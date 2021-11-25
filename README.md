<h1>Desafio 8: :robot: :book:</h1> 
____________________________________________________________


<b>a) O que são exceptions?</b><br>
	R. é uma condição de erro ou comportamento inesperado encontrado por um programa em execução. Em Java, as exceções são objetos herdados da classe Excpetion e RunTimeException. Para o programa continuar, a exceção deve ser capturada e tratada.<br><br>


<b>b) Qual é o funcionamento do TRY, CATCH e FINALLY?</b><br>
	R: São blocos. O TRY recebe e representa o trecho de código a ser executado. A nomenclatura vem do inglês "tente". Então, "tente executar isso". O bloco CATCH representa uma execução caso o TRY falhe. Ele precisa ser específico de acordo com a exceção esperada no TRY. E, finalmente, o bloco FINALLY. Este contém o código a ser executado intependentemente de ter ocorrido uma exceção, ou não.<br><br>

<b>c) Qual a relação entre try, catch e finally com THROWS?</b><br>
	R: Usada na assinatura do método, o THROWS declara que o método pode lançar uma, ou várias exceções. Estas exceções estarão descritas e previstas dentro do bloco TRY, CATCH e, às vezes, FINALLY.<br><br>

<b>d) Para que serve a annotation @ExceptionHandler?</b><br>
	R: Anotação que serve para lidar com exceções em classes e métodos específicos. Os métodos que são anotados com esta anotação podem ter assinaturas muito flexíveis. Eles podem ter parâmetros de variados tipos, tais como um argumento de exceção; objetos de request ou response; Session Objects (como o HTTP Session) e outras.<br><br>

<b>e) Para que serve o comando THROW?</b><br>
	R: É usada para lançar explicitamente uma exceção de um método ou de qualquer bloco de código. Usada principalmente para lançar exceções personalizadas.<br><br>

<b>f) Para que serve a annotation @ControllerAdvice?</b><br>
	R: Essa anotação é usada para tratamento global de erros no aplicativo Spring MVC. Ela também tem controle total sobre o corpo da resposta e o código de status.<br><br>

<b>g) Crie o seguinte método na classe de serviço do lançamento:</b><br>

	Integer calculaMedia(Integer x, Integer y) {
		return (x/y)
	}
 	
III - quando dividi 10/0 estourou a exceção "java.lang.ArithmeticException: / by zero" e o programa parou de funcionar.<br><br>

VII - Conclusão sobre exceptions: é um método essencial na programação, pois captura os equívocos dos usuários ao alimentar o sistema com dados não esperados pelo mesmo. Ajuda no fluxo, na organização e na segurança do desenvolvimento de programas. 



