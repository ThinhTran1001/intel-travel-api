package inteltravel.iamservice.dto.request;

import lombok.Getter;
import lombok.Setter;

/**
 * Author: thinhtd
 * Date: 2/6/2025
 * Time: 6:17 PM
 */
@Getter
@Setter
public class SignUpRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String dateOfBirth;
}
