package recuiter.recuiterplatform.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recuiter.recuiterplatform.dtos.UserDto;
import recuiter.recuiterplatform.exceptions.EmailNotValidException;
import recuiter.recuiterplatform.mappers.UserMapper;
import recuiter.recuiterplatform.utility.EmailValidator;


@Service
public class RegisterServiceImpl implements UserRegistrationService {
    private final EmailValidator emailValidator;
    private final AppUserService appUserService;

    @Autowired
    public RegisterServiceImpl(EmailValidator emailValidator, AppUserService appUserService) {
        this.emailValidator = emailValidator;
        this.appUserService = appUserService;
    }

    @Override
    public String registerUser(UserDto userDto) throws EmailNotValidException {

        boolean isEmailValid = emailValidator.test(userDto.getEmail());
        if(!isEmailValid){
            throw new EmailNotValidException("Email not valid");
        }
        return appUserService.signUp(UserMapper.userMapper(userDto));
    }
}
