package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UR1Test {
   @Test
   public void uc1exception() {
       UserRegistration1 userReg = new UserRegistration1();
       try {
           boolean result = userReg.validfName("gopi");
          Assertions.assertEquals(false, result);
       }catch(UserRegistrationException e){
           e.printStackTrace();

       }
   }
}
