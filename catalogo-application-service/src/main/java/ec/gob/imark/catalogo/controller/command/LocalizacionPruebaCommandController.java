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
* @subpackage   ec.gob.imark.catalogo.controller.command
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.controller.command;

import ec.gob.imark.catalogo.records.request.LocalizacionPruebaRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/command/localizacion-prueba")
@Validated
public interface LocalizacionPruebaCommandController
{

	/**
	*
	* Método que guarda los datos de la tabla localizacion_prueba
	*
	* @name saveLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return LocalizacionPruebaResponseRecord
	*/
	@PostMapping("/saveLocalizacionPrueba")
	@ResponseStatus(HttpStatus.OK)
	@Operation(summary = "Método que guarda los datos de la tabla localizacion_prueba")
	LocalizacionPruebaResponseRecord saveLocalizacionPrueba(@Valid @NotNull @RequestBody LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord);

	/**
	*
	* Método que actualiza los datos de la tabla localizacion_prueba
	*
	* @name updateLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return LocalizacionPruebaResponseRecord
	*/
	@PostMapping("/updateLocalizacionPrueba")
	@ResponseStatus(HttpStatus.OK)
	@Operation(summary = "Método que guarda los datos de la tabla localizacion_prueba")
	LocalizacionPruebaResponseRecord updateLocalizacionPrueba(@Valid @NotNull @RequestBody LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord);

}
