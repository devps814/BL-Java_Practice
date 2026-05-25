
import java.util.*;

// --- Custom Exception Handling ---
class MetroException extends Exception {
    public MetroException(String message) {
        super(message);
    }
}

// --- Module 1: Passenger Registration (Encapsulation) ---
class Passenger {
    private String passengerID;
    private String name;
    private int age;
    private String sourceStation;
    private String destinationStation;
    private double walletBalance;

    public Passenger(String passengerID, String name, int age, String sourceStation, String destinationStation, double walletBalance) throws MetroException {
        if (name == null || name.trim().isEmpty()) throw new MetroException("Name cannot be empty.");
        if (walletBalance < 0) throw new MetroException("Wallet balance cannot be negative.");
        this.passengerID = passengerID;
        this.name = name;
        this.age = age;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.walletBalance = walletBalance;
    }

    // Getters and Setters
    public String getPassengerID() { return passengerID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getWalletBalance() { return walletBalance; }
    public void setWalletBalance(double walletBalance) { this.walletBalance = walletBalance; }

    @Override
    public String toString() {
        return "ID: " + passengerID + " | Name: " + name + " | Wallet: ₹" + walletBalance;
    }
}