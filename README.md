## Algebraic API V 0.1

This app allows parsing of simple algebraic expressions. Parsing is done by antlr4 grammar which vas modified to allov
usage of `ABS(...) ` unary operator, also ensures commutativity and correct associativity of expression (which is
difference from original). Modified grammar can be found here `src/main/antlr4/Polynomial.g4` and originally was taken
from here:

[Davide Lettieri: polynomial grammar](https://davidelettieri.it/c%23/antlr/polynomial/2017/12/25/antlr-polynomial.html)

Functionality is delivered as spring boot server less app to run it please can use:

* on windows: `mvnw.cmd spring-boot:run`
* on linux: `mvnw.cmd spring-boot:run`

This requires some java runtime to be installed adn existence of `JAVA_HOME` environment property.

Then
access [http://localhost:8080](http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/expression/newEmployee)
where you can test the endpoint

![swgger-ui for polynomial api](assetes/swagger.png "Happy testing!")


