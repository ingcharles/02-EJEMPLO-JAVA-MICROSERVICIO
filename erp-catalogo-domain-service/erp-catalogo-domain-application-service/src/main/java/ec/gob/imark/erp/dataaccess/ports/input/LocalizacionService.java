/**
 * <p> Proyecto erp-catalogo.
 * <p> Clase LocalizacionService 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.imark.erp.dataaccess.ports.input;

import ec.gob.imark.erp.catalogo.records.response.LocalizacionResponseRecord;
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
public interface LocalizacionService {
  List<LocalizacionResponseRecord> obtenerPorNivelLocalizacion(
      Integer idMateria);
}
