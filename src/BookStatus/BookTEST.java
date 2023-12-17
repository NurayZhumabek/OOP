package BookStatus;

public class BookTEST {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings",Status.BORROWED);
        BookMover fromAvailableStatusMover = new FromAvailable();
        fromAvailableStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.getStatus());
    }
}
