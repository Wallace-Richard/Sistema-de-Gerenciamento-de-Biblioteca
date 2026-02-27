# 📚 Sistema de Biblioteca

Projeto desenvolvido para simular o gerenciamento de uma biblioteca via console, com foco em organização de domínio, regras de negócio robustas e aplicação rigorosa de Orientação a Objetos.

---

## 📌 Visão Geral

O sistema provê uma solução estruturada para o controle de acervos literários, permitindo uma gestão fluida entre livros, autores e usuários. Toda a interação ocorre via terminal através de um menu dinâmico e resiliente a falhas.

### 🛠 Funcionalidades Chave
- **Gestão de Acervo:** Cadastro detalhado de livros e autores.
- **Fluxo de Empréstimos:** Controle de status (Disponível/Emprestado).
- **Inteligência de Busca:** Consulta por títulos e listagem completa.
- **Métricas:** Contagem global de exemplares ativos no sistema.

---

## 🧱 Modelagem do Domínio

A arquitetura do sistema baseia-se em três pilares fundamentais:

### 👤 Autor
*Representa a propriedade intelectual da obra.*
- **Responsabilidades:** Armazenar nome, nacionalidade e manter o vínculo bidirecional com suas obras.
- **Segurança:** Atributos 100% privados com acesso via métodos assessores.

### 📖 Livro
*A unidade fundamental do acervo.*
- **Atributos:** ID Sequencial (Automático), Título, Ano, Autor e Status.
- **Integridade:** Validação obrigatória na criação (não existem livros "órfãos" ou sem dados).
- **Estado:** Inicializado por padrão como `Disponível`.

### 🏢 Biblioteca
*O motor de gerenciamento.*
- **Capacidade:** Armazenamento estruturado em Arrays.
- **Operações:** Processamento de empréstimos, devoluções e buscas complexas.

Controller do sistema e exibição visual:

### 🎮 Classe Menu (Interface & Controle)
*O orquestrador da experiência do usuário.*
- **Controle de Estado:** Gerencia o ciclo de vida do programa através de uma logica `boolean` de controle.
- **Separação de Preocupações:** Isola a lógica de exibição visual da lógica de processamento de dados (`options`).
- **Resiliência:** Implementada com tratamento de erros para garantir que o sistema não feche ao receber comandos inesperados.
  
---

## ⚙️ Regras de Negócio & Lógica

| Operação | Regra de Ouro |
| :--- | :--- |
| **Cadastro** | Geração de ID automático e encapsulamento total. |
| **Empréstimo** | Bloqueio de operação caso o livro já esteja `Emprestado`. |
| **Devolução** | Restauração imediata do status para `Disponível`. |
| **Consultas** | Busca por título com retorno detalhado de metadados do autor. |

---

## 🖥️ Interface do Sistema (Console)

O menu interativo foi projetado para ser ininterrupto e seguro contra entradas inválidas:

1. ➕ **Cadastrar novo livro**
2. 📋 **Listar todos os livros**
3. 🔍 **Buscar livro por nome**
4. 📤 **Emprestar livro**
5. 📥 **Devolver livro**
6. ❌ **Sair**

**Nota de Resiliência:** O sistema trata exceções de input, garantindo que o programa não encerre de forma inesperada caso o usuário digite comandos inválidos.

---

## 🧠 Conceitos de Engenharia Aplicados

Para garantir um código limpo e escalável, foram aplicados:
- **Encapsulamento Estrito:** Proteção da lógica interna das entidades.
- **Responsabilidade Única:** Cada classe possui um papel claro e definido.
- **Controle de Estado:** Gerenciamento preciso do ciclo de vida dos objetos.
- **Arquitetura Evolutiva:** Estrutura preparada para futura integração com Bancos de Dados ou Interfaces Gráficas (GUI).

---
⭐ *Desenvolvido por Wallace Richard*
