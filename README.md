# API REST - Cadastro de Usuários (CRUD) 👤

Esta é uma aplicação Java que implementa uma **API RESTful para cadastro de usuários**, com suporte completo às operações CRUD (**Create, Read, Update e Delete**). O projeto segue uma arquitetura em camadas (Controller, Service, Repository e Model), com foco em boas práticas de desenvolvimento e código limpo.

---

## 🎯 Objetivo

Desenvolver uma API robusta, escalável e bem estruturada que permita o gerenciamento de usuários, utilizando:
- Java com Spring Boot (ou estrutura básica sem framework, se preferir)
- Padrões de projeto
- Boas práticas de codificação
- Estrutura modularizada

---

## 🔧 Funcionalidades

- 🔐 Criar novo usuário (POST `/usuarios`)
- 📋 Listar todos os usuários (GET `/usuarios`)
- 🔍 Buscar usuário por ID (GET `/usuarios/{id}`)
- ✏️ Atualizar dados do usuário (PUT `/usuarios/{id}`)
- ❌ Deletar usuário (DELETE `/usuarios/{id}`)

---

## 📂 Estrutura do Projeto

CadastroUsuariosAPI/ ├── src/ │ └── main/ │ └── java/ │ └── com/ │ └── cadastro/ │ ├── controller/ # Endpoints REST │ ├── service/ # Regras de negócio │ ├── repository/ # Acesso a dados │ └── model/ # Classe Usuário │ ├── src/main/resources/ # Configurações da aplicação └── README.md
