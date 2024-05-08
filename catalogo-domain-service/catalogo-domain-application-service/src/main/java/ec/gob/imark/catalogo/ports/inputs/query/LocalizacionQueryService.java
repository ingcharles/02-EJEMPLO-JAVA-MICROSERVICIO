/**
 * Proyecto catalogo-catalogo.
 *
 * <p>Clase LocalizacionQueryService 24/4/2024.
 *
 * <p>Copyright 2024 Consejo de la Judicatura.
 *
 * <p>Todos los derechos reservados.
 */
package ec.gob.imark.catalogo.ports.inputs.query;

import ec.gob.imark.catalogo.records.request.LocalizacionFindByIdRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindByIdResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
import java.util.List;

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
public interface LocalizacionQueryService {
  List<LocalizacionResponseRecord> obtenerPorNivelLocalizacion(Integer nivelLocalizacion);

  List<LocalizacionFindByIdResponseRecord> findByIdLocalizacion(
      LocalizacionFindByIdRequestRecord localizacionFindByIdRequestRecord);
}
