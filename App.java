/************************************************************/
/*Program:  Recursion Assignment                            */
/*CIS163AA                                                  */
/*Edward Muniz                                              */
/*2020-02-16                                                */
/*Practice with Java!                                       */
/************************************************************/

package app;

public class App {
    public static void main(String[] args) throws Exception {
        // create a new instance
        Invoice invoice = new Invoice("test", "testing here", 1, 1.99);
        invoice.setPartNumber("ABC123");
        invoice.setPartQty(5);
        test(invoice);
    }

    public static void test(Invoice invoice) {
        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDesc());
        System.out.println("Quantity: " + invoice.getPartQty());
        System.out.println("Price: " + invoice.getPartPrice());
        System.out.println("Total: $" + invoice.getInvoiceAmount());
    }

}