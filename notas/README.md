# Notas sobre o curso
_Notas iniciadas nas nas aulas sobre Métodos, na parte básica do curso Java da DIO_


**OBS.:** Algumas dessas notas são transcrições diretas dos slides das aulas.

## Métodos


	>Caso o método não retorne nenhum valor, ele será representado pela palavra chave _void_

1. **Quais os parâmetros serão necessários para a execução do método?** Os métodos às vezes precisam de
argumentos como critérios para a sua execução.

2. **O método possui o risco de apresentar alguma exceção?** Exceções são comuns na execução de métodos, 
às vezes é necessário prever e tratar a possível existência de uma exceção.

3. **Qual é a visibilidade de um método?** Será necessário que o método seja visível a toda aplicação, somente
em mesmo pacotes, através de herança ou somente visível na própria classe.
	- **private** - O método fica visível somente dentro da classe na qual ele é declarado.
	- **public** - O método é acessível por outras classes fora daquela na qual ele é declarado.

### Exercitando
Solução em: _/metodos/src/SmartTv.java_

Vamos criar um exemplo de uma classe para representar uma SmartTV onde:

1. Ela tenha as características:  _ligada_(boolean), _canal_(int) e _volume_(int);
2. Nossa TV poderá ligar e desligar e assim mudar o estado _ligada_;
3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número corresondente.





