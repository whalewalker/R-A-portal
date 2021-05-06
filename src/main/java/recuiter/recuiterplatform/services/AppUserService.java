package recuiter.recuiterplatform.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import recuiter.recuiterplatform.dtos.UserDto;
import recuiter.recuiterplatform.models.User;

public interface AppUserService extends UserDetailsService {
    String signUp(User user);
}
