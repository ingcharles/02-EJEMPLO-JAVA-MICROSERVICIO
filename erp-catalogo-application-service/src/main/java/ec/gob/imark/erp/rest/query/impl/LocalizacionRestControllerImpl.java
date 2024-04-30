/**
 * <p> Proyecto erp-catalogo.
 * <p> Clase LocalizacionRestControllerImpl 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.imark.erp.rest.query.impl;

import ec.gob.imark.erp.catalogo.records.request.LocalizacionRequestRecord;
import ec.gob.imark.erp.catalogo.records.response.LocalizacionResponseRecord;
import ec.gob.imark.erp.dataaccess.ports.input.LocalizacionService;
import ec.gob.imark.erp.rest.query.LocalizacionRestController;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * -- AQUI AÑADIR LA DESCRIPCION DE LA CLASE --.
 *
 * <p>Historial de cambios:
 *
 * <ul>
 *   <li>1.0.0 - Descripción del cambio inicial - Carlos.Anchundia - 24/4/2024
 *       <!-- Añadir nuevas entradas de cambios aquí -->
 * </ul>
 *
 * @author Carlos.Anchundia
 * @version 1.0.0 $
 * @since 24/4/2024
 */
@RestController
@RequiredArgsConstructor
public class LocalizacionRestControllerImpl implements LocalizacionRestController {

  private final LocalizacionService localizacionService;

  @Override
  public List<LocalizacionResponseRecord> obtenerPorNivelLocalizacion(
      LocalizacionRequestRecord localizacionRequestRecord) {
    return localizacionService.obtenerPorNivelLocalizacion(localizacionRequestRecord.nivelLocalizacion());
  }
}
