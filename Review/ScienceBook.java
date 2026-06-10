package DesignPatterns.Review;

public class ScienceBook {
    public static Book createBook(){
        return new Book.BuilderBook()
                .setTitle("Science Book")
                .setAuthor("Stephen Hawking")
                .setEdition("1988")
                .setGenre("science")
                .build();
    }
}
