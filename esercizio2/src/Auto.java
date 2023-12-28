// Classe Auto.java
public class Auto {
    private int cilindrata;
    private String targa;
    private String marca;
    private String modello;

    // Costruttore
    public Auto(int cilindrata, String targa, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    // Metodi getters

    public int getCilindrata() {
        return cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    // Metodi setters

    public void setCilindrata(int nuovaCilindrata) {
        this.cilindrata = nuovaCilindrata;
    }

    public void setTarga(String nuovaTarga) {
        this.targa = nuovaTarga;
    }

    public void setMarca(String nuovaMarca) {
        this.marca = nuovaMarca;
    }

    public void setModello(String nuovoModello) {
        this.modello = nuovoModello;
    }

    // Metodo toString

    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata=" + cilindrata +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}

