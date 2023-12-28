public class Studente {
    private String nome;
    private String cognome;
    private int identificativo;

    // Costruttore
    public Studente(String nome, String cognome, int identificativo) {
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = identificativo;
    }

    // Metodi getters
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getIdentificativo() {
        return identificativo;
    }

    // Metodi setters
    public void setNome(String nuovoNome) {
        this.nome = nuovoNome;
    }

    public void setCognome(String nuovoCognome) {
        this.cognome = nuovoCognome;
    }
    public void setIdentificativo(int nuovoIdentificativo) {
        this.identificativo = nuovoIdentificativo;
    }


}
