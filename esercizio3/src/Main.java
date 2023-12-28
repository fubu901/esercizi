public class Main {
    public static void main(String[] args) {
        // Creazione di un'istanza di Auto
        Auto auto1 = new Auto(1000, "AB123CD", "Fiat", "Panda");

        // Accesso alle proprietà usando i metodi getter
        System.out.println("Cilindrata: " + auto1.getCilindrata());
        System.out.println("Targa: " + auto1.getTarga());
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modello: " + auto1.getModello());

        // Modifica di alcune proprietà usando i metodi setter
        auto1.setCilindrata(1800);
        auto1.setTarga("XY666ZZ");
        auto1.setMarca("Toyota");
        auto1.setModello("Corolla");

        // Accesso alle proprietà aggiornate
        System.out.println("\nDopo la modifica:");
        System.out.println("Cilindrata: " + auto1.getCilindrata());
        System.out.println("Targa: " + auto1.getTarga());
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modello: " + auto1.getModello());
    }
}
