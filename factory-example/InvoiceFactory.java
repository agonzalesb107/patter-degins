public class InvoiceFactory {
  public static Invoice getInvoiceIvaReduce() {
    return new InvoiceIvaReduce();
  }

  public static Invoice getInvoiceIva() {
    return new InvoiceIva();
  }
}
