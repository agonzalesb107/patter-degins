class Donut:
    def cost(self):
        return 5

class ChocolateDecorator:
    def __init__(self, coffee):
        self.coffee = coffee

    def cost(self):
        return self.coffee.cost() + 2

class CaramelDecorator:
    def __init__(self, coffee):
        self.coffee = coffee

    def cost(self):
        return self.coffee.cost() + 3

simple_coffee = Donut()
print('Simple donut: $' + str(simple_coffee.cost()))

coffee_with_milk = ChocolateDecorator(simple_coffee)
print('Chocolate donut: $' + str(coffee_with_milk.cost()))

coffee_with_milk_and_caramel = CaramelDecorator(coffee_with_milk)
print('Chocolate caramel donut: $' + str(coffee_with_milk_and_caramel.cost()))