package javaExample;

public class Main {
  public static void main(String[] args) {
    DataBase dataBase;

    dataBase = DataBase.getInstance();

    dataBase.getConnection();

    dataBase = DataBase.getInstance();
  }
}
