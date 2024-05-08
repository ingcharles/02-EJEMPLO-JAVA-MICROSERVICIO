/**
 * Proyecto catalogo-catalogo.
 *
 * <p>Clase LocalizacionQueryRepositoryImpl 24/4/2024.
 *
 * <p>Copyright 2024 Consejo de la Judicatura.
 *
 * <p>Todos los derechos reservados.
 */
package ec.gob.imark.catalogo.adapters.query;

import ec.gob.imark.catalogo.exceptions.LocalizacionException;
import ec.gob.imark.catalogo.records.request.LocalizacionFindByIdRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindByIdResponseRecord;
import ec.gob.imark.catalogo.repositories.query.LocalizacionQueryJpaRepository;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
import ec.gob.imark.catalogo.messages.MessageSourceUtil;
import ec.gob.imark.catalogo.ports.outputs.query.LocalizacionQueryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
@Component
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LocalizacionQueryRepositoryImpl implements LocalizacionQueryRepository {

  private final LocalizacionQueryJpaRepository localizacionQueryJpaRepository;
  private final MessageSourceUtil messageSourceUtil;

  @Override
  public List<LocalizacionResponseRecord> obtenerPorNivelLocalizacion(Integer nivelLocalizacion) {
    return localizacionQueryJpaRepository
        .obtenerPorNivelLocalizacion(nivelLocalizacion)
        .orElseThrow(
            () ->
                new LocalizacionException(
                    String.format(
                        messageSourceUtil.getMessage("localizacion.component.exception.notfound"),
                        nivelLocalizacion)));
  }

  @Override
  public List<LocalizacionFindByIdResponseRecord> findByIdLocalizacion(
      LocalizacionFindByIdRequestRecord localizacionFindByIdRequestRecord) {
    return localizacionQueryJpaRepository
        .findByIdLocalizacion(localizacionFindByIdRequestRecord.idLocalizacion())
        .orElseThrow(
            () ->
                new LocalizacionException(
                    String.format(
                        messageSourceUtil.getMessage("localizacion.component.exception.notfound"),
                        localizacionFindByIdRequestRecord.idLocalizacion())));
  }
}
