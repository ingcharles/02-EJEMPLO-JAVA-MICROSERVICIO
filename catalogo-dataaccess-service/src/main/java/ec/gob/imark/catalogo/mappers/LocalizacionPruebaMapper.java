/**
*
* Este archivo es la implementación del controlador: LocalizacionPruebaMappers
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionPruebaMappers
* @package       core
* @subpackage   ec.gob.imark.catalogo.mappers.core
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/

package ec.gob.imark.catalogo.mappers;

import ec.gob.imark.catalogo.entities.LocalizacionPruebaEntity;
import ec.gob.imark.catalogo.mappers.core.GenericMapper;
import ec.gob.imark.catalogo.records.request.LocalizacionPruebaRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionPruebaResponseRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper
public interface LocalizacionPruebaMapper extends GenericMapper<LocalizacionPruebaEntity , LocalizacionPruebaResponseRecord>
{
	LocalizacionPruebaMapper INSTANCE = Mappers.getMapper(LocalizacionPruebaMapper.class);
LocalizacionPruebaEntity requestRecordToEntity(LocalizacionPruebaRequestRecord localizacionpruebaRequestRecord);
LocalizacionPruebaResponseRecord entityToResponseRecord(LocalizacionPruebaEntity localizacionpruebaEntity);
	LocalizacionPruebaEntity responseRecordToEntity(LocalizacionPruebaResponseRecord localizacionpruebaResponseRecord);

}
