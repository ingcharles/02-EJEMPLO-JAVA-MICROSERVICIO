/**
 * Proyecto expel-consulta-causas-clex.<br> Clase TipoDocumentoEntity 3/2/2024.<br> Copyright 2024
 * Consejo de la Judicatura.<br> Todos los derechos reservados.
 */

package ec.gob.funcionjudicial.expel.catalogo.juridico.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.SQLDelete;

/**
 * Entidad para la tabla TipoDocumento.
 *
 * <p>Historial de cambios:
 *
 * <ul>
 *   <li>1.0.0 - Descripción del cambio inicial - Francisco.Zabala - 3/2/2024
 *       <!-- Añadir nuevas entradas de cambios aquí -->
 * </ul>
 *
 * @author Francisco.Zabala
 * @version 1.0.0 $
 * @since 3/2/2024
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "TipoDocumento", schema = "CLEX1", uniqueConstraints = {
    @UniqueConstraint(name = "AK_Unique_NombreTipoDocumento", columnNames = "NombreTipoDocumento")
})
@SQLDelete(sql = "UPDATE CLEX1.TipoDocumento SET Estado = 'X' WHERE idTipoDocumento = ?")
public class TipoDocumentoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idTipoDocumento", nullable = false, unique = true)
  private Integer id;

  @Column(name = "NombreTipoDocumento", nullable = false, length = 500)
  private String nombre;

  @Column(name = "IdOriginal")
  private Integer idOriginal;

  @Column(name = "IdProvincia", length = 5)
  private String idProvincia;

  @Column(name = "VisibleEscrito", length = 1)
  private String visibleEscrito;

  @NotBlank(message = "{tipoDocumento.tablaReferencia.notBlank}")
  @Size(max = 250, message = "{tipoDocumento.tablaReferencia.size}")
  @Column(name = "TablaReferencia", nullable = false, length = 250)
  private String tablaReferencia;

  @Size(max = 250, message = "{tipoDocumento.categoriaTipoDocumento.size}")
  @Column(name = "CategoriaTipoDocumento", length = 250)
  private String categoriaTipoDocumento;

  @Column(name = "Incidente", length = 1)
  private String incidente;

  @Column(name = "DescripcionDocumento", columnDefinition = "TEXT")
  private String descripcion;

  @NotBlank(message = "{tipoDocumento.usoDocumento.notBlank}")
  @Size(max = 20, message = "{tipoDocumento.usoDocumento.size}")
  @Column(name = "UsoDocumento", nullable = false, length = 20)
  private String usoDocumento;

  @Column(name = "Estado", nullable = false, length = 1)
  private String estado;

  @Column(name = "FechaCreacion", nullable = false)
  private LocalDateTime fechaCreacion;
}
