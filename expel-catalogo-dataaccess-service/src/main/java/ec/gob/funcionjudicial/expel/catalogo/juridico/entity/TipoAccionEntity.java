/**
 * <p> Proyecto expel-catalogo-juridico.
 * <p> Clase TipoAccionEntity 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.funcionjudicial.expel.catalogo.juridico.entity;

import ec.gob.funcionjudicial.expel.catalogo.juridico.enumeration.EstadoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "localizacion", schema = "esq_catalogo")
@Entity
public class TipoAccionEntity {

  @Id
  @NotBlank(message = "{localizacion.id_localizacion.not_blank}")
  @Column(name = "id_localizacion", nullable = false)
  private String idLocalizacion;

  @NotBlank(message = "{localizacion.nombreLocalizacion.not_blank}")
  @Size(max = 100, message = "{localizacion.nombreLocalizacion.size}")
  @Column(name = "nombre_localizacion", length = 100)
  private String nombreLocalizacion;
/*
  @NotBlank(message = "{TipoAccion.idMateria.not_blank}")
  @Column(name = "IdMateria", nullable = false)
  private Integer idMateria;

  @NotNull(message = "TipoAccion.estado.not_null")
  @Size(max = 1, message = "{TipoAccion.estado.size}")
  @Enumerated(EnumType.STRING)
  @Column(name = "Estado", length = 1)
  private EstadoEnum estado;*/

  @Override
  public int hashCode() {
    return Objects.hash(idLocalizacion);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoAccionEntity that = (TipoAccionEntity) o;
    return idLocalizacion.equals(that.idLocalizacion);
  }
}