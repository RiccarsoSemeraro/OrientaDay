import java.util.ArrayList;

public class Aula {

    private String nome;
    private int ora;
    private int max;
    ArrayList<Studente> lista = new ArrayList<Studente>();

    public Aula(String nome, int ora, int max) {
        this.nome = nome;
        this.ora = ora;
        this.max = max;
    }

    public String getNome() {
        return nome;
    }

    public Aula setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getOra() {
        return ora;
    }

    public Aula setOra(int ora) {
        this.ora = ora;
        return this;
    }

    public int getMax() {
        return max;
    }

    public int getStudenti() {
        return lista.size();
    }

    //addStudenti
    public void addStudente(Studente x){
        lista.add(x);
    }
    //rmvStudenti
    public void rmvStudente(String Nome, String Cognome){
        int i=0;
        for (Studente x:lista){
            if(x.getNome().equals(Nome)&&x.getCognome().equals(Cognome))
                lista.remove(i);
            i++;
        }
    }


}
