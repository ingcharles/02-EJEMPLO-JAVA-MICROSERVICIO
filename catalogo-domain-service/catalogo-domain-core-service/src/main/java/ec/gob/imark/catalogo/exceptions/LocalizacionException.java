/**
 * <p> Proyecto catalogo-catalogo.
 * <p> Clase LocalizacionException 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.imark.catalogo.exceptions;

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

public class LocalizacionException extends GeneralException {

  public LocalizacionException(String message) {
    super(message);
  }

  public LocalizacionException(String message, Throwable cause) {
    super(message, cause);
  }
}

