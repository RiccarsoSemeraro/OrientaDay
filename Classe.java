public class Classe {
    private String nome;
    private int totStudenti;
    private int partecipanti=0;
    private int percent;

    public Classe(String nome, int totStudenti, int percent) {
        this.nome = nome;
        this.totStudenti = totStudenti;
        this.percent = percent;
    }

    public String getNome() {
        return nome;
    }

    public Classe setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getTotStudenti() {
        return totStudenti;
    }

    public int getPartecipanti() {
        return partecipanti;
    }

    public int getPercent() {
        return percent;
    }

    public void addPartecipante(){//addPartecipante
        partecipanti++;
    }


    public void rmvPartecipante(){//rmvPartecipante
        partecipanti--;
    }//
}
