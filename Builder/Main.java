package DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {

        User user = new User.UserBuilder().
                setEmailId("devprataps814@gmail.com")
                .setUserId("USER12")
                .setUserName("Dev").build();

        System.out.println(user);
    }
}
