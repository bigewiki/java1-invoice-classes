/************************************************************/
/*Program:  Recursion Assignment                            */
/*CIS163AA                                                  */
/*Edward Muniz                                              */
/*2020-02-16                                                */
/*Practice with Java!                                       */
/************************************************************/

package app;

public class Invoice {
    // initialize attributes
    private String partNumber;
    private String partDesc;
    private Integer partQty;
    private Double partPrice;

    // constructor
    public Invoice(String initPartNumber, String initPartDesc, Integer initPartQty, Double initPartPrice) {
        partNumber = initPartNumber;
        partDesc = initPartDesc;
        partQty = initPartQty;
        partPrice = initPartPrice;
    }

    // get and set part number
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String param) {
        partNumber = param;
    }

    // get and set part description
    public String getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(String param) {
        partDesc = param;
    }

    // get and set part quantity
    public Integer getPartQty() {
        return partQty;
    }

    public void setPartQty(Integer param) {
        partQty = param;
    }

    // get and set part price
    public Double getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(Double param) {
        partPrice = param;
    }

    // provide a method named getInvoiceAmount that calculates the invoice amount
    // (i.e., multiplies the quantity by the price per item), then returns the
    // amount as a double value. If the quantity is not positive, it should be set
    // to 0. If the price per item is not positive, it should be set to 0.0.
    public Double getInvoiceAmount() {
        Double invoiceAmt = partQty * partPrice;
        if (invoiceAmt > 0) {
            return invoiceAmt;
        } else {
            return 0.0;
        }

    }
}