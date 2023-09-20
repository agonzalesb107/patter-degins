public class Main {
  public static void main(String[] args) {
    Invoice invoiceReduce = InvoiceFactory.getInvoiceIvaReduce();
    invoiceReduce.getImporteIva();
    System.out.println("Iva Reduce: " + invoiceReduce.getImport());
    Invoice invoice = InvoiceFactory.getInvoiceIva();
    invoice.getImporteIva();
    System.out.println("Iva: " + invoice.getImport());
  }
}
