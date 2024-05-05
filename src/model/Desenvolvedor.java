package model;

import java.util.ArrayList;

import controller.Trabalhavel;

public class Desenvolvedor extends Funcionario implements Trabalhavel {
    
    // private String[] tecnologiasDominadas;
    private ArrayList<String> tecnologiasDominadas = new ArrayList<>();

    public Desenvolvedor(String nome, int matricula, float horasTrababalhadas, float valorHora,
            ArrayList<String> tecnologiasDominadas) {
        super(nome, matricula, horasTrababalhadas, valorHora);
        this.tecnologiasDominadas = tecnologiasDominadas;
    }

    public ArrayList<String> getTecnologiasDominadas() {
        return tecnologiasDominadas;
    }

    public void setTecnologiasDominadas(ArrayList<String> tecnologiasDominadas) {
        this.tecnologiasDominadas = tecnologiasDominadas;
    }
    

    @Override
    public float calcularSalario(){
        return valorHora * horasTrababalhadas;
    }


    @Override
    public String toString() {
        String txt = "";

        for (String tecnologia : tecnologiasDominadas) {
            txt += tecnologia + ", ";
        }

        //formatar string
        txt = txt.substring(0, txt.length() - 2);
        txt += ".";

        return "\n-- DESENVOLVEDOR --" + super.toString() + 
                "\nTecnologias dominadas: " + txt;
    }

    @Override
    public void trabalhar(float horas){

        this.horasTrababalhadas += horas;

        System.out.println(horas + "h adicionadas às horas trabalhadas do desenvolvedor " + nome);

    }

    @Override
    public void relatarProgresso(){

        System.out.println("O desenvolvedor "+ nome + " trabalhou " + horasTrababalhadas + "h esse mês");

    }
    
}
