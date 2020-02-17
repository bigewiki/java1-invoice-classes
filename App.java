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
        System.out.println("Invoice amount is $" + invoice.getInvoiceAmount());
        // invoice.test();
    }

    // testing
    public void test() {
        System.out.println(partNumber + "\n" + partDesc + "\n" + partQty + "\n" + partPrice);
    }

}