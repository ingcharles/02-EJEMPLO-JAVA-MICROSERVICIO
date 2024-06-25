/**
*
* Este archivo es la implementación del controlador: LocalizacionPruebaQueryControllerImpl
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionPruebaQueryControllerImpl
* @package       catalogo-application-services
* @subpackage    ec.gob.imark.catalogo.controller.query.impl
*
* HISTORIAL DE CAMBIOS
*    1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.controller.query.impl;

import ec.gob.imark.catalogo.ports.inputs.query.LocalizacionPruebaQueryService;
import ec.gob.imark.catalogo.controller.query.LocalizacionPruebaQueryController;
import ec.gob.imark.catalogo.records.request.LocalizacionPruebaRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LocalizacionPruebaQueryControllerImpl implements LocalizacionPruebaQueryController
{

	private final LocalizacionPruebaQueryService localizacionpruebaQueryService;

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name findAllLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return List<LocalizacionPruebaResponseRecord>
	*/
	@Override
	public List<LocalizacionPruebaResponseRecord> findAllLocalizacionPrueba()
	{
		return localizacionpruebaQueryService.findAllLocalizacionPrueba();
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
	public List<LocalizacionPruebaResponseRecord> findAllPaginateLocalizacionPrueba(
	LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord)
	{
		return localizacionpruebaQueryService.findAllPaginateLocalizacionPrueba(localizacionpruebaRequestRecord);
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
	LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord)
	{
		return localizacionpruebaQueryService.findByIdLocalizacionPrueba(localizacionpruebaRequestRecord);
	}

}
