package ec.gob.funcionjudicial.expel.catalogo.juridico.enumeration;

import lombok.Getter;

@Getter
public enum SiNoEnum {
  S("SI"), N("NO");

  private final String tipo;

  SiNoEnum(String tipo) {
    this.tipo = tipo;
  }
}
