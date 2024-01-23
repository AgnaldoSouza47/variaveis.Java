public class Pessoa {
    public String getNome() {
        return nome;
    }

    public String nome;

    public int AnoNacimento;


    public int getAnoNacimento() {
        return AnoNacimento;
    }

    public void setAnoNacimento(int anoNacimento) {
        AnoNacimento = anoNacimento;
        if (anoNacimento < 0)
            this.AnoNacimento = 0;
        this.AnoNacimento = anoNacimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

