package hust.soict.cybersecurity.aims.cart;
import hust.soict.cybersecurity.aims.media.AbstractMedia;
import hust.soict.cybersecurity.aims.media.DigitalVideoDisc;
import java.util.ArrayList;

public class Cart {
    public  static  final  int MAX_NUMBER_ORDERED = 20;
    //Add a field as an array to store a list of DigitalVideoDisc
    private ArrayList<AbstractMedia> itemsOrdered = new
            ArrayList<AbstractMedia>();
    //To add an item to the list
    public void addMedia(AbstractMedia media) {
        if (itemsOrdered.size() == MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
        } else {
            itemsOrdered.add(media);
            System.out.println("The media " + media.getTitle() + " has been added");
        }
    }
    public void removeMedia(AbstractMedia media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media " + media.getTitle() + " has been removed");
        } else {
            System.out.println("The media was not found in the cart");
        }
    }

    public float totalCost() {
        float result = 0;
        for (AbstractMedia media : itemsOrdered) {
            result += media.getCost();
        }
        return result;
    }
}






