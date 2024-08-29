# Front Gestão Vagas
![ThymeLeaf](https://img.shields.io/badge/ThymeLeaf-%2357A143.svg?style=for-the-badge&logo=thymeleaf&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

Interface completa do projeto de sistema de controle de empresas, vagas e aplicações. A interface foi construída utilizando Thymeleaf junto com o ecossistema Spring Boot. O sistema permite que o usuário crie seu cadastro para aplicar em vagas e que as empresas cadastrem novas vagas para realizar contratações.


<div>
  <table>
  <tr>
    <td><img src="img/cover.png" alt="Home page do projeto" width="570" height="350" ></td>
    <td><img src="img/search.png" alt="Home page do projeto" width="570" height="350" ></td>
  </table>
  </tr>
</div>


## Tabela de Conteúdos

- [Requisitos](#requisitos)
- [Instalação](#instalação)
- [Rotas](#rotas)
- [Tecnologias](#tecnologias)
- [Autor](#conecte-se-comigo)

## Requisitos

- Instale e configure a API [Gestão de Vagas](https://github.com/matheusgmello/gestao-vagas).

## Instalação

**Clone o projeto e acesse a pasta**

```bash
git@github.com:matheusgmello/front-gestao-vagas.git
```

- Instale as dependências com o Maven.
- Suba a aplicação com o Maven via terminal (`mvn spring-boot:run`)
- Acesse (`http://localhost:8082`)

## Rotas

### Candidato
- Área do candidato para realizar o login (`http://localhost:8082/candidate/login`).
- Área para efetuar a criação de conta (`http://localhost:8082/candidate/create`).
- Área do perfil do candidato (`http://localhost:8082/candidate/profile`).
- Área para realizar busca por vagas (`http://localhost:8082/candidate/jobs`).

### Empresa
- Área da empresa para realizar o login (`http://localhost:8082/company/login`).
- Área para efetuar a criação de conta (`http://localhost:8082/company/create`).
- Área para cadastrar uma nova vaga (`http://localhost:8082/company/jobs`).
- Área listando todas vagas publicadas pela empresa (`http://localhost:8082/company/jobs/list`).

## Tecnologias

- [ThymeLeaf](https://www.thymeleaf.org/)
- [Java](https://docs.oracle.com/en/java/javase/17/)
- [Spring](https://spring.io/projects/spring-boot/) 
- [Tailwind](https://tailwindcss.com/)
- [JWT](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/oauth2/jwt/Jwt.html)

## Conecte-se comigo
[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/matheusgmello)
[![Reddit](https://img.shields.io/badge/Reddit-%23FF4500.svg?style=for-the-badge&logo=Reddit&logoColor=white)](https://www.reddit.com/user/math7zw)
[![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)](https://github.com/matheusgmello/)