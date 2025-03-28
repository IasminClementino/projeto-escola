# Projeto Escola

Este é um sistema escolar desenvolvido em Java, com o objetivo de gerenciar alunos, disciplinas e atividades. O projeto utiliza conceitos de orientação a objetos, interfaces e repositórios para organizar e estruturar o código.

## Funcionalidades

- **Login e Cadastro de Alunos**: Permite que alunos se registrem e façam login no sistema.
- **Gerenciamento de Disciplinas**: Adicionar, listar e remover disciplinas.
- **Gerenciamento de Alunos**: Listar e remover alunos.
- **Visualização de Atividades**: Alunos podem visualizar atividades disponíveis.
- **Menu de Administração**: Acesso a funcionalidades administrativas, como gerenciamento de disciplinas e alunos.

## Estrutura do Projeto

O projeto está organizado em pacotes para facilitar a manutenção e a escalabilidade:

- **`gui`**: Contém as classes responsáveis pelos menus e interação com o usuário.
- **`models`**: Contém as classes que representam as entidades do sistema, como `Aluno`, `Disciplinas` e `Atividades`.
- **`repository`**: Contém as classes responsáveis por armazenar e gerenciar os dados das entidades.
- **`services`**: Contém as classes que implementam a lógica de negócio do sistema.
- **`treatments`**: Contém classes utilitárias, como limpeza de tela e tratamento de exceções.
- **`interfaces`**: Define contratos para as operações realizadas nos repositórios.

## Como Executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Clone este repositório:
    ```bash
    git clone https://github.com/seu-usuario/projeto-escola.git
    ```
3. Navegue até o diretório do projeto:
    ```bash
    cd projeto-escola
    ```
4. Compile o projeto:
    ```bash
    javac -d bin src/**/*.java
    ```
5. Execute o programa:
    ```bash
    java -cp bin Main
    ```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

## Autor

- **Maria Iasmin Clementino da Silva**

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).  