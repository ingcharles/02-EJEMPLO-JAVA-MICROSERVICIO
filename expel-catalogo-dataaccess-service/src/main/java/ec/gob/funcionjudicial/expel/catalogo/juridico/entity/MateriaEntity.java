package ec.gob.funcionjudicial.expel.catalogo.juridico.entity;

import ec.gob.funcionjudicial.expel.catalogo.juridico.enumeration.EstadoEnum;
import ec.gob.funcionjudicial.expel.catalogo.juridico.enumeration.NemonicoEnum;
import ec.gob.funcionjudicial.expel.catalogo.juridico.enumeration.SiNoEnum;
import ec.gob.funcionjudicial.expel.catalogo.juridico.enumeration.TipoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Materias", schema = "CLEX1")
@Entity
public class MateriaEntity {

  @Id
  @NotBlank(message = "{catalogo.juridico.materia.id.not_blank}")
  @Column(name = "idMateria", nullable = false)
  private Short idMateria;

  @NotBlank(message = "{catalogo.juridico.materia.nombre.not_blank}")
  @Size(max = 60, message = "{materia.nombreMateria.size}")
  @Column(name = "NombreMateria", length = 60)
  private String nombreMateria;

  @NotNull(message = "catalogo.juridico.materia.estado.not_null")
  @Size(max = 1, message = "{materia.estado.size}")
  @Enumerated(EnumType.STRING)
  @Column(name = "Estado", length = 1)
  private EstadoEnum estado;

  @Size(max = 1, message = "{materia.idMateriaJusticia.size}")
  @Column(name = "IdMateriaJusticia", length = 1)
  private Character idMateriaJusticia;

  @Column(name = "IdMateriaPadre")
  private Short idMateriaPadre;

  @Column(name = "FechaCaducidad")
  private LocalDateTime fechaCaducidad;

  @Size(max = 50, message = "{materia.observacion.size}")
  @Column(name = "Observacion", length = 50)
  private String observacion;

  @NotNull(message = "catalogo.juridico.materia.tipo.not_null")
  @Enumerated(EnumType.STRING)
  @Size(max = 5, message = "{materia.tipo.size}")
  @Column(name = "Tipo", length = 5)
  private TipoEnum tipo;

  @NotNull(message = "catalogo.juridico.materia.sorteo.interno.not_null")
  @Size(max = 255, message = "{materia.sorteoInterno.size}")
  @Enumerated(EnumType.STRING)
  @Column(name = "SorteoInterno")
  private SiNoEnum sorteoInterno;

  @NotNull(message = "catalogo.juridico.materia.sorteo.externo.not_null")
  @Size(max = 255, message = "{materia.sorteoExterno.size}")
  @Enumerated(EnumType.STRING)
  @Column(name = "SorteoExterno")
  private SiNoEnum sorteoExterno;

  @Size(max = 100, message = "{materia.nemonico.size}")
  @Column(name = "Nemonico", length = 100)
  @Enumerated(EnumType.STRING)
  private NemonicoEnum nemonico;

  @Override
  public int hashCode() {
    return Objects.hash(idMateria);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MateriaEntity that = (MateriaEntity) o;
    return idMateria.equals(that.idMateria);
  }
}
