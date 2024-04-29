/**
 * <p> Proyecto expel-catalogo-juridico.
 * <p> Clase DelitoRestControllerImpl 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.funcionjudicial.expel.rest.query.impl;

import ec.gob.funcionjudicial.expel.catalogo.records.request.DelitoRequestRecord;
import ec.gob.funcionjudicial.expel.catalogo.records.response.DelitoResponseRecord;
import ec.gob.funcionjudicial.expel.dataaccess.ports.input.DelitoService;
import ec.gob.funcionjudicial.expel.rest.query.DelitoRestController;
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
public class DelitoRestControllerImpl implements DelitoRestController {

  private final DelitoService delitoService;

  @Override
  public List<DelitoResponseRecord> obtenerPorIdMateriaIdTipoAccion(
      DelitoRequestRecord delitoRequestRecord) {
    return delitoService.obtenerPorIdMateriaIdTipoAccion(delitoRequestRecord.idMateria(),delitoRequestRecord.idTipoAccion());
  }
}
