package DesignPatterns.Review;

public interface Bookfactory{
    public static Book createBook(String type){

        if (type.trim().equalsIgnoreCase("fiction")){
            return FictionBook.createBook();
        }
        else if (type.trim().equalsIgnoreCase("Science")){
            return ScienceBook.createBook();
        }
        else{
            return null;
        }
    }
}
