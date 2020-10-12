package Menu;

import Electronics.*;
import productmanagment.ProductManager;


import java.util.Scanner;

public class Menu {

    Scanner reader = new Scanner(System.in);
    ProductManager pm = new ProductManager();

    public void mainMenu() {
        System.out.println("Welcome!");
        System.out.println("1. Add new product"); // C
        System.out.println("2. Print all products"); // R
        System.out.println("3. Update a product."); // U
        System.out.println("4. Delete a product"); // D

        int choice = reader.nextInt();
        switch (choice) {
            case 1 -> createProduct();
            case 2 -> pm.printAllProducts();
        }
    }

    public void createProduct() {
        System.out.println("Which type of product will you add? ");
        System.out.println("1. Computer\n2. Microcomponent\n3. TV");
        int choice = reader.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter the ID: ");
                int id = reader.nextInt();
                reader.nextLine();
                System.out.print("Enter the serial number:");
                String ss = reader.nextLine().toUpperCase();
                System.out.print("Enter the manufacturer: ");
                String mfr = reader.nextLine().toUpperCase();
                System.out.print("Enter the CPU: ");
                String cpu = reader.nextLine().toUpperCase();
                System.out.print("Enter the GPU: ");
                String gpu = reader.nextLine().toUpperCase();
                System.out.print("Enter the ram frequency: ");
                int freq = reader.nextInt();
                reader.nextLine();
                Electronics computer = new Computer(id, ss, mfr, cpu, gpu, freq);
                pm.addProduct(computer);
                mainMenu();
            }
            case 2 -> {
                System.out.print("Enter the ID: ");
                int id = reader.nextInt();
                reader.nextLine();
                System.out.print("Enter the serial number:");
                String ss = reader.nextLine().toUpperCase();
                System.out.print("Enter the manufacturer: ");
                String mfr = reader.nextLine().toUpperCase();
                System.out.print("Is wireless: ");
                String wireless = reader.nextLine().toUpperCase();
                System.out.println("Watts: ");
                int watts = reader.nextInt();
                reader.nextLine();
                System.out.println("How many channels: ");
                int ch = reader.nextInt();
                reader.nextLine();
                Electronics micro = new MicroComponent(id, ss, mfr, wireless, watts, ch);
                pm.addProduct(micro);
                mainMenu();
            }
        }
    }

}
