public abstract class Forma {
    private TipoForma tipo;

    public Forma(TipoForma tipo) {
        this.tipo = tipo;
    }

    public abstract void calcolaArea();

    public TipoForma getTipo() {
        return tipo;
    }
}
