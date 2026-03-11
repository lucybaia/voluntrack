# VolunTrack

**Versão:** 1.0.0

---

## Descrição do Problema Real

O VolunTrack foi desenvolvido para mitigar a dificuldade de gestão em organizações sem fins lucrativos que dependem de trabalho voluntário. A dor atacada é a **vacância de turnos críticos**, onde a falta de pessoal é percebida apenas no início do expediente.

A aplicação permite cadastrar voluntários e listar quais turnos (**Manhã**, **Tarde** ou **Noite**) estão sem cobertura, permitindo que a coordenação tome medidas proativas para garantir a continuidade dos serviços prestados à sociedade.

---

## Tecnologias e Dependências

Este projeto utiliza as seguintes tecnologias, com todas as dependências declaradas formalmente no arquivo `pom.xml`:

| Componente | Tecnologia |
|---|---|
| Linguagem | Java 21 |
| Gerenciador de Build | Maven |
| Interface | CLI (Command Line Interface) |
| Testes Automatizados | JUnit 5 |
| Análise Estática (Linter) | Maven Checkstyle Plugin |
| CI (Integração Contínua) | GitHub Actions |

---

## Como Executar

### 1. Compilar o projeto

```powershell
mvn clean compile
```

### 2. Executar a aplicação

```powershell
mvn exec:java "-Dexec.mainClass=com.voluntrack.Main"
```

---

## Qualidade e Validação

Para garantir que o código atende aos requisitos de qualidade e testes automatizados, execute:

```powershell
mvn verify
```

Este comando:
- Executa os testes unitários presentes em `EscalaServiceTest.java`
- Realiza a análise estática de código para garantir a conformidade com as boas práticas de programação

---

## Workflow de CI

O projeto conta com um workflow de **GitHub Actions** configurado em `.github/workflows/ci.yml`.

A cada **push** ou **pull request** na branch principal, a pipeline executa automaticamente:

1. Build do projeto
2. Análise do linter
3. Testes automatizados

Garantindo a integridade do código antes da integração final.