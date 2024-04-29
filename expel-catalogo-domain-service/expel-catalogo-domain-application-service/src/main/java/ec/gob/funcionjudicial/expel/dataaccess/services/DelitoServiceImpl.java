/**
 * <p> Proyecto expel-catalogo-juridico.
 * <p> Clase DelitoServiceImpl 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.funcionjudicial.expel.dataaccess.services;

import ec.gob.funcionjudicial.expel.catalogo.records.response.DelitoResponseRecord;
import ec.gob.funcionjudicial.expel.dataaccess.ports.input.DelitoService;
import ec.gob.funcionjudicial.expel.dataaccess.ports.output.DelitoRepository;
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
public class DelitoServiceImpl implements DelitoService {

  private final DelitoRepository delitoRepository;

  /**
   * Permite obtener el delito por idMateria y por idDelito
   *
   * @param idMateria
   * * @param idMateria
   * @return
   */
  @Override
  @Cacheable(value = "delitos", key = "{#idMateria,#idTipoAccion}")
  public List<DelitoResponseRecord> obtenerPorIdMateriaIdTipoAccion(Integer idMateria,Integer idTipoAccion) {
    return delitoRepository.obtenerPorIdMateriaIdTipoAccion(idMateria,idTipoAccion);
  }
}

