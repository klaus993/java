package Main;

import LinkedList.LinkedList;
import composition.exercise.*;

public class Main {

    public static void main(String[] args) {
        //linkedListTest();
        //authorTest();
        //firstBookTest();
        secondBookTest();
    }

    private static void linkedListTest() {
        LinkedList list = new LinkedList<Integer>();
        list.push(1);
        list.push(2);
        Test.print("Probando que el primero sea correcto", (Integer)list.getFirst() == 2);
        Test.print("Probando que el último sea correcto" , (Integer)list.getLast() == 1);
        Test.print("Probando que borrar el primero sea correcto", (Integer)list.pop() == 2);
        list.pushLast(55);
        Test.print("Probando insertar último", (Integer)list.getLast() == 55);
    }

    private static void authorTest() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", Gender.MALE); // Test the constructor
        System.out.println(ahTeck);  // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com");  // Test setter
        System.out.println("name is: " + ahTeck.getName());     // Test getter
        System.out.println("email is: " + ahTeck.getEmail());   // Test getter
        System.out.println("gender is: " + ahTeck.getGender()); // Test gExerciseOOP_MyPolynomial.pngetter
    }

    /*private static void firstBookTest() {
        // Construct an author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", Gender.MALE);
        System.out.println(ahTeck);  // Author's toString()

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()

        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthors());  // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthors().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthors().getEmail());

        // Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", Gender.MALE), 29.95);
        System.out.println(anotherBook);  // toString()
    }*/

    private static void secondBookTest() {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[3];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", Gender.MALE);
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", Gender.MALE);
        authors[2] = new Author("Klaus Lungwitz", "lungwitz.klaus@gmail.com", Gender.MALE);

        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()
    }
}
