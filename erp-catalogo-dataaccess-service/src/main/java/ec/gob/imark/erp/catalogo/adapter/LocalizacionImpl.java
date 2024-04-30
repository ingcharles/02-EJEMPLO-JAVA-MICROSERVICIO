/**
 * <p> Proyecto erp-catalogo.
 * <p> Clase LocalizacionImpl 24/4/2024.
 * <p> Copyright 2024 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.imark.erp.catalogo.adapter;

import ec.gob.imark.erp.catalogo.exceptions.LocalizacionException;
import ec.gob.imark.erp.catalogo.repository.LocalizacionJpaRepository;
import ec.gob.imark.erp.catalogo.records.response.LocalizacionResponseRecord;
import ec.gob.imark.erp.dataaccess.messages.MessageSourceUtil;
import ec.gob.imark.erp.dataaccess.ports.output.LocalizacionRepository;
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
public class LocalizacionImpl implements LocalizacionRepository {

  private final LocalizacionJpaRepository localizacionJpaRepository;
  private final MessageSourceUtil messageSourceUtil;

  @Override
  public List<LocalizacionResponseRecord> obtenerPorNivelLocalizacion(Integer idMateria) {
    return localizacionJpaRepository.obtenerPorNivelLocalizacion(idMateria)
        .orElseThrow(() -> new LocalizacionException(
            String.format(
                messageSourceUtil.getMessage("localizacion.component.exception.notfound"),
                idMateria)));
  }
}