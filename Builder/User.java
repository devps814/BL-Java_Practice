package DesignPatterns.Builder;

public class User {

    private final String userId;
    private final String userName;
    private final String emailId;

    private User(UserBuilder builder){
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.emailId = builder.emailId;
    }
    public String getUserId(){
        return userId;
    }
    public String getUserName(){
        return userName;
    }
    public String getEmailId(){
        return emailId;
    }

    @Override
    public String toString() {
        return this.userName + " : " + this.userId + " : " + this.emailId ;
    }

    //inner class to create an object
    static class UserBuilder{

        private  String userId;
        private  String userName;
        private  String emailId;

        public  UserBuilder(){

        }

        public UserBuilder setUserId(String userId){
            this.userId = userId;
            return this;
        }
        public UserBuilder setUserName(String userName){
            this.userName = userName;
            return this;
        }
        public UserBuilder setEmailId(String emailId){
            this.emailId = emailId;
            return this;
        }
        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
//while creating object when object contains may attribute there are many problems exist:
//1). we have to pass many arguments to create object.
//2). some parameters might be optional
//3). factory class takes all responsibility for creating object .
// If the object is heavy then all complexity is the part of factory class.
//So , Builder Pattern : be created object step by step and finally return final object with
//     desired values of attributes.
