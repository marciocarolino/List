package org.example;

public class Main {
    public static void main(String[] args) {

//        ListaTarefas listaTarefas = new ListaTarefas();
//
//        System.out.println("O número total de elementos na lisa é: " + listaTarefas.obterNumeroTotalTarefa());
//
//        System.out.println("================================");
//        listaTarefas.adicionarTarefa("Tarefa 1");
//        listaTarefas.adicionarTarefa("Tarefa 2");
//        listaTarefas.adicionarTarefa("Tarefa 3");
//
//        System.out.println("O número total de elementos na lisa é: " + listaTarefas.obterNumeroTotalTarefa());
//
//        System.out.println("=============REMOVENDO===================");
//        listaTarefas.removerTarefa("Tarefa 1");
//
//
//        System.out.println("O número total de elementos na lisa é: " + listaTarefas.obterNumeroTotalTarefa());
//
//
//        System.out.println("=============OBTER DESCRIÇÕES TAREFAS===================");
//        listaTarefas.obterDescricoesTarefas();


        //Catalogo de Livros

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 1994);
        catalogoLivros.adicionarLivro("Livro 6", "Autor 6", 1995);


        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2023));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}