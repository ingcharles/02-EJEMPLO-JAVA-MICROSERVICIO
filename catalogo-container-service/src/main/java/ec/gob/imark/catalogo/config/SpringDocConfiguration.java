package ec.gob.imark.catalogo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {

  private static final String GROUP = "rest_services";
  private static final String API_RULES = "/api/evaluation/**";

  @Bean
  public GroupedOpenApi getDocket() {
    return GroupedOpenApi.builder().group(GROUP).pathsToMatch(API_RULES).build();
  }

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("Consejo de la Judicatura - Evaluaciones - Personal microservicio")
            .version("1.0.0")
            .description("API Rest para lo manipulación de datos de la base datos Personal. "));
  }
}
