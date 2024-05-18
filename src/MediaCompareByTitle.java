package hust.soict.cybersecurity.aims.cart;

import hust.soict.cybersecurity.aims.media.AbstractMedia;

import java.util.Comparator;

public class MediaCompareByTitle implements Comparator<AbstractMedia> {
    @Override
    public int compare(AbstractMedia media1, AbstractMedia media2) {
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        } else {
            return Float.compare(media2.getCost(), media1.getCost()); // Higher cost first
        }
    }
}

