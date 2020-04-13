# Rest API em Spring Boot para uma Todo List

## Resumo

Endpoints REST API em Spring Boot com autenticação JWT. Foi utilizado um banco de dados in-memory para teste dos dados.

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

### [GET] /jpa/users/${username}/todos 

#### Entrada JWT (Header)
Authorization Beares ${JWT_TOKEN}

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



#### Observações
Obrigado pela oportunidade do desafio. Infelizmente não tive como completá-lo em 48 horas. Mas foi uma boa oportunidade para aprender um framework novo (Laravel) e ainda iniciar sobre as técnicas de web scrapping.