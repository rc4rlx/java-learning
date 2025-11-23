
public class Book {
    String title;
    int publicationYear;
    double price;

    public Book(String title, int publicationYear, double price) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Title           : " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Price           : $" + price);
    }
}
