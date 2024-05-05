package controller;

import java.util.ArrayList;
import java.util.List;

import model.Desenvolvedor;
import model.Estagiario;
import model.Funcionario;
import model.Gerente;

public class ListaFuncionarios {
    
    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void adicionarFuncionario(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }


    public static Funcionario buscarFuncionario(String nome){
        
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getNome().equals(nome)) {
                return funcionario;
            }
        }

        return null;
    }

    public static Funcionario buscarFuncionario(int matricula){
        
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getMatricula() == matricula) {
                return funcionario;
            }
        }

        return null;
    }

    public static boolean removerFuncionario(String nome){

        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getNome().equals(nome)) {
                listaFuncionarios.remove(funcionario);
                return true;
            }
        }

        return false;
    }

    public static boolean removerFuncionario(int matricula){

        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getMatricula() == matricula) {
                listaFuncionarios.remove(funcionario);
                return true;
            }
        }

        return false;
    }


    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static List<Funcionario> getGerentes(){
        List<Funcionario> tempList = new ArrayList<>();

        for (Funcionario funcionario: listaFuncionarios) {
            if (funcionario instanceof Gerente) {
                tempList.add(funcionario);
            }
        }

        return tempList;
    }

    public static List<Funcionario> getDesenvolvedores(){
        List<Funcionario> tempList = new ArrayList<>();

        for (Funcionario funcionario: listaFuncionarios) {
            if (funcionario instanceof Desenvolvedor) {
                tempList.add(funcionario);
            }
        }

        return tempList;
    }

    public static List<Funcionario> getEstagiarios(){
        List<Funcionario> tempList = new ArrayList<>();

        for (Funcionario funcionario: listaFuncionarios) {
            if (funcionario instanceof Estagiario) {
                tempList.add(funcionario);
            }
        }

        return tempList;
    }




}
