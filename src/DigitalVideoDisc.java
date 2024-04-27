package hust.soict.cybersecurity.aims.disc;
public class DigitalVideoDisc {
    private  String title;
    private  String category;
    private  String director;
    private  int length;

    public java.lang.String getTitle() {
        return title;
    }

    public java.lang.String getCategory() {
        return category;
    }


    public java.lang.String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getCost() {
        return cost;
    }

    private  float cost;

    public DigitalVideoDisc(java.lang.String title) {
        this.title = title;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(java.lang.String title, java.lang.String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(java.lang.String title, java.lang.String category, java.lang.String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(java.lang.String title, java.lang.String category, java.lang.String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public int getId() {
        return id;
    }
}
