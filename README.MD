Portuguese:
# Exemplo de aplicação JEE6 utilizando Web Services

Exemplo de Aplicação Java JEE 6, utilizando Web Services SOAP e Restful, EJB 3 Stateless e JPA com Hibernate.

1 - Foi criado um projeto Maven do Eclipse, é só importar o projeto no Eclipse.  

2 - A aplicação primeiro tem de ser executada localmente para criar e popular as tabelas, com o persistence-des.xml 

3 - Deve-se renomear o arquivo persistence-des.xml para persistence.xml.

4 - Deve-se executar a classe CreateTabelas.java.

5 - Verificar se as tabelas da aplicação foram criadas e populadas.

6 - Deve-se renomear o arquivo persistence.xml para persistence-des.xml.

7 - Deve-se renomear o arquivo persistence-prod.xml para persistence.xml.

8 - Deve-se mapear as api's do Jboss no Eclipse para se utilizar da versão do Hibernate que está dentro dele, deve-se fazer o download da úlitma versão do driver jdbc do Mysql, e instalá-lo no Jboss EAP 6.4.

9 - Deve-se criar no Jboss EAP 6 ou versão superior, um datasource com o nome java:jboss/testejavaDS.

10 - Compilar a aplicação pelo Maven.

11 - Renomear o arquivo test-0.0.1.war para test.war para fazer o deploy no Jboss. 

12 - Baixar a última versão do Soapui para fazer o teste do WebService, a url é:
http://localhost:8080/test/TesteJavaEndPointService?wsdl

13 - Implementei também um serviço Rest, para fazer os testes do WebService, 
a url é:
http://localhost:8080/test/testejavarest/A/B
http://localhost:8080/test/testejavarest/C/D
http://localhost:8080/test/testejavarest/E/F
http://localhost:8080/test/testejavarest/G/H



English:
# Example of a JEE6 application using Web Services

Example of Java JEE 6 Application, using SOAP and Restful Web Services, EJB 3 Stateless and JPA with Hibernate.

1 - An Eclipse Maven project was created, just import the project into Eclipse.

2 - The application must first be run locally to create and populate the tables, with persistence-des.xml

3 - You must rename the persistence-des.xml file to persistence.xml.

4 - The CreateTables.java class must be executed.

5 - Check whether the application tables were created and populated.

6 - You must rename the persistence.xml file to persistence-des.xml.

7 - You must rename the persistence-prod.xml file to persistence.xml.

8 - You must map the Jboss api's in Eclipse to use the version of Hibernate that is inside it, you must download the latest version of the Mysql jdbc driver, and install it in Jboss EAP 6.4.

9 - A datasource must be created in Jboss EAP 6 or higher version with the name java:jboss/testejavaDS.

10 - Compile the application using Maven.

11 - Rename the test-0.0.1.war file to test.war to deploy it to Jboss.

12 - Download the latest version of Soapui to test the WebService, the url is:
http://localhost:8080/test/TesteJavaEndPointService?wsdl

13 - I also implemented a Rest service, to test the WebService,
the url is:
http://localhost:8080/test/testejavarest/A/B
http://localhost:8080/test/testejavarest/C/D
http://localhost:8080/test/testejavarest/E/F
http://localhost:8080/test/testejavarest/G/H
