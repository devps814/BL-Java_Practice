package com.lcwd.test.cabInfo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public boolean isEmailvalid(String email){
        String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    public boolean isPhoneNoValid(String phoneNo){
        String regex = "^[6-9][0-9]{9}$";

        Pattern pt = Pattern.compile(regex);
        Matcher mt = pt.matcher(phoneNo);
        return mt.matches();
    }
    public boolean ispasswordValid(String password){
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$" ;
        Pattern pt = Pattern.compile(regex);
        Matcher mt = pt.matcher(password);
        return mt.matches();
    }
}
