package ec.gob.imark.erp.catalogo.enumeration;

import lombok.Getter;

@Getter
public enum EstadoEnum {
  A("ACTIVO"), I("INACTIVO"), X("ELIMINADO");

  private final String tipo;

  EstadoEnum(String tipo) {
    this.tipo = tipo;
  }

}
