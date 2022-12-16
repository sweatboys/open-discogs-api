package io.dsub.sweatboys.opendiscogs.api.label.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dsub.sweatboys.opendiscogs.api.label.domain.Label;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.With;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.List;

@With
@Builder
@Schema(description = "Detailed information of a label")
public record LabelDetailDTO(@JsonProperty("id") Long id, @JsonProperty("contact_info") String contactInfo,
                             @JsonProperty("data_quality") String dataQuality, @JsonProperty("name") String name,
                             @JsonProperty("profile") String profile,
                             @JsonProperty("parent_label") LabelReferenceDTO parentLabel,
                             @JsonProperty("sublabels") List<LabelReferenceDTO> sublabels,
                             @JsonProperty("urls") List<String> urls) {
    @JsonProperty("uri")
    public String getUri() {
        return "https://www.discogs.com/label/" + this.id;
    }

    @JsonProperty("release_url")
    public String getReleasesUrl() {
        return "https://api.opendiscogs.com/labels/" + this.id + "/releases";
    }
}
