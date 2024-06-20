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
import ec.gob.imark.catalogo.records.request.LocalizacionRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
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
	* @param LocalizacionRequestRecord
	* @return LocalizacionResponseRecord
	*/
	@Override
	@Transactional()
	public LocalizacionResponseRecord saveLocalizacion(
		LocalizacionRequestRecord localizacionRequestRecord)
	{
		return localizacionCommandRepository.saveLocalizacion(localizacionRequestRecord);
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
	public LocalizacionResponseRecord updateLocalizacion(
		LocalizacionRequestRecord localizacionRequestRecord)
	{
		return localizacionCommandRepository.updateLocalizacion(localizacionRequestRecord);
	}

}
