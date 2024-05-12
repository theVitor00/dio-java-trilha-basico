# Conceitos de POO
___

À medida que a tecnologia vem evoluindo, as linguagens de programação tambpem, e é esta transição natural que determina 
quando estamos nos referindo a liguagem de baixo e alto nível.

-**Baixo nível:** São linguagens que estão mais próxima da interpretação da máquina diante do algoritmo desenvolvido. Exemplo: 
**Assembly** e **C**.

-**Alto nível:** São linguagem que disponibilizam uma proposta de sintaxe mais próxima de interpretação humana. Exemplo: 
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

## Programação Estruturada

A **Programação Estruturada** é um paradigma de programação que visa melhorar a clareza, a qualidade e o tempo de desenvolvimento
de um programa de computador, fazendo uso extensivo das construções de fluxo de controle estruturado de seleção (if/then/else)
e repetição (while/for), estruturas de bloco e subrotinas.

O que devemos ter em mente é que na programação  estruturada, implementamos algoritmos com estruturas sequenciais denominados
de procedimentos lineares. podendo afetar o valor das variáveis de escopo local ou global em uma aplicação.


## Programação Orientada a Objetos - POO

POO é um paradigma de programação baseado no conceito de _objetos_ que podem conter dados na forma de campos, também conhecidos
como atributos, e códigos na forma deprocedimentos, também conhecidos como métodos.

O que precisamos entender, é ue cada vez mais linguagens se adequam ao cenário real, proporcionando assim que o programador
desenvolva algoritmos mais próximos de fluxos comportamentais, logo, tudo ao nosso redor é representado como um Objeto.

    Enquanto a programação estruturada é voltada a procedimentos e funções definidas pelo usuário,
    a programação orientada a objetos é voltada a conceitos, como o de Classes e Objetos.


## Classes

Toda estrutura de código na linguagem Java é distribuído em arquivos com extensão *.java* denominados de **classes**. As
classes existentes em nossos projetos serão compostas por: **identificador**, **características** e **comportamentos**.
- **Classe** (class): A estrutura e ou representação que direciona a criação dos objetos de mesmo tipo;
- **Identificador** (identity): Propósito existencial aos objetos que serão criados;
- **Características** (states): Também conhecido como  **atributos** ou **propriedades**. É tpda informação que representa o estado do objeto;
- **Comportamentos** (behavior): Também conhecido como **ações** ou **métodos**. É toda a parte comportamental que um objeto dispõe;
- **Instanciar** (new): É o ato de criar um objeto à partir de uma estrutura definida em uma classe.

![img_1.png](img_1.png)


Seguindo algumas conveções, as nossas classes são classificadas como:
- **Classe de Modelo** (model): Classes que representem a estrutura de domínio da aplicação, como por exemplo: Cliente, Pedido, NotaFiscal, etc.;
- **Classe de Serviço** (service): Ckasses que contém regras de negócio e validação de nosso sistema;
- **Classe de Repositório** (repository): Classes que contém uma integração com Banco de Dados;
- **Classe de Controle** (controller): Classes que possuem a finalidade de disponibilar alguma cominação externa para a nossa aplicação, como _http_ _web_ e _webservices_;
- **Classe Utilitária** (util): Classe que contem recursos comuns à toda nossas aplicação.

![img_2.png](img_2.png)