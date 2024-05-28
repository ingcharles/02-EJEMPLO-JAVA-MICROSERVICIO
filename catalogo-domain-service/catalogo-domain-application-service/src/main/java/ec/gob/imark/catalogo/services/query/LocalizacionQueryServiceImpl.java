/**
*
* Este archivo es la implementación del controlador: LocalizacionQueryControllerImpl
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionQueryControllerImpl
* @package       catalogoAllPaginateservices
* @subpackage   ec.gob.imark.catalogo.controller.query.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.services.query;

import ec.gob.imark.catalogo.records.request.LocalizacionFindAllPaginateRequestRecord;
import ec.gob.imark.catalogo.records.request.LocalizacionFindByIdRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindAllResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindAllPaginateResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindByIdResponseRecord;
import ec.gob.imark.catalogo.ports.inputs.query.LocalizacionQueryService;
import ec.gob.imark.catalogo.ports.outputs.query.LocalizacionQueryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LocalizacionQueryServiceImpl implements LocalizacionQueryService
{
	private final LocalizacionQueryRepository localizacionQueryRepository;

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findAllLocalizacion
	* @return List<LocalizacionFindByIdResponseRecord>
	*/
	@Override
	@Cacheable(value = "findAlllocalizacion", key = "{#idLocalizacion}")
	public List<LocalizacionFindAllResponseRecord> findAllLocalizacion()
	{
		return localizacionQueryRepository.findAllLocalizacion();
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
	@Cacheable(value = "findAllPaginatelocalizacion", key = "{#idLocalizacion}")
	public List<LocalizacionFindAllPaginateResponseRecord> findAllPaginateLocalizacion(
		LocalizacionFindAllPaginateRequestRecord localizacionFindAllPaginateRequestRecord)
	{
		return localizacionQueryRepository.findAllPaginateLocalizacion(localizacionFindAllPaginateRequestRecord);
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
	@Cacheable(value = "findByIdlocalizacion", key = "{#idLocalizacion}")
	public List<LocalizacionFindByIdResponseRecord> findByIdLocalizacion(
		LocalizacionFindByIdRequestRecord localizacionFindByIdRequestRecord)
	{
		return localizacionQueryRepository.findByIdLocalizacion(localizacionFindByIdRequestRecord);
	}

}
