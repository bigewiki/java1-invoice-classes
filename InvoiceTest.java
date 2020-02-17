/************************************************************/
/*Program:  Recursion Assignment                            */
/*CIS163AA                                                  */
/*Edward Muniz                                              */
/*2020-02-16                                                */
/*Practice with Java!                                       */
/************************************************************/

package app;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) throws Exception {
        // introduce the program
        System.out.println();
        System.out.print("Hello! The purpose of this program is to use an  ");
        System.out.print("Invoice class with useful attributes and methods \n");

        // create a new instance
        Invoice invoice = new Invoice(null, null, 0, 0.0);

        // invoke input method for user input
        input(invoice);

        // output for the user
        System.out.println();
        output(invoice);
    }

    public static void input(Invoice invoice) {
        // setup the input
        Scanner input = new Scanner(System.in);

        // get user via Scanner
        System.out.print("Type a model number for your part: ");
        invoice.setPartNumber(input.nextLine());
        System.out.print("Type a description for this part: ");
        invoice.setPartDesc(input.nextLine());
        System.out.print("Type how many of this part are in stock: ");
        invoice.setPartQty(input.nextInt());
        System.out.print("Type a price for your part: ");
        invoice.setPartPrice(input.nextDouble());
        input.close();
    }

    public static void output(Invoice invoice) {
        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDesc());
        System.out.println("Quantity: " + invoice.getPartQty());
        System.out.println("Price: $" + invoice.getPartPrice());
        System.out.println("Total: $" + invoice.getInvoiceAmount());
    }

}