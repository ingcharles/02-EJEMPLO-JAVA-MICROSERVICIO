/**
*
* Este archivo es la implementación del controlador: LocalizacionMappers
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionMappers
* @package       core
* @subpackage   ec.gob.imark.catalogo.mappers.core
*
*    ------------- HISTORIAL DE CAMBIOS ------------
*          1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/

package ec.gob.imark.catalogo.mappers;

import ec.gob.imark.catalogo.entities.LocalizacionEntity;
import ec.gob.imark.catalogo.mappers.core.GenericMapper;
import ec.gob.imark.catalogo.records.request.LocalizacionRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionResponseRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper
public interface LocalizacionMapper extends GenericMapper<LocalizacionEntity , LocalizacionResponseRecord>
{
	LocalizacionMapper INSTANCE = Mappers.getMapper(LocalizacionMapper.class);
LocalizacionEntity requestRecordToEntity(LocalizacionRequestRecord localizacionRequestRecord);
LocalizacionResponseRecord entityToResponseRecord(LocalizacionEntity localizacionEntity);
	LocalizacionEntity responseRecordToEntity(LocalizacionResponseRecord localizacionResponseRecord);

}
