/**
*
* Este archivo es la implementación del controlador: LocalizacionCommandControllerImpl
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionCommandControllerImpl
* @package       catalogo-application-services
* @subpackage    ec.gob.imark.catalogo.controller.command.impl
*
* HISTORIAL DE CAMBIOS
*    1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.controller.command.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import ec.gob.imark.catalogo.ports.inputs.command.LocalizacionCommandService;
import ec.gob.imark.catalogo.controller.command.LocalizacionCommandController;
import ec.gob.imark.catalogo.records.request.LocalizacionSaveRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionSaveResponseRecord;
import ec.gob.imark.catalogo.records.request.LocalizacionUpdateRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionUpdateResponseRecord;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LocalizacionCommandControllerImpl implements LocalizacionCommandController
{

	private final LocalizacionCommandService localizacionCommandService;

	/**
	*
	* Método que guarda los datos de la tabla localizacion
	*
	* @name saveLocalizacion
	* @param LocalizacionSaveRequestRecord
	* @return List<LocalizacionSaveResponseRecord>
	*/
	@Override
	public LocalizacionSaveResponseRecord saveLocalizacion(LocalizacionSaveRequestRecord localizacionSaveRequestRecord)
			throws JsonProcessingException {
		return localizacionCommandService.saveLocalizacion(localizacionSaveRequestRecord);
	}

	/**
	*
	* Método que actualiza los datos de la tabla localizacion
	*
	* @name updateLocalizacion
	* @param LocalizacionUpdateRequestRecord
	* @return List<LocalizacionUpdateResponseRecord>
	*/
	@Override
	public List<LocalizacionUpdateResponseRecord> updateLocalizacion(LocalizacionUpdateRequestRecord localizacionUpdateRequestRecord)
	{
		return localizacionCommandService.updateLocalizacion(localizacionUpdateRequestRecord);
	}

}
