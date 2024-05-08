package ec.gob.imark.catalogo.to;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class MateriaTo {

  private Short nivelLocalizacion;
  private String nombreMateria;
}
