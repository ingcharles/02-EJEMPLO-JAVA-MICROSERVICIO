/**
*
* Este archivo es la implementación del controlador: LocalizacionCommandService
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionCommandService
* @package       catalogo-domain-services
* @subpackage   ec.gob.imark.catalogo.controller.command.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.ports.inputs.command;

import ec.gob.imark.catalogo.records.request.LocalizacionRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
import java.util.List;
public interface LocalizacionCommandService
{

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name saveLocalizacion
	* @param LocalizacionRequestRecord
	* @return LocalizacionResponseRecord
	*/
	LocalizacionResponseRecord saveLocalizacion(
		LocalizacionRequestRecord localizacionRequestRecord);

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name updateLocalizacion
	* @param LocalizacionRequestRecord
	* @return LocalizacionResponseRecord
	*/
	LocalizacionResponseRecord updateLocalizacion(
		LocalizacionRequestRecord localizacionRequestRecord);

}
