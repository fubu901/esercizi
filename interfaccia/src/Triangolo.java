public class Triangolo implements Forma {
    final double base;
    final double altezza;

    // Costruttore del triangolo
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Implementazione del metodo per il calcolo dell'area del triangolo
    @Override
    public void calcolaArea() {
        double area = 0.5 * base * altezza;
        System.out.println("L'area del triangolo è: " + area);
    }
}
