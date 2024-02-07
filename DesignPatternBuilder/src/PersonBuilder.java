public class PersonBuilder {

    protected String firstName;
    protected String lastName;

    protected int age;
    protected String address;

    // Costruttore
    public PersonBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Metodi per impostare  e restituire l'istanza di PersonBuilder per il chaining
    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    // Metodo per costruire l'oggetto Person
    public Person build() {
        return new Person(this);
    }
}
