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
    //Validation Of First Name And Return True
    public void givenFirstName_Return_True() {
        //Checking Validate FirstName With Pattern And Storing In result
       boolean result= userRegistration.validateFirstName("Gopi");
       //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(true,result);
    }
    //Test To Valid FirstName If It Starts With Small Letter Print False
    @Test
    public void givenFirstName_Return_False(){
        //Checking Validate FirstName With Pattern And Storing In result
        boolean result =userRegistration.validateFirstName("gopi");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(false,result);
    }
}
