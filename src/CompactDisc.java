package hust.soict.cybersecurity.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements IPlayable{
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, int id, String category, float cost, String director, int length, String artist) {
        super(title, id, category, cost, director, length);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    // Add a track to the CD
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        } else {
            System.out.println("Track already exists: " + track.getTitle());
        }
    }

    // Remove a track from the CD
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track not found: " + track.getTitle());
        }
    }

    // Calculate the total length of the CD
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    // Implement the play() method
    @Override
    public void play() {
        System.out.println("Playing Compact Disc: " + getTitle());
        System.out.println("Artist: " + artist);
        System.out.println("Total Length: " + getLength() + " seconds");

        // Play each track
        for (Track track : tracks) {
            System.out.println("Track: " + track.getTitle() + " (" + track.getLength() + " seconds)");
            // Call the play() method for each track
            track.play();
        }
    }
}


