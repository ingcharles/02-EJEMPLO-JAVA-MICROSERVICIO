/**
 * <p> Proyecto expel-catalogo-juridico.
 * <p> Clase TipoAccionImpl 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.funcionjudicial.expel.catalogo.juridico.adapter;

import ec.gob.funcionjudicial.expel.catalogo.exceptions.TipoAccionException;
import ec.gob.funcionjudicial.expel.catalogo.juridico.repository.TipoAccionJpaRepository;
import ec.gob.funcionjudicial.expel.catalogo.records.response.TipoAccionResponseRecord;
import ec.gob.funcionjudicial.expel.dataaccess.messages.MessageSourceUtil;
import ec.gob.funcionjudicial.expel.dataaccess.ports.output.TipoAccionRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
@Component
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TipoAccionImpl implements TipoAccionRepository {

  private final TipoAccionJpaRepository tipoAccionJpaRepository;
  private final MessageSourceUtil messageSourceUtil;

  @Override
  public List<TipoAccionResponseRecord> obtenerPorIdMateria(Integer idMateria) {
    return tipoAccionJpaRepository.obtenerPorIdMateria(idMateria)
        .orElseThrow(() -> new TipoAccionException(
            String.format(
                messageSourceUtil.getMessage("localizacion.component.exception.notfound"),
                idMateria)));
  }
}