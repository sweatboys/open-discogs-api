package io.dsub.sweatboys.opendiscogs.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
    // {x-release-please-start-version}
    title = "Open Discogs API", version = "1.3.1", description = "Open Discogs API Documentation"
    // {x-release-please-end}
))
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
