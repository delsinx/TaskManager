# TODO — Backend Portfolio Project (Java + Spring Boot)

Este documento representa o plano de desenvolvimento do projeto backend, organizado em etapas progressivas como em um fluxo Scrum.

---

## ✅ FASE 1 — SETUP DO PROJETO

- [:heavy_check_mark:] Criar projeto via Spring Initializr
- [:heavy_check_mark:] Configurar Java LTS
- [:heavy_check_mark: ] Configurar application.properties
- [:heavy_check_mark: ] Conectar ao PostgreSQL
- [:heavy_check_mark: ] Criar schema inicial
- [:heavy_check_mark:] Criar projeto no GitHub
- [:heavy_check_mark:] Criar `.gitignore`
- [:heavy_check_mark: ] Primeiro commit

---

## ✅ FASE 2 — ESTRUTURA DO BACKEND

- [:heavy_check_mark: ] Criar pacotes:
    - controller
    - service
    - repository
    - model
    - dto
    - config
    - security
- [:heavy_check_mark:] Criar estrutura base do projeto
- [ ] Criar endpoint `/health`
- [ ] Testar subida local

---

## ✅ FASE 3 — BANCO DE DADOS

- [:heavy_check_mark:] Configurar Flyway ou Liquibase
- [:heavy_check_mark: ] Criar migration inicial
- [:heavy_check_mark: ] Criar entidade User
- [:heavy_check_mark: ] Mapear entidade com JPA
- [:heavy_check_mark: ] Criar repositório JPA
- [ ] Testar persistência no banco

---

## ✅ FASE 4 — SEGURANÇA E AUTENTICAÇÃO

- [ ] Configurar Spring Security
- [ ] Criar DTO de login
- [ ] Criar endpoint de cadastro
- [ ] Criptografar senha (BCrypt)
- [ ] Criar autenticação básica
- [ ] Gerar JWT no login
- [ ] Criar filtro JWT
- [ ] Proteger endpoints privados

---

## ✅ FASE 5 — RECURSO PRINCIPAL (CRUD)

- [ ] Criar entidade principal (ex: Task, Item, Produto, etc)
- [ ] Criar Repository
- [ ] Criar Service
- [ ] Criar Controller
- [ ] Criar DTO de entrada e saída
- [ ] Criar CRUD completo:
    - [ ] CREATE
    - [ ] READ
    - [ ] UPDATE
    - [ ] DELETE
- [ ] Testar endpoints no Postman ou Insomnia

---

## ✅ FASE 6 — QUALIDADE E PADRÕES

- [ ] Criar validações (@NotNull, @Email, etc)
- [ ] Criar handler global de erros
- [ ] Padronizar respostas da API
- [ ] Testar erros de validação
- [ ] Garantir HTTP status corretos

---

## ✅ FASE 7 — DOCKER

- [ ] Criar Dockerfile
- [ ] Criar docker-compose
- [ ] Testar aplicação via container
- [ ] Ajustar variáveis de ambiente

---

## ✅ FASE 8 — DEPLOY

- [ ] Criar instância EC2
- [ ] Configurar Security Group
- [ ] Instalar Docker no servidor
- [ ] Transferir projeto
- [ ] Rodar docker-compose
- [ ] Testar endpoints públicos
- [ ] Configurar domínio (opcional)

---

## ✅ FASE 9 — DOCUMENTAÇÃO

- [ ] Criar README.md completo
- [ ] Instruções de setup
- [ ] Documentar endpoints
- [ ] Explicar autenticação
- [ ] Documentar variáveis de ambiente

---

## ✅ FASE 10 — FINALIZAÇÃO

- [ ] Refatorar código
- [ ] Remover código morto
- [ ] Rodar build limpo
- [ ] Revisar commits
- [ ] Verificar checklist completo
- [ ] Tag de versão (v1.0.0)
- [ ] Projeto finalizado

---

## ✅ EXTRAS (OPCIONAL)

- [ ] Paginação
- [ ] Filtro por parâmetros
- [ ] Cache simples
- [ ] Logs
- [ ] Testes unitários básicos
- [ ] Swagger
- [ ] Monitoramento simples

---

## ✅ DEFINIÇÃO DE PRONTO (DONE)

Uma tarefa só pode ser considerada feita quando:

- Código compila
- Não há erro em runtime
- Endpoints funcionam
- Banco atualizado
- Build passa
- Rodando via Docker
- Commit realizado

---

## ✅ PLANO CUTUCANTE (LEMBRETE)

> Código sem organização é só ruído.  
> Código com planejamento vira projeto profissional.

Este TODO é seu mapa de evolução como dev backend.
