/**
*
* Este archivo es el modelo para recuperar los datos
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionSaveResponseRecord
* @package       catalogo-domain-services
* @subpackage   ec.gob.imark.catalogo.records.response
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.records.response;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record LocalizacionSaveResponseRecord(
	@NotNull(message = "{id_localizacion.not_null}") String idLocalizacion,
	@NotNull(message = "{id_localizacion_padre.not_null}") String idLocalizacionPadre,
	@NotNull(message = "{nombre_localizacion.not_null}") String nombreLocalizacion,
	@NotNull(message = "{codigo_localizacion.not_null}") String codigoLocalizacion,
	@NotNull(message = "{nombre_nacionalidad_localizacion.not_null}") String nombreNacionalidadLocalizacion,
	@NotNull(message = "{regimen_escolar_localizacion.not_null}") String regimenEscolarLocalizacion,
	@NotNull(message = "{tiene_juzgado_localizacion.not_null}") Integer tieneJuzgadoLocalizacion,
	@NotNull(message = "{es_urbana_localizacion.not_null}") String esUrbanaLocalizacion,
	@NotNull(message = "{nivel_localizacion.not_null}") Integer nivelLocalizacion)
{

}
