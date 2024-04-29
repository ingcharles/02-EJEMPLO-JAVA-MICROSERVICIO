/**
 * <p> Proyecto expel-catalogo-juridico.
 * <p> Clase TipoAccionRestControllerImpl 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.funcionjudicial.expel.rest.query.impl;

import ec.gob.funcionjudicial.expel.catalogo.records.request.TipoAccionRequestRecord;
import ec.gob.funcionjudicial.expel.catalogo.records.response.TipoAccionResponseRecord;
import ec.gob.funcionjudicial.expel.dataaccess.ports.input.TipoAccionService;
import ec.gob.funcionjudicial.expel.rest.query.TipoAccionRestController;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * -- AQUI AÑADIR LA DESCRIPCION DE LA CLASE --.
 *
 * <p>Historial de cambios:
 *
 * <ul>
 *   <li>1.0.0 - Descripción del cambio inicial - Carlos.Anchundia - 24/4/2024
 *       <!-- Añadir nuevas entradas de cambios aquí -->
 * </ul>
 *
 * @author Carlos.Anchundia
 * @version 1.0.0 $
 * @since 24/4/2024
 */
@RestController
@RequiredArgsConstructor
public class TipoAccionRestControllerImpl implements TipoAccionRestController {

  private final TipoAccionService tipoAccionService;

  @Override
  public List<TipoAccionResponseRecord> obtenerPorIdMateria(
      TipoAccionRequestRecord tipoAccionRequestRecord) {
    return tipoAccionService.obtenerPorIdMateria(tipoAccionRequestRecord.idMateria());
  }
}