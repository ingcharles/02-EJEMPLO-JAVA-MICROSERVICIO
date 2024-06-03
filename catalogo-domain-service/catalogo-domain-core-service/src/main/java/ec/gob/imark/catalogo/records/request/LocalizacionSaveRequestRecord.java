/**
*
* Este archivo es el modelo para enviar los datos
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionSaveRequestRecord
* @package       catalogo-somain-services
* @subpackage   ec.gob.imark.catalogo.controller.command.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.records.request;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record LocalizacionSaveRequestRecord(
		@JsonProperty("id_localizacion")
	@NotNull(message = "{id_localizacion.not_null}") String idLocalizacion,
		@JsonProperty("id_localizacion_padre")
  @NotNull(message = "{id_localizacion_padre.not_null}") String idLocalizacionPadre,
		@JsonProperty("nombre_localizacion")
String nombreLocalizacion,
		@JsonProperty("codigo_localizacion")
	String codigoLocalizacion,
		@JsonProperty("nivel_localizacion")
	Integer nivelLocalizacion)
{

}
