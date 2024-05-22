
# Desafio back-end java/Spring frases famosas

## Frases famosas dos filme e serie que marcaram nossa vida

### Usando Banco de dados postgresql

- Documentação [postgresql](https://www.postgresql.org/docs/)

- projeto [MVC](https://www.alura.com.br/apostila-java-web/mvc-model-view-controller)
- ![image](https://github.com/JonasSMendes/freses-filmes-series/assets/119429346/7433a7af-8684-493f-be07-782568301f47)

- Front-end do desafio [Alura](https://github.com/jacqueline-oliveira/3356-java-desafio-front)
- ![image](https://github.com/JonasSMendes/freses-filmes-series/assets/119429346/282d4ef2-e0cb-4545-b382-c95aa5560b46)


### Aplicabilidade do banco de dados

Como o desafio foi feito em postgress, a pasta application.properties precisa ser preenchida com os seus dados do banco:

* spring.datasource.url=jdbc:postgresql://${DB_HOST -- seu localhost}/freses-filmes
* spring.datasource.username=${DB_USERNAME -- nome}
* spring.datasource.password=${DB_PASS -- senha}
* spring.datasource.driver-class-name=org.postgresql.Driver
* hibernate.dialect=org.hibernate.dialect.HSQLDialect






