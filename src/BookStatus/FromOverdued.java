package BookStatus;

public class FromOverdued extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus){
            case ARCHIVED -> System.out.println("The transfer of the book from the status " +
                    "of  OVERDYED to the status of ARCHIVED is  possible");
            case BORROWED -> System.out.println("The transfer of the book from the status " +
                    "of  OVERDYED to the status of BORROWED is not  possible");
            case AVAILABLE -> System.out.println("The transfer of the book from the status " +
                    "of  OVERDUED to the status of BORROWED is possible");
        }

    }
}
