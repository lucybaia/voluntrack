# VolunTrack 🐾

**Versão:** 2.0.0 (Etapa Intermediária)  

---

## 🎯 Descrição do Problema Real

Organizações sem fins lucrativos frequentemente enfrentam dificuldades na gestão de escalas. A falta de visibilidade sobre turnos descobertos gera falhas operacionais críticas. O VolunTrack resolve isso centralizando o controle e automatizando a identificação de lacunas.

## 🚀 Evolução: Integração com API Pública

Nesta versão 2.0.0, o projeto foi integrado à **BrasilAPI**. Agora, ao cadastrar um voluntário, o sistema solicita o CEP e realiza uma consulta em tempo real para validar a localidade (Cidade/Estado).

- **Endpoint utilizado:** `https://brasilapi.com.br/api/cep/v1/{cep}`
- **Benefício:** Garante que os dados de atuação geográfica dos voluntários sejam precisos e validados oficialmente.

## 👥 Público-Alvo

Gestores de ONGs e coordenadores de projetos sociais.

## ✨ Funcionalidades Principais

- **Cadastro de voluntários** com nome e turno.
- **Validação de Localidade:** Integração automática com BrasilAPI via CEP. *(Novo!)*
- **Monitoramento de Vacância:** Identificação de turnos sem cobertura.
- **Testes de Integração:** Validação automatizada da comunicação com a API externa. *(Novo!)*

---

## 🛠️ Tecnologias e Dependências

| Componente          | Tecnologia                    |
|---------------------|-------------------------------|
| Linguagem           | Java 21                       |
| Gerenciador de Build | Maven                        |
| JSON Parser         | Jackson Databind 2.17.0       |
| Testes              | JUnit 5 (Unitários e de Integração) |
| CI/CD               | GitHub Actions                |

---

## 💻 Como Executar (Deploy)

Como esta é uma aplicação **CLI**, o deploy consiste na disponibilidade do código funcional e documentado.

### 1. Requisitos

- JDK 21
- Maven 3.9+

### 2. Instalação e Execução

```bash
# Clone o repositório
git clone https://github.com/lucybaia/voluntrack.git

# Acesse a pasta
cd voluntrack-app

# Compile e instale as dependências (Jackson, JUnit, etc.)
mvn clean install

# Execute a aplicação
mvn exec:java "-Dexec.mainClass=com.voluntrack.Main"
```

---

## 🧪 Testes e Qualidade

### Executar Testes de Integração (BrasilAPI)

Para validar se a comunicação com a API externa está funcionando:

```bash
mvn test
```

### Executar Análise Estática (Lint)

```bash
mvn checkstyle:check
```

---

## 👤 Autora

**Lucy Baia** — [GitHub](https://github.com/lucybaia)  
🔗 **Repositório:** [https://github.com/lucybaia/voluntrack](https://github.com/lucybaia/voluntrack)
