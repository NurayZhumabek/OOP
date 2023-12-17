package BookStatus;

public class FromAvailable extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {

        switch (requestedStatus){
            case ARCHIVED -> System.out.println("The transfer of the book from the status " +
                    "of  AVAILABLE to the status of ARCHIVED is  possible");
            case BORROWED -> System.out.println("The transfer of the book from the status " +
                    "of  AVAILABLE to the status of BORROWED is   possible");
            case OVERDUED -> System.out.println("The transfer of the book from the status " +
                    "of  AVAILABLE to the status of OVERDUED is possible");
        }
    }
}
