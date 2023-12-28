public class Main {

    public static void main(String[] args) {
        // Creazione di un oggetto di tipo Studente
        Studente studente1 = new Studente("Leonardo", "Davinci", 1);

        // Accesso alle proprietà attraverso i metodi getters
        System.out.println("Nome: " + studente1.getNome());
        System.out.println("Cognome: " + studente1.getCognome());
        System.out.println("Identificativo: " + studente1.getIdentificativo());

        // Modifica delle proprietà attraverso i metodi setters
        studente1.setNome("Fabio");
        studente1.setCognome("Fornari");
        studente1.setIdentificativo(2);

        // Stampa delle nuove proprietà
        System.out.println("\nNuovo nome: " + studente1.getNome());
        System.out.println("Nuovo cognome: " + studente1.getCognome());
        System.out.println("Nuovo identificativo: " + studente1.getIdentificativo());
    }

}
