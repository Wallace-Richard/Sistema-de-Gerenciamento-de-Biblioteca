package br.com.wallace.biblioteca.model;

public class Biblioteca {
    private String unidade;
    private Livro[] livros;

    public Biblioteca(String unidade) {
        this.unidade = unidade;
    }

    public Biblioteca(String unidade, Livro[] livros) {
        this.unidade = unidade;
        this.livros = livros;
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

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}
