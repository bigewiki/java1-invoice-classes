/************************************************************/
/*Program:  Recursion Assignment                            */
/*CIS163AA                                                  */
/*Edward Muniz                                              */
/*2020-02-16                                                */
/*Practice with Java!                                       */
/************************************************************/

package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // setup the input
        Scanner input = new Scanner(System.in);

        // introduce the program
        System.out.println();
        System.out.print("Hello! The purpose of this program is to use an  ");
        System.out.print("Invoice class with useful attributes and methods \n");

        // get user input
        System.out.print("Type a model number for your part: ");
        String partNumber = input.nextLine();
        System.out.print("Type a description for this part: ");
        String partDesc = input.nextLine();
        System.out.print("Type how many of this part are in stock: ");
        Integer partQty = input.nextInt();
        System.out.print("Type a price for your part: ");
        Double partPrice = input.nextDouble();

        // create a new instance
        Invoice invoice = new Invoice(partNumber, partDesc, partQty, partPrice);

        // output for the user
        System.out.println();
        output(invoice);

        // making the user do it again for the sake of demonstration
        System.out.println();
        System.out.print("For demonstration purposes, we're going to do all this again.\n");

        // demonstrate setters
        System.out.print("Type a model number for your part: ");
        invoice.setPartNumber(input.nextLine());
        System.out.print("Type a description for this part: ");
        invoice.setPartDesc(input.nextLine());
        System.out.print("Type how many of this part are in stock: ");
        invoice.setPartQty(input.nextInt());
        System.out.print("Type a price for your part: ");
        invoice.setPartPrice(input.nextDouble());

        input.close();

        // output for the user AGAIN
        System.out.println();
        output(invoice);
    }

    public static void output(Invoice invoice) {
        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDesc());
        System.out.println("Quantity: " + invoice.getPartQty());
        System.out.println("Price: " + invoice.getPartPrice());
        System.out.println("Total: $" + invoice.getInvoiceAmount());
    }

}