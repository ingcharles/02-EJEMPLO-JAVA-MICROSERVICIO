/**
*
* Este archivo es el modelo para recuperar los datos
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionPruebaResponseRecord
* @package       catalogo-domain-services
* @subpackage   ec.gob.imark.catalogo.exceptions
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.exceptions;

public class LocalizacionPruebaException extends GeneralException {
public LocalizacionPruebaException (String message) { super(message); }
public LocalizacionPruebaException (String message, Throwable cause) { super(message, cause); }

}
