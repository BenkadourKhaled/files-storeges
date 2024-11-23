package dz.khaled.benkadour.filesstoreges.service;

import dz.khaled.benkadour.filesstoreges.domain.FileStorage;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;

/**
 * Create By ${} on 05/11/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 05/11/2024
 * @TIME : 15:38
 * @Project_Name : files-storeges
 */
public interface FileStorageService {

    String storeFile(MultipartFile file);
    FileStorage getFile(String id) throws FileNotFoundException;

}
