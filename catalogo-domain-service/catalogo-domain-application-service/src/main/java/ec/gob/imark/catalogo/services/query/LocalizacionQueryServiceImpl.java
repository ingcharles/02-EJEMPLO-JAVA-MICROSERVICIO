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
import ec.gob.imark.catalogo.records.request.LocalizacionRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
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
	* @return List<LocalizacionResponseRecord>
	*/
	@Override
	public List<LocalizacionResponseRecord> findAllLocalizacion()
	{
		return localizacionQueryRepository.findAllLocalizacion();
	}

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findAllPaginateLocalizacion
	* @param LocalizacionRequestRecord
	* @return List<LocalizacionResponseRecord>
	*/
	@Override
	public List<LocalizacionResponseRecord> findAllPaginateLocalizacion(
		LocalizacionRequestRecord localizacionRequestRecord)
	{
		return localizacionQueryRepository.findAllPaginateLocalizacion(localizacionRequestRecord);
	}

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findByIdLocalizacion
	* @param LocalizacionRequestRecord
	* @return List<LocalizacionResponseRecord>
	*/
	@Override
	public LocalizacionResponseRecord findByIdLocalizacion(
		LocalizacionRequestRecord localizacionRequestRecord)
	{
		return localizacionQueryRepository.findByIdLocalizacion(localizacionRequestRecord);
	}

}
