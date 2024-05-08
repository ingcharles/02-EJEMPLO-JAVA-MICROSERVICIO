/**
 * <p> Proyecto catalogo-catalogo.
 * <p> Clase LocalizacionQueryControllerImpl 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.imark.catalogo.controller.query.impl;

import ec.gob.imark.catalogo.ports.inputs.query.LocalizacionQueryService;
import ec.gob.imark.catalogo.records.request.LocalizacionFindByIdRequestRecord;
import ec.gob.imark.catalogo.records.request.LocalizacionRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindByIdResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
import ec.gob.imark.catalogo.controller.query.LocalizacionQueryController;
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
public class LocalizacionQueryControllerImpl implements LocalizacionQueryController {

  private final LocalizacionQueryService localizacionQueryService;

  @Override
  public List<LocalizacionResponseRecord> obtenerPorNivelLocalizacion(
      LocalizacionRequestRecord localizacionRequestRecord) {
    return localizacionQueryService.obtenerPorNivelLocalizacion(localizacionRequestRecord.nivelLocalizacion());
  }

  @Override
  public List<LocalizacionFindByIdResponseRecord> findByIdLocalizacion(
      LocalizacionFindByIdRequestRecord localizacionFindByIdRequestRecord) {
    return localizacionQueryService.findByIdLocalizacion(localizacionFindByIdRequestRecord);
  }


}
