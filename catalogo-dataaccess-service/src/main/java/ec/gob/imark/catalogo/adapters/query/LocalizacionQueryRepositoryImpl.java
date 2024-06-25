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
import ec.gob.imark.catalogo.records.request.LocalizacionRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
import ec.gob.imark.catalogo.repositories.LocalizacionJpaRepository;
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
	private final LocalizacionJpaRepository localizacionJpaRepository;
	private final MessageSourceUtil messageSourceUtil;

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
		return localizacionJpaRepository.findAllLocalizacion()
		.orElseThrow(() -> new LocalizacionException(String.format(messageSourceUtil.getMessage("localizacion.component.exception.notfound"))));
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
		return localizacionJpaRepository.findAllPaginateLocalizacion(localizacionRequestRecord.idLocalizacion())
		.orElseThrow(() -> new LocalizacionException(String.format(messageSourceUtil.getMessage("localizacion.component.exception.notfound"),
		localizacionRequestRecord.idLocalizacion())));
	}

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findByIdLocalizacion
	* @param LocalizacionRequestRecord
	* @return LocalizacionResponseRecord
	*/
	@Override
	public LocalizacionResponseRecord findByIdLocalizacion(
	LocalizacionRequestRecord localizacionRequestRecord)
	{
		return localizacionJpaRepository.findByIdLocalizacion(localizacionRequestRecord.idLocalizacion())
		.orElseThrow(() -> new LocalizacionException(String.format(messageSourceUtil.getMessage("localizacion.component.exception.notfound"),
		localizacionRequestRecord.idLocalizacion())));
	}

}
