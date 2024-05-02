public class Estagiario extends Funcionario {
    
    private String supervisor;
    private int jornadaDiaria;



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
}
