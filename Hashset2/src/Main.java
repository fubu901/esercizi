import java.util.HashSet;

public class Main {

    public static HashSet<String> Veicoli() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Nissan Skyline");
        hashSet.add("Volvo V70-R");
        hashSet.add("Porsche Carrera 3.3");
        return hashSet;
    }


    public static void main(String[] args) {
        HashSet<String> mioHashSet = Veicoli();


        HashSet<String> altroHashSet = new HashSet<>(mioHashSet);
        altroHashSet.add("Opel Calibra");

        System.out.println("Veicoli in altroHashSet:");
        for (String veicolo : altroHashSet) {
            System.out.println(veicolo);
        }

        String veicoloDaVerificare = "Volvo V70-R";
        boolean contieneElemento = altroHashSet.contains(veicoloDaVerificare);

        System.out.println("L'HashSet contiene il veicolo '" + veicoloDaVerificare + "': " + contieneElemento);
    }
}
