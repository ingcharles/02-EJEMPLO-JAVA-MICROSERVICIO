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

import ec.gob.imark.catalogo.records.request.LocalizacionSaveRequestRecord;
import ec.gob.imark.catalogo.records.request.LocalizacionUpdateRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionSaveResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionUpdateResponseRecord;
import java.util.List;
public interface LocalizacionCommandService
{

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name saveLocalizacion
	* @param LocalizacionSaveRequestRecord
	* @return List<LocalizacionSaveResponseRecord>
	*/
	List<LocalizacionSaveResponseRecord> saveLocalizacion(
		LocalizacionSaveRequestRecord localizacionSaveRequestRecord);

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name updateLocalizacion
	* @param LocalizacionUpdateRequestRecord
	* @return List<LocalizacionUpdateResponseRecord>
	*/
	List<LocalizacionUpdateResponseRecord> updateLocalizacion(
		LocalizacionUpdateRequestRecord localizacionUpdateRequestRecord);

}
