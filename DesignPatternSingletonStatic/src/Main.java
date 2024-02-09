public class Main {
    public static void main(String[] args) {

        User user1 = new User("Mario", 30);
        User user2 = new User("Luigi", 25);


        System.out.println("Informazioni di default per il primo utente:");
        user1.stampaInformazioni();
        System.out.println("Informazioni di default per il secondo utente:");
        user2.stampaInformazioni();


        user2.setNome("Giuseppe");
        user2.setEta(40);


        System.out.println("\nInformazioni del secondo utente dopo la modifica:");
        user2.stampaInformazioni();
    }
}
