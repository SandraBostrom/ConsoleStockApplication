package com.sandra.ConsoleStockApplication;

import java.util.Scanner;

public class Main {
    protected static String newOne, checkForS;
    private static Scanner scan = new Scanner(System.in);
    private static int choice, newStock;
    private static Stock stock = new Stock();


    public static void main(String[] args) {

        do {
            menu();
            choice = scan.nextInt();
            menuOptions(choice);
        } while (choice != 0);

    }

    private static void menu() {
        System.out.println("\nStockUp - stock application \n");
        System.out.println("****************************");
        System.out.println("1- Add to stock");
        System.out.println("2- Sell from stock");
        System.out.println("3- Display current stock");
        System.out.println("0- Goodbye for now");
        System.out.println("****************************");
    }

    public static void menuOptions(int choice) {


        switch (choice) {
            case 1:
                addToStock();
                break;
            case 2:
                sellOfStock();
                break;
            case 3:
                displayStockIfL();
                break;
            case 0:
                break;

        }
    }

    private static void displayStockIfL() {
        System.out.println("Press L for displaying \n");
        if (scan.next().toUpperCase().equals("L")) {
            System.out.println("****************************");
            System.out.println("Stock " + stock.getStock());
            System.out.println("****************************");

        } else {
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("Woops!");
            System.out.println("Most press L to display current stock!");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");

        }
    }


    private static void addToStock() {
        System.out.println("Input new stock. \nStart with S and then the value ex. S4 for 4 products \n");
        newOne = scan.next().toUpperCase();
        checkForS = newOne.substring(0, 1);
        checkCorrectInput(newOne, checkForS);
    }

    private static void checkCorrectInput(String newOne, String checkForS) {
        if (checkForS.equals("S")) {
            try {
                newStock = Integer.parseInt(newOne.substring(1));
                stock.addToStock(newStock);

            } catch (Exception e) {
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx\nSomething went wrong, Did you used correct format? \nNeed to be S(number)\nxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            }

        } else {
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx\nWoops! Most start with S/s\nxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        }
    }

    private static void sellOfStock() {
        System.out.println("Input sold items from stock \nStart with I and then the value. ex I5 for 5 products \n");
        String newOne = scan.next().toUpperCase();
        String checkForI = newOne.substring(0, 1);
        if (checkForI.equals("I")) {
            try {
                int newStock = Integer.parseInt(newOne.substring(1));
                stock.sellFromStock(newStock);
            } catch (Exception e) {
                System.out.println("Something went wrong, Did you used correct format? \nNeed to be I(number)");
            }

        } else {
            System.out.println("Woops! Most start with I/i");
        }

    }
}




