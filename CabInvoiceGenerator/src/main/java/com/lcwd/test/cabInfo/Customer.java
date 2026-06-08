package com.lcwd.test.cabInfo;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String phoneNo;

    public Customer(String customerId, String name, String phoneNo, String email){
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }
    public String getCustomerId(){
        return this.customerId;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNo(){
        return this.phoneNo;
    }

}
