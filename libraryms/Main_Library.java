package sess9may16_gslc;

import java.util.Scanner;

public class Main_Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the borrower's name: ");
        String borrower = sc.nextLine();

        System.out.println("Choose the type of item you'd like to borrow:");
        System.out.println("1. Fiction Book");
        System.out.println("2. Non-fiction Book");
        System.out.println("3. Magazine");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        LibraryItem item = null;
        switch (choice) {
            case 1:
                System.out.print("Enter the title of the fiction book: ");
                String fictionTitle = sc.nextLine();
                System.out.print("Enter the author of the fiction book: ");
                String fictionAuthor = sc.nextLine();
                item = new FictionBook(fictionTitle, fictionAuthor);
                break;
            case 2:
                System.out.print("Enter the title of the non-fiction book: ");
                String nonFictionTitle = sc.nextLine();
                System.out.print("Enter the author of the non-fiction book: ");
                String nonFictionAuthor = sc.nextLine();
                item = new NonFictionBook(nonFictionTitle, nonFictionAuthor);
                break;
            case 3:
                System.out.print("Enter the title of the magazine: ");
                String magazineTitle = sc.nextLine();
                System.out.print("Enter the publisher of the magazine: ");
                String magazinePublisher = sc.nextLine();
                item = new Magazine(magazineTitle, magazinePublisher);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        item.checkOut(borrower);

        sc.close();
    }
}
