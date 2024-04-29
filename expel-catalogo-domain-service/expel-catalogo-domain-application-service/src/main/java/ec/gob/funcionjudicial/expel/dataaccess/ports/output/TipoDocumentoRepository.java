/**
 * Proyecto expel-consulta-causas-clex.<br> Clase TipoDocumentoRepository 4/2/2024.<br> Copyright
 * 2024 Consejo de la Judicatura.<br> Todos los derechos reservados.
 */

package ec.gob.funcionjudicial.expel.dataaccess.ports.output;

import ec.gob.funcionjudicial.expel.catalogo.records.response.TipoDocumentoResponseRecord;

/**
 * -- AQUI AÑADIR LA DESCRIPCION DE LA CLASE --.
 *
 * <p>Historial de cambios:
 *
 * <ul>
 *   <li>1.0.0 - Descripción del cambio inicial - Francisco.Zabala - 4/2/2024
 *       <!-- Añadir nuevas entradas de cambios aquí -->
 * </ul>
 *
 * @author Francisco.Zabala
 * @version 1.0.0 $
 * @since 4/2/2024
 */
public interface TipoDocumentoRepository {

  TipoDocumentoResponseRecord obtenerPorNombre(
      String nombreTipoDocumento,
      String usoTipoDocumento);
}
