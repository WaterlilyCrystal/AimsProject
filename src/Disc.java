package hust.soict.cybersecurity.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Disc extends AbstractMedia implements IPlayable{
    private String director;
    private int length;

    public Disc(String title, int id, String category, float cost, String director, int length) {
        super(title, id, category, cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() {

    }
}

