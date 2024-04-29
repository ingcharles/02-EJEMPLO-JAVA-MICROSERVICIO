package ec.gob.funcionjudicial.expel.dataaccess.ports.output;

import ec.gob.funcionjudicial.expel.catalogo.to.juridico.MateriaTo;
import java.util.List;

public interface MateriaRepository {

  List<MateriaTo> getActiveMaterias();

  List<MateriaTo> obtenerMateriasParaConsultaCausas(List<Long> materiasAExcluir);
}
