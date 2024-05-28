/**
*
* Este archivo es la implementación del controlador: LocalizacionQueryControllerImpl
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionQueryControllerImpl
* @package       catalogo-application-services
* @subpackage    ec.gob.imark.catalogo.controller.query.impl
*
* HISTORIAL DE CAMBIOS
*    1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.controller.query.impl;

import ec.gob.imark.catalogo.ports.inputs.query.LocalizacionQueryService;
import ec.gob.imark.catalogo.controller.query.LocalizacionQueryController;
import ec.gob.imark.catalogo.records.request.LocalizacionFindAllPaginateRequestRecord;
import ec.gob.imark.catalogo.records.request.LocalizacionFindByIdRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindAllResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindAllPaginateResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindByIdResponseRecord;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LocalizacionQueryControllerImpl implements LocalizacionQueryController
{

	private final LocalizacionQueryService localizacionQueryService;

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findAllLocalizacion
	* @param LocalizacionFindAllRequestRecord
	* @return List<LocalizacionFindAllResponseRecord>
	*/
	@Override
	public List<LocalizacionFindAllResponseRecord> findAllLocalizacion()
	{
		return localizacionQueryService.findAllLocalizacion();
	}

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findAllPaginateLocalizacion
	* @param LocalizacionFindAllPaginateRequestRecord
	* @return List<LocalizacionFindAllPaginateResponseRecord>
	*/
	@Override
	public List<LocalizacionFindAllPaginateResponseRecord> findAllPaginateLocalizacion(
	LocalizacionFindAllPaginateRequestRecord localizacionFindAllPaginateRequestRecord)
	{
		return localizacionQueryService.findAllPaginateLocalizacion(localizacionFindAllPaginateRequestRecord);
	}

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findByIdLocalizacion
	* @param LocalizacionFindByIdRequestRecord
	* @return List<LocalizacionFindByIdResponseRecord>
	*/
	@Override
	public List<LocalizacionFindByIdResponseRecord> findByIdLocalizacion(
	LocalizacionFindByIdRequestRecord localizacionFindByIdRequestRecord)
	{
		return localizacionQueryService.findByIdLocalizacion(localizacionFindByIdRequestRecord);
	}

}
