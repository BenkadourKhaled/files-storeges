package dz.khaled.benkadour.filesstoreges.service.impl;

import dz.khaled.benkadour.filesstoreges.domain.FileStorage;
import dz.khaled.benkadour.filesstoreges.repository.FileStorageRepository;
import dz.khaled.benkadour.filesstoreges.service.FileStorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 31/10/2024
 * @TIME : 08:59
 * @Project_Name : inventory-management-system
 */
@Service
@RequiredArgsConstructor
public class FileStorageServiceImpl implements FileStorageService {

    private final FileStorageRepository fileStorageRepository;


    @Override
    public String storeFile(MultipartFile file) {
        FileStorage fileStorage = null;
        try {
            fileStorage = new FileStorage(
                    file.getOriginalFilename(),
                    file.getContentType(),
                    file.getBytes()
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        FileStorage savedFile = fileStorageRepository.save(fileStorage);
        return savedFile.getId();
    }

    @Override
    public FileStorage getFile(String id) throws FileNotFoundException {
        return fileStorageRepository.findById(id)
                .orElseThrow(() -> new FileNotFoundException("File not found with id: " + id));
    }
}
