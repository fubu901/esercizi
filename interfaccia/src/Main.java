public class Main {
    public static void main(String[] args) {
        Forma rettangolo = new Rettangolo(5.0, 3.0);
        Forma triangolo = new Triangolo(4.0, 6.0);

        // Chiamata al metodo calcolaArea() della classe Rettangolo
        rettangolo.calcolaArea();

        // Chiamata al metodo calcolaArea() della classe Triangolo
        triangolo.calcolaArea();
    }
}
