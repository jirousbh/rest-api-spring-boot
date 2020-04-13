# Rest API em Spring Boot para uma Todo List

## Resumo

Endpoints REST API em Spring Boot com autenticação JWT. Foi utilizado um banco de dados in-memory para teste dos dados. O Intuito desse projeto foi entender os conceitos de spring boot e como aplicar um CRUD básico usando alguma camada de segurança na aplicação.

## Tecnologias

- Spring Boot 2.2.5
- Jwt 0.9.1

## URL de acesso

[https://criptonita.herokuapp.com/](https://criptonita.herokuapp.com/)

## Rotas

### [POST] /authenticate (*Obrigatório para obter o JWT Token para as próximas rotas)
Rota utilizada para buscar a lista de anúncios que correspondem aos parâmetros fornecidos

#### Entrada JSON (body)
{
  "username": "jirous",
  "password": "asdfg"
}

#### Saída
<pre>
Json:{
"token": [
  ...
]
}
</pre>


### [GET] /jpa/users/${username}/todos --Lista completa

#### Entrada JWT (Header)
Authorization Bearer ${JWT_TOKEN}

#### Saída
<pre>
Json:
 {
"id": ...,
"username": "...",
"description": "...",
"targetDate": "...",
"isDone": ('true|false')
},...
</pre>


### [GET] /jpa/users/${username}/todos/${id} --Lista somente um item da lista

#### Entrada JWT (Header)
Authorization Bearer ${JWT_TOKEN}

#### Saída
<pre>
Json:
 {
"id": ...,
"username": "...",
"description": "...",
"targetDate": "...",
"isDone": ('true|false')
},
</pre>


### [POST] /jpa/users/${username}/todos/ --Insere um novo item na lista

#### Entrada JWT (Header)
Authorization Bearer ${JWT_TOKEN}

#### Entrada JSON (body)
<pre>
Json:
 {
"username": "...",
"description": "...",
"targetDate": "...",
"isDone": ('true|false')
},
</pre>


### [PUT] /jpa/users/${username}/todos/${id} --Altera um item da lista

#### Entrada JWT (Header)
Authorization Bearer ${JWT_TOKEN}

#### Entrada JSON (body)
<pre>
Json:
 {
"id": ..., 
"username": "...",
"description": "...",
"targetDate": "...",
"isDone": ('true|false')
},
</pre>


### [DELETE] /jpa/users/${username}/todos/${id} --Apaga um item da lista

#### Entrada JWT (Header)
Authorization Bearer ${JWT_TOKEN}

