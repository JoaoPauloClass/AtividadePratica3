package model;


public class Gerente extends Funcionario{

    private String equipe;
    private float bonusAnual; //Valor inteiro do bonus, ele ganhará durante o andamento do o ano o valor

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public float getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(float bonusAnual) {
        this.bonusAnual = bonusAnual;
    }


    public Gerente(String nome, int matricula, float horasTrababalhadas, float valorHora, String equipe,
            float bonusAnual) {
        super(nome, matricula, horasTrababalhadas, valorHora);
        this.equipe = equipe;
        this.bonusAnual = bonusAnual;
    }

    @Override
    public float calcularSalario() {
        return horasTrababalhadas * valorHora + (bonusAnual/12);
    }

    @Override
    public String toString() {
        return "\n-- GERENTE --" + super.toString() + 
                "\nEquipe sob gerência: " + equipe + 
                "\nBonus Anual: R$" + bonusAnual;
    }


    @Override
    public void trabalhar(float horas){

        this.horasTrababalhadas += horas;

        System.out.println(horas + "h adicionadas às horas trabalhadas do gerente " + nome);

    }

    @Override
    public void relatarProgresso(){

        System.out.println("O gerente "+ nome + " trabalhou " + horasTrababalhadas + "h esse mês");

    }
}