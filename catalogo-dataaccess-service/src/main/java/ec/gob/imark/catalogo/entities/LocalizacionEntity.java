package ec.gob.imark.catalogo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.Objects;
import lombok.*;
import org.hibernate.annotations.Comment;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "localizacion", schema = "esq_catalogo")
@Entity
public class LocalizacionEntity {
  @Id
  @Size(max = 100)
  @Column(name = "id_localizacion", nullable = false, length = 100)
  private String idLocalizacion;

  @NotBlank(message = "{localizacion.nombreLocalizacion.not_blank}")
  @Size(max = 100, message = "{localizacion.nombreLocalizacion.size}")
  @Comment("AAAAA")
  @Column(name = "nombre_localizacion", length = 100)
  private String nombreLocalizacion;

  @Size(max = 100)
  @Column(name = "codigo_localizacion", length = 100)
  private String codigoLocalizacion;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_localizacion_padre")
  private LocalizacionEntity idLocalizacionPadre;

  @Column(name = "es_urbana_localizacion")
  private Integer esUrbanaLocalizacion;

  @Column(name = "nivel_localizacion")
  private Integer nivelLocalizacion;

  @Size(max = 100)
  @Column(name = "nombre_nacionalidad_localizacion", length = 100)
  private String nombreNacionalidadLocalizacion;

  @Column(name = "tiene_juzgado_localizacion")
  private Integer tieneJuzgadoLocalizacion;

  @OneToMany(mappedBy = "idLocalizacionPadre")
  private Set<LocalizacionEntity> localizacions = new LinkedHashSet<>();

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
    LocalizacionEntity that = (LocalizacionEntity) o;
    return idLocalizacion.equals(that.idLocalizacion);
  }
}
