package hust.soict.cybersecurity.aims.store;

public class Store {
    private DigitalVideoDisc[] itemsInStore;

    public Store(int capacity) {
        itemsInStore = new DigitalVideoDisc[capacity];
    }

    public void addDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] == null) {
                itemsInStore[i] = dvd;
                System.out.println("DVD \"" + dvd.getTitle() + "\" added to the store.");
                return;
            }
        }
        System.out.println("The store is full. Cannot add more DVDs.");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] != null && itemsInStore[i].equals(dvd)) {
                itemsInStore[i] = null;
                System.out.println("DVD \"" + dvd.getTitle() + "\" removed from the store.");
                return;
            }
        }
        System.out.println("DVD \"" + dvd.getTitle() + "\" not found in the store.");
    }

}
