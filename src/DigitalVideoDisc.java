package hust.soict.cybersecurity.aims.media;
public class DigitalVideoDisc extends Disc implements IPlayable{


    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public DigitalVideoDisc(String title, int id, String category, float cost, String director, int length) {
        super(title, id, category, cost, director, length);
    }

    public int getId() {
        return id;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
