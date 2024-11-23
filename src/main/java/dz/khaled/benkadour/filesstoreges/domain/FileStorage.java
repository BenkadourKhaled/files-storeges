package dz.khaled.benkadour.filesstoreges.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 31/10/2024
 * @TIME : 08:59
 * @Project_Name : inventory-management-system
 */
@Document(collection = "files")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FileStorage {

    @Id
    private String id;
    private String filename;
    private String contentType;
    private byte[] content;

    public FileStorage(String filename, String contentType, byte[] content) {
        this.filename = filename;
        this.contentType = contentType;
        this.content = content;
    }
}
