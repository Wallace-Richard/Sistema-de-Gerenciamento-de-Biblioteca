package br.com.wallace.biblioteca.model;

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

    public void listaDeLivros() {
        if (livros[0] == null)
        {
            System.out.println("Não existem livros cadrastados!");
            return;
        }
        System.out.println("--- Lista de livros ---");
        int i = 0;
        for (Livro livro : livros)
        {
            if (livros[i] == null) return;
            System.out.println("\nId: " + livro.getId());
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor().getNome());
            System.out.println("Ano de publicação: " + livro.getAnoPublicacao());

            System.out.print("Situação: ");
            String situacao = livro.isDisponivel() ? "Disponível para empréstimo!" : "Indisponível para empréstimo!";
            System.out.println(situacao);

            i++;
        }
    }


    public void emprestarLivro(int id){
        livros[id-1].setDisponivel(false);
    }

    public void disponibilizarLivro(int id){
        livros[id-1].setDisponivel(true);
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

    public void setLivros(Livro livro) {
        if (livros.length < counter+1)
        {
            System.out.println("Atingido o limite de espaço para cadastramento de livros!");
            return;
        }
            this.livros[counter] = livro;
        counter++;
    }
}
