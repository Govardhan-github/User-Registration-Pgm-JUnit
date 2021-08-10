package com.bridgelabz;
//Importing The Junit Packages
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//Declaring User Registration Test class

public class UserRegistrationTest {
    //Defining User Registration
    UserRegistration userRegistration = new UserRegistration();
    //Test To Valid FirstName Starts With Cap Letter And It Has Min 3 Letters
    @Test
    /*
    Validation Of First Name And Return True
    Here Declaring Try Catch Block For Exception Handling
    Checking Validate FirstName With Pattern And Storing In result
    Asserting The Result As Boolean Type True Or False
    */
    public void givenFirstName_StartsWithCapLetter_Return_True() {
        Assertions.assertEquals("valid", UserRegistration.validateFirstName("Gopi", userRegistration.validate));
    }
    /*
    Test To Valid FirstName If It Starts With Small Letter Print False
    Checking Validate FirstName With Pattern And Storing In result
    If FirstName Is Not Match With Pattern It Throws Exception Handling Message
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenFirstName_StartsWithSmallLetter_Return_False() {
        Assertions.assertEquals("INVALID_FIRSTNAME" ,UserRegistration.validateFirstName("gopi" , userRegistration.validate));
    }
    //UC2
    /*
    Test To Valid LastName Starts With Cap Letter And It Has Min 3 Letters
    Checking Validate LastName With Pattern And Storing In result
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenLastName_StartsWithCapLetter_Return_True()  {
        Assertions.assertEquals("VALID_LASTNAME" ,UserRegistration.validateLastName("Reddy", UserRegistration.validate));

    }
    @Test
    /*
     Test To Valid LastName Starts With Small Letter And Return False
     Checking Validate LastName With Pattern And Storing In result
     If LastName Is Not Match With Pattern It Throws Exception Handling Message
     Asserting The Result As Boolean Type True Or False
    */
    public void givenLastName_StartsWithSmallLetter_Return_False() {
        Assertions.assertEquals("INVALID_LASTNAME" ,UserRegistration.validateLastName("reddy", userRegistration.validate));
    }
    //UC3
    /*
    Test To Valid Email Starts With Small Letter And Return True
    Checking Validate Email With Pattern And Storing In result
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenEmail_StartsWithSmallLetter_ReturnTrue() {
        Assertions.assertEquals("VALID_EMAIL" , UserRegistration.validateEmail("gopi1998@gmail.com" , userRegistration.validate));

    }
    /*
    Test To Valid Email Starts With Cap Letter And Return False
    Checking Validate Email With Pattern And Storing In result
    If Email Is Not Match With Pattern It Throws Exception Handling Message
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenEmail_StartsWithCapLetter_ReturnFalse() {
        Assertions.assertEquals("INVALID_EMAIL" , UserRegistration.validateEmail("Gopi1998@gmail.com", userRegistration.validate));

    }
    /*
    Test To Valid Email Ends With .Com Return True
    Checking Validate Email With Pattern And Storing In result
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenEmail_EndsWithCom_ReturnTrue() {
        Assertions.assertEquals("VALID_EMAIL" , UserRegistration.validateEmail("gopi1998@gmail.com", userRegistration.validate));

    }
    //UC4
    /*
    Test To Phone Number Start With Country Code Should Return True
    Checking Validate Phone Number With Pattern And Storing In result
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenPhoneNumber_StartWithCountryCode_ReturnTrue() throws UserRegistrationException {
        Assertions.assertEquals("VALID_NUMBER" , UserRegistration.validatePhoneNumber("91 9666110767", userRegistration.validate));


    }
    /*
    Test To Phone Number Does Not Have 10Numbers Return False
    Checking Validate Phone Number With Pattern And Storing In result
    If Phone Number Is Not Match With Pattern It Throws Exception Handling Message
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenPhoneNumber_DoesNotHave10Numbers_ReturnFalse() throws UserRegistrationException {
        Assertions.assertEquals("INVALID_NUMBER" ,UserRegistration.validatePhoneNumber("966611077", userRegistration.validate));

    }
    /*
    Test To Phone Number Does Have 10Numbers Return True
    Checking Validate Phone Number With Pattern And Storing In result
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenPhoneNumber_DoesHave10Numbers_ReturnTrue() throws UserRegistrationException {
        Assertions.assertEquals("VALID_NUMBER" , UserRegistration.validatePhoneNumber("91 9666110767", userRegistration.validate));

    }
    //UC5
    /*
    Test To Password Does Have 8Characters Return True
    Checking Validate Password With Pattern And Storing In result
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenPassword_ContainsEightDigits_ReturnTrue() {
        Assertions.assertEquals("VALID_PASSWORD" ,UserRegistration.validatePassword("Gopi@144", userRegistration.validate));

    }
    /*
    Test To Password Does Not Have 8 Characters Return False
    Checking Validate Password With Pattern And Storing In result
    If Password Is Not Match With Pattern It Throws Exception Handling Message
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenPassword_DoesNotContainsEightDigits_ReturnFalse() {
        Assertions.assertEquals("INVALID_PASSWORD" ,UserRegistration.validatePassword("Gopi@12", userRegistration.validate));

    }
    //UC6
    /*
    Password Should Contain One UpperCase Letter
    Test To Password Does Have One UpperCase And 8 Characters Return True
    Checking Validate Password With Pattern And Storing In result
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenPassword_ShouldHaveOneUpperCase_AndContainsEightDigits_ReturnTrue() {
        Assertions.assertEquals("VALID_PASSWORD" , UserRegistration.validatePassword("Gopi@144", userRegistration.validate));

    }
    /*
    Test To Password Does Not Have UpperCase And 8 Characters Return False
    Checking Validate Password With Pattern And Storing In result
    If Password Is Not Match With Pattern It Throws Exception Handling Message
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenPassword_ShouldNotHaveOneUpperCase_AndContainsEightDigits_ReturnFalse() {
        Assertions.assertEquals("INVALID_PASSWORD" ,UserRegistration.validatePassword("gopi@144", userRegistration.validate));


    }
    //UC7
    /*
    Password Should Contain One Numeric Number
    Test To Password Does Have One Numeric Number And 8 Characters Return True
    Checking Validate Password With Pattern And Storing In result
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenPassword_ShouldHaveOneNumericNbr_AndContainsEightDigits_ReturnTrue() {
        Assertions.assertEquals("VALID_PASSWORD" ,UserRegistration.validatePassword("Gopi@145", userRegistration.validate));

    }
    /*
    Test To Password Does Not Have One Numeric Number And 8 Characters Return True
    Checking Validate Password With Pattern And Storing In result
    If Password Is Not Match With Pattern It Throws Exception Handling Message
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenPassword_ShouldNotHaveOneNumericNbr_AndContainsEightDigits_ReturnFalse() {
        Assertions.assertEquals("INVALID_PASSWORD" ,UserRegistration.validatePassword("Gopi@$" , userRegistration.validate));

    }
    /*
    UC8 Password Should Contain One Special Character
    Test To Password Does Have One Numeric Number And 8 Characters Return True
    Checking Validate Password With Pattern And Storing In result
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenPassword_ShouldHaveOneSpecialCharacter_AndContainsEightDigits_ReturnTrue() {
        Assertions.assertEquals("VALID_PASSWORD" ,UserRegistration.validatePassword("Gopi@144" , userRegistration.validate));

    }
    /*
    Test To Password Does Not Have One Numeric Number And 8 Characters Return True
    Checking Validate Password With Pattern And Storing In result
    If Password Is Not Match With Pattern It Throws Exception Handling Message
    Asserting The Result As Boolean Type True Or False
    */
    @Test
    public void givenPassword_ShouldNotHaveOneSpecialCharacter_AndContainsEightDigits_ReturnFalse() {
        Assertions.assertEquals("INVALID_PASSWORD" ,UserRegistration.validatePassword("Gopi@144", userRegistration.validate));

    }
}