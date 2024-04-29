/**
 * <p> Proyecto expel-catalogo-juridico.
 * <p> Clase DelitoEntity 24/4/2024.
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
@Table(name = "Delitos", schema = "CLEX1")
@Entity
public class DelitoEntity {

  @Id
  @NotBlank(message = "{catalogo.juridico.Delito.id.not_blank}")
  @Column(name = "IdDelito", nullable = false)
  private Integer idDelito;

  @NotBlank(message = "{catalogo.juridico.Delito.nombre.not_blank}")
  @Size(max = 900, message = "{Delito.nombreDelito.size}")
  @Column(name = "Nombre", length = 900)
  private String nombreDelito;

  @NotBlank(message = "{catalogo.juridico.Delito.idMateria.not_blank}")
  @Column(name = "IdMateria", nullable = false)
  private Integer idMateria;

  @NotBlank(message = "{catalogo.juridico.Delito.idTipoAccion.not_blank}")
  @Column(name = "idTipoAccion", nullable = false)
  private Integer idTipoAccion;

  @NotNull(message = "catalogo.juridico.Delito.estado.not_null")
  @Size(max = 1, message = "{Delito.estado.size}")
  @Enumerated(EnumType.STRING)
  @Column(name = "Estado", length = 1)
  private EstadoEnum estado;

  @Override
  public int hashCode() {
    return Objects.hash(idDelito);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelitoEntity that = (DelitoEntity) o;
    return idDelito.equals(that.idDelito);
  }
}
