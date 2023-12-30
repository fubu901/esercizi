public class Triangolo extends Forma {
    private double base;
    private double altezza;

    // Costruttore del triangolo
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Override del metodo calcolaArea() per il triangolo
    @Override
    public void calcolaArea() {
        double area = 0.5 * base * altezza;
        System.out.println("L'area del triangolo è: " + area);
    }
}

