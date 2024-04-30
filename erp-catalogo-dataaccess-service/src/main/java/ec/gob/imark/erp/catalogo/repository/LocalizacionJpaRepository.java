/**
 * <p> Proyecto erp-catalogo.
 * <p> Clase LocalizacionJpaRepository 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.imark.erp.catalogo.repository;

import ec.gob.imark.erp.catalogo.entity.LocalizacionEntity;
import ec.gob.imark.erp.catalogo.records.response.LocalizacionResponseRecord;

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
public interface LocalizacionJpaRepository extends JpaRepository<LocalizacionEntity, Integer> {

  /*@Query(value = """
          select 
            new ec.gob.imark.erp.catalogo.records.response.LocalizacionResponseRecord(
              ta.idTipoAccion, ta.nombreTipoAccion
            )
          from 
            LocalizacionEntity ta
          where 
                ta.estado = 'A' and  ta.idMateria = :idMateria 
      """)*/
  @Query(value="SELECT new ec.gob.imark.erp.catalogo.records.response.LocalizacionResponseRecord(t.idLocalizacion, t.nombreLocalizacion) FROM LocalizacionEntity t") //, nativeQuery=true
  //@Query("SELECT t FROM TblModulosNotificaciones t WHERE t.estado=:estado and t.idUsuario=:idUsuario order by idModuloNotificacion desc")
  Optional<List<LocalizacionResponseRecord>> obtenerPorNivelLocalizacion(
      @Param("idMateria") Integer idMateria);
}
