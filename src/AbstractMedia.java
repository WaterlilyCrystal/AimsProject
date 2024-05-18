package hust.soict.cybersecurity.aims.media;
import hust.soict.cybersecurity.aims.cart.MediaCompareByCost;
import hust.soict.cybersecurity.aims.cart.MediaCompareByTitle;

import java.util.Comparator;
public abstract class AbstractMedia {
    int id;
    String title;
    String category;
    float cost;

    public static final Comparator<AbstractMedia> COMPARE_BY_TITLE_COST= new MediaCompareByTitle();

    public static final Comparator<AbstractMedia> COMPARE_BY_COST_TITLE = new MediaCompareByCost();

    public AbstractMedia(String title, int id, String category, float cost) {
    }

    public AbstractMedia() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference, so they are equal
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Not an instance of Media or null
        }
        AbstractMedia otherMedia = (AbstractMedia) obj;
        return title.equals(otherMedia.title);
    }
}

