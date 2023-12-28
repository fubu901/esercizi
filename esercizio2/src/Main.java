// Classe Main.java
public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto di tipo Auto
        Auto auto1 = new Auto(2000, "AB123CD", "Toyota", "Corolla");

        // Accesso alle proprietà attraverso i metodi getters
        System.out.println("Proprietà dell'auto: " + auto1);

        // Modifica delle proprietà attraverso i metodi setters
        auto1.setCilindrata(1800);
        auto1.setTarga("XY987ZW");
        auto1.setMarca("Honda");
        auto1.setModello("Civic");

        // Stampa delle nuove proprietà
        System.out.println("Nuove proprietà dell'auto: " + auto1);
    }
}
