public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto Person usando il builder
        Person person1 = new PersonBuilder("Mario", "Rossi")
                .age(30)
                .address("Via Roma, 123")
                .build();

        // Creazione di un altro oggetto Person usando il builder
        Person person2 = new PersonBuilder("Anna", "Verdi")
                .age(25)
                .address("Via Adua, 69")
                .build();

        // Stampa delle informazioni delle persone
        System.out.println("Informazioni persona 1:");
        System.out.println("Nome: " + person1.getFirstName() + " " + person1.getLastName());
        System.out.println("Età: " + person1.getAge());
        System.out.println("Indirizzo: " + person1.getAddress());

        System.out.println();

        System.out.println("Informazioni persona 2:");
        System.out.println("Nome: " + person2.getFirstName() + " " + person2.getLastName());
        System.out.println("Età: " + person2.getAge());
        System.out.println("Indirizzo: " + person2.getAddress());
    }
}
