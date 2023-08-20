package org.example;

public class Main {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O número total de elementos na lisa é: " + listaTarefas.obterNumeroTotalTarefa());

        System.out.println("================================");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");

        System.out.println("O número total de elementos na lisa é: " + listaTarefas.obterNumeroTotalTarefa());

        System.out.println("=============REMOVENDO===================");
        listaTarefas.removerTarefa("Tarefa 1");


        System.out.println("O número total de elementos na lisa é: " + listaTarefas.obterNumeroTotalTarefa());


        System.out.println("=============OBTER DESCRIÇÕES TAREFAS===================");
        listaTarefas.obterDescricoesTarefas();


        // System.out.println("O número total de elementos na lisa é: " + listaTarefas.obterNumeroTotalTarefa());


    }
}