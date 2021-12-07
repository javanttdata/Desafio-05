<h2>Desafio 12 - Cybertron :robot: :books:</h2>
____________________________________________________________

<b>A) Explique o conceito de teste unitário:</b><br>

R: Teste unitário é testar de forma automatizada a menor unidade possível de um código pra ver sua corretude. No caso de linguagens Orientadas a Objetos, como é o caso do Java, estamos falando em testar os métodos das classes. <br><br>

<b>B) Descreva como fazer um código de teste</b><br>

R: É necessário criar uma classe no pacote de testes do Spring Boot. Nessa classe, é preciso inserir anotações da framework de testes escolhido, por exemplo o @Mock. Essa anotação serve para virtualizar a classe e rodar o teste nessa classe virtual. Existe também a anotação @Teste que vai acima do método de teste propriamente dito. Nessa classe o desenvolvedor passa os valores e os campos a serem testados e também as exceções que ele espera quando da execução do código. Depois, é necessário especificar o comportamento do teste, com o "When" e o "Then". Neste, uma possibilidade é utirlizar os "Assertions"  para configurar os retornos como False, True, Equals, etc.<br><br>

<b>C) Com qual objetivo criamos os testes unitários?</b><br>

R: Com o objetivo de testar a funcionalidade e o retorno dos métodos das classes da API, provendo assim maior confiabilidade e segurança da aplicação. Além disso, amplifica a manutenibilidade, pois serve também como documentação para desenvolvedores novos no projeto.<br><br>

<b>D) Cite 2 ferramentas que são utilizadas para execução dos testes.</b><br>

R: JUnit e Mockito<br>

