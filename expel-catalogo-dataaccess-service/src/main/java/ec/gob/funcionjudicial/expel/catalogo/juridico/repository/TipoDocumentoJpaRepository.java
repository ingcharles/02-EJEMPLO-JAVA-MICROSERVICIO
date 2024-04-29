/**
 * Proyecto expel-consulta-causas-clex.<br> Clase TipoDocumentoJpaRepository 4/2/2024.<br> Copyright
 * 2024 Consejo de la Judicatura.<br> Todos los derechos reservados.
 */

package ec.gob.funcionjudicial.expel.catalogo.juridico.repository;

import ec.gob.funcionjudicial.expel.catalogo.juridico.entity.TipoDocumentoEntity;
import ec.gob.funcionjudicial.expel.catalogo.records.response.TipoDocumentoResponseRecord;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * JpaRepository para el tipo de documento.
 *
 * <p>Historial de cambios:
 *
 * <ul>
 *   <li>1.0.0 - Descripción del cambio inicial - Francisco.Zabala - 4/2/2024
 *       <!-- Añadir nuevas entradas de cambios aquí -->
 * </ul>
 *
 * @author Francisco.Zabala
 * @version 1.0.0 $
 * @since 4/2/2024
 */
@Repository
public interface TipoDocumentoJpaRepository extends JpaRepository<TipoDocumentoEntity, Integer> {

  @Query(value = """
          select 
            new ec.gob.funcionjudicial.expel.catalogo.records.response.TipoDocumentoResponseRecord(
              td.id, td.nombre
            )
          from 
            TipoDocumentoEntity td 
          where 
                td.nombre = :nombreTipoDocumento 
            and td.usoDocumento = :usoTipoDocumento
      """)
  Optional<TipoDocumentoResponseRecord> obtenerPorNombre(
      @Param("nombreTipoDocumento") String nombreTipoDocumento,
      @Param("usoTipoDocumento") String usoTipoDocumento);
}
