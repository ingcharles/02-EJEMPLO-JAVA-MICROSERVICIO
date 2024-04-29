/**
 * Proyecto expel-consulta-causas-clex.<br> Clase TipoDocumentoRestController 4/2/2024.<br>
 * Copyright 2024 Consejo de la Judicatura.<br> Todos los derechos reservados.
 */

package ec.gob.funcionjudicial.expel.rest.query;

import ec.gob.funcionjudicial.expel.catalogo.records.request.TipoDocumentoRequestRecord;
import ec.gob.funcionjudicial.expel.catalogo.records.response.TipoDocumentoResponseRecord;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Controlador REST para la administracion del tipo de documento.
 *
 * <p>Historial de cambios:
 *
 * <ul>
 *   <li>1.0.0 - ObtenerPorNombre(TipoDocumentoRequestRecord tipoDocumentoRequestRecord) - Francisco.Zabala - 4/2/2024
 *       <!-- Añadir nuevas entradas de cambios aquí -->
 * </ul>
 *
 * @author Francisco.Zabala
 * @version 1.0.0 $
 * @since 4/2/2024
 */
@RequestMapping(value = "/tipoDocumento", produces = "application/vnd.api.v1+json")
@Validated
public interface TipoDocumentoRestController {

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  @Operation(summary = "Permite obtener los datos del tipo de documento.")
  TipoDocumentoResponseRecord obtenerPorNombre(
      @Valid @NotNull @RequestBody TipoDocumentoRequestRecord tipoDocumentoRequestRecord);
}
