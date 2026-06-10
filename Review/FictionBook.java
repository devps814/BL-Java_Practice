package DesignPatterns.Review;

public class FictionBook {

   public static Book createBook(){
       return new Book.BuilderBook()
               .setTitle("Harry Potter")
               .setAuthor("J.K.Rowling")
               .setEdition("2015")
               .setGenre("fiction").build();
   }
}
