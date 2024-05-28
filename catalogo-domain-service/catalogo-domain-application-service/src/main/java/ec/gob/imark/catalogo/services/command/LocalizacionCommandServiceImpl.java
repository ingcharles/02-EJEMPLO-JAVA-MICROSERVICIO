/**
*
* Este archivo es la implementación del controlador: LocalizacionCommandControllerImpl
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionCommandControllerImpl
* @package       catalogoAllPaginateservices
* @subpackage   ec.gob.imark.catalogo.controller.xommand.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.services.command;

import ec.gob.imark.catalogo.records.request.LocalizacionSaveRequestRecord;
import ec.gob.imark.catalogo.records.request.LocalizacionUpdateRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionSaveResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionUpdateResponseRecord;
import ec.gob.imark.catalogo.ports.inputs.command.LocalizacionCommandService;
import ec.gob.imark.catalogo.ports.outputs.command.LocalizacionCommandRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LocalizacionCommandServiceImpl implements LocalizacionCommandService
{
	private final LocalizacionCommandRepository localizacionCommandRepository;

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name saveLocalizacion
	* @param LocalizacionSaveRequestRecord
	* @return List<LocalizacionSaveResponseRecord>
	*/
	@Override
	@Cacheable(value = "savelocalizacion", key = "{#idLocalizacion}")
	public List<LocalizacionSaveResponseRecord> saveLocalizacion(
		LocalizacionSaveRequestRecord localizacionSaveRequestRecord)
	{
		return localizacionCommandRepository.saveLocalizacion(localizacionSaveRequestRecord);
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
	@Cacheable(value = "updatelocalizacion", key = "{#idLocalizacion}")
	public List<LocalizacionUpdateResponseRecord> updateLocalizacion(
		LocalizacionUpdateRequestRecord localizacionUpdateRequestRecord)
	{
		return localizacionCommandRepository.updateLocalizacion(localizacionUpdateRequestRecord);
	}

}
