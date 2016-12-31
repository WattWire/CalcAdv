package net.wattwire;

import java.util.Scanner;

public class Main {

    public static final String OPS = "+-*/";

    public static void main(String[] args) {
        //**************************

        Scanner sc = new Scanner(System.in);

        Double n1 = 0.0, n2 = 0.0;

        double result=0.0;

        String s1, s2, operator;

        System.out.println("\n\n******* Hey Bitches, Time to Calculate! *******\n\n");
        System.out.println("Please enter two numbers:");
        System.out.println("");

        System.out.print("First number: ");
        s1 = sc.nextLine();

        System.out.print("Second number: ");
        s2 = sc.nextLine();

        System.out.print("Enter the numeric operator (+ - * /): ");
        operator = sc.nextLine().trim();

        try {
            n1 = Double.parseDouble(s1);
            n2 = Double.parseDouble(s2);

            if (!OPS.contains(operator) || operator.length() != 1) {
                throw (new Exception("\n*** Illegal Operator Entered!"));}
            else if (operator.contains("/") && n2==0.0){
                throw (new Exception("\n*** Why are you trying to divide by zero?  Is it because you are a Mongoloid?!!"));}
        }

        catch (NumberFormatException nfe) {
            throw new NumberFormatException("*** You Mongoloid, at least one of those isn't a number!");

        } catch (Exception e) {
            System.out.println(e.getMessage()); //*** Illegal Operator Exception
            System.exit(1);
        }

        //***** Input is Good, Proceed James with the Answer!

        switch (operator) {

            case "+": result = n1 + n2;
                break;
            case "-": result = n1 - n2;
                break;
            case "*": result = n1 * n2;
                break;
            case "/": result = n1 / n2;
                break;
        }

        System.out.println("\nYour requested result: " + result);

    }
}
