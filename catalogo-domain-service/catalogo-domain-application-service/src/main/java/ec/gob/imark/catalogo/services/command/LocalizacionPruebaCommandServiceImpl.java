/**
*
* Este archivo es la implementación del controlador: LocalizacionPruebaCommandControllerImpl
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionPruebaCommandControllerImpl
* @package       catalogoAllPaginateservices
* @subpackage   ec.gob.imark.catalogo.controller.xommand.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.services.command;
import ec.gob.imark.catalogo.records.request.LocalizacionPruebaRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord;
import ec.gob.imark.catalogo.ports.inputs.command.LocalizacionPruebaCommandService;
import ec.gob.imark.catalogo.ports.outputs.command.LocalizacionPruebaCommandRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LocalizacionPruebaCommandServiceImpl implements LocalizacionPruebaCommandService
{
	private final LocalizacionPruebaCommandRepository localizacionpruebaCommandRepository;

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name saveLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return LocalizacionPruebaResponseRecord
	*/
	@Override
	@Transactional()
	public LocalizacionPruebaResponseRecord saveLocalizacionPrueba(
		LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord)
	{
		return localizacionpruebaCommandRepository.saveLocalizacionPrueba(localizacionpruebaRequestRecord);
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
	public LocalizacionPruebaResponseRecord updateLocalizacionPrueba(
		LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord)
	{
		return localizacionpruebaCommandRepository.updateLocalizacionPrueba(localizacionpruebaRequestRecord);
	}

}
