/**
*
* Este archivo es la implementación del query repository: LocalizacionRepositoryImpl
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionQueryRepositoryImpl
* @package       catalogo-dataaccess-services
* @subpackage    ec.gob.imark.catalogo.controller.query.impl
*
* HISTORIAL DE CAMBIOS
*    1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.adapters.query;

import ec.gob.imark.catalogo.exceptions.LocalizacionException;
import ec.gob.imark.catalogo.records.request.LocalizacionFindAllPaginateRequestRecord;
import ec.gob.imark.catalogo.records.request.LocalizacionFindByIdRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindAllResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindAllPaginateResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindByIdResponseRecord;
import ec.gob.imark.catalogo.repositories.query.LocalizacionQueryJpaRepository;
import ec.gob.imark.catalogo.messages.MessageSourceUtil;
import ec.gob.imark.catalogo.ports.outputs.query.LocalizacionQueryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LocalizacionQueryRepositoryImpl implements LocalizacionQueryRepository
{
	private final LocalizacionQueryJpaRepository localizacionQueryJpaRepository;
	private final MessageSourceUtil messageSourceUtil;

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findAllLocalizacion
	* @return List<LocalizacionFindAllResponseRecord>
	*/
	@Override
	public List<LocalizacionFindAllResponseRecord> findAllLocalizacion()
	{
		return localizacionQueryJpaRepository.findAllLocalizacion()
		.orElseThrow(() -> new LocalizacionException(String.format(messageSourceUtil.getMessage("localizacion.component.exception.notfound"))));
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
		return localizacionQueryJpaRepository.findAllPaginateLocalizacion(localizacionFindAllPaginateRequestRecord.idLocalizacion())
		.orElseThrow(() -> new LocalizacionException(String.format(messageSourceUtil.getMessage("localizacion.component.exception.notfound"),
		localizacionFindAllPaginateRequestRecord.idLocalizacion())));
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
		return localizacionQueryJpaRepository.findByIdLocalizacion(localizacionFindByIdRequestRecord.idLocalizacion())
		.orElseThrow(() -> new LocalizacionException(String.format(messageSourceUtil.getMessage("localizacion.component.exception.notfound"),
		localizacionFindByIdRequestRecord.idLocalizacion())));
	}

}
