public abstract class Invoice  {
  private int id;
  private double importInvoice;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getImport() {
    return importInvoice;
  }

  public void setImporte(double importInvoice) {
    this.importInvoice = importInvoice;
  }

  public abstract double getImporteIva();
}