package javas;

class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}

class PersonBuilder {
    private String name;
    private int age = 0;
    private String address = "";

    public PersonBuilder(String name) {
        this.name = name;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(name, age, address);
    }
}

public class Builder {
    public static void main(String[] args) {
        Person person1 = new PersonBuilder("Alice")
            .setAge(30)
            .setAddress("123 Main St")
            .build();

        Person person2 = new PersonBuilder("Bob")
            .setAge(25)
            .setAddress("123 Other St")

            .build();

        System.out.println(person1);
        System.out.println(person2);
    }
}
