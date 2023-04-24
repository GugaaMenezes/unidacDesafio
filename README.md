
# Projeto de Admissão Unidac - Grupo WL

Crud de cadastro, utilizando Java e Front, utilizando HTML e Javascript com Bootstrap.

## Referência

 - [Referência do Projeto](https://github.com/unidac-grupo-wl/desafio-unidac-grupo-wl)
 - [Back-End](https://unidacdesafio-production-8747.up.railway.app/)
 - [Front-End](https://frontendunidac-production.up.railway.app/) (Página principal - ACESSE AQUI)

----------------------------
## Repositórios

 - [Repositório Back-End](https://github.com/GugaaMenezes/unidacDesafio)
 - [Repositório Front-End](https://github.com/GugaaMenezes/front-unidac)


## Autores

- Gustavo Menezes - [@gugaamenezes](https://github.com/GugaaMenezes) 


## Aprendizados

Nesse desafio, pude trabalhar com todas as etapas do desenvolvimento, desde a análise da demanda, passando pelo desenvolvimento e concluindo com os testes e deploy.




## Stacks utilizada

**Front-end:** Html, Css, Javascript, Rest e Bootstrap (Framekork)

**Back-end:** Java, NativeQuery, Mysql


## Documentação da API

#### Retorna todos os itens

```http
  GET /unidac
```

#### Inclui dados no Banco de dados via Api REST
```http
  POST /unidac
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `nome` | `string` | **Obrigatório**. |
| `cpf` | `string` | **Obrigatório**. Chave primária, juntamente com o ID|
| `dataDoCafedaManha` | `dataDoCafedaManha` | **Obrigatório**. A chave da sua API |
| `Itens` | `itensArray` | Em implementação |


#### Exclui um item

```http
  DELETE /unidac/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `long` | **Obrigatório**. O ID do item que você quer excluir|
## Funcionalidades

- Temas responsivo
- Preview em tempo real
- Modo tela cheia
- Multiplataforma

