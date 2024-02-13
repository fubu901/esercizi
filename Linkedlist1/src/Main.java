import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Fruit> fruitList = new LinkedList<>();
        fruitList.add(new Fruit("Apple"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Orange"));

        System.out.println("Collezione iniziale:");
        stampaCollezione(fruitList);

        // Aggiungere un elemento al primo posto della lista
        fruitList.addFirst(new Fruit("Cherry"));

        // Aggiungere un elemento all'ultimo posto della lista
        fruitList.addLast(new Fruit("Grapes"));

        // Stampare la collezione aggiornata
        System.out.println("Collezione aggiornata:");
        stampaCollezione(fruitList);
    }

    // stampa il contenuto della LinkedList di Fruit
    private static void stampaCollezione(LinkedList<Fruit> fruitList) {
        for (Fruit fruit : fruitList) {
            System.out.println("Nome: " + fruit.getName());
        }
        System.out.println();
    }
}
