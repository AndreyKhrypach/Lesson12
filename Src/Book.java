import EnumHelper.Topic;

public class Book {
    String name;
    Topic bookType;
    String author;

    Book(String name, String author, Topic type){

        bookType = type;
        this.name = name;
        this.author = author;
    }
}
