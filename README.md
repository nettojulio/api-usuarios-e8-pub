# EQUIPE 8 - Bola 8 - Desafio Final iLab

## API de usuários

Uma aplicação Java API para cadastrar e listar usuários com os atributos id, nome, CPF, telefone, data nascimento e
email. Para utilizar esta API, esta aplicação deverá ser autenticada pela aplicação de administradores, passando o token jwt.

Repositório do Front-end, clique aqui: https://github.com/equipe8-final-ilab/frontend-e8

Repositório da API de administradores: https://github.com/equipe8-final-ilab/api-administrador-e8

Repositório da API de pedidos: https://github.com/equipe8-final-ilab/api-pedidos-e8

Link do Jira: https://grupo8ilab.atlassian.net/jira/software/projects/G8ILAB/boards/2/roadmap

## Variáveis de Ambiente

Para rodar esse projeto, você vai precisar adicionar as seguintes variáveis de ambiente no seu 
application.properties

`DB_URL`

`DB_USER`

`DB_PASSWORD`

## Instalação
Rodar no terminal
```
docker-compose up
```

## Autores

- [@JessieZan](https://www.github.com/JessieZan)
- [@nettojulio](https://www.github.com/nettojulio)
- [@Raphaella-leite](https://github.com/Raphaella-leite)
- [@queziabalonecker](https://github.com/queziabalonecker)
- [@Edvan-Jr](https://github.com/Edvan-Jr)

## Stack utilizada

**Front-end:** React.

**Back-end:** Java, SpringBoot, PostgreSQL, RDS.


## Documentação da API

### End-Points

### Cadastrar Usuários

```http
  POST /usuarios
```

#### Dados Enviados

| Chave   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `nome` | `String` | nome do usuário **Obrigatório** |
| `cpf` | `String` | cpf do usuário **Obrigatório** |
| `email` | `String` | email do usuário **Obrigatório** |
| `telefone` | `String` | telefone do usuário **Obrigatório** |
| `dataNascimento` | `Date` | data de nascimento do usuário **Obrigatório** |


#### Body
```http
{
	"nome":"Usuário",
	"cpf":"11122233344",
	"email":"usuario@email.com",
	"telefone":"55999999999",
	"dataNascimento":"2004-01-01"
}
```

#### Dados Recebidos
```
{
  "id": 1,
	"nome":"Usuário",
	"cpf":"11122233344",
	"email":"usuario@email.com",
	"telefone":"55999999999",
	"dataNascimento":"2004-01-01T00:00:00.000+00:00"
}
```

#### (201) Created ou Erro(400) Bad Request

---


### Listar Usuários

```http
  GET /usuarios
```

#### Dados Enviados

| Chave   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `token` | `bearer` | token bearer de acesso do usuario **Obrigatório** |

#### Exemplo
```http
{
	"token": "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJJdGFsb19Db3N0YSwyLGl0YWxvQGVtYWlsLmNvbSw3MTEyMzQ1Njc4OSIsImlzcyI6IkZvb2RMb3ZlcnMiLCJleHAiOjE2NDg3ODA4Nzl9.0UW7jMU8_S9VvluB3tMDvwRHAbp6ZcMoCoyFRrO6Udk"
}
```

#### No Body

#### Dados Recebidos

```
[
  {
		"id": 3,
		"nome": "Julio",
		"cpf": "12345678901",
		"email": "julio.neto@ifood.com.br",
		"telefone": "71996498435",
		"dataNascimento": "1988-11-09T00:00:00.000+00:00"
	},
	{
		"id": 4,
		"nome": "Edvan",
		"cpf": "11122233300",
		"email": "edvan.junior@ifood.com.br",
		"telefone": "48999952515",
		"dataNascimento": "1986-04-01T00:00:00.000+00:00"
	}
]
```

#### (200) OK ou Erro(401) Unauthorized

---


### Buscar Usuário por id

```http
  GET /usuarios/{id}
```

#### Dados Enviados

| Variável   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Integer` | PathVariable identificadora do usuario a ser encontrado |

#### **No Body

#### Dados Recebidos

```
{
  "id": 1,
	"nome":"Usuário",
	"cpf":"11122233344",
	"email":"usuario@email.com",
	"telefone":"55999999999",
	"dataNascimento":"2004-01-01T00:00:00.000+00:00"
}
```

#### (200) OK, Erro(401) Não Autorizado
