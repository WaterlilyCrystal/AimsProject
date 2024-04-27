package hust.soict.cybersecurity.aims.cart;

public class Cart {
    public  static  final  int MAX_NUMBER_ORDERED = 20;


    //Add a field as an array to store a list of DigitalVideoDisc
    private  DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];


    //To keep track of how many DigitalVideoDiscs are in the cart, we create a field named qtyOrdered and set init val = 0
    private int qtyOrdered=0;


    //To add an item to the list
    public void  addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered==MAX_NUMBER_ORDERED){
            System.out.println("The cart is almost full");
        } else {
            itemsOrdered[qtyOrdered] = disc; // Directly assign the disc to the array
            qtyOrdered++;
            System.out.println("The disc " + disc.getTitle() + " has been added to the cart");
        }
    }
    //returns the total cost of the current cart
    public float totalCost() {
        float result = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            result += itemsOrdered[i].getCost();
        }
        return result;
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {  //found the disc to be removed
                // Shift the subsequent elements to the left
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; // Nullify the last element
                qtyOrdered--; // Decrease qtyOrdered
                System.out.println("The disc " + disc.getTitle() + " has been deleted from cart");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The disc was not found in the cart");
        }
    }

    // Overloading: Add a list of DVDs to the current cart
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (qtyOrdered > (MAX_NUMBER_ORDERED - dvdList.length)) {
            System.out.println("The cart is almost full");
        } else {
            for (int i = 0; i < dvdList.length; i++) {
                itemsOrdered[qtyOrdered + i] = dvdList[i];
                qtyOrdered++;
            }
            System.out.println("Some new discs have just been added");
        }
    }

    // Overloading: Add an arbitrary number of DVDs to the current cart
    public void addDigitalVideoDisc1(DigitalVideoDisc... dvd) {
        for (DigitalVideoDisc disc : dvd) {
            if (qtyOrdered == MAX_NUMBER_ORDERED) {
                System.out.println("The cart is almost full");
                break;
            }
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
        }
        System.out.println("Some new discs have just been added");
    }

    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            System.out.println((i + 1) + ". DVD - " + disc.getTitle() + " - " + disc.getCategory() +
                    " - " + disc.getDirector() + " - " + disc.getLength() + " minutes: $" + disc.getCost());
        }
        System.out.println("Total cost: $" + totalCost());
        System.out.println("**************************************************");
    }


    public boolean searchByID(int id){
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            if (disc.getId()==id){
                System.out.println((i + 1) + ". DVD - " + disc.getTitle() + " - " + disc.getCategory() +
                        " - " + disc.getDirector() + " - " + disc.getLength() + " minutes: $" + disc.getCost());
                return  true;
            }
        }
        System.out.println(id+": No disc with that ID found");
        return false;
    }

    public boolean searchByTitle(String title){
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            if (disc.getTitle().equals(title)){
                System.out.println((i + 1) + ". DVD - " + disc.getTitle() + " - " + disc.getCategory() +
                        " - " + disc.getDirector() + " - " + disc.getLength() + " minutes: $" + disc.getCost());
                return  true;
            }
        }
        System.out.println("No disc with Title " + title+ " found");
        return false;
    }
}




