package Ex8;

import java.util.Scanner;

public class UseBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the title of the Fiction book:");
        String fictionTitle = scanner.nextLine();
        Book fictionBook = new Fiction(fictionTitle);

        System.out.println("Enter the title of the NonFiction book:");
        String nonFictionTitle = scanner.nextLine();
        Book nonFictionBook = new NonFiction(nonFictionTitle);

        displayBookDetails(fictionBook);
        displayBookDetails(nonFictionBook);

        scanner.close();
    }

    public static void displayBookDetails(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: $" + book.getPrice());
    }
}
