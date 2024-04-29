/**
 * Proyecto expel-consulta-causas-clex.<br> Clase TipoDocumentoRestControllerImpl 4/2/2024.<br>
 * Copyright 2024 Consejo de la Judicatura.<br> Todos los derechos reservados.
 */

package ec.gob.funcionjudicial.expel.rest.query.impl;

import ec.gob.funcionjudicial.expel.catalogo.records.request.TipoDocumentoRequestRecord;
import ec.gob.funcionjudicial.expel.catalogo.records.response.TipoDocumentoResponseRecord;
import ec.gob.funcionjudicial.expel.dataaccess.ports.input.TipoDocumentoService;
import ec.gob.funcionjudicial.expel.rest.query.TipoDocumentoRestController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * -- AQUI AÑADIR LA DESCRIPCION DE LA CLASE --.
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
@RestController
@RequiredArgsConstructor
public class TipoDocumentoRestControllerImpl implements TipoDocumentoRestController {

  private final TipoDocumentoService tipoDocumentoService;

  @Override
  public TipoDocumentoResponseRecord obtenerPorNombre(
      TipoDocumentoRequestRecord tipoDocumentoRequestRecord) {
    return tipoDocumentoService.obtenerPorNombre(tipoDocumentoRequestRecord.nombreTipoDocumento(),
        tipoDocumentoRequestRecord.usoTipoDocumento());
  }
}
