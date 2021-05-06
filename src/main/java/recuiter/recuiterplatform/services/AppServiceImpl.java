package recuiter.recuiterplatform.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import recuiter.recuiterplatform.exceptions.UserNotFoundException;
import recuiter.recuiterplatform.models.User;
import recuiter.recuiterplatform.repositories.UserRepository;

@Service
public class AppServiceImpl implements AppUserService{
    private final UserRepository userRepository;

    public AppServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findUserByEmail(email).orElseThrow(()-> new UsernameNotFoundException("User not found"));
    }

    @Override
    public String signUp(User user) {
        return "";
    }
}
