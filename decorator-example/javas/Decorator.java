package javas;

// Clase base
class Donut {
    double cost() {
        return 5.0;
    }
}

// Decorador para el chocolate
class ChocolateDecorator extends Donut {
    private Donut donut;

    ChocolateDecorator(Donut donut) {
        this.donut = donut;
    }

    @Override
    double cost() {
        return donut.cost() + 2.0;
    }
}

// Decorador para el caramelo
class CaramelDecorator extends Donut {
    private Donut donut;

    CaramelDecorator(Donut donut) {
        this.donut = donut;
    }

    @Override
    double cost() {
        return donut.cost() + 3.0;
    }
}

public class Decorator {
    public static void main(String[] args) {
        Donut simpleDonut = new Donut();
        System.out.println("Simple donut: $" + simpleDonut.cost());

        Donut chocolateDonut = new ChocolateDecorator(simpleDonut);
        System.out.println("Chocolate donut: $" + chocolateDonut.cost());

        Donut chocolateCaramelDonut = new CaramelDecorator(chocolateDonut);
        System.out.println("Chocolate caramel donut: $" + chocolateCaramelDonut.cost());
    }
}

