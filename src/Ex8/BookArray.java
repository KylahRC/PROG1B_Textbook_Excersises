package Ex8;

import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter the title of the book:");
            String title = scanner.nextLine();

            System.out.println("Is the book Fiction or NonFiction? (F/N):");
            String type = scanner.nextLine().toUpperCase();

            while (!type.equals("F") && !type.equals("N")) {
                System.out.println("Invalid input. Please enter F for Fiction or N for NonFiction:");
                type = scanner.nextLine().toUpperCase();
            }

            if (type.equals("F")) {
                books[i] = new Fiction(title);
            } else {
                books[i] = new NonFiction(title);
            }
        }

        for (Book book : books) {
            displayBookDetails(book);
        }

        scanner.close();
    }

    public static void displayBookDetails(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: $" + book.getPrice());
    }
}

