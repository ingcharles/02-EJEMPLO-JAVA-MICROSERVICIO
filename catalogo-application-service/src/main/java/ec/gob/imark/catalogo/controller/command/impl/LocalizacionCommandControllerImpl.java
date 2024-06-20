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

import ec.gob.imark.catalogo.ports.inputs.command.LocalizacionCommandService;
import ec.gob.imark.catalogo.controller.command.LocalizacionCommandController;
import ec.gob.imark.catalogo.records.request.LocalizacionRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
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
	* @param LocalizacionRequestRecord
	* @return LocalizacionResponseRecord
	*/
	@Override
	public LocalizacionResponseRecord saveLocalizacion(LocalizacionRequestRecord localizacionRequestRecord)
	{
		return localizacionCommandService.saveLocalizacion(localizacionRequestRecord);
	}

	/**
	*
	* Método que actualiza los datos de la tabla localizacion
	*
	* @name updateLocalizacion
	* @param LocalizacionRequestRecord
	* @return LocalizacionResponseRecord
	*/
	@Override
	public LocalizacionResponseRecord updateLocalizacion(LocalizacionRequestRecord localizacionRequestRecord)
	{
		return localizacionCommandService.updateLocalizacion(localizacionRequestRecord);
	}

}
