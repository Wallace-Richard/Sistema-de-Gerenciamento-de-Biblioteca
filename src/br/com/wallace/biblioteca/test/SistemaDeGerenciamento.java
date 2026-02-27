package br.com.wallace.biblioteca.test;

import br.com.wallace.biblioteca.model.Autor;
import br.com.wallace.biblioteca.model.Biblioteca;
import br.com.wallace.biblioteca.model.Livro;
import br.com.wallace.biblioteca.model.Menu;
import java.util.Scanner;

public class SistemaDeGerenciamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Menu menuPrincipal = new Menu();
        Biblioteca biblioteca = new Biblioteca("Biblioteca municipal");
        menuPrincipal.setBiblioteca(biblioteca);

        while (menuPrincipal.isDentroDoMenu())
        {
            Menu.exibirMenu();
            String opcao = input.nextLine();
            menuPrincipal.options(opcao);
        }
    }
}
