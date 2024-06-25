/**
*
* Este archivo es el modelo para enviar los datos
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionRequestRecord
* @package       catalogo-somain-services
* @subpackage   ec.gob.imark.catalogo.controller.query.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.records.request;

import lombok.Builder;

@Builder
public record LocalizacionRequestRecord(
		String idLocalizacion,
		String idLocalizacionPadre,
		String nombreLocalizacion,
		String codigoLocalizacion,
		String nombreNacionalidadLocalizacion,
		String regimenEscolarLocalizacion,
		Integer tieneJuzgadoLocalizacion,
		String esUrbanaLocalizacion,
		Integer nivelLocalizacion) {

}
