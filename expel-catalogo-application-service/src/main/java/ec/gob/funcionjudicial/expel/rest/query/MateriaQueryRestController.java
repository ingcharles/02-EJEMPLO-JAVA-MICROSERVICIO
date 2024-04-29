package ec.gob.funcionjudicial.expel.rest.query;

import ec.gob.funcionjudicial.expel.catalogo.to.juridico.MateriaTo;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Permite gestionar el catálogo de materias existentes en el SATJE.
 *
 * <p>Historial de cambios:
 *
 * <ul>
 *   <li>1.0.0 - Descripción del cambio inicial - Francisco.Zabala - 2/1/2024
 *       <!-- Añadir nuevas entradas de cambios aquí -->
 * </ul>
 *
 * @author Francisco.Zabala
 * @version 1.0.0 $
 * @since 2/1/2024
 */
@RequestMapping(value = "/materia", produces = "application/vnd.api.v1+json")
@Validated
public interface MateriaQueryRestController {

  @GetMapping("/getAll")
  @ResponseStatus(HttpStatus.OK)
  @Operation(summary = "Permite obtener el listado de materias configuradas para consulta de causas externas")
  List<MateriaTo> getAll();
}
