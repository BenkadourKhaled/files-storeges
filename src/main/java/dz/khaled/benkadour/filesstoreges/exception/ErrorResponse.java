package dz.khaled.benkadour.filesstoreges.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 31/10/2024
 * @TIME : 08:59
 * @Project_Name : inventory-management-system
 */
@Data
@AllArgsConstructor @NoArgsConstructor
public class ErrorResponse {
    private int statusCode;
    private String message;


}
