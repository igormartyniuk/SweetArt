package com.cakes.validator.user;

import com.cakes.dao.UserDao;
import com.cakes.entity.User;
import com.cakes.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Kanibal on 30.05.2017.
 */
@Component
public class UserValidator implements Validator {

    @Autowired
    private UserDao userDao;

    @Override
    public void validate(Object o) throws Exception {

        User user = (User) o;

        if(user.getName().isEmpty()){
            throw new UserException(UserValidationMessages.EMPTY_USER_NAME_FIELD);
        }else if(userDao.findByName(user.getName()) != null){
            throw new UserException(UserValidationMessages.USER_NAME_ALREADY_EXIST);
        }else if(user.getEmail().isEmpty()){
            throw new UserException(UserValidationMessages.EMPTY_EMAIL_FIELD);
        }else if(!user.getEmail().contains("@")){
            throw new UserException(UserValidationMessages.WRONG_EMAIL);
        }else if(userDao.findByEmail(user.getEmail()) != null){
            throw new UserException(UserValidationMessages.EMAIL_ALREADY_EXIST);
        }else if(user.getPassword().isEmpty()){
            throw new UserException(UserValidationMessages.EMPTY_PASSWORD_FIELD);
        }else if(user.getPassword().length() < 4){
            throw new UserException(UserValidationMessages.TOO_SMALL_PASSWORD);
        }
    }
}

