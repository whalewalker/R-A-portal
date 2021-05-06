package recuiter.recuiterplatform.mappers;

import recuiter.recuiterplatform.dtos.UserDto;
import recuiter.recuiterplatform.models.User;

public class UserMapper {
    public static User userMapper(UserDto userDto){
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setEmail(userDto.getEmail());
        user.setPassword(user.getPassword());
        user.setPhoneNumber(user.getPhoneNumber());
        return user;
    }
}
