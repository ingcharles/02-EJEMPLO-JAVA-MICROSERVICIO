/**
 * Proyecto expel-consulta-causas-clex.<br> Clase TipoDocumentoRequestRecord 4/2/2024.<br> Copyright
 * 2024 Consejo de la Judicatura.<br> Todos los derechos reservados.
 */

package ec.gob.funcionjudicial.expel.catalogo.records.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;

/**
 * Record que almacena la solicitud del api rest para la busqueda de un tipo de documento.
 *
 * <p>Historial de cambios:
 *
 * <ul>
 *   <li>1.0.0 - Descripción del cambio inicial - Francisco.Zabala - 4/2/2024
 *       <!-- Añadir nuevas entradas de cambios aquí -->
 * </ul>
 *
 * @author Francisco.Zabala
 * @version 1.0.0
 * @since 4/2/2024
 */
@Builder
public record TipoDocumentoRequestRecord(
    @NotBlank(message = "{tipoDocumento.nombreTipoDocumento.notBlank}")
    @Size(max = 500, message = "{tipoDocumento.nombreTipoDocumento.size}")
    String nombreTipoDocumento,

    @NotBlank(message = "{tipoDocumento.usoTipoDocumento.notBlank}")
    @Size(max = 20, message = "{tipoDocumento.usoTipoDocumento.size}")
    String usoTipoDocumento
) {

}
