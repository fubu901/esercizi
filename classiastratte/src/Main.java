public class Main {
    public static void main(String[] args) {
        Forma formaGenerica = new Rettangolo(5.0, 3.0);
        Forma altroForma = new Triangolo(4.0, 6.0);

        // Chiamata al metodo calcolaArea() della classe Rettangolo (override)
        formaGenerica.calcolaArea();

        // Chiamata al metodo calcolaArea() della classe Triangolo (override)
        altroForma.calcolaArea();
    }
}
