import java.util.HashMap;

public class Library {
    public Library() {

    }
    public void getFinishedBooks(HashMap <String, Boolean> library){
        if (library.size() < 1){
            System.out.println("HashMap is empty");

        }
        else {
            for (String book : library.keySet()) {
                boolean read = library.get(book);
                System.out.println("Book name: " + book + " read: " + read);
            }

        }





    }

    public static void main(String[] args) {
        Library myLibrary = new Library();

        HashMap<String, Boolean> myBooks = new HashMap<>();
        myBooks.put("Harry Potter", false);
        myBooks.put("Penis Enlargement", true);
        myBooks.put("Road Down The Funnel", true);
        myBooks.put("Rat: A Biology", false);
        myBooks.put("TimeIn", true);
        myBooks.put("3D Food Printing", false);



        myLibrary.getFinishedBooks(myBooks);
    }
}
