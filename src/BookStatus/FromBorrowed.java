package BookStatus;

public class FromBorrowed extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {

        switch (requestedStatus) {
            case ARCHIVED -> System.out.println("The transfer of the book from the status " +
                    "of  BORROWED to the status of ARCHIVED is  possible");
            case OVERDUED -> System.out.println("The transfer of the book from the status " +
                    "of  BORROWED to the status of OVERDUED is  possible");
            case AVAILABLE -> System.out.println("The transfer of the book from the status " +
                    "of  BORROWED to the status of AVAILABLE is possible");
        }
    }
}