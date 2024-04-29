/**
 * <p> Proyecto expel-catalogo-juridico.
 * <p> Clase DelitoQueryRestController 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.funcionjudicial.expel.rest.query;

import ec.gob.funcionjudicial.expel.catalogo.records.request.DelitoRequestRecord;
import ec.gob.funcionjudicial.expel.catalogo.records.response.DelitoResponseRecord;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * -- AQUI AÑADIR LA DESCRIPCION DE LA INTERFACE --.
 *
 * <p>Historial de cambios:
 *
 * <ul>
 *   <li>1.0.0 - Descripción del cambio inicial - Carlos.Anchundia - 24/4/2024
 *       <!-- Añadir nuevas entradas de cambios aquí -->
 * </ul>
 *
 * @author Carlos.Anchundia
 * @version 1.0.0
 * @since 24/4/2024
 */
@RequestMapping(value = "/delito", produces = "application/vnd.api.v1+json")
@Validated
public interface DelitoRestController {
  @PostMapping("/obtenerPorIdMateriaIdTipoAccion")
  @ResponseStatus(HttpStatus.OK)
  @Operation(summary = "Permite obtener los datos del tipo de acción.")
  List<DelitoResponseRecord> obtenerPorIdMateriaIdTipoAccion(
      @Valid @NotNull @RequestBody DelitoRequestRecord delitosRequestRecord);
}
