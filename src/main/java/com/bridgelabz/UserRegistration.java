package com.bridgelabz;
import java.util.regex.Pattern;
/*
Program Of UserRegistration By Using Junit Testing
 */
public class UserRegistration {
    private Pattern pattern;//Declaring The Pattern variable as private
    //Declaring Validate First Name Method
    public boolean validateFirstName(String firstName) {
        //Here Declaring The Name Pattern
        String Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";//The First Letter With Cap And Min 3 Letters
        return pattern.matches(Name_Pattern, firstName);//Matching The Name Pattern And FirstName And Returning It
    }
    //Declaring Last Name Method
    public boolean validateLastName(String LastName) {
        //Here Declaring The Name Pattern
        String Name_pattern = "^[A-Z]{1}[a-z]{2,}$";//The First Letter With Cap And Min 3 Letters
        return pattern.matches(Name_pattern , LastName);//Matching0 The Name Pattern And LastName And Returning It.
    }
    //Declaring Valid Email Method
    public boolean validateemail(String Email) {
        //Here Declaring The Email Pattern
        String Email_pattern = "[a-z][a-zA-Z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z]{5}+.[a-zA-Z]{2,3}(.[a-zA-Z]{2})?$";
        return pattern.matches(Email_pattern,Email);//Matching The Email Pattern And Email And Returning It.
    }
}