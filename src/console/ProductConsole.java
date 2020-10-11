package console;

import java.util.Scanner;

public class ProductConsole {

    private Scanner reader;

    public void getOption() {
        this.reader = new Scanner(System.in);
    }

    private void menu() {

        int choice;
        System.out.println("-----------Menu---------------");
        System.out.println("1. Add Product"); //C
        System.out.println("2. Show all products"); //R
        System.out.println("3. Modify Product"); // U
        System.out.println("4. Remove Product"); // D
        choice = reader.nextInt();

        switch (choice) {
            //case 1 -> addProduct();
            default -> System.out.println("Invalid option.");
        }
    }


}
