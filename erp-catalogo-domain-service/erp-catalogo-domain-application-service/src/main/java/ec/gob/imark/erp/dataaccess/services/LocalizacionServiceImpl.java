/**
 * <p> Proyecto erp-catalogo.
 * <p> Clase LocalizacionServiceImpl 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.imark.erp.dataaccess.services;

import ec.gob.imark.erp.catalogo.records.response.LocalizacionResponseRecord;
import ec.gob.imark.erp.dataaccess.ports.input.LocalizacionService;
import ec.gob.imark.erp.dataaccess.ports.output.LocalizacionRepository;

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
public class LocalizacionServiceImpl implements LocalizacionService {

  private final LocalizacionRepository localizacionRepository;

  /**
   * Permite obtener el localizacion por idMateria
   *
   * @param idMateria
   * @return
   */
  @Override
  @Cacheable(value = "localizacion", key = "{#idMateria}")
  public List<LocalizacionResponseRecord> obtenerPorNivelLocalizacion(Integer idMateria) {
    return localizacionRepository.obtenerPorNivelLocalizacion(idMateria);
  }
}

