# BootCamp Dio.Me Java Developer

- Maven 3.9.9
- Java 17
- SpringBoot 3.4.2

## Maven Wrapper
O Maven Wrapper permite que o projeto tenha uma versão específica do Maven embutida, sem que os desenvolvedores precisem instalá-la manualmente. Isso facilita a padronização do ambiente de desenvolvimento.

Comando: 
``` sh
mvn -N io.takari:maven:wrapper
```

Ele cria os seguintes arquivos no seu projeto:

- `mvnw.cmd` → Scripts para executar o Maven sem precisar instalá-lo.
- `maven-wrapper.jar` e `maven-wrapper.properties` (dentro de .mvn/wrapper/) → Definem qual versão do Maven deve ser baixada e usada no projeto.   

## Java

Rodar app no cmd:
``` sh
java -jar target/projeto-inicial-0.0.1-SNAPSHOT.jar
```