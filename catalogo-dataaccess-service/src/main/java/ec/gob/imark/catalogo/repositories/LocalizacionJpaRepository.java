/**
*
* Este archivo es la implementación del controlador: LocalizacionJpaRepository
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionJpaRepository
* @package       catalogo-dataaccess-services
* @subpackage    ec.gob.imark.catalogo.controller.query.impl
*
* HISTORIAL DE CAMBIOS
*    1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.repositories;

import ec.gob.imark.catalogo.entities.LocalizacionEntity;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizacionJpaRepository extends JpaRepository<LocalizacionEntity, Integer>
{

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findAllLocalizacion
	* @param 
	* @return List<LocalizacionResponseRecord>
	*/
	@Query(value="SELECT new ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord(t.idLocalizacion,t.idLocalizacionPadre,t.nombreLocalizacion,t.codigoLocalizacion,t.nombreNacionalidadLocalizacion,t.regimenEscolarLocalizacion,t.tieneJuzgadoLocalizacion,t.esUrbanaLocalizacion,t.nivelLocalizacion) FROM LocalizacionEntity t")
	Optional<List<LocalizacionResponseRecord>> findAllLocalizacion();

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findAllPaginateLocalizacion
	* @param LocalizacionRequestRecord
	* @return List<LocalizacionResponseRecord>
	*/
	@Query(value="SELECT new ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord(t.idLocalizacion,t.idLocalizacionPadre,t.nombreLocalizacion,t.codigoLocalizacion,t.nombreNacionalidadLocalizacion,t.regimenEscolarLocalizacion,t.tieneJuzgadoLocalizacion,t.esUrbanaLocalizacion,t.nivelLocalizacion) FROM LocalizacionEntity t WHERE t.idLocalizacion = :idLocalizacion")
	Optional<List<LocalizacionResponseRecord>> findAllPaginateLocalizacion(
	@Param("idLocalizacion") String idLocalizacion);

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name findByIdLocalizacion
	* @param LocalizacionRequestRecord
	* @return List<LocalizacionResponseRecord>
	*/
	@Query(value="SELECT new ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord(t.idLocalizacion,t.idLocalizacionPadre,t.nombreLocalizacion,t.codigoLocalizacion,t.nombreNacionalidadLocalizacion,t.regimenEscolarLocalizacion,t.tieneJuzgadoLocalizacion,t.esUrbanaLocalizacion,t.nivelLocalizacion) FROM LocalizacionEntity t WHERE t.idLocalizacion = :idLocalizacion")
	Optional<LocalizacionResponseRecord> findByIdLocalizacion(
	@Param("idLocalizacion") String idLocalizacion);

}
