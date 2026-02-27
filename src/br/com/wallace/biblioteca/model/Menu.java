package br.com.wallace.biblioteca.model;

import java.util.Scanner;

public class Menu {
    private Biblioteca biblioteca;
    private Livro livro;
    private Autor autor;
    private boolean dentroDoMenu = true;
    private Scanner input = new Scanner(System.in);


    public static void exibirMenu() {
        System.out.println("\n\n------------------------------------------------");
        System.out.println("     SISTEMA DE GERENCIAMENTO DE BIBLIOTECA");
        System.out.println("------------------------------------------------");
        System.out.println("1 - Cadastrar um novo Livro");
        System.out.println("2 - Listar todos os livros");
        System.out.println("3 - Buscar livro por ID");
        System.out.println("4 - Emprestar um livro");
        System.out.println("5 - Devolver um livro");
        System.out.println("6 - Sair do sistema");
        System.out.println("------------------------------------------------");

        System.out.print("\nDigite a opção: ");
    }

    public void options(String option) {
        int id = 0;
        switch (option)
        {
            case "1":
                livro = biblioteca.cadastrarLivro();
                biblioteca.addLivro(livro);
                return;
            case "2":
                if (biblioteca.verificarCadastro(livro)) return;
                biblioteca.listaDeLivros();
                return;
            case "3":
                if (biblioteca.verificarCadastro(livro)) return;
                while (livro.isDisponivel())
                {
                    System.out.print("\nDigite o id do livro: ");
                    id = input.nextInt();
                    biblioteca.buscarLivro(id);
                    if (id == 0) break;
                }
                return;
            case "4":
                if (biblioteca.verificarCadastro(livro)) return;
                while (true)
                {
                    System.out.print("\nDigite o id do livro: ");
                    id = input.nextInt();
                    biblioteca.emprestarLivro(id);
                    if (id == 0) break;
                }
            case "5":
                if (biblioteca.verificarCadastro(livro)) return;
                while (true)
                {
                    System.out.print("\nDigite o id do livro: ");
                    id = input.nextInt();
                    biblioteca.disponibilizarLivro(id);
                    if (id == 0) break;
                }
            case "6":
                System.out.println("\nSISTEMA ENCERRADO!!!!");
                dentroDoMenu = false;
                return;

            default:
                System.out.println("\nOPÇÃO INVALIDA TENTE NOVAMENTE!");
        }
    }


    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public boolean isDentroDoMenu() {
        return dentroDoMenu;
    }
}
