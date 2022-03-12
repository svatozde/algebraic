## Algebraic API V 0.1

This app allows parsing of simple algebraic expressions. Parsing is done by antlr4 grammar which vas modified to allov
usae of `ABS(...) ` unary operator also ensures comutativity and correct asociativity of expression. gramar can be foudn
here `src/main/antlr4/Polynomial.g4` and originaly was taken from here:

[Davide Lettieri: polynomial grammar](https://davidelettieri.it/c%23/antlr/polynomial/2017/12/25/antlr-polynomial.html)

Functionality is delivered as spring boot server less app to run it u can use:

* on windows: `mvnw.cmd spring-boot:run`
* on linux: `mvnw.cmd spring-boot:run`

Then
access [http://localhost:8080](http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/expression/newEmployee)
where you can test the endpoint

![alt text for screen readers](assetes/swagger.png "Text to show on mouseover")


