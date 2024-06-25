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
* @subpackage   ec.gob.imark.catalogo.controller.query.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.controller.query;

import ec.gob.imark.catalogo.records.request.LocalizacionPruebaRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping(value = "/query/localizacion-prueba")
@Validated
public interface LocalizacionPruebaQueryController
{

	/**
	*
	* Método que obtiene los datos de la tabla localizacion_prueba
	*
	* @name findAllLocalizacionPrueba
	* @return List<LocalizacionPruebaResponseRecord>
	*/
	@GetMapping("/findAllLocalizacionPrueba")
	@ResponseStatus(HttpStatus.OK)
	@Operation(summary = "Método que obtiene los datos de la tabla localizacion_prueba")
	List<LocalizacionPruebaResponseRecord> findAllLocalizacionPrueba();

	/**
	*
	* Método que obtiene los datos de la tabla localizacion_prueba
	*
	* @name FindAllPaginateLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return List<LocalizacionPruebaResponseRecord>
	*/
	@PostMapping("/findAllPaginateLocalizacionPrueba")
	@ResponseStatus(HttpStatus.OK)
	@Operation(summary = "Método que obtiene los datos de la tabla localizacion_prueba")
	List<LocalizacionPruebaResponseRecord> findAllPaginateLocalizacionPrueba(
		@Valid @NotNull @RequestBody LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord);

	/**
	*
	* Método que obtiene los datos de la tabla localizacion_prueba
	*
	* @name findByIdLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return LocalizacionPruebaResponseRecord
	*/
	@PostMapping("/findByIdLocalizacionPrueba")
	@ResponseStatus(HttpStatus.OK)
	@Operation(summary = "Método que obtiene los datos de la tabla localizacion_prueba")
	LocalizacionPruebaResponseRecord findByIdLocalizacionPrueba(
		@Valid @NotNull @RequestBody LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord);

}
