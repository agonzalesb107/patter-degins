package javaExample;

public class DataBase {
  private static DataBase dataBaseInstance;

  private DataBase() {}

  public static DataBase getInstance() {
    if (dataBaseInstance == null) {
      dataBaseInstance = new DataBase();
    } else {
      System.out.println("Db already created...");
    }

    return dataBaseInstance;
  }

  public void getConnection() {
    System.out.println("Connected to DB...");
  }
  
}

