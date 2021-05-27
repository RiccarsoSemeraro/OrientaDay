import java.util.Arrays;

public class Studente {

    private String Nome;
    private String Cognome;
    private String Classe;
    private String [] Ore = new String[3];

    public Studente(String nome, String cognome, String classe) {
        Nome = nome;
        Cognome = cognome;
        Classe = classe;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public String getClasse() {
        return Classe;
    }

    public void setClasse(String classe) {
        Classe = classe;
    }

    public String[] getOre() {
        return Ore;
    }

    public void setOre(String[] ore) {
        Ore = ore;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "Nome='" + Nome + '\'' +
                ", Cognome='" + Cognome + '\'' +
                ", Classe='" + Classe + '\'' +
                ", Ore=" + Arrays.toString(Ore) +
                '}';
    }


}
