package ec.gob.imark.erp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"ec.gob.imark.erp"})
@EntityScan(basePackages = {"ec.gob.imark.erp"})
@SpringBootApplication(scanBasePackages = "ec.gob.imark.erp")
@OpenAPIDefinition(
    servers = {
      @Server(url = "${openapi.service.url}", description = "URL del Servidor Personalizado")
    },
    info =
        @Info(
            title = "API Catálogo .",
            version = "1.0",
            description = "Documentation API Catálogo . v1.0"))
public class ErpCatalogoServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(ErpCatalogoServiceApplication.class, args);
  }
}
