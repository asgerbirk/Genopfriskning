package Exercise2;

import java.util.ArrayList;


public class Biblotek {

   private Bog bog1 = new Bog(1, "john", 1998);
    private Bog bog2 = new Bog(2, "zando", 1995);
    private Bog bog3 = new Bog(3, "riise", 1993);
     private ArrayList<Bog> books = new ArrayList<>();


    public void getAllBooks() {
        books.add(bog1);
        books.add(bog2);
        books.add(bog3);

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

    public boolean checkForSameBook(Bog bog) {
        getAllBooks();
        if (books.get(0).equals(bog.getISBNNumber())) {
            return true;
        } else {
            return false;
        }
    }
}




