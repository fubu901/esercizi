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

    // Metodi getter
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

    // Metodi setter
    public void setCilindrata(int cilindrata) {
        // Modificatore per controllare che la cilindrata sia più grandedi 1000
        if (cilindrata > 1000) {
            this.cilindrata = cilindrata;
        } else {
            System.out.println("La cilindrata deve essere più grande di 1000.");
        }
    }

    public void setTarga(String targa) {
        // Modificatore per controllare la lunghezza della targa
        if (targa.length() == 7) {
            this.targa = targa;
        } else {
            System.out.println("La lunghezza della targa deve essere di 7 caratteri.");
        }
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
}

