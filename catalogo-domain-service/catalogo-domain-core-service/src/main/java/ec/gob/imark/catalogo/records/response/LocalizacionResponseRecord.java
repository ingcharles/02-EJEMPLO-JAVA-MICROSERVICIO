/**
*
* Este archivo es el modelo para recuperar los datos
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionResponseRecord
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
public record LocalizacionResponseRecord(
	String idLocalizacion,
	String idLocalizacionPadre,
	String nombreLocalizacion,
	String codigoLocalizacion,
	String nombreNacionalidadLocalizacion,
	String regimenEscolarLocalizacion,
	Integer tieneJuzgadoLocalizacion,
	String esUrbanaLocalizacion,
	Integer nivelLocalizacion)
{

}
