package dz.khaled.benkadour.filesstoreges.config;

import com.mongodb.client.MongoClient;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 31/10/2024
 * @TIME : 08:59
 * @Project_Name : inventory-management-system
 */
@Configuration
public class FileStorageConfig {
    @Bean
    public MongoTemplate mongoTemplate(MongoClient mongoClient,
                                       MongoProperties mongoProperties) {
        return new MongoTemplate(mongoClient, mongoProperties.getDatabase());
    }
}
