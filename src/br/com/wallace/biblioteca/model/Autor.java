package br.com.wallace.biblioteca.model;

public class Autor {
    private String nome;
    private String nacionalidade;
    private Livro[] livros = new Livro[5];
    private int counter = 0;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public Autor(String nome, String nacionalidade, Livro[] livros) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.livros = livros;
    }

    public void addLivro(Livro livro) {
        if (livros.length < counter + 1)
        {
            System.out.println("Limites de livros pro autor atingido!");
            return;
        }
        this.livros[counter] = livro;
        counter++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }


}
