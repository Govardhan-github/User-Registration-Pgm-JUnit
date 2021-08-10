package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Program Of UserRegistration By Using Junit Testing
 */
public class UserRegistration {
    private Pattern pattern;//Declaring The Pattern variable as private

    /*
    Declaring Validate First Name Method
    The Pattern Defines The First Name Starts With Capital Letter
    The Name Should Have Min 3 Words
     */
        public static String validateFirstName (String firstName, ValidateInput validate){
            String result;
            try {
                if (validate.validateInput(firstName, UserFieldPattern.REGEX_NAME)) {
                    result = "valid";
                } else {
                    throw new UserRegistrationException("Invalid User Details", UserRegistrationException.invalidCredentials.INVALID_FIRSTNAME);
                }
            } catch (UserRegistrationException exception) {
                result = exception.type.toString();
            }
            return result;
        }
    /*
    Declaring Validate Last Name Method
    The Pattern Defines The Last Name Starts With Capital Letter
    The Name Should Have Min 3 Words
    */
        public static String validateLastName(String lastName, ValidateInput validate)  {
            String result;
            try {
                if (validate.validateInput(lastName, UserFieldPattern.REGEX_NAME)) {
                    result = "valid";
                } else {
                    throw new UserRegistrationException("Invalid User Details", UserRegistrationException.invalidCredentials.INVALID_LASTNAME);
                }
            } catch (UserRegistrationException exception) {
                result = exception.type.toString();
            }
            return result;
        }
    /*
    Declaring Valid Email Method
    The Email Should Starts With Small Letter
    Here Declaring The Email Pattern
    */
        public static String validateEmail(String email, ValidateInput validate)  {
            String result;
            try {
                if (validate.validateInput(email, UserFieldPattern.REGEX_EMAIL)) {
                    result = "valid";
                } else {
                    throw new UserRegistrationException("Invalid User Details", UserRegistrationException.invalidCredentials.INVALID_EMAIL);
                }
            } catch (UserRegistrationException exception) {
                result = exception.type.toString();
            }
            return result;
        }
    /*
    Declaring Valid Phone Number Method
    The Phone Number Pattern Contain The Phone Should Have 10 Numbers
    Here Declaring The Phone Number Pattern
    */
        public static String validatePhoneNumber(String phoneNumber, ValidateInput validate) throws UserRegistrationException {
            String result;
            try {
                if (validate.validateInput(phoneNumber, UserFieldPattern.REGEX_MOBILE_NUMBER)) {
                    result = "valid";
                } else {
                    throw new UserRegistrationException("Invalid User Details", UserRegistrationException.invalidCredentials.INVALID_PHONE_NUMBER);
                }
            } catch (UserRegistrationException exception) {
                result = exception.type.toString();
            }
            return result;
        }
    /*
    Declaring Valid Password Method
    The Password Should Contain The Minimum Of 8 Characters
    Here Declaring The Password Pattern
    */
        public static String validatePassword(String password, ValidateInput validate)  {
            String result;
            try {
                if (validate.validateInput(password, UserFieldPattern.REGEX_PASSWORD)) {
                    result = "valid";
                } else {
                    throw new UserRegistrationException("Invalid User Details", UserRegistrationException.invalidCredentials.INVALID_PASSWORD);
                }
            } catch (UserRegistrationException exception) {
                result = exception.type.toString();
            }
            return result;
        }
        ValidateInput validate = (String input, UserFieldPattern regex) -> {
            boolean result;
            Pattern pattern = Pattern.compile(regex.pattern);
            Matcher matcher = pattern.matcher(input);
            result = matcher.find();
            return result;
        };
    }
}



