package hust.soict.cybersecurity.aims.media;
import java.util.List;
import java.util.ArrayList;

public class Book extends AbstractMedia{
    private List<String> authors = new ArrayList<String>();

    public Book() {
        super();
//Auto-generated constructor
    }

    public Book(String title, int id, String category, float cost, List<String> authors) {
        super(title, id, category, cost);
        this.authors = authors;
    }

    public void addAuthor(String authorName){
        if (this.authors.contains(authorName) == true){
            System.out.println("That author is already in the list");
        } else {
            this.authors.add(authorName); // Directly assign
            System.out.println("The author " + authorName + " has been added to the list");
        }
    }

    public void removeAuthor(String authorName){
        if (this.authors.contains(authorName) == false){
            System.out.println("That author is not in the list");
        } else {
            this.authors.add(authorName); // Directly assign
            System.out.println("The author " + authorName + " has been removed from the list");
        }
    }
}