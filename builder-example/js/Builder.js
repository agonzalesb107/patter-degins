class Person {
  constructor(name, age, address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  toString() {
    return `Name: ${this.name}, Age: ${this.age}, Address: ${this.address}`;
  }
}

class PersonBuilder {
  constructor(name) {
    this.name = name;
    this.age = 0;
    this.address = '';
  }

  setAge(age) {
    this.age = age;
    return this;
  }

  setAddress(address) {
    this.address = address;
    return this;
  }

  build() {
    return new Person(this.name, this.age, this.address);
  }
}

const person1 = new PersonBuilder('Alice')
  .setAge(30)
  .setAddress('123 Main St')
  .build();

const person2 = new PersonBuilder('Bob')
  .setAge(25)
  .setAddress('123 Other St')
  .build();

console.log(person1.toString());
console.log(person2.toString());
