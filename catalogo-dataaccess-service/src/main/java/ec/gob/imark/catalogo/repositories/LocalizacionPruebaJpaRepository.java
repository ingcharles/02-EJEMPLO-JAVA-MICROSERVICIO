/**
*
* Este archivo es la implementación del controlador: LocalizacionPruebaJpaRepository
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionPruebaJpaRepository
* @package       catalogo-dataaccess-services
* @subpackage    ec.gob.imark.catalogo.controller.query.impl
*
* HISTORIAL DE CAMBIOS
*    1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.repositories;

import ec.gob.imark.catalogo.entities.LocalizacionPruebaEntity;
import ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizacionPruebaJpaRepository extends JpaRepository<LocalizacionPruebaEntity, Integer>
{

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name findAllLocalizacionPrueba
	* @param 
	* @return List<LocalizacionPruebaResponseRecord>
	*/
	@Query(value="SELECT new ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord(t.idLocalizacionPrueba,t.nombreLocalizacionPrueba,t.isLocalizacionPrueba,t.enteroLocalizacionPrueba,t.decimalLocalizacionPrueba,t.descripcionLocalizacionPrueba,t.fechaLocalizacionPrueba,t.estadoLocalizacionPrueba) FROM LocalizacionPruebaEntity t")
	Optional<List<LocalizacionPruebaResponseRecord>> findAllLocalizacionPrueba();

  /**
   *
   * Método que obtiene los datos por id de la tabla localizacion_prueba
   *
   * @name findAllPaginateLocalizacionPrueba
   * @param LocalizacionPruebaRequestRecord
   * @return List<LocalizacionPruebaResponseRecord>
   */
  @Query(
      value =
          """
 SELECT new ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord(t.idLocalizacionPrueba,t.nombreLocalizacionPrueba,t.isLocalizacionPrueba,t.enteroLocalizacionPrueba,t.decimalLocalizacionPrueba,t.descripcionLocalizacionPrueba,t.fechaLocalizacionPrueba,t.estadoLocalizacionPrueba)
 FROM LocalizacionPruebaEntity t
 WHERE (:search IS NULL OR (LOWER(t.nombreLocalizacionPrueba) LIKE LOWER(CONCAT('%', :search, '%')) OR 
               CAST(t.estadoLocalizacionPrueba AS string) LIKE CONCAT('%', :search, '%') OR 
               LOWER(t.descripcionLocalizacionPrueba) LIKE LOWER(CONCAT('%', :search, '%')) OR 
               CAST(t.fechaLocalizacionPrueba AS string) LIKE CONCAT('%', :search, '%') OR 
               CAST(t.isLocalizacionPrueba AS string) LIKE CONCAT('%', :search, '%') OR 
               CAST(t.enteroLocalizacionPrueba AS string) LIKE CONCAT('%', :search, '%') OR 
               CAST(t.decimalLocalizacionPrueba AS string) LIKE CONCAT('%', :search, '%')))
 """)
  Page<LocalizacionPruebaResponseRecord> findAllPaginateLocalizacionPrueba(
      @Param("search") String search, Pageable pageable);

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion_prueba
	*
	* @name findByIdLocalizacionPrueba
	* @param LocalizacionPruebaRequestRecord
	* @return List<LocalizacionPruebaResponseRecord>
	*/
	@Query(value="SELECT new ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord(t.idLocalizacionPrueba,t.nombreLocalizacionPrueba,t.isLocalizacionPrueba,t.enteroLocalizacionPrueba,t.decimalLocalizacionPrueba,t.descripcionLocalizacionPrueba,t.fechaLocalizacionPrueba,t.estadoLocalizacionPrueba) FROM LocalizacionPruebaEntity t WHERE t.idLocalizacionPrueba = :idLocalizacionPrueba")
	Optional<LocalizacionPruebaResponseRecord> findByIdLocalizacionPrueba(
	@Param("idLocalizacionPrueba") Integer idLocalizacionPrueba);

}
