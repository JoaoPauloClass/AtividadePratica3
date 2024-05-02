public class Desenvolvedor extends Funcionario {
    
    private String[] tecnologiasDominadas;

    public Desenvolvedor(String nome, int matricula, float horasTrababalhadas, float valorHora,
            String[] tecnologiasDominadas) {
        super(nome, matricula, horasTrababalhadas, valorHora);
        this.tecnologiasDominadas = tecnologiasDominadas;
    }

    public String[] getTecnologiasDominadas() {
        return tecnologiasDominadas;
    }

    public void setTecnologiasDominadas(String[] tecnologiasDominadas) {
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
    
}
