public class Book {
    // Attributes
    private String title;
    private String author;
    private String ISBN;
    private double price;

    public Book() {
        this.title = "";
        this.author = "";
        this.ISBN = "";
        this.price = 0.0;
    }

    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: $" + price);
    }

    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            price -= price * (discountPercentage / 100);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("Default Book Information:");
        book1.displayInfo(); // Display default values

        Book book2 = new Book("1984", "George Orwell", "123456789", 15.99);
        System.out.println("\nBook 2 Information:");
        book2.displayInfo(); // Display book2 details

        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "987654321", 12.99);
        System.out.println("\nBook 3 Information:");
        book3.displayInfo(); // Display book3 details


        System.out.println("\nApplying a 10% discount to Book 2:");
        book2.applyDiscount(10); // Apply 10% discount
        System.out.println("Updated Book 2 Information:");
        book2.displayInfo(); // Display updated details
    }
}
