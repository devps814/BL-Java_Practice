
import java.util.*;

public class PassengerRegistration{
    private int id;
    private String name;
    private int age;
    private String source_Station;
    private String destination_station;
    private double wallet_ballance;


    public PassengerRegistration(int id , String name , int age , String source_Station, String destination_station , double wallet_ballence){
        this.id = id;
        this.name = name;
        this.age = age;
        this.source_Station = source_Station;
        this.destination_station = destination_station;
        this.wallet_ballance = wallet_ballance;
    }

    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String getsource_Station(){
        return source_Station;
    }
    public String getdestination_station(){
        return destination_station;
    }
    public double getwallet_ballence(){
        return wallet_ballance;
    }

    List<PassengerRegistration> passengerlist = new ArrayList<>();
    public void addPassenger(PassengerRegistration passenger){
        for (PassengerRegistration existing : passengerlist) {
            if (existing.getid() == passenger.getid()) {
                System.out.println("Passenger id is already present !");
                return;
            }
        }
        passengerlist.add(passenger);
    }

}