package ec.gob.funcionjudicial.expel;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"ec.gob.funcionjudicial.expel"})
@EntityScan(basePackages = {"ec.gob.funcionjudicial.expel"})
@SpringBootApplication(scanBasePackages = "ec.gob.funcionjudicial.expel")
@OpenAPIDefinition(
    servers = {
      @Server(url = "${openapi.service.url}", description = "URL del Servidor Personalizado")
    },
    info =
        @Info(
            title = "API Catálogo jurídico.",
            version = "1.0",
            description = "Documentation API Catálogo jurídico. v1.0"))
public class ExpelCatalogoJuridicoServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(ExpelCatalogoJuridicoServiceApplication.class, args);
  }
}
