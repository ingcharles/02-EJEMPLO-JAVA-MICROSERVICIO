package ec.gob.funcionjudicial.expel.catalogo.juridico.repository;

import ec.gob.funcionjudicial.expel.catalogo.juridico.entity.MateriaEntity;
import ec.gob.funcionjudicial.expel.catalogo.to.juridico.MateriaTo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaJpaRepository extends JpaRepository<MateriaEntity, Long> {

  @Query("""
       select
           new ec.gob.funcionjudicial.expel.catalogo.to.juridico.MateriaTo(
               m.idMateria, m.nombreMateria
           )
          from
              MateriaEntity m
          where
              m.estado = 'A'
          order by m.nombreMateria asc
      """)
  List<MateriaTo> getActiveMaterias();

  @Query("""
       select
           new ec.gob.funcionjudicial.expel.catalogo.to.juridico.MateriaTo(
               m.idMateria, m.nombreMateria
           )
          from
              MateriaEntity m
          where
              m.estado = 'A' and m.idMateria not in :materiasAExcluir
          order by m.nombreMateria asc
      """)
  List<MateriaTo> obtenerMateriasParaConsultaCausas(List<Long> materiasAExcluir);
}
