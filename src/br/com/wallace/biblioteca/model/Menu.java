package br.com.wallace.biblioteca.model;

import javax.swing.event.UndoableEditListener;
import java.util.Scanner;

public class Menu {
    private Biblioteca biblioteca;
    private Livro livro;
    private Autor autor;

    public static void exibirMenu() {
        System.out.println("--- SISTEMA DE GERENCIAMENTO DE BIBLIOTECA ---");
        System.out.println("\n1 - Cadastrar um novo Livro");
        System.out.println("2 - Listar todos os livros");
        System.out.println("3 - Buscar livro por nome");
        System.out.println("4 - Emprestar um livro");
        System.out.println("5 - Devolver um livro");
        System.out.println("6 - Sair do sistema");
        System.out.println("-----------------------------------------------");
    }

    public void options(int option) {
        switch (option)
        {
            case 1:
                System.out.println("\n--- Cadastrar Livro ---");
                Scanner input = new Scanner(System.in);

                System.out.print("Titulo do livro: ");
                livro.setTitulo(input.next());

                System.out.print("Ano de publicação: ");
                livro.setAnoPublicacao(input.nextInt());

                System.out.print("Nome do Autor: ");
                autor.setNome(input.nextLine());

                System.out.print("Nacionalidade: ");
                autor.setNacionalidade(input.nextLine());

                autor.addLivro(livro);
                biblioteca.cadastrarLivro(livro);

            case 2:
                biblioteca.listaDeLivros();
            case 3: return;

            case 4:

        }
    }


    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
}
