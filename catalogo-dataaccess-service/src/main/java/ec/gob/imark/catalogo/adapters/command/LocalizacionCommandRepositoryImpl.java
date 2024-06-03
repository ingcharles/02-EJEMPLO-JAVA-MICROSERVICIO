/**
*
* Este archivo es la implementación del command repository: LocalizacionRepositoryImpl
*
* @copyright     imark 08-05-2024
* @author        Carlos Anchundia
* @version       1.0.0
* @date          08-05-2024
* @name          LocalizacionCommandRepositoryImpl
* @package       catalogo-dataaccess-services
* @subpackage    ec.gob.imark.catalogo.controller.command.impl
*
* HISTORIAL DE CAMBIOS
*    1.0.0 - Descripción del cambio inicial - Carlos Anchundia - 08-05-2024
*    <!-- Añadir nuevas entradas de cambios aquí -->
*
*/
package ec.gob.imark.catalogo.adapters.command;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ec.gob.imark.catalogo.exceptions.LocalizacionException;
import ec.gob.imark.catalogo.records.request.LocalizacionSaveRequestRecord;
import ec.gob.imark.catalogo.records.request.LocalizacionUpdateRequestRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionSaveResponseRecord;
import ec.gob.imark.catalogo.records.response.LocalizacionUpdateResponseRecord;
import ec.gob.imark.catalogo.repositories.command.LocalizacionCommandJpaRepository;
import ec.gob.imark.catalogo.messages.MessageSourceUtil;
import ec.gob.imark.catalogo.ports.outputs.command.LocalizacionCommandRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.postgresql.util.PGobject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
//@Transactional(readOnly = true)
@Transactional(readOnly = false)
public class LocalizacionCommandRepositoryImpl implements LocalizacionCommandRepository
{
	private final LocalizacionCommandJpaRepository localizacionCommandJpaRepository;
	private final MessageSourceUtil messageSourceUtil;
	@Autowired
	private ObjectMapper objectMapper;


	@PersistenceContext
	private EntityManager entityManager;
	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name saveLocalizacion
	* @param LocalizacionSaveRequestRecord
	* @return List<LocalizacionSaveResponseRecord>
	*/
	@Override
	public LocalizacionSaveResponseRecord saveLocalizacion(
	LocalizacionSaveRequestRecord localizacionSaveRequestRecord) throws JsonProcessingException {

		//StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("sp_save_localizacion");
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("sp_save_localizacion");
		String inputJsonLocalizacion = objectMapper.writeValueAsString(localizacionSaveRequestRecord);

		byte[] jsonLocalizacionBytes = inputJsonLocalizacion.getBytes(StandardCharsets.UTF_8);
		byte[] jsonResultadoBytes = "{}".getBytes(StandardCharsets.UTF_8); // Placeholder para el parámetro de salida

		query.setParameter("i_json_localizacion", jsonLocalizacionBytes);
		query.setParameter("o_json_resultado", jsonResultadoBytes);

		query.execute();

		byte[] resultBytes = (byte[]) query.getOutputParameterValue("o_json_resultado");
		// Convertir el byte[] en una cadena JSON
		String resultJson = new String(resultBytes, StandardCharsets.UTF_8);
		// Convertir el JSON de resultado a un objeto LocalizacionSaveResponseRecord
		LocalizacionSaveResponseRecord responseRecord = objectMapper.readValue(resultJson, LocalizacionSaveResponseRecord.class);
		return responseRecord;
		//var a= objectMapper.readValue(resultJson, new TypeReference<LocalizacionSaveResponseRecord>() {});
		// Convertir el JSON de resultado a una lista de LocalizacionSaveResponseRecord
		//return objectMapper.readValue(resultJson, new TypeReference<List<LocalizacionSaveResponseRecord>>() {});
		//return null;
		//return new String(resultBytes, StandardCharsets.UTF_8);
		/*String resultJson = String.valueOf(Optional.ofNullable(localizacionCommandJpaRepository.saveLocalizacion(jsonbObject, jsonbOutput))
				.orElseThrow(() -> new LocalizacionException("Error al insertar localización")));

		// Convert the JSON response to a List of LocalizacionSaveResponseRecord
		List<LocalizacionSaveResponseRecord> responseRecords = objectMapper.readValue(
				resultJson, new TypeReference<List<LocalizacionSaveResponseRecord>>() {});

		return null;*/
		//StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("sp_save_localizacion");

		/*PGobject jsonParam = new PGobject();
		jsonParam.setType("jsonb");
		try {
			String inputJsonLocalizacion = objectMapper.writeValueAsString(localizacionSaveRequestRecord);
			String jsonString = "{\"idLocalizacion\":\"X\"}";//asigne su cadena JSON aquí
			JSONObject json = new JSONObject(jsonString);
			jsonParam.setValue(json.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (JSONException e) {
      throw new RuntimeException(e);
    }

    query.setParameter("i_json_localizacion", jsonParam);

		PGobject jsonResult = new PGobject();
		jsonResult.setType("jsonb");
		query.setParameter("o_json_resultado", jsonResult);

		query.execute();


		PGobject result = (PGobject) query.getOutputParameterValue("o_json_resultado");
		return null;*/
		/*try {
			String inputJsonLocalizacion = objectMapper.writeValueAsString(localizacionSaveRequestRecord);
			// Crear un objeto PGobject para representar el tipo jsonb
			PGobject jsonbObject = new PGobject();
			jsonbObject.setType("jsonb");
			jsonbObject.setValue(inputJsonLocalizacion);

			// Inicializar el parámetro de salida
			PGobject jsonbOutput = new PGobject();
			jsonbOutput.setType("jsonb");
			jsonbOutput.setValue("{}"); // JSON vacío

			// Llamar al repositorio y pasar los objetos PGobject
			System.out.println("jsonbObject" +jsonbObject);
			//return localizacionRepository.saveLocalizacion(jsonbObject.getValue(), jsonbOutput.getValue());
			String resultJson = String.valueOf(Optional.ofNullable(localizacionCommandJpaRepository.saveLocalizacion(jsonbObject, jsonbOutput))
					.orElseThrow(() -> new LocalizacionException("Error al insertar localización")));

			// Convert the JSON response to a List of LocalizacionSaveResponseRecord
			List<LocalizacionSaveResponseRecord> responseRecords = objectMapper.readValue(
					resultJson, new TypeReference<List<LocalizacionSaveResponseRecord>>() {});

			return responseRecords;

		} catch (SQLException e) {
			// Manejar la excepción si ocurre algún problema al crear los PGobject
			e.printStackTrace();
			return Collections.emptyList();

		}*/

		/*String inputJson = objectMapper.writeValueAsString(localizacionSaveRequestRecord);
		String oJsonResultado = " ";
		String resultJson = String.valueOf(Optional.ofNullable(localizacionCommandJpaRepository.saveLocalizacion(inputJson,oJsonResultado))
				.orElseThrow(() -> new LocalizacionException("Error al insertar localización")));

		// Convert the JSON response to a List of LocalizacionSaveResponseRecord
		List<LocalizacionSaveResponseRecord> responseRecords = objectMapper.readValue(
				resultJson, new TypeReference<List<LocalizacionSaveResponseRecord>>() {});

		return responseRecords;*/
	}

	/**
	*
	* Método que obtiene los datos por id de la tabla localizacion
	*
	* @name updateLocalizacion
	* @param LocalizacionUpdateRequestRecord
	* @return List<LocalizacionUpdateResponseRecord>
	*/
	@Override
	public List<LocalizacionUpdateResponseRecord> updateLocalizacion(
	LocalizacionUpdateRequestRecord localizacionUpdateRequestRecord)
	{
		return localizacionCommandJpaRepository.updateLocalizacion(localizacionUpdateRequestRecord.idLocalizacion())
		.orElseThrow(() -> new LocalizacionException(String.format(messageSourceUtil.getMessage("localizacion.component.exception.notfound"),
		localizacionUpdateRequestRecord.idLocalizacion())));
	}

}
