package recuiter.recuiterplatform.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import recuiter.recuiterplatform.dtos.UserDto;
import recuiter.recuiterplatform.exceptions.EmailNotValidException;
import recuiter.recuiterplatform.services.UserRegistrationService;

@RestController
@RequestMapping("/api/v1/register")
public class registrationController {
    private final UserRegistrationService registrationService;

    public registrationController(UserRegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping()
    public String registerUser(@RequestBody UserDto userDto) throws EmailNotValidException {
        registrationService.registerUser(userDto);
        return "Created";
    }
}
