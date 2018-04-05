package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean stop = false;
        Scanner keyboard = new Scanner(System.in);

        CheckoutTime storeBought = new CheckoutTime();
        String answer = " ";

        do {


            System.out.print("Item Description : ");
            storeBought.setDescription(keyboard.nextLine());


            System.out.print("Enter unit price : ");
            storeBought.setUnitPrice(keyboard.nextDouble());
            keyboard.nextLine();

            System.out.print("Enter quantity : ");
            storeBought.setQuantity(keyboard.nextInt());
            keyboard.nextLine();

//            System.out.print("Enter total price : ");
            //storeBought.setTotalPrice(keyboard.nextDouble());


//            System.out.print("Enter tax percentage :  ");
//            storeBought.setTax(keyboard.nextDouble());
//            keyboard.nextLine();

//            System.out.print("Grand Total is :  ");
            //storeBought.setGrandTotal(keyboard.nextDouble());
            //keyboard.nextLine();

            double totalPrice = storeBought.getUnitPrice() * storeBought.getQuantity();
            double grandTotal = totalPrice + storeBought.getTax();
            System.out.println("String your totalPrice is" + totalPrice);

            System.out.println("Do you want to add more items ?  (Y/N)");
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("N")  || answer.equalsIgnoreCase("No"))
            stop = true;


        }while (stop);




    }
}















       /* Create an application that allows a teller to add items to a checkout stand, each with a price, description and quantity.
        After the teller is done, calculate the sub total, tax (6%), and grand total price of the items.



        The list should look like this:

        Description          Unit Price          Quantity        Total Price

        Gummy bears            5.00                         2                     10.00

        Tax                                                                                            0.60

       Grand total (6%)                                                                  10.60*/