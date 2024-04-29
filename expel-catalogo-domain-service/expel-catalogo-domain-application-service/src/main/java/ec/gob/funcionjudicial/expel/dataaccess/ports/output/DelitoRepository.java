/**
 * <p> Proyecto expel-catalogo-juridico.
 * <p> Clase DelitoRepository 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.funcionjudicial.expel.dataaccess.ports.output;

import ec.gob.funcionjudicial.expel.catalogo.records.response.DelitoResponseRecord;
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
public interface DelitoRepository {

  List<DelitoResponseRecord> obtenerPorIdMateriaIdTipoAccion(Integer idMateria, Integer idTipoAccion);

}
