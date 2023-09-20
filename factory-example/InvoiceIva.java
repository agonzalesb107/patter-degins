public class InvoiceIva extends Invoice{

  @Override
  public double getImporteIva() {
    setImporte(1.0);
    return getImport() * 1.42;
  }
  
}
