class Person:
    def __init__(self, name, age, address):
        self.name = name
        self.age = age
        self.address = address

    def __str__(self):
        return f"Name: {self.name}, Age: {self.age}, Address: {self.address}"


class PersonBuilder:
    def __init__(self, name):
        self.name = name
        self.age = 0
        self.address = ""

    def set_age(self, age):
        self.age = age
        return self

    def set_address(self, address):
        self.address = address
        return self

    def build(self):
        return Person(self.name, self.age, self.address)


person1 = PersonBuilder("Alice").set_age(30).set_address("123 Main St").build()

person2 = PersonBuilder("Bob").set_age(25).set_address("123 Other St").build()

print(person1)
print(person2)
