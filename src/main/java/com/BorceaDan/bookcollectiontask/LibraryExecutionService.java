package com.BorceaDan.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class LibraryExecutionService {

    public static void main(String[] args) {
        Book book1984 = new Book("1984" , "George O.");
        Book bookHomework = new Book("Tema pentru acasa", "Nicolae Dabija");
        Book bookAventuresChildrens = new Book("Amintiri din copilarie", "Ion Creanga");
        Book bookDark = new Book("Noaptea", "Jovani N.");

        Library classicLibrary = new Library("Moldova");

        classicLibrary.addBook(bookHomework);
        classicLibrary.addBook(bookAventuresChildrens);
        classicLibrary.addBook(bookHomework, book1984);

        classicLibrary.printAllTheBooks();

        System.out.println("1. Numarul de carti este: " + classicLibrary.returnNumberBooks());

        classicLibrary.removeBook (3);

        classicLibrary.removeBook(book1984);

        System.out.println("2. Numarul de carti dupa stergere este: " + classicLibrary.returnNumberBooks());

        classicLibrary.removeBook("Tema pentru acasa");

        System.out.println("3. Numarul de carti dupa stergere este: " + classicLibrary.returnNumberBooks());

        classicLibrary.printAllTheBooks();

        Library elefantLibrary = new Library("Elefant");

        elefantLibrary.addBook(bookDark, bookDark);
        elefantLibrary.addBook(book1984,bookHomework);
        elefantLibrary.addBook(bookAventuresChildrens);

        System.out.println(elefantLibrary.returnNumberBooks());

        Map<String, Library> LibrariesNetwork = new HashMap<>();
        LibrariesNetwork.put("str.Vieru 15", classicLibrary);
        LibrariesNetwork.put("str. Alecsandri 64", elefantLibrary);

        LibrariesNetwork.get("str. Alecsandri 64").addBook(bookDark);
        LibrariesNetwork.get("str.Vieru 15").printAllTheBooks();
        LibrariesNetwork.get("str.Vieru 15").addBook(bookDark);
        LibrariesNetwork.get("str.Vieru 15").printAllTheBooks();

        LibrariesNetwork.get("str.Vieru 15").addAnotherListOfBooksIntoTheLibraryList(elefantLibrary.getBookList());

        LibrariesNetwork.get("str.Vieru 15").printAllTheBooks();
    }
}
