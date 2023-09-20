interface OldSystem {
  void operationA();
}

class OldClass implements OldSystem {
  @Override
  public void operationA() {
      System.out.println("OldClass: Operation A");
  }
}

interface NewSystem {
  void operationB();
}

class NewClass implements NewSystem {
  @Override
  public void operationB() {
      System.out.println("NewClass: Operation B");
  }
}

class Adapter implements NewSystem {
  private OldSystem oldSystem;

  public Adapter(OldSystem oldSystem) {
      this.oldSystem = oldSystem;
  }

  @Override
  public void operationB() {
      oldSystem.operationA();
  }
}

public class JavaExample {
  public static void main(String[] args) {
      NewSystem newSystem = new NewClass();
      newSystem.operationB();

      OldSystem oldSystem = new OldClass();
      NewSystem adaptedOldSystem = new Adapter(oldSystem);
      adaptedOldSystem.operationB();
  }
}
