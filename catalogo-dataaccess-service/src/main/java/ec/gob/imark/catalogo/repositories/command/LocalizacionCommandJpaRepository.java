/**
*
* Este archivo es la implementación del controlador: LocalizacionCommandJpaRepository
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionCommandJpaRepository
* @package       catalogo-dataaccess-services
* @subpackage    ec.gob.imark.catalogo.controller.command.impl
*
* HISTORIAL DE CAMBIOS
*    1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.repositories.command;

import ec.gob.imark.catalogo.entities.LocalizacionEntity;
import ec.gob.imark.catalogo.records.response.LocalizacionSaveResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionUpdateResponseRecord;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizacionCommandJpaRepository extends JpaRepository<LocalizacionEntity, Integer>
{

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findAllPaginateLocalizacion
	* @param LocalizacionFindAllPaginateRequestRecord
	* @return List<LocalizacionFindAllPaginateResponseRecord>
	*/
	@Query(value="SELECT new ec.gob.imark.catalogo.records.response.LocalizacionSaveResponseRecord(t.idLocalizacion,t.idLocalizacionPadre,t.nombreLocalizacion,t.codigoLocalizacion,t.nombreNacionalidadLocalizacion,t.regimenEscolarLocalizacion,t.tieneJuzgadoLocalizacion,t.esUrbanaLocalizacion,t.nivelLocalizacion) FROM LocalizacionEntity t WHERE t.idLocalizacion = :idLocalizacion")
	Optional<List<LocalizacionSaveResponseRecord>> saveLocalizacion(
	@Param("idLocalizacion") String idLocalizacion);

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findAllPaginateLocalizacion
	* @param LocalizacionFindAllPaginateRequestRecord
	* @return List<LocalizacionFindAllPaginateResponseRecord>
	*/
	@Query(value="SELECT new ec.gob.imark.catalogo.records.response.LocalizacionUpdateResponseRecord(t.idLocalizacion,t.idLocalizacionPadre,t.nombreLocalizacion,t.codigoLocalizacion,t.nombreNacionalidadLocalizacion,t.regimenEscolarLocalizacion,t.tieneJuzgadoLocalizacion,t.esUrbanaLocalizacion,t.nivelLocalizacion) FROM LocalizacionEntity t WHERE t.idLocalizacion = :idLocalizacion")
	Optional<List<LocalizacionUpdateResponseRecord>> updateLocalizacion(
	@Param("idLocalizacion") String idLocalizacion);

}
