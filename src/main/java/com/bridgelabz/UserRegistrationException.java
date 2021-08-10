package com.bridgelabz;
/*
Declaring UserRegistration Class With Extends Exception
 */
public class UserRegistrationException extends Exception {

    enum invalidCredentials{
        INVALID_FIRSTNAME, INVALID_LASTNAME, INVALID_EMAIL, INVALID_PHONE_NUMBER, INVALID_PASSWORD
    }
    public invalidCredentials type;
    /*
    Defining The Parametrised Constructor
    Used For Trow The Exception Message By user
    To Print While Exception Handling
    */
    public UserRegistrationException(String message ,invalidCredentials type ) {
        super(message);
        this.type = type;

    }
}
