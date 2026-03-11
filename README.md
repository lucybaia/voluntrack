# VolunTrack

**Versão:** 1.0.0

---

## Descrição do Problema Real

Organizações sem fins lucrativos frequentemente enfrentam dificuldades na gestao de escalas de trabalho voluntario. A falta de visibilidade sobre quais turnos estao descobertos gera falhas operacionais que só são detectadas no momento em que o servico deveria ser prestado. Essa desorganização impacta diretamente a continuidade de atividades essenciais da instituicao.

## Proposta da Solução

O VolunTrack e uma aplicação de terminal que automatiza a gestao de escalas. O sistema permite o cadastro de voluntarios em turnos específicos e fornece uma funcionalidade de monitoramento de vacância. Ao cruzar os dados de voluntários alocados com a grade necessária, o software identifica e destaca turnos vazios, permitindo que a gestão da ONG atue rapidamente para preencher as lacunas.

## Público Alvo

Coordenadores de ONGs, gestores de projetos sociais e administradores de centros comunitários que dependem de mão de obra voluntária.

## Funcionalidades Principais

- Cadastro de voluntários com nome e turno de preferência.
- Listagem completa de voluntários alocados.
- Identificação automática de turnos sem cobertura (vacância).
- Interface interativa via linha de comando para fácil acesso.

---

## Tecnologias e Dependências

Este projeto utiliza as seguintes tecnologias, com todas as dependências declaradas formalmente no arquivo `pom.xml`:

| Componente | Tecnologia |
|---|---|
| Linguagem | Java 21 |
| Gerenciador de Build | Maven 3.9.x |
| Interface | CLI (Command Line Interface) |
| Testes Automatizados | JUnit 5 |
| Análise Estática (Linter) | Maven Checkstyle Plugin |
| CI (Integração Contínua) | GitHub Actions |

---

## Instruções de Instalação

### 1. Certifique-se de ter o JDK 21 e o Maven configurados no sistema

### 2. Clone o repositório

```powershell
git clone https://github.com/lucybaia/voluntrack.git
```

### 3. Acesse a pasta do projeto

```powershell
cd voluntrack-app
```

### 4. Baixe as dependências e compile o projeto

```powershell
mvn exec:java "-Dexec.mainClass=com.voluntrack.Main"
```
---

## Instruções para rodar os testes

### Para executar a suite de testes automatizados:

```powershell
mvn test
```

## Instruções para Rodar o Lint

### Para executar a análise estática de código (Linting):

```powershell
mvn checkstyle:check
```

Nota: O comando mvn verify tambem executa tanto os testes quanto o linter simultaneamente.

---

## Versão atual
### 1.0.0

## Nome do Autor
### Lucy Baia
