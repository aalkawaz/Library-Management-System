import java.util.Scanner;
public class Book {
Scanner reader = new Scanner(System.in);
    private  String title;
    private  String author;
    private int serialNumber;
    public int availability;

    public Book(String title, String author, int serialNumber) {
        this.title = title;
        this.author = author;
        this.serialNumber = serialNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    

    public String toString() {
        return "Title: " +  title + " Author: " + author + " Serial Number: " + serialNumber;
    }
      
}
