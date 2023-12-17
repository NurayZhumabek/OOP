package BookStatus;

public class FromArchievedStatusMover  extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {

        switch (requestedStatus){
            case AVAILABLE -> System.out.println("The transfer of the book from the status " +
                    "of  ARCHIVED  to the status of AVAILABLE is  possible");
            case BORROWED -> System.out.println("The transfer of the book from the status " +
                    "of  ARCHIVED  to the status of BORROWED is  not  possible");
            case OVERDUED -> System.out.println("The transfer of the book from the status " +
                    "of  ARCHIVED  to the status of OVERDUED is not possible");
        }
    }
}
