package io.dsub.sweatboys.opendiscogs.api.config.properties;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Getter
@Validated
@NoArgsConstructor
@AllArgsConstructor
public class DatabaseProperties {
  @NotBlank
  private String username;
  @NotBlank
  private String password;
  @NotBlank
  @Setter
  private String host;
  @NotBlank
  @Setter
  private String database;

  public void setUsername(String username) {
    this.username = encodeToUTF8(username);
  }

  public void setPassword(String password) {
    this.password = encodeToUTF8(password);
  }

  private String encodeToUTF8(String in) {
    if (in == null || in.length() == 0) {
      return in;
    }
    return URLEncoder.encode(in, StandardCharsets.UTF_8);
  }

  public String getUrl() {
    return "r2dbc:postgres://%s/%s".formatted(host, database);
  }
}
