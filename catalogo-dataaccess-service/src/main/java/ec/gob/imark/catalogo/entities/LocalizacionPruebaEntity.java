/**
*
* Este archivo es modelo de la tabla: LocalizacionPrueba
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionPruebaEntity
* @package       catalogo-domain-services
* @subpackage   ec.gob.imark.catalogo.controller.query.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.entities;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
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
@Table(name = "localizacion_prueba", schema = "esq_catalogo")
@Entity
public class LocalizacionPruebaEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_localizacion_prueba", nullable = false)
	private Integer idLocalizacionPrueba;
	
	@NotBlank(message = "{localizacionprueba.nombreLocalizacionPrueba.not_blank}")
	@Size(max = 100, message = "{localizacionprueba.nombreLocalizacionPrueba.size}")
	@Column(name = "nombre_localizacion_prueba", nullable = false)
	private String nombreLocalizacionPrueba;
	
	@NotNull(message = "{localizacionprueba.isLocalizacionPrueba.not_null}")
	@Column(name = "is_localizacion_prueba", nullable = false)
	private Boolean isLocalizacionPrueba;

	@NotNull(message = "{localizacionprueba.enteroLocalizacionPrueba.not_null}")
	@Column(name = "entero_localizacion_prueba", nullable = false)
	private Integer enteroLocalizacionPrueba;
	
	@NotNull(message = "{localizacionprueba.decimalLocalizacionPrueba.not_null}")
	@DecimalMax(value = "999999999.99", message = "{localizacionprueba.decimalLocalizacionPrueba.max, El valor debe ser mayor o igual a 999999999.99 }")
	@Column(name = "decimal_localizacion_prueba", nullable = false)
	private Double decimalLocalizacionPrueba;
	
	@Size(max = 250, message = "{localizacionprueba.descripcionLocalizacionPrueba.size}")
	@Column(name = "descripcion_localizacion_prueba")
	private String descripcionLocalizacionPrueba;
	
	@NotNull(message = "{localizacionprueba.fechaLocalizacionPrueba.not_null}")
	@Column(name = "fecha_localizacion_prueba", nullable = false)
	private LocalDateTime fechaLocalizacionPrueba;

	@NotNull(message = "{localizacionprueba.estadoLocalizacionPrueba.not_null}")
	@Column(name = "estado_localizacion_prueba", nullable = false)
	private Integer estadoLocalizacionPrueba;

	@Override
	public int hashCode()
	{
		return Objects.hash(idLocalizacionPrueba);
	}
	@Override
	public boolean equals(Object o)
	{
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LocalizacionPruebaEntity that = (LocalizacionPruebaEntity) o;
		return idLocalizacionPrueba.equals(that.idLocalizacionPrueba);
	}

}
