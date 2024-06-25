/**
*
* Este archivo es la implementación del controlador: LocalizacionPruebaCommandService
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionPruebaCommandService
* @package       catalogo-domain-services
* @subpackage   ec.gob.imark.catalogo.controller.command.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.ports.inputs.command;

import ec.gob.imark.catalogo.records.request.LocalizacionPruebaRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord;
import java.util.List;
public interface LocalizacionPruebaCommandService
{

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name saveLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return LocalizacionPruebaResponseRecord
	*/
	LocalizacionPruebaResponseRecord saveLocalizacionPrueba(
		LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord);

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name updateLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return LocalizacionPruebaResponseRecord
	*/
	LocalizacionPruebaResponseRecord updateLocalizacionPrueba(
		LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord);

}
