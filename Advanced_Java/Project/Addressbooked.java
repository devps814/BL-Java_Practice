
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Addressbooked {
    public static void main(String[] args) {
        try {
            Contacts c1 = new Contacts("Shivam", "9835672834", "Mathura");
            Contacts c2 = new Contacts("Dev", "9835685678", "Etawah");
            Contacts c3 = new Contacts("Rahul", "9835670579", "Kanpur");
            Contacts c4 = new Contacts("Aditya", "98356725678", "Agra");
            Contacts c5 = new Contacts("Abhay", "9835689401", "Delhi");

            addaddress(c1);
            addaddress(c2);
            addaddress(c3);
            addaddress(c4);
            addaddress(c5);

            InsertFile();
            System.out.println("Successfully store the file in the output file! ");

            //check for modifying
            modifyContact("Rahul", "9874521458" ,"Chennai");
            InsertFile();

            // check for deleting
             deleteContact("Aman");

            //Read the records from the file and print it on console
            ReadFile();
            
        } catch (Exception e) {
            System.out.println("Custom exception cought " + e.getMessage());
        }
        finally{
            System.out.println("Program Executed !");
        }


    }
    //Storage
    private static List<Contacts> storage = new ArrayList<>();
    public static void addaddress(Contacts c){
        if(c != null){
            storage.add(c);
        }
    }

    //Modifying
    public static void modifyContact(String name, String newnumber, String newaddress) throws AddressNotFoundException {
        boolean isfound = false;
        for (int i =0; i < storage.size(); i++){
            Contacts c = storage.get(i);
            if (c.getname().equalsIgnoreCase(name)){
                isfound = true;
                c.setnumber(newnumber);
                c.setaddress(newaddress);
                System.out.println("Modified Successfully!");
            }
        }
        if (!isfound){
            throw new AddressNotFoundException("Address not found in the record!");
        }
    }
    //Deleting
    public static void deleteContact(String name) throws AddressNotFoundException{
        boolean isfound = false;
        for (int i = 0 ; i < storage.size(); i++){
            Contacts c = storage.get(i);
            if (c.getname().equalsIgnoreCase(name)){
                isfound = true;
                storage.remove(i);
                System.out.println("Successfully delete the contact from the address!");
            }
        }
        if (!isfound){
            throw new AddressNotFoundException("Contact not found which wants to delete!");
        }
    }
    //Retrieving or writing the file
    public static void InsertFile(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            for (int i = 0; i < storage.size(); i++){
                Contacts c = storage.get(i);
                String line = c.getname() + ","  + c.getnumber() + "," + c.getaddress();
                bw.write(line);
                bw.newLine();
            }
        }
        catch(Exception e){
            System.out.println("File not found exception occur!");
        }
    }
    //Reading the file 
    public static void ReadFile() throws AddressNotFoundException{
        try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                String[] data = line.split(",");
                if (data.length == 3){
                    System.out.println("Name: " + data[0] + "NUmber : " + data[1] + "Address : " + data[2] );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("Program finished!");
        }
    }

}

