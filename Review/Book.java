package DesignPatterns.Review;
// Builder pattern

public class Book{
   private final String title;
   private final String author;
   private final String edition;
   private final String genre;

   private Book(BuilderBook builderBook){
       this.title = builderBook.title;
       this.author = builderBook.author;
       this.edition = builderBook.edition;
       this.genre = builderBook.genre;

   }
   public String getTitle(){
       return title;
   }

    @Override
    public String toString() {
        return this.title + " : " + this.author+ " : " + this.edition+ " : " + this.genre;
    }

    static class BuilderBook{
       private String title;
       private String author;
       private String edition;
       private String genre;

       BuilderBook(){
       }
       public BuilderBook setTitle(String title){
           this.title = title;
           return this;
       }
       public BuilderBook setAuthor(String author){
           this.author = author;
           return this;
       }
       public BuilderBook setEdition(String edition){
           this.edition = edition;
           return this;
       }
       public BuilderBook setGenre(String genre){
           this.genre = genre;
           return this;
       }
       public Book build(){
           Book book = new Book(this);
           return book;
       }
   }

}
