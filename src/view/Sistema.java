package view;

import java.util.ArrayList;

import controller.ListaFuncionarios;
import model.Desenvolvedor;
import model.Estagiario;
import model.Funcionario;
import model.Gerente;

public class Sistema {
    
    public static void executar(){

        menu();

    }

    private static void menu() {
        int op;
        do {
            System.out.println("\n\nSISTEMA DE FUNCIONARIOS");
            System.out.println("Selecione uma opção:");
            System.out.println("1) Cadastrar funcioario");
            System.out.println("2) Buscar funcionario");
            System.out.println("3) Excluir funcionario");
            System.out.println("4) Listar funcionarios");
            System.out.println("5) Trabalho/Progressos de funcionarios");
            System.out.println("0) Sair");
            System.out.print(">> ");
            op = Console.lerInt();

            switch (op) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    buscarFuncionario();
                    break;
                case 3:
                    excluirFuncionario();
                    break;
                case 4:
                    listarFuncionarios();
                    break;
                case 5:
                    menuFuncionarios();
                    break;
                case 0:
                    System.out.println("Encerrando sistema.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }      
        } while (op != 0);
    }

    private static void cadastrarFuncionario() {
        int op;
        do {
            System.out.println("\n\nCADASTRAR CARTA");
            System.out.println("Selecione o tipo de funcionario:");
            System.out.println("1) Gerente");
            System.out.println("2) Desenvolvedor");
            System.out.println("3) Estagiário");
            System.out.println("0) Cancelar");
            System.out.print(">> ");
            op = Console.lerInt();

            switch (op) {
                case 1:
                    cadastrarGerente();
                    break;
                case 2:
                    cadastrarDesenvolvedor();
                    break;
                case 3:
                    cadastrarEstagiario();
                    break;
   
                case 0:
                    System.out.println("Cancelando operação.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
            if (op >= 1 && op <= 3) {
                break;
            }
        } while(op != 0);
    }

    private static void cadastrarGerente() {
        String nome;
        int matricula;
        float horasTrababalhadas;
        float valorHora;
        String equipe;
        float bonusAnual;

        System.out.println("\nCADASTRO DE GERENTE");
        System.out.print("Nome do gerente: ");
        nome = Console.lerString();
        System.out.print("Matricula: ");
        matricula = Console.lerInt();
        System.out.print("Horas trabalhadas ");
        horasTrababalhadas = Console.lerFloat();
        System.out.print("Valor hora: ");
        valorHora = Console.lerFloat();
        System.out.print("Equipe: ");
        equipe = Console.lerString();
        System.out.print("Bonus Anual (R$): ");
        bonusAnual = Console.lerFloat();
        
        Gerente g1 = new Gerente(nome, matricula, horasTrababalhadas, valorHora, equipe, bonusAnual);

        ListaFuncionarios.adicionarFuncionario(g1);
    }

    private static void cadastrarDesenvolvedor() {
        String nome;
        int matricula;
        float horasTrababalhadas;
        float valorHora;
        ArrayList<String> tecnologiasDominadas = new ArrayList<>();

        System.out.println("\nCADASTRO DE DESENVOLVEDOR");
        System.out.print("Nome do desenvolvedor: ");
        nome = Console.lerString();
        System.out.print("Matricula: ");
        matricula = Console.lerInt();
        System.out.print("Horas trabalhadas ");
        horasTrababalhadas = Console.lerFloat();
        System.out.print("Valor hora: ");
        valorHora = Console.lerFloat();

        System.out.println("Digite as tecnologias que ele domina (digite SAIR para sair)");
        String op = "";
        int aux= 0;
        do {
            aux ++;
            System.out.printf("Tencnologia %d: ", aux);
            op = Console.lerString();
            if (!op.equalsIgnoreCase("SAIR")) {
                tecnologiasDominadas.add(op);
            }
            
        } while (!op.equalsIgnoreCase("SAIR"));
        
        
        Desenvolvedor d1 = new Desenvolvedor(nome, matricula, horasTrababalhadas, valorHora, tecnologiasDominadas);
        ListaFuncionarios.adicionarFuncionario(d1);
    }

    private static void cadastrarEstagiario() {
        String nome;
        int matricula;
        float horasTrababalhadas;
        float valorHora;
        String supervisor;
        int jornadaDiaria;


        System.out.println("\nCADASTRO DE ESTAGIARIO");
        System.out.print("Nome do estagiario: ");
        nome = Console.lerString();
        System.out.print("Matricula: ");
        matricula = Console.lerInt();
        System.out.print("Horas trabalhadas ");
        horasTrababalhadas = Console.lerFloat();
        System.out.print("Valor hora: ");
        valorHora = Console.lerFloat();
        System.out.print("Supervisor: ");
        supervisor = Console.lerString();
        System.out.print("Jornada Diaria (h): ");
        jornadaDiaria = Console.lerInt();
        
        Estagiario e1 = new Estagiario(nome, matricula, horasTrababalhadas, valorHora, supervisor, jornadaDiaria);
        ListaFuncionarios.adicionarFuncionario(e1);
    }

    private static void buscarFuncionario(){

        int op;
        do {
            System.out.println("\n\nBuscar por");
            System.out.println("1) Nome");
            System.out.println("2) Matricula");
            System.out.println("0) Voltar");
            System.out.print(">> ");
            op = Console.lerInt();

            switch (op) {
                case 1:
                    String nome = "";
                    System.out.println("Digite o nome do funcionário: ");
                    nome = Console.lerString();
            
                    System.out.println(ListaFuncionarios.buscarFuncionario(nome));
                    break;
                case 2:
                    int matricula;
                    System.out.println("Digite a matricula do funcionário: ");
                    matricula = Console.lerInt();
            
                    System.out.println(ListaFuncionarios.buscarFuncionario(matricula));
                    break;
   
                case 0:
                    System.out.println("Cancelando operação.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        } while(op != 0);
    }

    private static void excluirFuncionario(){
        int op;
        do {
            System.out.println("\n\nExcluir por");
            System.out.println("1) Nome");
            System.out.println("2) Matricula");
            System.out.println("0) Voltar");
            System.out.print(">> ");
            op = Console.lerInt();

            switch (op) {
                case 1:
                    String nome = "";
                    System.out.println("Digite o nome do funcionário: ");
                    nome = Console.lerString();
            
                    if (ListaFuncionarios.removerFuncionario(nome)) {
                        System.out.println("Funcionário removido!");
                    }else{
                        System.out.println("ERRO! Não foi possivel remover o funcionário");
                    }

                    break;
                case 2:
                    int matricula;
                    System.out.println("Digite a matricula do funcionário: ");
                    matricula = Console.lerInt();
            
                    if (ListaFuncionarios.removerFuncionario(matricula)) {
                        System.out.println("Funcionário removido!");
                    }else{
                        System.out.println("ERRO! Não foi possivel remover o funcionário");
                    }
                    break;
   
                case 0:
                    System.out.println("Cancelando operação.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        } while(op != 0);
    }

    private static void listarFuncionarios(){
        for (Funcionario funcionario : ListaFuncionarios.getListaFuncionarios()) {
            System.out.println(funcionario);
        }
    }

    private static void menuFuncionarios(){

        int op;
        do {
            int matricula;
            System.out.println("Digite a matricula do funcionário (0 para sair): ");
            matricula = Console.lerInt();

            

            Funcionario tempFuncionario = ListaFuncionarios.buscarFuncionario(matricula);
            if (matricula == 0) {
                break;
            } else if (tempFuncionario == null) {
                System.out.println("Funcionario não encontrado!");
                break;
            }

            System.out.println("Funcionário: " + tempFuncionario.getNome());

            System.out.println("\n\nSelecione uma opção");
            System.out.println("1) Ver progresso");
            System.out.println("2) Adicionar horas");
            System.out.println("0) Voltar");
            System.out.print(">> ");
            op = Console.lerInt();
            
            switch (op) {
                case 1:

                    tempFuncionario.relatarProgresso();;     
                
                    break;
                case 2:
                    System.out.println("Quantas horas deseja adicionar?");
                    System.err.print(">> ");
                    int horas = Console.lerInt();

                    tempFuncionario.trabalhar(horas);                    
                    break;
   
                case 0:
                    System.out.println("Cancelando operação.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        } while(op != 0);

    }

}
