package ec.gob.funcionjudicial.expel.catalogo.juridico.adapter;

import ec.gob.funcionjudicial.expel.catalogo.juridico.repository.MateriaJpaRepository;
import ec.gob.funcionjudicial.expel.catalogo.to.juridico.MateriaTo;
import ec.gob.funcionjudicial.expel.dataaccess.ports.output.MateriaRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MateriaRepositoryImpl implements MateriaRepository {

  private final MateriaJpaRepository materiaJpaRepository;

  @Override
  public List<MateriaTo> getActiveMaterias() {
    return materiaJpaRepository.getActiveMaterias();
  }

  @Override
  public List<MateriaTo> obtenerMateriasParaConsultaCausas(List<Long> materiasAExcluir) {
    return materiaJpaRepository.obtenerMateriasParaConsultaCausas(materiasAExcluir);
  }
}
