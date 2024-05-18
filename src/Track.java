package hust.soict.cybersecurity.aims.media;
public class Track implements IPlayable{
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference, so they are equal
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Not an instance of Track or null
        }
        Track otherTrack = (Track) obj;
        return title.equals(otherTrack.title) && length == otherTrack.length;
    }
}

