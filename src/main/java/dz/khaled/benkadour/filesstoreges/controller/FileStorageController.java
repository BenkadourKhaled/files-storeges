package dz.khaled.benkadour.filesstoreges.controller;
import dz.khaled.benkadour.filesstoreges.domain.FileStorage;
import dz.khaled.benkadour.filesstoreges.service.FileStorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 31/10/2024
 * @TIME : 08:59
 * @Project_Name : inventory-management-system
 */
@RestController
@RequestMapping("/api/v1/files")
@RequiredArgsConstructor
public class FileStorageController {

    private final FileStorageService FileStorageService;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> storeFile(@RequestParam("file") MultipartFile file) {
        String fileId = FileStorageService.storeFile(file);
        return ResponseEntity.status(HttpStatus.CREATED).body(fileId);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<byte[]> getFile(@PathVariable String id) throws FileNotFoundException {
        FileStorage fileEntity = FileStorageService.getFile(id);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, fileEntity.getContentType())
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileEntity.getFilename() + "\"")
                .body(fileEntity.getContent());
    }

}
