package extends1.problem1;

public class Album extends Item{
    int isbn;
    String artist;

    public Album(String artist, int isbn,String name, int price){
        super(name, price);
        this.isbn = isbn;
        this.artist = artist;
    }
}
