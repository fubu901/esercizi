public class Main {
    public static void main(String[] args) {
        Forma formaGenerica = new Forma();
        Rettangolo rettangolo = new Rettangolo(5.0, 3.0);

        // Chiamata al metodo calcolaArea() della classe Forma
        formaGenerica.calcolaArea();

        // Chiamata al metodo calcolaArea() della classe Rettangolo (override)
        rettangolo.calcolaArea();
    }
}
