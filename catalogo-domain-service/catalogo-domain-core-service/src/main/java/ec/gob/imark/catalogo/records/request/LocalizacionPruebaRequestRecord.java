/**
*
* Este archivo es el modelo para enviar los datos
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionPruebaRequestRecord
* @package       catalogo-somain-services
* @subpackage   ec.gob.imark.catalogo.controller.query.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.records.request;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Builder;

@Builder
public record LocalizacionPruebaRequestRecord(
	Integer idLocalizacionPrueba,
	String nombreLocalizacionPrueba,
	Boolean isLocalizacionPrueba,
	Integer enteroLocalizacionPrueba,
	Float decimalLocalizacionPrueba,
	String descripcionLocalizacionPrueba,
	LocalDateTime fechaLocalizacionPrueba,
	Integer estadoLocalizacionPrueba)
 implements Serializable {

}
