package ec.gob.imark.erp.catalogo.exceptions;

public class GeneralException extends RuntimeException {

  public GeneralException(String message) {
    super(message);
  }

  public GeneralException(String message, Throwable cause) {
    super(message, cause);
  }

  public GeneralException() {
  }
}
