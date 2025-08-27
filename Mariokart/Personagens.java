package Mariokart;
/*
    TAd Jogadores
    @authors bernardo_cardoso e cauã_loiola
 */



public class Personagens {
    private int poder, velocidade, manobrabilidade;
    String nome;
    public Personagens(String nome, int velocidade, int manobrabilidade, int poder) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.manobrabilidade = manobrabilidade;
        this.poder = poder;
    }


    public String getNome() {
        return nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getManobrabilidade() {
        return manobrabilidade;
    }

    public int getPoder() {
        return poder;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setManobrabilidade(int manobrabilidade) {
        this.manobrabilidade = manobrabilidade;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
