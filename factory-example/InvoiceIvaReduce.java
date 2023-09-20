public class InvoiceIvaReduce extends Invoice {

  @Override
  public double getImporteIva() {
    setImporte(2.0);
    return getImport() * 1.10;
  }
  
}
