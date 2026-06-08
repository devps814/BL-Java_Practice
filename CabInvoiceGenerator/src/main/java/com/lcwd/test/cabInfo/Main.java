package com.lcwd.test.cabInfo;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "D101" ,"Dev Singh", "9874563210",
                "devprataps814@gmail.com");

        Ride[] rides = {
                new Ride(2,5 ),
                new Ride(3,10),
                new Ride(1,2)
        };
        GenerateInvoice generator = new GenerateInvoice();
        InvoiceSummary summary = generator.Calculatefareofsummary(rides);

        System.out.println("Customer details :... ");
        System.out.println("Customer ID : " + customer.getCustomerId());
        System.out.println("Customer Name : " + customer.getName());
        System.out.println("Customer phoneNo :" + customer.getPhoneNo());
        System.out.println("Customer emailId : " + customer.getEmail());
        System.out.println(summary);


    }
}
