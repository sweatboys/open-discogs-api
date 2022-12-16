package io.dsub.sweatboys.opendiscogs.api.artist.application;

import io.dsub.sweatboys.opendiscogs.api.artist.domain.Artist;
import io.dsub.sweatboys.opendiscogs.api.artist.domain.ArtistRepository;
import io.dsub.sweatboys.opendiscogs.api.artist.dto.ArtistDetailDTO;
import io.dsub.sweatboys.opendiscogs.api.artist.dto.ArtistReleaseDTO;
import io.dsub.sweatboys.opendiscogs.api.artist.query.ArtistQuery;
import io.dsub.sweatboys.opendiscogs.api.core.exception.ItemNotFoundException;
import io.dsub.sweatboys.opendiscogs.api.core.response.PagedResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.function.Function;

import static org.springframework.data.domain.ExampleMatcher.matchingAll;

@Service
@RequiredArgsConstructor
public class ArtistService {
  private final ArtistRepository artistRepository;

  public Mono<PagedResponseDTO<Artist>> findArtists(ArtistQuery query, Pageable pageable) {
    return artistRepository.findAllBy(Example.of(query.toArtist(),
        matchingAll()
            .withStringMatcher(StringMatcher.CONTAINING)
            .withIgnoreCase()
            .withIgnoreNullValues()), pageable)
        .flatMap(fromPageToResponseDTO());
  }

  private Function<Page<Artist>, Mono<PagedResponseDTO<Artist>>> fromPageToResponseDTO() {
    return PagedResponseDTO::fromPage;
  }

  public Mono<ResponseEntity<ArtistDetailDTO>> getArtist(long id) {
    return artistRepository.findById(id)
        .map(ResponseEntity::ok)
        .switchIfEmpty(getItemNotFoundException(id));
  }

  public Mono<PagedResponseDTO<ArtistReleaseDTO>> getArtistReleases(long id, Pageable pageable) {
    return artistRepository.findReleasesByArtistId(id, pageable)
        .collectList()
        .zipWith(artistRepository.countReleasesByArtistId(id))
        .flatMap(tuple -> PagedResponseDTO.fromPage(new PageImpl<>(tuple.getT1(), pageable, tuple.getT2())));
  }
  private static Mono<ResponseEntity<ArtistDetailDTO>> getItemNotFoundException(long id) {
    return Mono.error(new ItemNotFoundException("artist", id));
  }
}
