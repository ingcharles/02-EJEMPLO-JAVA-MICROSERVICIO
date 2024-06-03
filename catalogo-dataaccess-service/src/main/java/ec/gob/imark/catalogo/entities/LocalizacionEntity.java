/**
*
* Este archivo es modelo de la tabla: Localizacion
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionEntity
* @package       catalogo-domain-services
* @subpackage   ec.gob.imark.catalogo.controller.query.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.postgresql.util.PGobject;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "localizacion", schema = "esq_catalogo")
@Entity
@NamedStoredProcedureQuery(
		name = "sp_save_localizacion",
		procedureName = "esq_catalogo.sp_save_localizacion",
		parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "i_json_localizacion", type = PGobject.class),
				@StoredProcedureParameter(mode = ParameterMode.INOUT, name = "o_json_resultado", type = PGobject.class)
		}
)
public class LocalizacionEntity
{
	@Id
	@NotBlank(message = "{localizacion.idLocalizacion.not_blank}")
	@Size(max = 16, message = "{localizacion.idLocalizacion.size}")
	@Column(name = "id_localizacion", nullable = false)
	private String idLocalizacion;
	
	@NotBlank(message = "{localizacion.idLocalizacionPadre.not_blank}")
	@Size(max = 16, message = "{localizacion.idLocalizacionPadre.size}")
	@Column(name = "id_localizacion_padre", nullable = false)
	private String idLocalizacionPadre;
	
	@NotBlank(message = "{localizacion.nombreLocalizacion.not_blank}")
	@Size(max = 126, message = "{localizacion.nombreLocalizacion.size}")
	@Column(name = "nombre_localizacion", nullable = false)
	private String nombreLocalizacion;
	
	@NotBlank(message = "{localizacion.codigoLocalizacion.not_blank}")
	@Size(max = 8, message = "{localizacion.codigoLocalizacion.size}")
	@Column(name = "codigo_localizacion", nullable = false)
	private String codigoLocalizacion;
	
	@NotBlank(message = "{localizacion.nombreNacionalidadLocalizacion.not_blank}")
	@Size(max = 8, message = "{localizacion.nombreNacionalidadLocalizacion.size}")
	@Column(name = "nombre_nacionalidad_localizacion", nullable = false)
	private String nombreNacionalidadLocalizacion;
	
	@NotBlank(message = "{localizacion.regimenEscolarLocalizacion.not_blank}")
	@Size(max = 8, message = "{localizacion.regimenEscolarLocalizacion.size}")
	@Column(name = "regimen_escolar_localizacion", nullable = false)
	private String regimenEscolarLocalizacion;

	@NotBlank(message = "{localizacion.tieneJuzgadoLocalizacion.not_blank}")
	@Column(name = "tiene_juzgado_localizacion", nullable = false)
	private Integer tieneJuzgadoLocalizacion;
	
	@NotBlank(message = "{localizacion.esUrbanaLocalizacion.not_blank}")
	@Size(max = 8, message = "{localizacion.esUrbanaLocalizacion.size}")
	@Column(name = "es_urbana_localizacion", nullable = false)
	private String esUrbanaLocalizacion;

	@NotBlank(message = "{localizacion.nivelLocalizacion.not_blank}")
	@Column(name = "nivel_localizacion", nullable = false)
	private Integer nivelLocalizacion;

	@Override
	public int hashCode()
	{
		return Objects.hash(idLocalizacion);
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
		LocalizacionEntity that = (LocalizacionEntity) o;
		return idLocalizacion.equals(that.idLocalizacion);
	}

}
