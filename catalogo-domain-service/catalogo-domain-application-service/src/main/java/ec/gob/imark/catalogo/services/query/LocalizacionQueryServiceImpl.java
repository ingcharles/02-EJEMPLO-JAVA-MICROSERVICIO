/**
 * <p> Proyecto catalogo-catalogo.
 * <p> Clase LocalizacionQueryServiceImpl 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.imark.catalogo.services.query;

import ec.gob.imark.catalogo.ports.inputs.query.LocalizacionQueryService;
import ec.gob.imark.catalogo.ports.outputs.query.LocalizacionQueryRepository;
import ec.gob.imark.catalogo.records.request.LocalizacionFindByIdRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionFindByIdResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
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
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LocalizacionQueryServiceImpl implements LocalizacionQueryService {

  private final LocalizacionQueryRepository localizacionQueryRepository;

  /**
   * Permite obtener el localizacion por nivelLocalizacion
   *
   * @param nivelLocalizacion
   * @return List<LocalizacionResponseRecord>
   */
  @Override
  @Cacheable(value = "localizacion", key = "{#nivelLocalizacion}")
  public List<LocalizacionResponseRecord> obtenerPorNivelLocalizacion(Integer nivelLocalizacion) {
    return localizacionQueryRepository.obtenerPorNivelLocalizacion(nivelLocalizacion);
  }

  /**
   * Permite obtener el localizacion por nivelLocalizacion
   *
   * @param nivelLocalizacion
   * @return List<LocalizacionFindByIdResponseRecord>
   */
  @Override
  @Cacheable(value = "findByIdLocalizacion", key = "{#idLocalizacion}")
  public List<LocalizacionFindByIdResponseRecord> findByIdLocalizacion(
      LocalizacionFindByIdRequestRecord localizacionFindByIdRequestRecord) {
    return localizacionQueryRepository.findByIdLocalizacion(localizacionFindByIdRequestRecord);
  }
}

