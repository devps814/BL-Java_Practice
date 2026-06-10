package DesignPatterns.Review;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private static LibraryManager manager;
    private List<Observer> observers = new ArrayList<>();

    private LibraryManager(){

    }
    public static LibraryManager getManager(){
        if (manager == null){
            synchronized (LibraryManager.class){
                if (manager == null){
                    manager = new LibraryManager();
                }
            }
        }
        return manager;
    }

    public void registerObserver(Observer ob){
        observers.add(ob);
    }
    public void notifyUsers(String message){
        for (Observer observer : observers){
            observer.notify(message);
        }
    }

    public void addBook(Book book){

        System.out.println(book.getTitle() + " added to the library ");
        notifyUsers(book.getTitle() + " is now available ");
    }
}
