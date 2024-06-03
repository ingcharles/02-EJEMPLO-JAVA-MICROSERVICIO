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
* @subpackage   ec.gob.imark.catalogo.controller.command
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.controller.command;

import com.fasterxml.jackson.core.JsonProcessingException;
import ec.gob.imark.catalogo.records.request.LocalizacionSaveRequestRecord;
import ec.gob.imark.catalogo.records.request.LocalizacionUpdateRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionSaveResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionUpdateResponseRecord;
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

@RequestMapping("/command/localizacion")
@Validated
public interface LocalizacionCommandController
{

	/**
	*
	* Método que guarda los datos de la tabla localizacion
	*
	* @name saveLocalizacion
	* @param LocalizacionSaveRequestRecord
	* @return List<LocalizacionSaveResponseRecord>
	*/
	@PostMapping("/saveLocalizacion")
	@ResponseStatus(HttpStatus.OK)
	@Operation(summary = "Método que guarda los datos de la tabla localizacion")
	LocalizacionSaveResponseRecord saveLocalizacion(@Valid @NotNull @RequestBody LocalizacionSaveRequestRecord localizacionSaveRequestRecord)
      throws JsonProcessingException;

	/**
	*
	* Método que actualiza los datos de la tabla localizacion
	*
	* @name updateLocalizacion
	* @param LocalizacionUpdateRequestRecord
	* @return List<LocalizacionUpdateResponseRecord>
	*/
	@PostMapping("/updateLocalizacion")
	@ResponseStatus(HttpStatus.OK)
	@Operation(summary = "Método que guarda los datos de la tabla localizacion")
	List<LocalizacionUpdateResponseRecord> updateLocalizacion(@Valid @NotNull @RequestBody LocalizacionUpdateRequestRecord localizacionUpdateRequestRecord);

}
