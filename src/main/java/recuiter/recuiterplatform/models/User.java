package recuiter.recuiterplatform.models;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class User {
    @Id
    private Long id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Email()
    @NotBlank
    private String email;

    @NotBlank
    @Digits(integer = 11, fraction = 0)
    private String phoneNumber;

    @NotBlank
    @Digits(integer = 15, fraction = 0)
    private String password;
}
