public class Book {
    String title;

    // Constructor
    Book() {
        title = "Untitled";
    }

    public static void main(String[] args) {
        Book b = new Book();
        System.out.println(b.title);
    }
}