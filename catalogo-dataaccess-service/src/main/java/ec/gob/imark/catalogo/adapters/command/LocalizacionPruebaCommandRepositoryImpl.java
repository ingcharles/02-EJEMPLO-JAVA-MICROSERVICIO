/**
*
* Este archivo es la implementación del command repository: LocalizacionPruebaRepositoryImpl
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionPruebaCommandRepositoryImpl
* @package       catalogo-dataaccess-services
* @subpackage    ec.gob.imark.catalogo.controller.command.impl
*
* HISTORIAL DE CAMBIOS
*    1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.adapters.command;

import ec.gob.imark.catalogo.entities.LocalizacionPruebaEntity;
import ec.gob.imark.catalogo.exceptions.LocalizacionPruebaException;
import ec.gob.imark.catalogo.mappers.LocalizacionPruebaMapper;
import ec.gob.imark.catalogo.records.request.LocalizacionPruebaRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord;
import ec.gob.imark.catalogo.messages.MessageSourceUtil;
import ec.gob.imark.catalogo.ports.outputs.command.LocalizacionPruebaCommandRepository;
import ec.gob.imark.catalogo.repositories.LocalizacionPruebaJpaRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LocalizacionPruebaCommandRepositoryImpl implements LocalizacionPruebaCommandRepository
{
	private final LocalizacionPruebaJpaRepository localizacionPruebaJpaRepository;
	private final MessageSourceUtil messageSourceUtil;

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name saveLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return LocalizacionPruebaResponseRecord
	*/
	@Override
	@Transactional
	public LocalizacionPruebaResponseRecord saveLocalizacionPrueba(
	LocalizacionPruebaRequestRecord localizacionPruebaRequestRecord)
	{
		LocalizacionPruebaEntity localizacionPruebaEntity = LocalizacionPruebaMapper.INSTANCE.requestRecordToEntity(localizacionPruebaRequestRecord);
		localizacionPruebaEntity = localizacionPruebaJpaRepository.save(localizacionPruebaEntity); 
		return LocalizacionPruebaMapper.INSTANCE.entityToResponseRecord(localizacionPruebaEntity); 
	}

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name updateLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return LocalizacionPruebaResponseRecord
	*/
	@Override
	@Transactional
	public LocalizacionPruebaResponseRecord updateLocalizacionPrueba(
	LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord)
	{
	return null;
	}

}
