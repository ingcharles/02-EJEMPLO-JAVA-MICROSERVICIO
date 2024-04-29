/**
 * <p> Proyecto expel-catalogo-juridico.
 * <p> Clase TipoAccionServiceImpl 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.funcionjudicial.expel.dataaccess.services;

import ec.gob.funcionjudicial.expel.catalogo.records.response.TipoAccionResponseRecord;
import ec.gob.funcionjudicial.expel.dataaccess.ports.input.TipoAccionService;
import ec.gob.funcionjudicial.expel.dataaccess.ports.output.TipoAccionRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
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
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TipoAccionServiceImpl implements TipoAccionService {

  private final TipoAccionRepository tipoAccionRepository;

  /**
   * Permite obtener el tipoAccion por idMateria
   *
   * @param idMateria
   * @return
   */
  @Override
  @Cacheable(value = "tipoAccion", key = "{#idMateria}")
  public List<TipoAccionResponseRecord> obtenerPorIdMateria(Integer idMateria) {
    return tipoAccionRepository.obtenerPorIdMateria(idMateria);
  }
}

