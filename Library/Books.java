import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
public class Books {  

    Scanner reader = new Scanner(System.in);

    HashMap<String, Book> bookByTitle = new HashMap<>();
    HashMap<Integer, Book> bookBySerialNumber = new HashMap<>();
    HashMap<String, ArrayList<Book>> bookAvailability = new HashMap<>();

    public void addBook() {
    System.out.println("Enter the books title, author, and serial number seperated by commas:");
    String input = reader.nextLine();
    String[] parts = input.split(",");

    String title = parts[0];
    String author = parts[1];
    int serialNumber = Integer.valueOf(parts[2]);

    Book newBook = new Book (title, author, serialNumber);
    bookByTitle.put(title, newBook);
    bookBySerialNumber.put(serialNumber, newBook);
    bookAvailability.putIfAbsent(title, new ArrayList<>());
    bookAvailability.get(title).add(newBook);
    System.out.println("Book added succesfully"); 
    
    System.out.println(bookAvailability);
    }

    public void removeBook() {
        System.out.println("Would you like to remove the book by its title or serial number?");
        String input = reader.nextLine();
        if (input.equalsIgnoreCase("title")) {
            removeBookTitle();
        } else if (input.equalsIgnoreCase("serial number")) {
            removeBookSerialNumber();
        }
    }

    public void removeBookTitle() {
        System.out.println("What's the book's title?");
        String input = reader.nextLine();
        if (bookByTitle.containsKey(input)) {
            List<Book> arrayListBookToRemove = bookAvailability.get(input);
            for (Book b: arrayListBookToRemove) {
                int serialNumbersToRemove = b.getSerialNumber()
                bookBySerialNumber.remove(serialNumbersToRemove);
            }
            bookByTitle.remove(input);
            System.out.println("All copies are removed");
    } else {
        System.out.println("Title doesn't exist");
    }
    }

    /*public void removeBookSerialNumber() {
        System.out.println("What's the book's serial number?");
        int input = reader.nextInt() {
            if (bookBySerialNumber.containsKey(input)) {
                Book book = bookBySerialNumber.get(input);
                removeBookTitle(book.getTitle());

                bookBySerialNumber.remove(input);
                bookByTitle.removeValue(bookBySerialNumber.get(input));
            }
        }
    } */
    

    public void getBookInfoTitle() {
        System.out.println("Please enter the title: ");
        String input = reader.nextLine();
        System.out.println(bookByTitle.get(input));
    }

    public void getBookInfoSerialNumber() {
        System.out.println("Please enter the serial number: ");
        int input = reader.nextInt();
        System.out.println(bookBySerialNumber.get(input));
    }

    public void getBookInfo() {
        System.out.println("Would you like to search for the book through the title or serial number?");
        String input = reader.nextLine();
        if (input.equalsIgnoreCase("title")) {
            getBookInfoTitle();
        } else if (input.equalsIgnoreCase("serial number")) {
            getBookInfoSerialNumber();
        }
    }

    



}
