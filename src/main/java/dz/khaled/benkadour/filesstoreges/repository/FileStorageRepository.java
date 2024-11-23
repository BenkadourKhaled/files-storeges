package dz.khaled.benkadour.filesstoreges.repository;

import dz.khaled.benkadour.filesstoreges.domain.FileStorage;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 31/10/2024
 * @TIME : 08:59
 * @Project_Name : inventory-management-system
 */
public interface FileStorageRepository extends MongoRepository<FileStorage, Integer> {

    Optional<FileStorage> findById(String id);
}
