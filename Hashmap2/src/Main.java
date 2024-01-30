import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(1, "one");
        hashMap.put(5, "five");
        hashMap.put(9, "nine");
        hashMap.put(6, "six");

        Collection<String> values = hashMap.values();

        List<String> sortedValues = new ArrayList<>(values);

        Collections.sort(sortedValues);

        for(String value : sortedValues);

        System.out.println(values);
    }
}