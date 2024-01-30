import java.util.HashMap;
import java.util.Map;
import java.util.AbstractMap;

public class Main {

    public static void main(String[] args) {
        // Metodo 1: Inizializzazione standard
        HashMap<String, Integer> firstMap = new HashMap<>();
        firstMap.put("one", 1);
        firstMap.put("two", 2);
        firstMap.put("three", 3);
        firstMap.put("four", 4);

        System.out.println("First List: ");
        for(Map.Entry<String, Integer> element : firstMap.entrySet()) {
            System.out.println("Element: " + element);
        }
        // Metodo 2: Inizializzazione con un altro Map
        HashMap<String, Integer> secondMap = new HashMap<>(Map.of("one", 1, "two", 2, "three", 3));
        System.out.println("Second list: ");
        for (Map.Entry<String, Integer> element : secondMap.entrySet()) {
            System.out.println("Element: " +element);
        }


        // Metodo 3: Inizializzazione con Java 8 e metodo putIfAbsent
        HashMap<String, Integer> thirdMap = new HashMap<>(Map.ofEntries(
           new AbstractMap.SimpleEntry<String, Integer>("one", 1),
           new AbstractMap.SimpleEntry<String, Integer>("two", 2),
                new AbstractMap.SimpleEntry<String, Integer>("three", 3)
        ));
        System.out.println("Thirdlist: ");
        for (Map.Entry<String, Integer> element : thirdMap.entrySet()) {
            System.out.println("Element: " +element);
        }


    }


    }

