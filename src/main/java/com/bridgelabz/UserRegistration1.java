package com.bridgelabz;
import java.util.regex.Pattern;
public class UserRegistration1 {
    private Pattern pattern;

    public boolean validfName(String firstName) throws UserRegistrationException {
         //String Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";//The First Letter With Cap And Min 3 Letters
        boolean ghj= pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName);//Matching The Name Pattern And FirstName And Returning It
        //return ghj;
       if(ghj) {
           System.out.println("First Name Is Valid");
       } else{
           throw new UserRegistrationException("inValid First Name");
       }
    return ghj;
    }
}
