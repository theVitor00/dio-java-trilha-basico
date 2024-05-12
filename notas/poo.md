# Conceitos de POO
___

� medida que a tecnologia vem evoluindo, as linguagens de programa��o tambpem, e � esta transi��o natural que determina 
quando estamos nos referindo a liguagem de baixo e alto n�vel.

-**Baixo n�vel:** S�o linguagens que est�o mais pr�xima da interpreta��o da m�quina diante do algoritmo desenvolvido. Exemplo: 
**Assembly** e **C**.

-**Alto n�vel:** S�o linguagem que disponibilizam uma proposta de sintaxe mais pr�xima de interpreta��o humana. Exemplo: 
**Java**, **JavaScript**, **Python** e **C+**

Exemplo simples de _Hello world_ em **Assembly** e em **Python**:

**ASSEMBLY**
```
section .text
    global _start
_start:
    mov edx, len
    mov ecx, msg
    mov ebx, 1
    mov eax, 4
    int 0x80
    mov eax, 1
    int 0x80
section .data
msg db 'Hello, world!', 0xa
len equ $ - msg
```

**PYTHON**
```
print("Hello, world!")
```

## Programa��o Estruturada

A **Programa��o Estruturada** � um paradigma de programa��o que visa melhorar a clareza, a qualidade e o tempo de desenvolvimento
de um programa de computador, fazendo uso extensivo das constru��es de fluxo de controle estruturado de sele��o (if/then/else)
e repeti��o (while/for), estruturas de bloco e subrotinas.

O que devemos ter em mente � que na programa��o  estruturada, implementamos algoritmos com estruturas sequenciais denominados
de procedimentos lineares. podendo afetar o valor das vari�veis de escopo local ou global em uma aplica��o.


## Programa��o Orientada a Objetos - POO

POO � um paradigma de programa��o baseado no conceito de _objetos_ que podem conter dados na forma de campos, tamb�m conhecidos
como atributos, e c�digos na forma deprocedimentos, tamb�m conhecidos como m�todos.

O que precisamos entender, � ue cada vez mais linguagens se adequam ao cen�rio real, proporcionando assim que o programador
desenvolva algoritmos mais pr�ximos de fluxos comportamentais, logo, tudo ao nosso redor � representado como um Objeto.

    Enquanto a programa��o estruturada � voltada a procedimentos e fun��es definidas pelo usu�rio,
    a programa��o orientada a objetos � voltada a conceitos, como o de Classes e Objetos.


## Classes

Toda estrutura de c�digo na linguagem Java � distribu�do em arquivos com extens�o *.java* denominados de **classes**. As
classes existentes em nossos projetos ser�o compostas por: **identificador**, **caracter�sticas** e **comportamentos**.
- **Classe** (class): A estrutura e ou representa��o que direciona a cria��o dos objetos de mesmo tipo;
- **Identificador** (identity): Prop�sito existencial aos objetos que ser�o criados;
- **Caracter�sticas** (states): Tamb�m conhecido como  **atributos** ou **propriedades**. � tpda informa��o que representa o estado do objeto;
- **Comportamentos** (behavior): Tamb�m conhecido como **a��es** ou **m�todos**. � toda a parte comportamental que um objeto disp�e;
- **Instanciar** (new): � o ato de criar um objeto � partir de uma estrutura definida em uma classe.

![img_1.png](img_1.png)


Seguindo algumas conve��es, as nossas classes s�o classificadas como:
- **Classe de Modelo** (model): Classes que representem a estrutura de dom�nio da aplica��o, como por exemplo: Cliente, Pedido, NotaFiscal, etc.;
- **Classe de Servi�o** (service): Ckasses que cont�m regras de neg�cio e valida��o de nosso sistema;
- **Classe de Reposit�rio** (repository): Classes que cont�m uma integra��o com Banco de Dados;
- **Classe de Controle** (controller): Classes que possuem a finalidade de disponibilar alguma comina��o externa para a nossa aplica��o, como _http_ _web_ e _webservices_;
- **Classe Utilit�ria** (util): Classe que contem recursos comuns � toda nossas aplica��o.

![img_2.png](img_2.png)