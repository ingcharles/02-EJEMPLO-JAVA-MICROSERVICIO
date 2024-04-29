/**
 * <p> Proyecto expel-catalogo-juridico.
 * <p> Clase TipoAccionJpaRepository 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.funcionjudicial.expel.catalogo.juridico.repository;

import ec.gob.funcionjudicial.expel.catalogo.juridico.entity.TipoAccionEntity;
import ec.gob.funcionjudicial.expel.catalogo.records.response.TipoAccionResponseRecord;
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
public interface TipoAccionJpaRepository extends JpaRepository<TipoAccionEntity, Integer> {

  /*@Query(value = """
          select 
            new ec.gob.funcionjudicial.expel.catalogo.records.response.TipoAccionResponseRecord(
              ta.idTipoAccion, ta.nombreTipoAccion
            )
          from 
            TipoAccionEntity ta 
          where 
                ta.estado = 'A' and  ta.idMateria = :idMateria 
      """)*/
  @Query(value="SELECT new ec.gob.funcionjudicial.expel.catalogo.records.response.TipoAccionResponseRecord(t.idLocalizacion, t.nombreLocalizacion) FROM TipoAccionEntity t") //, nativeQuery=true
  //@Query("SELECT t FROM TblModulosNotificaciones t WHERE t.estado=:estado and t.idUsuario=:idUsuario order by idModuloNotificacion desc")
  Optional<List<TipoAccionResponseRecord>> obtenerPorIdMateria(
      @Param("idMateria") Integer idMateria);
}
