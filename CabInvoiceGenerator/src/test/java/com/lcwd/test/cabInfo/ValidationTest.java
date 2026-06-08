package com.lcwd.test.cabInfo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidationTest {

    Validation valid = new Validation();

    @Test
    void validEmail(){
        Assertions.assertTrue(valid.isEmailvalid("devprataps814@gmail.com"));
    }
    @Test
    void validPassword(){
        Assertions.assertTrue(valid.ispasswordValid("Pratap@123"));
    }
    @Test
    void validPhoneNo(){
        Assertions.assertTrue(valid.isPhoneNoValid("8546971230"));
    }

}
