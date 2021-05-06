package recuiter.recuiterplatform.services;

import recuiter.recuiterplatform.dtos.UserDto;
import recuiter.recuiterplatform.exceptions.EmailNotValidException;

public interface UserRegistrationService {
    String registerUser(UserDto userDto) throws EmailNotValidException;
}
