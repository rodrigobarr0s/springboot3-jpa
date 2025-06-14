# Spring Boot 3 JPA
[![License](https://img.shields.io/npm/l/react)](https://github.com/rodrigobarr0s/springboot3-jpa/blob/main/LICENSE)

## Sobre o projeto
Este repositório contém o backend de uma aplicação desenvolvida com **Spring Boot 3** e **JPA**, estruturada em camadas organizadas para uma API RESTful robusta. Inclui configuração de ambiente de teste com banco H2 e carga inicial de dados para facilitar o desenvolvimento e testes.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **Hibernate 6.1.6**
- **Maven**
- **Banco H2 (em memória)**

## Modelo Conceitual

O diagrama abaixo representa o modelo conceitual da aplicação com suas entidades e relacionamentos principais:

![Modelo Conceitual](https://raw.githubusercontent.com/rodrigobarr0s/springboot3-jpa/d246c5aa631555e3ba235b77b8cc2f58eff09a1d/src/main/resources/static/img/domain-model.png)

## Como Executar o Projeto

### Pré-requisitos

- Java 17+
- Maven 3.8+
- IDE de sua preferência (IntelliJ, Eclipse, VS Code...)

### Passos para execução local

```bash
# Clonar o repositório
git clone https://github.com/rodrigobarr0s/springboot3-jpa.git

# Acessar o diretório do projeto
cd springboot3-jpa

# Executar o projeto com perfil de teste ativado (popula banco com dados)
./mvnw spring-boot:run -Dspring-boot.run.profiles=test
````

A aplicação estará disponível em: `http://localhost:8080`

## Banco de Dados

A aplicação usa o banco **H2 em memória** com carga automática de dados iniciais.

### Console H2

* URL: `http://localhost:8080/h2-console`
* JDBC URL: `jdbc:h2:mem:testdb`
* Usuário: `sa`
* Senha: *(em branco)*

### Carga de dados (`TestConfig`)

Ao executar com o perfil `test`, o banco é automaticamente populado com:

* Categorias (Books, Electronics, Computers)
* Produtos (TV, Macbook, PC Gamer, etc.)
* Usuários e pedidos com itens e pagamento

## Estrutura do Projeto

* `resources/` → Endpoints da API REST
* `services/` → Camada de regras de negócio
* `repositories/` → Interfaces de persistência com Spring Data JPA
* `entities/` → Entidades JPA que representam as tabelas no banco
* `config/` → Configuração do projeto, incluindo carga de dados para perfil de teste

## Autor

**Rodrigo Barros**

[LinkedIn](https://www.linkedin.com/in/rodrigobarr0s)
