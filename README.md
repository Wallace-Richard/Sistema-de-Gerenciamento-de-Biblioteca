# 📚 Sistema de Biblioteca

Projeto desenvolvido para simular o gerenciamento de uma biblioteca via console, com foco em organização de domínio, regras de negócio bem definidas e aplicação correta de conceitos de orientação a objetos.

A proposta é modelar o problema de forma simples, mas estruturada, garantindo consistência dos dados e controle do fluxo do sistema.

# 📌 Visão Geral

## O sistema permite:

Cadastro de livros e autores

Controle de empréstimos e devoluções

Consulta e listagem de livros

Contagem global de exemplares no sistema

Toda a interação é feita via terminal, por meio de um menu contínuo.

# 🧱 Modelagem do Domínio

## O sistema é composto por três entidades principais:

## Autor

Representa o escritor da obra.

Responsabilidades:

Armazenar nome e nacionalidade.

Manter vínculo com os livros escritos.

Os atributos devem ser privados, garantindo encapsulamento e acesso controlado.

## Livro

Representa o item físico controlado pela biblioteca.

Atributos obrigatórios:

ID único (gerado automaticamente)

## Título

Ano de publicação

## Autor

Status (Disponível ou Emprestado)

## Regras importantes:

O ID deve ser gerado automaticamente de forma sequencial.

Um livro não pode existir sem título, ano e autor.

O estado inicial deve ser "Disponível".

Nenhum atributo pode ser acessado diretamente fora da classe.

Biblioteca

Responsável pelo gerenciamento do acervo.

Atributos:

Nome da unidade

Estrutura de armazenamento (Array de livros)

Responsabilidades:

Adicionar livros ao acervo (respeitando limite de capacidade).

Realizar empréstimos.

Processar devoluções.

Listar e buscar livros.

# ⚙️ Regras de Negócio
Cadastro

Geração automática de ID para cada novo livro.

Garantia de integridade dos dados no momento da criação.

Encapsulamento completo das entidades.

Controle de Estoque
Empréstimo

Só pode ser realizado se o livro estiver disponível.

Ao emprestar, o status deve ser alterado para "Emprestado".

Devolução

Ao devolver, o status deve retornar para "Disponível".

Consultas

O sistema deve permitir:

Listagem completa do acervo.

Busca por título, retornando todas as informações do livro e do autor.

Contagem global de livros cadastrados no sistema, independentemente da biblioteca.

# 🖥️ Interface (Console)

O sistema possui um menu interativo contínuo:

1 - Cadastrar novo livro
2 - Listar todos os livros
3 - Buscar livro por nome
4 - Emprestar livro
5 - Devolver livro
6 - Sair

## Requisitos da interface:

O menu deve permanecer ativo até o usuário escolher sair.

Entradas inválidas devem ser tratadas.

O sistema não pode encerrar de forma inesperada.

# 🧠 Conceitos Aplicados

Programação Orientada a Objetos

Encapsulamento

Responsabilidade de classes

Controle de estado

Validação de regras de negócio

Manipulação de Arrays

Estruturação de sistema em camadas simples
