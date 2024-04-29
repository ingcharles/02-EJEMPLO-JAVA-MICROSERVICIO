/**
 * <p> Proyecto expel-catalogo-juridico.
 * <p> Clase TipoAccionRequestRecord 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.funcionjudicial.expel.catalogo.records.request;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

/**
 * -- AQUI AÑADIR LA DESCRIPCION DEL RECORD --.
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
@Builder
public record DelitoRequestRecord(
    @NotNull(message = "{idMateria.not_null}")
    Integer idMateria,

    @NotNull(message = "{idTipoAccion.not_null}")
    Integer idTipoAccion
) {


}

