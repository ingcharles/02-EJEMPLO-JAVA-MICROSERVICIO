/**
*
* Este archivo es la interfaz del repositorio: LocalizacionPrueba
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionPruebaRepository
* @package       catalogo-domain-services
* @subpackage   ec.gob.imark.catalogo.controller.query.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.ports.outputs.query;
import ec.gob.imark.catalogo.records.request.LocalizacionPruebaRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord;
import java.util.List;
public interface LocalizacionPruebaQueryRepository
{

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name findAllLocalizacionPrueba
	* @param 
	* @return List<LocalizacionPruebaResponseRecord>
	*/
	 List<LocalizacionPruebaResponseRecord> findAllLocalizacionPrueba();

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name findAllPaginateLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return List<LocalizacionPruebaResponseRecord>
	*/
	 List<LocalizacionPruebaResponseRecord> findAllPaginateLocalizacionPrueba(LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord);

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name findByIdLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return LocalizacionPruebaResponseRecord
	*/
	 LocalizacionPruebaResponseRecord findByIdLocalizacionPrueba(LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord);

}
