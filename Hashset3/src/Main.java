import java.util.HashSet;
import java.util.Iterator;

public class Main {

    // Funzione che restituisce un HashSet riempito
    public static HashSet<String> garage() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("VW CORRADO");
        hashSet.add("VOLVO480 TURBO");
        hashSet.add("RENAULT CLIO WILLIAMS");
        return hashSet;
    }

    public static void main(String[] args) {
        // Creare un oggetto HashSet e popolarlo
        HashSet<String> mioGarage = garage();

        // Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
        HashSet<String> altroGarage = new HashSet<>(mioGarage);
        altroGarage.add("FORD SIERRA COSSWORTH");

        // Scorrere il set e verificare se ogni elemento è uguale all'oggetto creato ed eliminarlo
        String elementoDaVerificare = "Elemento4";
        Iterator<String> iterator = altroGarage.iterator();
        while (iterator.hasNext()) {
            String auto = iterator.next();
            if (auto.equals(elementoDaVerificare)) {
                iterator.remove();
            }
        }

        // Svuotare l'HashSet
        altroGarage.clear();

        // Verificare se l'HashSet è vuoto e stampare il risultato
        boolean isVuoto = altroGarage.isEmpty();
        System.out.println("Il garage è vuoto: " + isVuoto);
    }
}
