package main;

import java.util.Scanner;
import defination.ContactList;

public class Main {
    public static void main(String[] args) {
        ContactList<Integer> list = new ContactList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to mansi's contactList");
            System.out.println("Press 1 to add a new contact");
            System.out.println("Press 2 to view all contacts");
            System.out.println("Press 3 to search for a contact");
            System.out.println("Press 4 to delete a contact");
            System.out.println("Press 5 to exit program");
            System.out.println("Enter Choice");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int num = sc.nextInt();
                    System.out.println(list.add());
                    break;
                case 2:
                    System.out.println(list.view());
                    break;
                case 3:
                    System.out.println(list.search());
                    break;
                case 4:
                    System.out.println(list.delete());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Entered Wrong Choice");
            }
        }
    }
}
