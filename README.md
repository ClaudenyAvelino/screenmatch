# Aula Prática: Criando a Classe `Filme` em Java com Orientação a Objetos

## Objetivo

Nesta aula, vamos aprender a **aplicar a orientação a objetos** para organizar e melhorar o código de uma aplicação. Usaremos a criação de uma classe `Filme` como exemplo para mostrar como centralizar informações e regras de negócios de maneira eficiente, facilitando a manutenção e a legibilidade do código.

---

### **1. Introdução à Orientação a Objetos**

A orientação a objetos é um paradigma de programação que permite organizar o código em **classes** e **objetos**, onde cada classe define as características e comportamentos de uma entidade, e os objetos são instâncias dessas classes.

### **2. Problema com Código Desorganizado**

Antes de usar orientação a objetos, quando espalhamos regras de negócios pelo código, como verificações e condições, o código se torna difícil de manter. Se precisar alterar uma regra, é necessário procurar em várias partes do código, o que pode gerar bugs.

### **3. Benefícios da Orientação a Objetos**

- **Encapsulamento**: As regras e dados são centralizados dentro de classes, evitando dispersão de lógica.
- **Abstração**: Podemos abstrair comportamentos e atributos comuns, tornando o código mais legível.
- **Reusabilidade**: Classes podem ser reutilizadas em diferentes partes do código.

---

### **4. Criando a Classe `Filme`**

Vamos criar uma classe chamada `Filme` para representar as informações de um filme. A classe irá conter atributos e métodos para manipular essas informações.

#### Atributos:
- `nome`: O nome do filme.
- `anoDeLancamento`: O ano em que o filme foi lançado.
- `incluidoNoPlano`: Indica se o filme está incluído no plano do usuário.
- `avaliacao`: A avaliação do filme, de 0 a 10.
- `totalDeAvaliacoes`: O número total de avaliações do filme.

#### Método:
- `estaIncluidoNoPlano()`: Método para verificar se o filme está incluído no plano do usuário.

```java
public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacoes;

    // Método para verificar se o filme está incluído no plano
    public boolean estaIncluidoNoPlano() {
        return incluidoNoPlano;
    }
}
