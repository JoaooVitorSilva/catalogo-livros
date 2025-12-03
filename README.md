# 📚 Catálogo de Livros – API REST + Interface Web

Um projeto completo que implementa um catálogo de livros utilizando **Spring Boot**, **PostgreSQL (Supabase)** e uma interface simples em **HTML + JavaScript**.  
O sistema permite cadastrar, listar, editar, excluir e consultar livros via API e também pela interface web.

---

## 🚀 Funcionalidades

- ➕ **Cadastrar** livros  
- 📄 **Listar** todos os livros  
- 🔍 **Consultar** livro por ID  
- ✏️ **Editar** livro  
- 🗑 **Excluir** livro  
- 🌐 Interface HTML integrada com a API  
- 🛢 Integração com **PostgreSQL / Supabase**

---

## 🛠 Tecnologias Utilizadas

### Backend
- Java 17  
- Spring Boot 3  
- Spring Web  
- Spring Data JPA  
- Hibernate  
- PostgreSQL  
- Supabase  

### Frontend
- HTML5  
- CSS3  
- JavaScript (Fetch API)

---

## 📂 Estrutura do Projeto

```bash
catalogo-livros/
│
├── src/main/java/com/joao/catalogo/
│ ├── controller/
│ ├── model/
│ ├── repository/
│ └── CatalogoLivrosApplication.java
│
├── src/main/resources/
│ ├── static/
│ │ └── index.html ← Interface web
│ └── application.properties
│
└── pom.xml
```

---

## ⚙️ Configuração do Banco (Supabase)

No arquivo:

src/main/resources/application.properties


Configure assim:

```bash
spring.datasource.url=jdbc:postgresql://<HOST>:5432/<DB_NAME>
spring.datasource.username=<USERNAME>
spring.datasource.password=<PASSWORD>
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```
---

## ▶️ Como Executar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/JoaooVitorSilva/catalogo-livros
cd catalogo-livros
```

### 2️⃣ Rodar o backend

```bash
mvn spring-boot:run
```

### 3️⃣ Abrir a interface web

```bash
http://localhost:8080
```

---

## 🎨 Interface Web

 - A página index.html permite:
 - Cadastrar novos livros
 - Editar livros existentes
 - Listar todos os livros dinamicamente
 - Excluir registros com um clique
 - Tudo conectado diretamente à API do Spring.

---

## 📘 Autores

João Vitor Silva, Jaison Rafael Tavares, Isaac de Lima, João Volkmann, Marcio

---

Projeto desenvolvido para estudo e aprimoramento em Java, Spring Boot e APIs REST.



