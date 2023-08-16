package com.campusmonk.nqtquestion;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to CCD!");
        System.out.println("Enter the first letter to select main menu (c for Coffee, t for Tea, s for Soups, b for Beverages): ");
        char mainMenu = scanner.next().charAt(0);

        String subMenu = "";
        
        switch (mainMenu) {
            case 'c':
                System.out.println("Enter the sub menu number (1: Espresso Coffee, 2: Cappuccino Coffee, 3: Latte Coffee): ");
                int coffeeChoice = scanner.nextInt();
                subMenu = getSubMenuCoffee(coffeeChoice);
                break;
            case 't':
                System.out.println("Enter the sub menu number (1: Plain Tea, 2: Assam Tea, 3: Ginger Tea, 4: Cardamom Tea, 5: Masala Tea, 6: Lemon Tea, 7: Green Tea, 8: Organic Darjeeling Tea): ");
                int teaChoice = scanner.nextInt();
                subMenu = getSubMenuTea(teaChoice);
                break;
            case 's':
                System.out.println("Enter the sub menu number (1: Hot and Sour Soup, 2: Veg Corn Soup, 3: Tomato Soup, 4: Spicy Tomato Soup): ");
                int soupChoice = scanner.nextInt();
                subMenu = getSubMenuSoup(soupChoice);
                break;
            case 'b':
                System.out.println("Enter the sub menu number (1: Hot Chocolate Drink, 2: Badam Drink, 3: Badam-Pista Drink): ");
                int beverageChoice = scanner.nextInt();
                subMenu = getSubMenuBeverage(beverageChoice);
                break;
            default:
                System.out.println("INVALID OUTPUT");
                break;
        }

        if (!subMenu.isEmpty()) {
            System.out.println("Enjoy your " + subMenu + "!");
        }
        
        scanner.close();
    }
    
    public static String getSubMenuCoffee(int choice) {
        switch (choice) {
            case 1:
                return "Espresso Coffee";
            case 2:
                return "Cappuccino Coffee";
            case 3:
                return "Latte Coffee";
            default:
                return "";
        }
    }
    
    public static String getSubMenuTea(int choice) {
        switch (choice) {
            case 1:
                return "Plain Tea";
            case 2:
                return "Assam Tea";
            case 3:
                return "Ginger Tea";
            case 4:
                return "Cardamom Tea";
            case 5:
                return "Masala Tea";
            case 6:
                return "Lemon Tea";
            case 7:
                return "Green Tea";
            case 8:
                return "Organic Darjeeling Tea";
            default:
                return "";
        }
    }
    
    public static String getSubMenuSoup(int choice) {
        switch (choice) {
            case 1:
                return "Hot and Sour Soup";
            case 2:
                return "Veg Corn Soup";
            case 3:
                return "Tomato Soup";
            case 4:
                return "Spicy Tomato Soup";
            default:
                return "";
        }
    }
    
    public static String getSubMenuBeverage(int choice) {
        switch (choice) {
            case 1:
                return "Hot Chocolate Drink";
            case 2:
                return "Badam Drink";
            case 3:
                return "Badam-Pista Drink";
            default:
                return "";
        }
    }
}
