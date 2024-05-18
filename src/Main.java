package hust.soict.cybersecurity.aims.main;

import java.util.ArrayList;
import java.util.List;
import hust.soict.cybersecurity.aims.media.AbstractMedia;
import hust.soict.cybersecurity.aims.media.Book;
import hust.soict.cybersecurity.aims.media.CompactDisc;
import hust.soict.cybersecurity.aims.media.Disc;

public class Main {
    public static void main(String[] args) {
        List<AbstractMedia> media = new ArrayList<>();

        // Creating some media objects: CD, DVD, Book
        CompactDisc cd = new CompactDisc("Music Album", 101, "Music", 12.99f, "Director X", 60, "Various Artists");
        Disc disc = new Disc("Smile", 201, "Movie", 19.99f, "Director Y", 120);


        // Adding media objects to the list
        media.add(cd);
        media.add(disc);

        // Printing details of each media object
        for (AbstractMedia m : media) {
            System.out.println(m.toString());
        } //hust.soict.cybersecurity.aims.media.CompactDisc@5b480cf9 and //hust.soict.cybersecurity.aims.media.Disc@6f496d9f
    }

    public static void showMenu() {

        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");

    }

    public static void storeMenu() {

        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");

    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {

        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");

    }

}