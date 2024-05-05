package model;

import controller.Trabalhavel;

public class Estagiario extends Funcionario implements Trabalhavel{
    
    private String supervisor;
    private int jornadaDiaria;


    public Estagiario(String nome, int matricula, float horasTrababalhadas, float valorHora, String supervisor,
            int jornadaDiaria) {
        super(nome, matricula, horasTrababalhadas, valorHora);
        this.supervisor = supervisor;
        this.jornadaDiaria = jornadaDiaria;
    }

    @Override
    public float calcularSalario(){

        return valorHora * horasTrababalhadas;
    }

    @Override
    public String toString() {
        return "\n-- ESTAGIARIO --" + super.toString() + 
                "\nSupervisor: " + supervisor + 
                "\nJornada de trabalho diaria:" + jornadaDiaria + "h";
    }

    @Override
    public void trabalhar(float horas){

        this.horasTrababalhadas += horas;

        System.out.println(horas + "h adicionadas às horas trabalhadas do estagiário " + nome);

    }

    @Override
    public void relatarProgresso(){

        System.out.println("O estagiário "+ nome + " trabalhou " + horasTrababalhadas + "h esse mês");

    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public int getJornadaDiaria() {
        return jornadaDiaria;
    }

    public void setJornadaDiaria(int jornadaDiaria) {
        this.jornadaDiaria = jornadaDiaria;
    }
}
