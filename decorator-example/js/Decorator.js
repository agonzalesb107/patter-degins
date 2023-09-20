class Donut {
  cost() {
    return 5;
  }
}

class ChocolateDecorator {
  constructor(coffee) {
    this.coffee = coffee;
  }

  cost() {
    return this.coffee.cost() + 2;
  }
}

class CaramelDecorator {
  constructor(coffee) {
    this.coffee = coffee;
  }

  cost() {
    return this.coffee.cost() + 3;
  }
}

const simpleCoffee = new Donut();
console.log('Simple donut: $' + simpleCoffee.cost());

const coffeeWithMilk = new ChocolateDecorator(simpleCoffee);
console.log('Chocolate donut: $' + coffeeWithMilk.cost());

const coffeeWithMilkAndCaramel = new CaramelDecorator(coffeeWithMilk);
console.log('Chocolate caramel donut: $' + coffeeWithMilkAndCaramel.cost());
