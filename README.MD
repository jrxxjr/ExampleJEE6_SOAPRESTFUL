# Exemplo de aplicação JEE6 utilizando Web Services

Exemplo de Aplicação Java JEE 6, utilizando Web Services SOAP e Restful, EJB 3 Stateless e JPA com Hibernate.

1 - Foi criado um projeto Maven do Eclipse, é só importar o projeto no Eclipse.  

2 - A aplicação primeiro tem de ser executada localmente para criar e popular as tabelas, com o persistence-des.xml 

3 - Deve-se renomear o arquivo persistence-des.xml para persistence.xml.

4 - Deve-se executar a classe CreateTabelas.java.

5 - Verificar se as tabelas da aplicação foram criadas e populadas.

6 - Deve-se renomear o arquivo persistence.xml para persistence-des.xml.

7 - Deve-se renomear o arquivo persistence-prod.xml para persistence.xml.

8 - Deve-se mapear as api's do Jboss no Eclipse para se utilizar da versão do hibernate que está dentro dele, deve-se fazer o download da úlitma versão do driver jdbc do Mysql, e instalá-lo no Jboss EAP 6.4.

9 - Deve-se criar no Jboss EAP 6 ou versão superior, um datasource com o nome java:jboss/testejavaDS.

10 - Compilar a aplicação pelo Maven.

11 - Renomear o arquivo test-0.0.1.war para test.war para fazer o deploy no Jboss. 

12 - Baixar a última versão do Soapui para fazer o teste do WebService, a url é:
http://localhost:8080/test/TesteJavaEndPointService?wsdl.

13 - Implementei também um serviço Rest, para fazer os testes do WebService, 
a url é:
http://localhost:8080/test/testejavarest/A/B
http://localhost:8080/test/testejavarest/C/D
http://localhost:8080/test/testejavarest/E/F
http://localhost:8080/test/testejavarest/G/H
