package hust.soict.cybersecurity.aims.cart;

import hust.soict.cybersecurity.aims.media.AbstractMedia;

import java.util.Comparator;

public class MediaCompareByCost implements Comparator<AbstractMedia> {
    @Override
    public int compare(AbstractMedia media1, AbstractMedia media2) {
        int costComparison = Float.compare(media2.getCost(), media1.getCost()); // Higher cost first
        if (costComparison != 0) {
            return costComparison;
        } else {
            return media1.getTitle().compareTo(media2.getTitle());
        }
    }
}
