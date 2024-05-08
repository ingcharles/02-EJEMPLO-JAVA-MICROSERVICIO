/**
 * <p> Proyecto catalogo-catalogo.
 * <p> Clase TipoAccionQueryRestController 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.imark.catalogo.controller.query;

import ec.gob.imark.catalogo.records.request.LocalizacionFindByIdRequestRecord;
import ec.gob.imark.catalogo.records.request.LocalizacionRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindByIdResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
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
@RequestMapping(value = "/query/localizacion", produces = "application/vnd.api.v1+json")
@Validated
public interface LocalizacionQueryController {
    
  @PostMapping("/obtenerPorNivelLocalizacion")
  @ResponseStatus(HttpStatus.OK)
  @Operation(summary = "Método que obtiene los datos de la tabla localizacion.")
  List<LocalizacionResponseRecord> obtenerPorNivelLocalizacion(
      @Valid @NotNull @RequestBody LocalizacionRequestRecord localizacionRequestRecord);

  @PostMapping("/findByIdLocalizacion")
  @ResponseStatus(HttpStatus.OK)
  @Operation(summary = "Método que obtiene los datos de la tabla localizacion")
  List<LocalizacionFindByIdResponseRecord> findByIdLocalizacion(
      @Valid @NotNull @RequestBody LocalizacionFindByIdRequestRecord localizacionFindByIdRequestRecord);
}
