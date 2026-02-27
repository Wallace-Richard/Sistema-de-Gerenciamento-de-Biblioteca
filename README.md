# 📚 Sistema de Gerenciamento de Biblioteca

Um sistema de console robusto desenvolvido em Java para gerenciar o acervo de uma biblioteca, focando em boas práticas de Programação Orientada a Objetos (POO).

## 🚀 Funcionalidades

- **Cadastro de Livros:** Registro de título, ano de publicação e autor.
- **Gestão de Autores:** Criação automática de autores vinculados aos livros (Relação Bidirecional).
- **Validação Inteligente:** - Verificação de formato de ano (YYYY).
  - Tratamento de IDs inexistentes.
  - Alertas para listas vazias.
- **Menu Interativo:** Navegação fluida via console com controle de estado.

## 🛠️ Tecnologias e Conceitos Aplicados

- **Linguagem:** Java 17+
- **Encapsulamento:** Uso de modificadores de acesso e métodos Getter/Setter.
- **Composição:** Relação entre as classes `Livro` e `Autor`.
- **Injeção de Dependência:** Scanner compartilhado para otimização de recursos.
- **Clean Code:** Métodos curtos, nomes descritivos e separação de responsabilidades.

## 📋 Como Executar

1. Certifique-se de ter o **JDK 17** ou superior instalado.
2. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/nome-do-repositorio.git](https://github.com/seu-usuario/nome-do-repositorio.git)

3. Abra o projeto em sua IDE favorita (Recomendado: IntelliJ IDEA).
4. Execute a classe principal: `SistemaDeGerenciamento.java`.

## 📂 Estrutura do Projeto

* `SistemaDeGerenciamento.java`: Ponto de entrada (Main) e orquestração do loop principal.
* `Menu.java`: Gerencia a interface de usuário e lógica de entrada de dados.
* `Biblioteca.java`: Armazena e gerencia a coleção de livros.
* `Livro.java` & `Autor.java`: Classes de modelo (Entidades).

Desenvolvido por Wallace Richard como projeto de estudos em Java.
2.  Cole o texto acima.
3.  Substitua `[Seu Nome]` pelo seu nome real.
4.  **Faça o commit:** > **`docs: adicionar README com especificações técnicas do projeto`**

**Deseja que eu adicione uma seção de "Exemplos de Uso" com um passo a passo de como cadastrar o primeiro livro?** Isso ajuda muito quem nunca viu o sistema funcionando.

```
