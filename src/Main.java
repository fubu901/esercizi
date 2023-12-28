public class Main {
    public static void main(String[] args) {
        Animale animaleGenerico = new Animale();
        Gatto gatto = new Gatto();

        // Chiamata al metodo faiIlVerso() della classe Animale
        animaleGenerico.faiIlVerso();

        // Chiamata al metodo faiIlVerso() della classe Gatto (override)
        gatto.faiIlVerso();
    }
}
