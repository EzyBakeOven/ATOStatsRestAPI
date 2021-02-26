package lama.dev.api.repositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import lama.dev.api.model.ATOMetadata;
import lama.dev.api.model.Person;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
public class MongoDBMetadataRepository implements ATOMetadataRepository {

    private final MongoClient client;
    private MongoCollection<ATOMetadata> metadataCollection;

    public MongoDBMetadataRepository(MongoClient client) {
        this.client = client;
    }

    @PostConstruct
    void init() {
        metadataCollection = client.getDatabase("ATOStats").getCollection("Metadata", ATOMetadata.class);
    }

    @Override
    public List<ATOMetadata> findAll() {
        return null;
    }

    @Override
    public List<ATOMetadata> findAll(List<String> ids) {
        return null;
    }

    @Override
    public ATOMetadata findOne(String id) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
