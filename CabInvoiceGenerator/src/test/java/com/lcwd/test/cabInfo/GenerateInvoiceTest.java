package com.lcwd.test.cabInfo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GenerateInvoiceTest {
    GenerateInvoice invoiceTest = new GenerateInvoice();
    @BeforeEach
    public void beforeeach(){
        System.out.println("It will ask for which ride you have to choose ! ");
    }
    @Test
    void NormalRides(){
        double fare = invoiceTest.CalculateFare(2,5);
        Assertions.assertEquals(25,fare);
        System.out.println("The customer choose Normal type of Ride !");
    }
    @Test
    void PremiumRides(){
        double fare = invoiceTest.CalculateFare(0.1,1);
        Assertions.assertEquals(5,fare);
        System.out.println("The ");
    }
    @Test
    void multipleRides(){
        Ride[] rides = {
                new Ride(2,5),
                new Ride(3,10)
        };
        InvoiceSummary summary = invoiceTest.Calculatefareofsummary(rides);
        Assertions.assertEquals(2,summary.totalrides);
//        Assertions.assertEquals(65,summary.totalrides);
    }


}
