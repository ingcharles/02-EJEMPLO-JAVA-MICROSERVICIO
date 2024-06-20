package ec.gob.imark.catalogo.mappers.core;

import ec.gob.imark.catalogo.records.response.PaginatedDataRecord;
import org.springframework.data.domain.Page;

public interface GenericMapper<E, R> {

    R entityToResponseRecord(E entity);

    R recordPageToRecordPage(R Record);

    /**
     * Permite convertir entre Page<Entity> a PaginatedDataRecord<Response>
     *
     * @param entityPage Entidad a convertir
     * @return PaginatedDataRecord como respuesta.
     */
    default PaginatedDataRecord<R> entityPageToRecordPage(Page<E> entityPage) {
        return PaginatedDataRecord.<R>builder()
                .data(entityPage.getContent().stream().map(this::entityToResponseRecord).toList())
                .totalElements(entityPage.getTotalElements())
                .totalPages(entityPage.getTotalPages())
                .number(entityPage.getNumber())
                .size(entityPage.getSize())
                .build();
    }

    default PaginatedDataRecord<R>
    recordPageToRecordPage(Page<R> recordPage) {
        return PaginatedDataRecord.<R>builder()
                .data(recordPage.getContent())
                .totalElements(recordPage.getTotalElements())
                .totalPages(recordPage.getTotalPages())
                .number(recordPage.getNumber())
                .size(recordPage.getSize())
                .build();


    }


}
