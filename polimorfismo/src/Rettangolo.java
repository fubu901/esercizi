public class Rettangolo extends Forma {
    private double lunghezza;
    private double larghezza;

    // Costruttore del rettangolo
    public Rettangolo(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    // Override del metodo calcolaArea() per il rettangolo
    @Override
    public void calcolaArea() {
        double area = lunghezza * larghezza;
        System.out.println("L'area del rettangolo è: " + area);
    }
}
