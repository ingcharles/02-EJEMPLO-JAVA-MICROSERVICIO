package ec.gob.funcionjudicial.expel.catalogo.to.juridico;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class MateriaTo {

  private Short idMateria;
  private String nombreMateria;
}
