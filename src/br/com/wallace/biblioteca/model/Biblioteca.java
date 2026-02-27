package br.com.wallace.biblioteca.model;

import java.util.Scanner;

public class Biblioteca {
    private String unidade;
    private Livro[] livros = new Livro[5];
    private int counter = 0;

    public Biblioteca(String unidade) {
        this.unidade = unidade;
    }

    public Biblioteca(String unidade, Livro[] livros) {
        this.unidade = unidade;
        this.livros = livros;
    }

    public Livro cadastrarLivro() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n--- CADASTRAR LIVRO ---");

        System.out.print("\nTitulo do livro: ");
        String titulo = input.nextLine();

        System.out.print("\nAno de publicação: ");
        String ano = input.nextLine();
        while (ano.length() != 4)
        {
            System.out.println("Ano inválido! Use o formato YYYY.");
            System.out.print("\nAno de publicação: ");
            ano = input.nextLine();
        }

        System.out.print("\nNome do Autor: ");
        String nome = input.nextLine();

        System.out.print("\nNacionalidade: ");
        String nacionalidade = input.nextLine();

        Autor autor = new Autor(nome, nacionalidade);
        Livro livro = new Livro(titulo, ano, autor);

        autor.addLivro(livro);

        return livro;
    }

    public void listaDeLivros() {
        System.out.println("--- LISTA DE LIVROS ---");
        int i = 0;
        for (Livro livro : livros)
        {
            if (livros[i] == null) return;
            System.out.println("\nId: " + livro.getId());
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor().getNome());
            System.out.println("Ano de publicação: " + livro.getAnoPublicacao());

            System.out.print("Situação: ");
            String situacao = livro.isDisponivel() ? "Disponível!" : "Emprestado!";
            System.out.println(situacao);

            i++;
        }
    }


    public void addLivro(Livro livro) {
        if (livros.length < counter + 1)
        {
            System.out.println("ATINGIDO O LIMITE PARA CADASTRAMENTO DE LIVROS!");
            return;
        }
        this.livros[counter] = livro;
        counter++;
    }

    public void emprestarLivro(int id) {
        switch (id)
        {
            case 1, 2, 3, 4, 5:
                if (livros[id - 1].getTitulo() == null)
                {
                    System.out.println("ID inexistente!");
                    return;
                }
                livros[id - 1].setDisponivel(false);
                System.out.println("Livro emprestado com sucesso!");
                return;
            default:
                System.out.println("ID invalido tente novamente!");
                return;
        }
    }

    public void disponibilizarLivro(int id) {
        switch (id)
        {
            case 1, 2, 3, 4, 5:
                if (livros[id - 1].getTitulo() == null)
                {
                    System.out.println("ID inexistente!");
                    return;
                }
                livros[id - 1].setDisponivel(true);
                System.out.println("Livro devolvido com sucesso!");
                return;
            default:
                System.out.println("ID invalido tente novamente!, se quiser sair digite 0!");
                return;
        }
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Livro[] getLivros() {
        return livros;
    }
}
