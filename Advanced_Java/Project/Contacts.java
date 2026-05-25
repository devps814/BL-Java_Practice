class Contacts{
    private String name ;
    private transient String number;
    private String address;

    public Contacts(String name , String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }
    public String getname(){
        return this.name;
    }
    public String setname(String name){
        return this.name = name;
    }
    public String getnumber(){
        return this.number;
    }
    public String setnumber(String number){
        return this.number = number;
    }
    public String getaddress(){
        return this.address;
    }
    public String setaddress(String address){
        return this.address = address;
    }
    
}
