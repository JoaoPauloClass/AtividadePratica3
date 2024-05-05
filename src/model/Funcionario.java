package model;

import controller.Trabalhavel;

public abstract class Funcionario implements Trabalhavel{

    protected String nome;
    protected int matricula;
    protected float horasTrababalhadas;
    protected float valorHora;

    public Funcionario() {
    }

    

    public Funcionario(String nome, int matricula, float horasTrababalhadas, float valorHora) {
        this.nome = nome;
        this.matricula = matricula;
        this.horasTrababalhadas = horasTrababalhadas;
        this.valorHora = valorHora;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getHorasTrababalhadas() {
        return horasTrababalhadas;
    }

    public void setHorasTrababalhadas(float horasTrababalhadas) {
        this.horasTrababalhadas = horasTrababalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public abstract float calcularSalario();

    @Override
    public String toString() {
        return "\nMatrícula: " + matricula +
        "\nNome: " + nome +
        "\nValor da hora: R$ " + valorHora +
        "\nHoras trabalhadas: " + horasTrababalhadas + "h" +
        "\nSalário: R$" + calcularSalario();
    }

}
