public class Main {
    public static void main(String[] args) {
        Triangolo triangolo = new Triangolo(4.0, 6.0);
        Rettangolo rettangolo = new Rettangolo(5.0, 3.0);

        // Chiamata al metodo calcolaArea() della classe Triangolo
        triangolo.calcolaArea();
        System.out.println("Tipo di forma: " + triangolo.getTipo());

        // Chiamata al metodo calcolaArea() della classe Rettangolo
        rettangolo.calcolaArea();
        System.out.println("Tipo di forma: " + rettangolo.getTipo());
    }
}
