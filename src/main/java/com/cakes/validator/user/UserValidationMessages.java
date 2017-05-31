package com.cakes.validator.user;

/**
 * Created by Kanibal on 30.05.2017.
 */
public interface UserValidationMessages {
    String EMPTY_USER_NAME_FIELD = "EMPTY USER NAME FIELD";
    String USER_NAME_ALREADY_EXIST = "USER NAME ALREADY EXIST";

    String EMPTY_EMAIL_FIELD = "EMPTY EMAIL FIELD";
    String EMAIL_ALREADY_EXIST = "EMAIL ALREADY EXIST";
    String WRONG_EMAIL = "WRONG EMAIL";

    String EMPTY_PASSWORD_FIELD = "EMPTY PASSWORD FIELD";
    String TOO_SMALL_PASSWORD = "TOO SMALL PASSWORD";

}
