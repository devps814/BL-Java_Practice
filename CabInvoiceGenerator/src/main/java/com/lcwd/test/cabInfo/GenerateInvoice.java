package com.lcwd.test.cabInfo;

public class GenerateInvoice {
    private double costperkm = 10;
    private double costpermin = 1;
    private double minimumFare = 5;

    public double CalculateFare(double distance, double time){
        double fare = (distance * costperkm) + (time * costpermin);
        return Math.max(fare,minimumFare);
    }

    public InvoiceSummary Calculatefareofsummary(Ride[] rides){
        double totalfare = 0;

        for (Ride ride : rides){
            totalfare = totalfare + CalculateFare(ride.getDistance(), ride.getTime());
        }
        return new InvoiceSummary(rides.length, totalfare);
    }
}
