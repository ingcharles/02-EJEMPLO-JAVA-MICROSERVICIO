/**
*
* Este archivo es la implementación del query repository: LocalizacionPruebaRepositoryImpl
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionPruebaQueryRepositoryImpl
* @package       catalogo-dataaccess-services
* @subpackage    ec.gob.imark.catalogo.controller.query.impl
*
* HISTORIAL DE CAMBIOS
*    1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.adapters.query;

import ec.gob.imark.catalogo.exceptions.LocalizacionPruebaException;
import ec.gob.imark.catalogo.records.request.LocalizacionPruebaRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord;
import ec.gob.imark.catalogo.repositories.LocalizacionPruebaJpaRepository;
import ec.gob.imark.catalogo.messages.MessageSourceUtil;
import ec.gob.imark.catalogo.ports.outputs.query.LocalizacionPruebaQueryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LocalizacionPruebaQueryRepositoryImpl implements LocalizacionPruebaQueryRepository
{
	private final LocalizacionPruebaJpaRepository localizacionPruebaJpaRepository;
	private final MessageSourceUtil messageSourceUtil;

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
		return localizacionPruebaJpaRepository.findAllLocalizacionPrueba()
		.orElseThrow(() -> new LocalizacionPruebaException(String.format(messageSourceUtil.getMessage("localizacionPrueba.component.exception.notfound"))));
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
	public Page<LocalizacionPruebaResponseRecord> findAllPaginateLocalizacionPrueba(String search,
			Pageable pageable)
	{
		return localizacionPruebaJpaRepository.findAllPaginateLocalizacionPrueba(search, pageable);
		//.orElseThrow(() -> new LocalizacionPruebaException(String.format(messageSourceUtil.getMessage("localizacionPrueba.component.exception.notfound"),
		//localizacionPruebaRequestRecord.idLocalizacionPrueba())));
	}

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name findByIdLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return LocalizacionPruebaResponseRecord
	*/
	@Override
	public LocalizacionPruebaResponseRecord findByIdLocalizacionPrueba(
	LocalizacionPruebaRequestRecord localizacionPruebaRequestRecord)
	{
		return localizacionPruebaJpaRepository.findByIdLocalizacionPrueba(localizacionPruebaRequestRecord.idLocalizacionPrueba())
		.orElseThrow(() -> new LocalizacionPruebaException(String.format(messageSourceUtil.getMessage("localizacionPrueba.component.exception.notfound"),
		localizacionPruebaRequestRecord.idLocalizacionPrueba())));
	}

}
