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

import ec.gob.imark.catalogo.exceptions.LocalizacionException;
import ec.gob.imark.catalogo.records.request.LocalizacionSaveRequestRecord;
import ec.gob.imark.catalogo.records.request.LocalizacionUpdateRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionSaveResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionUpdateResponseRecord;
import ec.gob.imark.catalogo.repositories.command.LocalizacionCommandJpaRepository;
import ec.gob.imark.catalogo.messages.MessageSourceUtil;
import ec.gob.imark.catalogo.ports.outputs.command.LocalizacionCommandRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LocalizacionCommandRepositoryImpl implements LocalizacionCommandRepository
{
	private final LocalizacionCommandJpaRepository localizacionCommandJpaRepository;
	private final MessageSourceUtil messageSourceUtil;

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name saveLocalizacion
	* @param LocalizacionSaveRequestRecord
	* @return List<LocalizacionSaveResponseRecord>
	*/
	@Override
	public List<LocalizacionSaveResponseRecord> saveLocalizacion(
	LocalizacionSaveRequestRecord localizacionSaveRequestRecord)
	{
		return localizacionCommandJpaRepository.saveLocalizacion(localizacionSaveRequestRecord.idLocalizacion())
		.orElseThrow(() -> new LocalizacionException(String.format(messageSourceUtil.getMessage("localizacion.component.exception.notfound"),
		localizacionSaveRequestRecord.idLocalizacion())));
	}

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name updateLocalizacion
	* @param LocalizacionUpdateRequestRecord
	* @return List<LocalizacionUpdateResponseRecord>
	*/
	@Override
	public List<LocalizacionUpdateResponseRecord> updateLocalizacion(
	LocalizacionUpdateRequestRecord localizacionUpdateRequestRecord)
	{
		return localizacionCommandJpaRepository.updateLocalizacion(localizacionUpdateRequestRecord.idLocalizacion())
		.orElseThrow(() -> new LocalizacionException(String.format(messageSourceUtil.getMessage("localizacion.component.exception.notfound"),
		localizacionUpdateRequestRecord.idLocalizacion())));
	}

}
