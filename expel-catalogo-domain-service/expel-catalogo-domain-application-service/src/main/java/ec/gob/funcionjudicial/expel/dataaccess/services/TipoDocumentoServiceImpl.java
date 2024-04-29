/**
 * Proyecto expel-consulta-causas-clex.<br> Clase TipoDocumentoServiceImpl 4/2/2024.<br> Copyright
 * 2024 Consejo de la Judicatura.<br> Todos los derechos reservados.
 */

package ec.gob.funcionjudicial.expel.dataaccess.services;

import ec.gob.funcionjudicial.expel.catalogo.records.response.TipoDocumentoResponseRecord;
import ec.gob.funcionjudicial.expel.dataaccess.ports.input.TipoDocumentoService;
import ec.gob.funcionjudicial.expel.dataaccess.ports.output.TipoDocumentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Servicio que administra los tipos de documentos.
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
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TipoDocumentoServiceImpl implements TipoDocumentoService {

  private final TipoDocumentoRepository tipoDocumentoRepository;

  /**
   * Permite obtener el tipo de documento por el nombre y el uso
   *
   * @param nombreTipoDocumento
   * @param usoTipoDocumento
   * @return
   */
  @Override
  @Cacheable(value = "tipoDocumento", key = "{#nombreTipoDocumento, #usoTipoDocumento}")
  public TipoDocumentoResponseRecord obtenerPorNombre(String nombreTipoDocumento,
      String usoTipoDocumento) {
    return tipoDocumentoRepository.obtenerPorNombre(nombreTipoDocumento, usoTipoDocumento);
  }
}
