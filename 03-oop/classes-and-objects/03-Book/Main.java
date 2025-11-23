
public class Main {
    public static void main(String[] args) {
            Book book1 = new Book("The Bible", -1000, 29.99);
            Book book2 = new Book("Rich Dad Poor Dad", 1997, 19.99);
            Book book3 = new Book("Ego is the Enemy", 2016, 14.99);


            book1.displayInfo();
            System.out.println();

            book2.displayInfo();
            System.out.println();
            
            book3.displayInfo();
            System.out.println();
    }



}
