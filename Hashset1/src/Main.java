//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

      int setSize = readFruitSet().size();
        System.out.println("Size o set: " + setSize);

        System.out.println("Fruits in the set: ");
        for(String fruit : readFruitSet()) {
            System.out.println(fruit);
        }

        }

    private static HashSet<String> readFruitSet() {
        HashSet<String> fruitSet = new HashSet<>();

        fruitSet.add("Arancia");
        fruitSet.add("Kiwi");
        fruitSet.add("Mango");
        fruitSet.add("Avocado");
        return fruitSet;

    }
}

