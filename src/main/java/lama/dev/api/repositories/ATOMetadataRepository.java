package lama.dev.api.repositories;

import lama.dev.api.model.ATOMetadata;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ATOMetadataRepository {

    List<ATOMetadata> findAll();

    List<ATOMetadata> findAll(List<String> ids);

    ATOMetadata findOne(String id);

    long count();
}
