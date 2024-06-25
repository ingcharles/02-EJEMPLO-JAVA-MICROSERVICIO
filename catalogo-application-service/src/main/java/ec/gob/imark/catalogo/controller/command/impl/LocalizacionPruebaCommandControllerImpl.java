/**
*
* Este archivo es la implementación del controlador: LocalizacionPruebaCommandControllerImpl
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionPruebaCommandControllerImpl
* @package       catalogo-application-services
* @subpackage    ec.gob.imark.catalogo.controller.command.impl
*
* HISTORIAL DE CAMBIOS
*    1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.controller.command.impl;

import ec.gob.imark.catalogo.ports.inputs.command.LocalizacionPruebaCommandService;
import ec.gob.imark.catalogo.controller.command.LocalizacionPruebaCommandController;
import ec.gob.imark.catalogo.records.request.LocalizacionPruebaRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LocalizacionPruebaCommandControllerImpl implements LocalizacionPruebaCommandController
{

	private final LocalizacionPruebaCommandService localizacionpruebaCommandService;

	/**
	*
	* Método que guarda los datos de la tabla localizacion_prueba
	*
	* @name saveLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return LocalizacionPruebaResponseRecord
	*/
	@Override
	public LocalizacionPruebaResponseRecord saveLocalizacionPrueba(LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord)
	{
		return localizacionpruebaCommandService.saveLocalizacionPrueba(localizacionpruebaRequestRecord);
	}

	/**
	*
	* Método que actualiza los datos de la tabla localizacion_prueba
	*
	* @name updateLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return LocalizacionPruebaResponseRecord
	*/
	@Override
	public LocalizacionPruebaResponseRecord updateLocalizacionPrueba(LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord)
	{
		return localizacionpruebaCommandService.updateLocalizacionPrueba(localizacionpruebaRequestRecord);
	}

}
