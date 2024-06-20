/**
*
* Este archivo es la implementación del command repository: LocalizacionRepositoryImpl
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionCommandRepositoryImpl
* @package       catalogo-dataaccess-services
* @subpackage    ec.gob.imark.catalogo.controller.command.impl
*
* HISTORIAL DE CAMBIOS
*    1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.adapters.command;

import ec.gob.imark.catalogo.entities.LocalizacionEntity;
import ec.gob.imark.catalogo.exceptions.LocalizacionException;
import ec.gob.imark.catalogo.mappers.LocalizacionMapper;
import ec.gob.imark.catalogo.records.request.LocalizacionRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
import ec.gob.imark.catalogo.messages.MessageSourceUtil;
import ec.gob.imark.catalogo.ports.outputs.command.LocalizacionCommandRepository;
import ec.gob.imark.catalogo.repositories.LocalizacionJpaRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LocalizacionCommandRepositoryImpl implements LocalizacionCommandRepository
{
	private final LocalizacionJpaRepository localizacionJpaRepository;
	private final MessageSourceUtil messageSourceUtil;

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name saveLocalizacion
	* @param LocalizacionRequestRecord
	* @return LocalizacionResponseRecord
	*/
	@Override
	@Transactional
	public LocalizacionResponseRecord saveLocalizacion(
	LocalizacionRequestRecord localizacionRequestRecord)
	{
		LocalizacionEntity parent = localizacionJpaRepository.findByIdLocalizacion(localizacionRequestRecord.idLocalizacionPadre()).map(LocalizacionMapper.INSTANCE::responseRecordToEntity).orElseThrow(()-> new LocalizacionException("Parent Localizacion not found")); 
		LocalizacionEntity localizacionEntity = LocalizacionMapper.INSTANCE.requestRecordToEntity(localizacionRequestRecord);
		localizacionEntity = localizacionJpaRepository.save(localizacionEntity); 
		return LocalizacionMapper.INSTANCE.entityToResponseRecord(localizacionEntity); 
	}

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name updateLocalizacion
	* @param LocalizacionRequestRecord
	* @return LocalizacionResponseRecord
	*/
	@Override
	@Transactional
	public LocalizacionResponseRecord updateLocalizacion(
	LocalizacionRequestRecord localizacionRequestRecord)
	{
	return null;
	}

}
