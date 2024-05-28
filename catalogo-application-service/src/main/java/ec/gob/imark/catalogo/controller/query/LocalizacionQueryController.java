/**
*
* Este archivo es la implementación del controlador: LocalizacionQueryControllerImpl
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionQueryControllerImpl
* @package       catalogo-application-services
* @subpackage   ec.gob.imark.catalogo.controller.query.impl
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.controller.query;

import ec.gob.imark.catalogo.records.request.LocalizacionFindByIdRequestRecord;
import ec.gob.imark.catalogo.records.request.LocalizacionFindAllPaginateRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindAllResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindAllPaginateResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindByIdResponseRecord;
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

@RequestMapping(value = "/query/localizacion")
@Validated
public interface LocalizacionQueryController
{

	/**
	*
	* Método que obtiene los datos de la tabla localizacion
	*
	* @name findAllLocalizacion
	* @return List<LocalizacionResponseRecord>
	*/
	@GetMapping("/findAllLocalizacion")
	@ResponseStatus(HttpStatus.OK)
	@Operation(summary = "Método que obtiene los datos de la tabla localizacion")
	List<LocalizacionFindAllResponseRecord> findAllLocalizacion();

	/**
	*
	* Método que obtiene los datos de la tabla localizacion
	*
	* @name FindAllPaginateLocalizacion
	* @param LocalizacionFindAllPaginateRequestRecord
	* @return List<LocalizacionFindAllPaginateResponseRecord>
	*/
	@PostMapping("/findAllPaginateLocalizacion")
	@ResponseStatus(HttpStatus.OK)
	@Operation(summary = "Método que obtiene los datos de la tabla localizacion")
	List<LocalizacionFindAllPaginateResponseRecord> findAllPaginateLocalizacion(
		@Valid @NotNull @RequestBody LocalizacionFindAllPaginateRequestRecord localizacionFindAllPaginateRequestRecord);

	/**
	*
	* Método que obtiene los datos de la tabla localizacion
	*
	* @name findByIdLocalizacion
	* @param LocalizacionFindByIdRequestRecord
	* @return List<LocalizacionFindByIdResponseRecord>
	*/
	@PostMapping("/findByIdLocalizacion")
	@ResponseStatus(HttpStatus.OK)
	@Operation(summary = "Método que obtiene los datos de la tabla localizacion")
	List<LocalizacionFindByIdResponseRecord> findByIdLocalizacion(
		@Valid @NotNull @RequestBody LocalizacionFindByIdRequestRecord localizacionFindByIdRequestRecord);

}
