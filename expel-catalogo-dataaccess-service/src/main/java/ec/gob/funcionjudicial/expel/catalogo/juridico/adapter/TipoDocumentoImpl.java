/**
 * Proyecto expel-consulta-causas-clex.<br> Clase TipoDocumentoImpl 4/2/2024.<br> Copyright 2024
 * Consejo de la Judicatura.<br> Todos los derechos reservados.
 */

package ec.gob.funcionjudicial.expel.catalogo.juridico.adapter;

import ec.gob.funcionjudicial.expel.catalogo.exceptions.TipoDocumentoException;
import ec.gob.funcionjudicial.expel.catalogo.juridico.repository.TipoDocumentoJpaRepository;
import ec.gob.funcionjudicial.expel.catalogo.records.response.TipoDocumentoResponseRecord;
import ec.gob.funcionjudicial.expel.dataaccess.messages.MessageSourceUtil;
import ec.gob.funcionjudicial.expel.dataaccess.ports.output.TipoDocumentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
@Component
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TipoDocumentoImpl implements TipoDocumentoRepository {

  private final TipoDocumentoJpaRepository tipoDocumentoJpaRepository;
  private final MessageSourceUtil messageSourceUtil;

  @Override
  public TipoDocumentoResponseRecord obtenerPorNombre(String nombreTipoDocumento,
      String usoTipoDocumento) {
    return tipoDocumentoJpaRepository.obtenerPorNombre(nombreTipoDocumento, usoTipoDocumento)
        .orElseThrow(() -> new TipoDocumentoException(
            String.format(
                messageSourceUtil.getMessage("tipoDocumento.component.exception.notfound"),
                nombreTipoDocumento,
                usoTipoDocumento)));
  }
}
