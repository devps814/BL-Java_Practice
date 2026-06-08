package com.lcwd.test.cabInfo;

public class InvoiceSummary {
    double totalrides ;
    double totalfare;
    double averagefare;

    public InvoiceSummary(double totalrides, double totalfare){
        this.totalrides = totalrides;
        this.totalfare = totalfare;
        this.averagefare = totalfare/ totalrides;
    }
    @Override
    public String toString(){
        return "\nInvoice Summary " +
                "\nTotal Rides : " + totalrides +
                "\nTotal fare : " + totalfare +
                "\nAverage fare : " + averagefare;
    }
}
