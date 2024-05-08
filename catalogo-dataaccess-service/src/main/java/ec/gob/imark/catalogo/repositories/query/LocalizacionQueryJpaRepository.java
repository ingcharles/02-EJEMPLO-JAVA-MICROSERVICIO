/**
 * <p> Proyecto catalogo-catalogo.
 * <p> Clase LocalizacionQueryJpaRepository 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.imark.catalogo.repositories.query;

import ec.gob.imark.catalogo.entities.LocalizacionEntity;
import ec.gob.imark.catalogo.records.response.LocalizacionFindByIdResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * -- AQUI AÑADIR LA DESCRIPCION DE LA INTERFACE --.
 *
 * <p>Historial de cambios:
 *
 * <ul>
 *   <li>1.0.0 - Descripción del cambio inicial - Carlos.Anchundia - 24/4/2024
 *       <!-- Añadir nuevas entradas de cambios aquí -->
 * </ul>
 *
 * @author Carlos.Anchundia
 * @version 1.0.0
 * @since 24/4/2024
 */
@Repository
public interface LocalizacionQueryJpaRepository extends JpaRepository<LocalizacionEntity, String> {

  @Query(value="SELECT new ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord(t.idLocalizacion, t.nombreLocalizacion) FROM LocalizacionEntity t WHERE t.nivelLocalizacion = :nivelLocalizacion") //, nativeQuery=true
  Optional<List<LocalizacionResponseRecord>> obtenerPorNivelLocalizacion(
      @Param("nivelLocalizacion") Integer nivelLocalizacion);

  @Query(value="SELECT new ec.gob.imark.catalogo.records.response.LocalizacionFindByIdResponseRecord(t.idLocalizacion, t.nombreLocalizacion) FROM LocalizacionEntity t WHERE t.idLocalizacion = :idLocalizacion") //, nativeQuery=true
  Optional<List<LocalizacionFindByIdResponseRecord>> findByIdLocalizacion(
      @Param("idLocalizacion") String idLocalizacion);
}
