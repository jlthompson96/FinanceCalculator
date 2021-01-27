/*
 * This program allows the user to make a selection to calculate different types
 * of personal finance equations.
 */
package financecalculator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @version 1
 * @author joeythompson
 */
public class FinanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c;
        c = menu();
        if (c == 1) {
            compoundCalc();           
        }
    }
    /**
     * void method that displays selection menu
     */
    private static int menu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("Finance Calculator");
        System.out.println("------------------");
        System.out.println();
        System.out.println("1.Interest Calculator");
        System.out.println("2.Car Loan Calculator");
        System.out.println("3.Mortgage Calculator");
        System.out.println("4.Stock Return Calculator");
        System.out.print("Please select and option above: ");
        int choice = keyboard.nextInt();
        while (choice <= 0 || choice > 4) {
            System.out.print("ERROR: Choice invalid, please pick an option listed above: ");
            choice = keyboard.nextInt();
        } 
        return choice;
    }
    /**
     * 
     */
    public static void compoundCalc() {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<InterestCalculator> icalc = new ArrayList<>();
        System.out.println();
        System.out.println("-------------------");
        System.out.println("Interest Calculator");
        System.out.println("-------------------");
        System.out.println();
        System.out.print("What is your inital balance? ");
        double initBalance = keyboard.nextDouble();
        System.out.print("What is the interest rate? ");
        double interestRate = keyboard.nextDouble();
        System.out.println("How often does it compund? ");
        System.out.println("--------------------------");
        System.out.println("1 - Yearly");
        System.out.println("4 - Quarterly");
        System.out.println("12 - Monthly");
        System.out.println("365 - Daily");
        System.out.print("Enter a number from the list above: ");
        int compound = keyboard.nextInt();
        System.out.print("How many years is your money compounding? ");
        double years = keyboard.nextDouble();
        InterestCalculator ic = new InterestCalculator(compound,years,initBalance,interestRate);
        icalc.add(ic);
        
        for (int i = 0; i < icalc.size(); i++) {
            System.out.println();
            System.out.println(icalc.get(i));      
        }
        System.out.println();
        System.out.print("Would you like to return to the main menu? (Y for Yes, N for No) ");
        keyboard.nextLine();
        System.out.println();
        char choice = keyboard.nextLine().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            System.out.println();
            menu();             
        }
    }
    
}
