/**
*
* Este archivo es la implementación del controlador: LocalizacionPruebaQueryControllerImpl
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionPruebaQueryControllerImpl
* @package       catalogoAllPaginateservices
* @subpackage   ec.gob.imark.catalogo.controller.query.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.services.query;
import ec.gob.imark.catalogo.records.request.LocalizacionPruebaRequestRecord;
import ec.gob.imark.catalogo.records.request.PaginationRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord;
import ec.gob.imark.catalogo.ports.inputs.query.LocalizacionPruebaQueryService;
import ec.gob.imark.catalogo.ports.outputs.query.LocalizacionPruebaQueryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LocalizacionPruebaQueryServiceImpl implements LocalizacionPruebaQueryService
{
	private final LocalizacionPruebaQueryRepository localizacionpruebaQueryRepository;

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name findAllLocalizacionPrueba
	* @return List<LocalizacionPruebaResponseRecord>
	*/
	@Override
	public List<LocalizacionPruebaResponseRecord> findAllLocalizacionPrueba()
	{
		return localizacionpruebaQueryRepository.findAllLocalizacionPrueba();
	}

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name findAllPaginateLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return List<LocalizacionPruebaResponseRecord>
	*/
	@Override
	public Page<LocalizacionPruebaResponseRecord> findAllPaginateLocalizacionPrueba(
			PaginationRequestRecord paginationRequestRecord)
	{
		Pageable pageable = PageRequest.of(paginationRequestRecord.page(), paginationRequestRecord.size());
		return localizacionpruebaQueryRepository.findAllPaginateLocalizacionPrueba(paginationRequestRecord.search(),pageable);
	}

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name findByIdLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return List<LocalizacionPruebaResponseRecord>
	*/
	@Override
	public LocalizacionPruebaResponseRecord findByIdLocalizacionPrueba(
		LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord)
	{
		return localizacionpruebaQueryRepository.findByIdLocalizacionPrueba(localizacionpruebaRequestRecord);
	}

}
