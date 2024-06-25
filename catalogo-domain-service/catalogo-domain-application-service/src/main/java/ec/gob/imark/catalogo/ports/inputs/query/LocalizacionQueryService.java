/**
*
* Este archivo es la implementación del controlador: LocalizacionQueryService
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionQueryService
* @package       catalogo-domain-services
* @subpackage   ec.gob.imark.catalogo.controller.query.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.ports.inputs.query;

import ec.gob.imark.catalogo.records.request.LocalizacionRequestRecord;
import ec.gob.imark.catalogo.records.request.LocalizacionRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
import java.util.List;
public interface LocalizacionQueryService
{

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findAllLocalizacion
	* @param 
	* @return List<LocalizacionResponseRecord>
	*/
	List<LocalizacionResponseRecord> findAllLocalizacion();

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findAllPaginateLocalizacion
	* @param LocalizacionRequestRecord
	* @return List<LocalizacionResponseRecord>
	*/
	List<LocalizacionResponseRecord> findAllPaginateLocalizacion(
		LocalizacionRequestRecord localizacionRequestRecord);

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findByIdLocalizacion
	* @param LocalizacionRequestRecord
	* @return LocalizacionResponseRecord
	*/
	LocalizacionResponseRecord findByIdLocalizacion(
		LocalizacionRequestRecord localizacionRequestRecord);

}
