<h2>Desafio 10 - Cybertron :robot: :book:</h2>
____________________________________________________________

<b>A) O que você entende por Spring Framework?</b><br>
R: Spring é um framework voltado à linguagem Java, que auxilia no desenvolvimento de um software, haja visto ele ter anotações que agilizam e simplificam a implementação na hora da codificação, como por exemplo a criação de getter e setter, a integração com o banco de dados, a injeção de dependências, entre outras coisas.<br><br>

<b>B) Cite 3 exemplos de ferramentas Spring e suas respectivas finalidades:</b><br>

<li>* O Spring Boot Starter é o coração de uma aplicação Spring. Sua função principal é combinar as várias dependências advindas de um projeto Spring Boot em uma única dependência, retirando-se a necessidade de configuração de múltiplas dependências no Maven ou no Gradle.</li>

<li>* O Spring Boot Dev Tools executa uma série de autoconfigurações, incluindo memória cache para melhorar a performance da aplicação. Outra propriedade é o restar automático da aplicação.</li>

<li>* O Spring DATA JPA tem por objetivo facilitar nosso trabalho com persistência de dados de uma forma geral. Ele faz isso nos liberando de ter que implementar as interfaces dos repositórios, e também já deixando pré-implementado algumas funcionalidades como, por exemplo, de ordenação das consultas e de paginação de registros.</li><br><br>

<b>C) Quais ferramentas do Spring foram utilizadas na trilha até o momento?</b><br>
R: Spring Boot Starter, DevTools, Startes Web, Starter Test, Starter Data JPA, H2, Swagger2, Lombok, Hibernate, Maven.<br><br>

<b>D) Cite 5 vantagens em utilizar Spring:</b><br>
R: Reduz drasticamente o tempo de desenvolvimento, aumenta a produtividade, configura todos os componentes de um aplicativo 'automaticamente', tem servidores HTTP imbutidos para teste de web, facilita os testes de bancos de dados com estes incorporados	(como o H2).<br><br>	

<b>E) Descreva os passos de criação de uma WEB API Spring boot, com conexão com SQL Server;</b><br>
R: Primeiramente, você pode entrar no site do spring initiazlizer e escolher as versões do Java e do Maven, assim como dar o nome ao projeto. Ainda no initializer, há a possibilidade de escolher as dependências. Já ali, é possível escolher a Spring Web, que auxilia na criação de Web Api's; Sprin Dev Tools, cuja principal função é agilizar a reinicialização da aplicação depois de modificar o código; a dependencia do Spring Data JPA, pra fazer a conexão com o banco de dados. Há ainda outras dependências que auxiliam muito na hora de codificar, mas essas são as principais quando se fala em WEB API. Depois de selecionar as dependências, é só clicar em GENERATE. Vai iniciar o dowload .zip do modelo do projeto com as dependências. Depois de baixado, é só descompactar o arquivo .zip e abri-lo na sua IDE favorita. <br><br>

<b>F) Qual a funcionalidade do pom.xml?</b><br>
R: O pom é responsável em organizar e inserir as dependências que são utilizadas pelo Spring. <br><br>

<b>G) Qual a funcionalidade do applications.properties?</b><br>
R: É a camada da aplicação onde se configura as propriedades do programa. Por exemplo, na application é possível configurar qual vai ser a porta que o programa vai utilizar para se comunicar como banco de dados. <br><br>

<b>H) Qual o propósito das Annotations?</b><br>
R: As annotations são métodos e funções já pré-desenvolvidos e imbutidos no framework que podem ser chamados nas classes, objetos e métodos, automatizando a utilização dos mesmos. Sendo assim, a aplicação fica mais segura, padronizada e como desenvolvimento mais ágil. Quando se fala de Java "puro", as annotations também estão presentes e estão divididas em três grupos: Instruções em tempo de compilação (CLASS): tem como objetivo gerar códigos fonte em tempo de compilação; Instruções em tempo de construção (SOURCE): tem como objetivo gerar empacotamento de arquivos e Instruções em tempo de execução(RUNTIME): tem como objetivo criar validações ou injetar informações em tempo de execução.<br><br>

<b>I) Cite 10 annotations, com suas respectivas finalidades e descreva ou desenhe um cenário exemplificando a sua utilização:</b><br>

<li>1 @Configuration: É uma annotation que indica que determinada classe possui métodos que expõe novos beans.</li>

<li>2 @Controller: Associada com classes que possuem métodos que processam requests numa aplicação web. </li>

<li>3 @Repository: Associada com classes que isolam o acesso aos dados da sua aplicação. Geralmente associada a DAO’s.</li>

<li>4 @Service: Associada com classes que representam a ideia do Service do DDD. Fica na classe que é responsável em ter os métodos que controlam as regras de negócios da aplicação.</li>

<li>5 @Component: A annotation básica que indica que uma classe vai ser gerenciada pelo container do Spring. Dela derivam as classes mencionadas anteriormente.</li>

<li>6 @Bean: Anotação utilizada em cima dos métodos de uma classe, geralmente marcada com @Configuration, indicando que o Spring deve invocar aquele método e gerenciar o objeto retornado por ele. Dessa forma, este objeto pode ser injetado em qualquer ponto da sua aplicação.</li>

<li>7 @RequestMapping: Uilizada em cima dos métodos de uma classe anotada com @Controller. Serve para você colocar os endereços da sua aplicação que, quando acessados por algum cliente, deverão ser direcionados para o determinado método. Por exemplo, colocando ("/endereco") como endpoint.</li>

<li>8 @ResponseBody: Utilizada em métodos anotados com @RequestMapping para indicar que o retorno do método deve ser automaticamente escrito na resposta para o cliente. Muito comum quando queremos retornar JSON ou XML em função de algum objeto da aplicação.</li>

<li>9 @SpringBootApplication: Para quem usa Spring Boot, essa é uma das primeiras que você. Ela engloba a @Component, @ComponentScan e mais uma chamada @EnableAutoConfiguration, que é utilizada pelo Spring Boot para tentar advinhar as configurações necessárias para rodar o seu projeto.</li>

<li>10 @ EnableSwagger2: É a anotação que habilita a utilização do testador Swagger2. Introduzida na classe de configuração do Swagger.</li><br><br>

<b>J) O que é um advice em Spring? Quais os tipos de advice para o Spring?</b><br>
R: Advice faz parte do AOP - Aspect Object Programming. Ele é uma ação realizada por um aspecto em um ponto de junção específico. Sua função é oferecer suporte a questões transversais, como registro, criação de perfil, armazenamento em cache e gerenciamento de transações.  	
São estes os tipos de Advice: before: executa antes do método; after: faz o advice depois da execução do método, não importando seu resultado; after-returning: roda o advice depois da execução do método, se esse rodar sem problemas; after-throwing: roda o advice depois de executar o método, somente se este terminar após lançar uma exceção; around: roda o advice antes e depois do método ser invocado.<br><br>

<b>K) O que é Spring IoC Container?</b><br>
R: É um Container de Inversão de Controle. Ou seja, o prórprio Spring exerce essa função, uma vez que ele sabe criar o objeto, mas também faz a ligação das dependências. Como o Spring está no controle, ele administra todo o ciclo da vida do programa. Só que, para isso acontecer, é preciso definir pelo menos algumas configurações tais como declarar o objeto como componente e ligar a dependência no pom, por exemplo.<br><br>

<b>L) Como adicionamos segurança à nossa aplicação Spring?</b><br>
R: Existem várias maneiras, como por exemplo utilizando Desing Patterns, utilizando camadas que protegem o código. De maneira mais direta e prática, ainda podemos utilizar a autenticação do HTTP Basic, através do Spring Security.<br><br>

<b>M) Qual é o pacote Spring responsável pelas conexões com os bancos de dados?</b><br>
R: <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency><br><br>

<b>N) Explique e exemplifique como criar um agendamento de execução de métodos Spring; Cite exemplos de usabilidade:</b><br>
R: Utilizando as annotations @Schedule e @EnableScheduling. Poderia, por exemplo, criar uma periodização de verificação de banco de dados para ver o fluxo de vendas a cada hora, ou dia, ou ainda a um horário específico. 
