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



## Escopo

O escopo pode ser entendido como o ambiente onde uma variável pode ser acessada.
Em Java, o escopo de variáveis **vai de acordo com o bloco onde ela foi declarada.**

A variável é criada no primeiro acesso à ela, se tornando inacessível após o interpretador sair do bloco
de execução ao qual ela pertence. Portanto, esta variável não pode ser lida ou manipulada por rotinas
e códigos que estão fora do seu bloco de delaração, ou seja, fora do escopo da variável.

Em uma Classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo
principal da Classe, sendo portanto **acessíveis por todos os métodos**.

Caso você declare uma variável DENTRO DE UM MÉTODO, o escopo dessa variável está **limitado apenas
ao corpo desse método**, ou seja, dentro das chaves que limitam o método.

Uma parte fundamental na elaboração de algoritmos simples ou complexos é determinar a localização
do código em questão. Sem um domínio sobre o escopo de códigos seu projeto tende a conter falhas estruturais e
comprometer a proposta principal da aplicação.



## Palavras Reservadas


Palavras reservadas são identificadores de uma linguagem que já possuem uma finalidade específica,
portanto não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.

A linguagem Java possui **52 palavras reservadas**. Todas essas palavras são classificadas em grupos e
**escritas com letra minúscula**, sendo identificadas com uma cor especial pela maioria das IDE's. Abaixo
temos a lista de palavras agrupadas por sua finalidade

### Palavras reservadas em Java:

| | | | | |
| --- | --- | --- | --- | --- |
| abstract | continue | goto | package | synchronized |
| assert | default | if | private | this |
| boolean | do | implements | protected | throw |
| break | double | import | public | throws |
| byte | else | instanceof | return | transient |
| case | extends | int | short | try |
| catch | final | interface | static | void |
| char | finally | long | strictfp | volatile |
| class | float | native | super | while |
| const | for | new | switch | - | 


>#### Controle de pacotes

**import:** importa pacotes ou classes para dentro do código.

**package:** especifica a qual pacote todas as classes de um arquivo pertencem.



#### Modificadores de acesso

**public:** acesso de qualquer classe

**private:** acesso apenas dentro da classe

**protected:** acesso por classes no mesmo pacote e subclasses



>#### Primitivos

**boolean**: um valor indicando _verdadeiro_ ou _falso_

**byte:** um inteiro de 8 bits _(signed)_

**char:** um caractere unicode _(16-bit unsigned)_

**double:** um número de ponto flutuante de 64 bits _(signed)_

**float:** um número de ponto flutuante de 32 bits _(signed)_

**int:** um inteiro de 32 bits _(signed)_

**long:** um inteiro de 64 bits _(signed)_

**short:** um inteiro de 32 bits _(signed)_

**void:** indica que o método não tem retorno de valor



>#### Modificadores de classes, variáveis ou métodos

**abstract:** classe que não pode ser instanciada ou método que precisa ser implementado por
uma subclasse não abstrata

**class:** especifica uma classe

**extends:** indica a superclasse que a subclasse está estendendo

**final:** impossibilita que uma classe seja estendida, que um método seja sobrescrito por uma subclasse,
que valores de variáveis sejam alterados, ou para criar objetos com atributos imutáveis

**implements:** indica as interfaces que uma classe irá implementar

**interface:** especifica uma interface

**native:** indica que um método está escrito em uma linguagem dependente de plataforma, como o C

**new:** instancia um novo objeto, chamando seu construtor

**static:** faz um método ou variável pertencer à classe ao invés de às instâncias

**strictfp:** usado em frente a um método ou classe para indicar que os números de ponto
flutuante seguirão as regras de ponto flutuante em todas as expressões

**synchronized:** indica que um método só pode ser acessado por uma thread de cada vez

**transient:** impede a serialização de campos

**volatile:** indica que uma variável pode ser alterada durante o uso de threads



>#### Controle de fluxo dentro de um bloco de código

**break:** sai do bloco de código em que ele está

**case:** executa um bloco de código dependendo do teste do _switch_

**continue:** pula a execução do código que viria após essa linha e vai para a próxima
passagem do loop

**default:** executa esse bloco de código caso nenhum dos teste de switch-case seja verdadeiro;

**do:** executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para 
determinar se o bloco deverá ser executado novamente;

**else:** executa um bloco de código alternativo caso o teste "if" seja falso;

**for:** usado para realizar um loop condicional de um bloco de código;

**if:** usado para realizar um teste lógico de verdadeiro ou falso;

**instanceof:** determina se um objeto é uma instância de determinada classe, superclasse ou interface;

**return:** retorna um método sem executar qualquer código, que venha depois desta linha (também pode retornar uma variável);

**switch:** indica a variável a ser comparada nas expressões case;

**while:** executa um bloco de código repetidamente enquanto a condição for verdadeira.



>#### Tratamento de erros

**assert:** testa uma expressão condicional, para verificar uma suposição do programador;

**catch:** declara o bloco de código usado para tratar uma exceção;

**finally:** bloco de código, após um try-catch, que é executado independentemente do fluxo de programa 
seguido ao lidar com uma exceção;

**throw:** usado para passar uma exceção para o método que o chamou;

**throws:** indica que um método pode passar uma exceção para o método que o chamou;

**try:** bloco de código que tentará ser executado, mas que pode causar uma exceção.



>#### Variáveis de referência

**super:** refere-se a superclasse imediata;

**this:** refere-se a instância atual do objeto.



>#### Palavras reservadas não utilizadas

**const:** Não utilize para declarar constantes; use public static final;

**goto:** não implementada na linguagem Java, por ser considerada prejudicial.



>#### Literais reservados

De acordo com a Java Language Specification, **null**, **true** e **false** são
tecnicamente chamados de valores literais, e não keywords. Se você tentar criar 
algum identificador com estes valores, você também terá um erro de compilação.




## Documentação

Uma das maiores caracterpisticas da linguagem Java é que desde suas primeiras versões
tínhamos em nossas mãos uma documentação rica e detalhada dos recursos da linguagem.

Conforme site oficial, podemos compreender e explorar todos os recursos  organizados por
pacotes e classes bem específicas sem nem mesmo escrever uma linha de código.

Hoje costuma-se afirnmar que para se tornar um desenvolvedor nível avançado, é um requisito
imprescindível adquirir a habilidade de compreender a documentação oficial da linguagem e dos
frameworks que são incorporados nos projetos atuais.

### Tags

Mais e quais as informações que obtemos através de classes documentadas na linguagem? Java Documentation
é composto por tags que representam dados relevantes para a compreensão por tags que representam
dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos
conforme a tabela abaixo:



| Tag | Descrição |
| ---- | ---- |
| @autor | Autor/Criador |
| @version | Versão do recurso disponibilizado |
| @since | Versão/Data de início da disponibilização do recurso |
| @param | Descrição do parâmetro do método |
| @return | Definição do tipo de retorno do método |
| @throws | Se o método lança alguma exceção |


## Javadoc

**Javadoc** é um gerador de documentação criado pela _Sun Microsystems_, para documentar a API
dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML. É constituído basicamente
por algumas marcações muito simples inseridas nos comentários do programa.

Este sistema é o padrão de documentação de classes em Java, onde muitas das IDEs desta linguagem irão
automaticamente gerarmum Javadoc em HTML

_No terminal, execute o comando:_
```
javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
```


## Terminal e Argumentos

Nem sempre executamos nosso programa Java pela IDE. Já pensou osso clientes tendo que instalar
o Eclipse ou o VsCode par rodar o sistema em sua empresa?

Como a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar
o instalador para qualquer sistema operacional. No nosso caso, iremos aprender como executar um programa Java via terminal,
como MS-DOS ou terminal no VS-Code.


### Argumentos

Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array []
de argumentos, do tipo String. Logo, podemos após a definição da classe a ser executada, informar
esses parâmetros.



## Estruturas Condicionais

A Estrutura Condicional possibilita a escolha de um grupo de ações e comportamentos a serem executadas quando determinadas
condições e comportamentos a serem executadas quando determinadas condições são ou não satisfeitas.
A estrutura condicional pode ser **Simples** ou **Composta**. 

- **Condicionais Simples:** Quando ocorre uma validação de execução de fluxo somente quando a condição for positiva, consideramos
como uma estrutura Simples.

- **Condicionais Compostas:** Algumas vezes o programa deverá seguir mais de uma jornada de execução condicionado a uma regra de 
negócio, este cenário é denominado **Estrutura Condicional Composta**.

**OBS:** Em controle de fluxo condicional, nem sempre nos limitamos ao _if/else_, podemos ter uma terceira, quarta
ou inúmeras condições.


### Condição ternária


Como vimos em Operadores, podemos abreviar nosso algorítmo condicional, refatorando com o conceito de
operador ternário:

	(condição) ? instrucao-caso-true : instrucao-caso-false;



## Switch-Case

A estrutura **switch** compara o valor de cada caso com o da variável sequencialmente, e sempre que se encontra um valor
correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas após um caso correspondente
ter sido encontrado, acrescentamos o comando **break** no final de cada bloco de códigos. O comando **break** 
quando executado, encerra a execução da estrutura onde ele  se encontra.



## Estruturas de Repetição

Laços de repetição, também conhecidos como laços de iteração ou simplesmente **loops**, são comandos que perimtem iteração 
de código seja, que comandos presentes no bloco sejam repetidos diversas vezes.
Estruturas de repetição são representadas pelas seguintes estruturas:
- **for**;
- **while**;
- **do-while**;


### for


O comando **for** permite que uma variável contadora seja testada e incrementada a cada iteração, sendo essas informações
definidas na chamada do comando.O comando for recebe como entrada uma variável contadora, a condição e o valor de incremento.
A estrutura do controle de repetição **for** é exibida abaixo:
```
for (bloco_de_inicializacao; expressao_booleana_de_validacao; bloco_de_incremento) {
	// comando que será executado até que a
	// expressão de validação se torne falsa
}
```

#### break e continue

**Break** significa quebrar, parar, frear, interromper. E é isso que se faz quando o Java encontra esse comando pela frente. **Continue**
, como o nome diz, dá prosseguimento ao laço. O comando **break** interrompe o laço, já o **continue** interrompe somente
a iteração atual.


### while

O laço **while** determina que enquanto uma condição for válida, o bloco será executado. O laço **while** testa a condição antes de
executar o código, logo, caso a condição seja inválida no primeiro teste, o bloco nem será executado.


### do while

O laço **do - while**, assim como o laço while, considera que enquanto uma determinada condição
for válida, o bloco de código será executado. entretanto, **do - while** testa a condição após executar o código, sendo
assim, mesmo que a condição seja considerada inválida no primeiro teste, o bloco
será executado pelo menos uma vez.
