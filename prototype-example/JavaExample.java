import java.util.HashMap;
import java.util.Map;

interface Clonable {
    Clonable clone();
}

class Product implements Clonable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Clonable clone() {
        return new Product(this.name, this.price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

class PrototypeManager {
    private Map<String, Clonable> prototypes = new HashMap<>();

    public void addPrototype(String key, Clonable prototype) {
        prototypes.put(key, prototype);
    }

    public Clonable getClone(String key) {
        Clonable prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }
}

public class JavaExample {
    public static void main(String[] args) {
        PrototypeManager manager = new PrototypeManager();

        manager.addPrototype("Product1", new Product("Product 1", 10.0));
        manager.addPrototype("Product2", new Product("Product 2", 20.0));

        Product product1Clone = (Product) manager.getClone("Product1");
        Product product2Clone = (Product) manager.getClone("Product2");

        if (product1Clone != null && product2Clone != null) {
            product1Clone.setPrice(15.0);
            product2Clone.setPrice(25.0);

            System.out.println("Information of original products:");
            product1Clone.showInfo();
            product2Clone.showInfo();

            System.out.println("\nInformation of cloned products:");
            product1Clone.showInfo();
            product2Clone.showInfo();
        }
    }
}
