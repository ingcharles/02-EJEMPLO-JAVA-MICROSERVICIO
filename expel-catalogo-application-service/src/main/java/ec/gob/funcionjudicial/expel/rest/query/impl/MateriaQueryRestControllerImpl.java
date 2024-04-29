/**
 * Proyecto expel-catalogo-juridico.<br> Clase MateriaControllerImpl 2/1/2024.<br> Copyright 2024
 * Consejo de la Judicatura.<br> Todos los derechos reservados.
 */

package ec.gob.funcionjudicial.expel.rest.query.impl;

import ec.gob.funcionjudicial.expel.catalogo.to.juridico.MateriaTo;
import ec.gob.funcionjudicial.expel.dataaccess.ports.input.MateriaApplicationService;
import ec.gob.funcionjudicial.expel.rest.query.MateriaQueryRestController;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MateriaQueryRestControllerImpl implements MateriaQueryRestController {

  private final MateriaApplicationService materiaApplicationService;

  @Override
  public List<MateriaTo> getAll() {
    return materiaApplicationService.getActiveMaterias();
  }
}
