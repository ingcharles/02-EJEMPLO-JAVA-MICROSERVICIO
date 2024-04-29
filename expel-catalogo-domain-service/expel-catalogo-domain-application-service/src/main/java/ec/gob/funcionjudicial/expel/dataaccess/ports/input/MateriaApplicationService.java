package ec.gob.funcionjudicial.expel.dataaccess.ports.input;

import ec.gob.funcionjudicial.expel.catalogo.to.juridico.MateriaTo;
import java.util.List;

public interface MateriaApplicationService {

  List<MateriaTo> getActiveMaterias();
}
