package br.com.wallace.biblioteca.model;

import java.util.Scanner;

public class Biblioteca {
    private String unidade;
    private Livro[] livros = new Livro[5];
    private int counter = 0;
    Scanner input = new Scanner(System.in);

    public Biblioteca(String unidade) {
        this.unidade = unidade;
    }

    public Biblioteca(String unidade, Livro[] livros) {
        this.unidade = unidade;
        this.livros = livros;
    }

    public Livro cadastrarLivro() {
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

    public void buscarLivro(int id) {
        switch (id)
        {
            case 0:
                encerrarOperacao();
                return;
            case 1, 2, 3, 4, 5:
                if (verificarId(id)) return;
                exibirLivro(id);
                return;
            default:
                exibirErroId();
        }
    }

    public void emprestarLivro(int id) {
        switch (id)
        {
            case 0:
                encerrarOperacao();
                return;
            case 1, 2, 3, 4, 5:
                if (verificarId(id)) return;
                if (verificarSituacaoEmprestado(id)) return;
                setSituacaoEmprestado(id);
                return;
            default:
                exibirErroId();
        }
    }

    public void disponibilizarLivro(int id) {
        switch (id)
        {
            case 0:
                encerrarOperacao();
                return;
            case 1, 2, 3, 4, 5:
                if (verificarId(id)) return;
                if (verificarSituacaoDisponivel(id)) return;
                setSituacaoDispoivel(id);
                return;
            default:
                exibirErroId();
        }
    }

    public void exibirLivro(int id) {
        System.out.println("\nTítulo: " + livros[id - 1].getTitulo());
        System.out.println("Autor: " + livros[id - 1].getAutor().getNome());
        System.out.println("Ano de publicação: " + livros[id - 1].getAnoPublicacao());
        System.out.println("\nPARA SAIR DIGITE 0!");
    }

    public boolean verificarCadastro(Livro livro) {
        if (livro == null)
        {
            System.out.println("\nNENHUM LIVRO CADASTRADO AINDA!");
            return true;
        }
        return false;
    }

    private boolean verificarId(int id) {
        if (livros[id - 1] == null)
        {
            exibirErroId();
            return true;
        }
        return false;
    }

    public boolean verificarSituacaoDisponivel(int id) {
        if (livros[id - 1].isDisponivel() == true)
        {
            System.out.println("\nLIVRO JÁ DISPONIVEL!");
            System.out.println("PARA SAIR DIGITE 0!");
            return true;
        }
        return false;
    }

    public boolean verificarSituacaoEmprestado(int id) {
        if (livros[id - 1].isDisponivel() == false)
        {
            System.out.println("\nLIVRO JÁ EMPRESTADO!");
            System.out.println("PARA SAIR DIGITE 0!");
            return true;
        }
        return false;
    }

    public void setSituacaoDispoivel(int id) {
        livros[id - 1].setDisponivel(true);
        System.out.println("\nLIVRO DEVOLVIDO COM SUCESSO!");
    }

    public void setSituacaoEmprestado(int id) {
        livros[id - 1].setDisponivel(false);
        System.out.println("\nLIVRO EMPRESTADO COM SUCESSO!");
    }

    public void exibirErroId() {
        System.out.println("\nID INEXISTENTE!");
        System.out.println("PARA SAIR DIGITE 0!");
    }

    public void encerrarOperacao() {
        System.out.println("ENCERRANDO A OPERAÇÃO ATUAL!");
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
