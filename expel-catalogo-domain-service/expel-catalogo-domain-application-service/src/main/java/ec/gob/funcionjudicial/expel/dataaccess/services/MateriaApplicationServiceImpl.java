package ec.gob.funcionjudicial.expel.dataaccess.services;

import ec.gob.funcionjudicial.expel.catalogo.to.juridico.MateriaTo;
import ec.gob.funcionjudicial.expel.dataaccess.ports.input.MateriaApplicationService;
import ec.gob.funcionjudicial.expel.dataaccess.ports.output.MateriaRepository;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MateriaApplicationServiceImpl implements MateriaApplicationService {

  private final MateriaRepository materiaRepository;

  /**
   * No se nos permitió añadir un nuevo campo a la tabla Materia para ahí poner esta configuración
   * de saber qué materias son las que se deben mostrar en la pantalla del nuevo sistema de
   * consultas de causas.
   *
   * <p>Por esta razón se debe quemar todavía los códigos de las materias que no se deben mostrar.
   *
   * @return
   */
  @Override
  @Cacheable(value = "materias", sync = true)
  public List<MateriaTo> getActiveMaterias() {
    /**
     * Estas materias se deben excluir del listado a mostrar en consulta de causas. 7,ADOLESCENTE
     * INFRACTOR 25,QUEJAS 30,VIOLENCIA CONTRA LA MUJER Y FAMILIA COIP
     */
    List<Long> materiasAExcluirEnBusqueda = Arrays.asList(7L, 25L, 30L);
    return materiaRepository.obtenerMateriasParaConsultaCausas(materiasAExcluirEnBusqueda);
  }
}
