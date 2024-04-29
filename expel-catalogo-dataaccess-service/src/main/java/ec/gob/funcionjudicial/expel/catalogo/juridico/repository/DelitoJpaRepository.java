/**
 * <p> Proyecto expel-catalogo-juridico.
 * <p> Clase DelitoJpaRepository 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.funcionjudicial.expel.catalogo.juridico.repository;

import ec.gob.funcionjudicial.expel.catalogo.juridico.entity.DelitoEntity;
import ec.gob.funcionjudicial.expel.catalogo.records.response.DelitoResponseRecord;
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
public interface DelitoJpaRepository extends JpaRepository<DelitoEntity, Integer> {

  @Query(value = """
          select 
            new ec.gob.funcionjudicial.expel.catalogo.records.response.DelitoResponseRecord(
              d.idDelito, d.nombreDelito
            )
          from 
            DelitoEntity d 
          where 
                d.estado = 'A' and d.idMateria = :idMateria and d.idTipoAccion = :idTipoAccion
      """)
  Optional<List<DelitoResponseRecord>> obtenerPorIdMateriaIdTipoAccion(
      @Param("idMateria") Integer idMateria, @Param("idTipoAccion") Integer idTipoAccion);
}
