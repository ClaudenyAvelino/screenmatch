# Aula Prática: Criando a Classe `Filme` em Java com Orientação a Objetos

## Objetivo
Aplicar a orientação a objetos para organizar e melhorar o código, utilizando a criação de uma classe `Filme` como exemplo. O objetivo é centralizar informações e regras de negócios de maneira eficiente, melhorando a manutenção e legibilidade do código.

---

## Conteúdo Programático

### 1. Introdução à Orientação a Objetos
- Conceitos de classes e objetos.
- Diferença entre orientação a objetos e programação procedural.
- Benefícios da orientação a objetos no desenvolvimento de software.

### 2. Desafios com Código Desorganizado
- Explicação do problema de código desorganizado, com regras de negócios espalhadas por todo o código.
- Como a manutenção e evolução do código ficam mais difíceis sem a aplicação de boas práticas de organização.

### 3. Benefícios da Orientação a Objetos
- **Encapsulamento**: Centralização de dados e regras dentro de classes.
- **Abstração**: Simplificação de comportamentos comuns.
- **Reusabilidade**: Criação de classes reutilizáveis em diferentes partes do código.

---

## Histórico de Commits

### 1. [Adiciona classe Filme com atributos básicos](https://github.com/ClaudenyAvelino/screenmatch/commit/commit_id)
- Criação inicial da classe `Filme`.
- Atributos: `nome`, `anoDeLancamento`, `incluidoNoPlano`, `avaliacao`, `totalDeAvaliacoes`.
- Definição do método `estaIncluidoNoPlano()` para verificar se o filme está incluído no plano de assinatura.

### 2. [Adiciona método para calcular média de avaliações](https://github.com/ClaudenyAvelino/screenmatch/commit/commit_id)
- Implementação do método `calcularMediaAvaliacoes()`.
- Cálculo da média de avaliações baseadas nas avaliações e total de avaliações feitas no filme.

### 3. [Refatora código de inclusão no plano](https://github.com/ClaudenyAvelino/screenmatch/commit/commit_id)
- Refatoração do método `estaIncluidoNoPlano()`, tornando-o mais eficiente e claro.
- Adição de novos atributos e validações para garantir maior controle sobre o estado do filme no plano.

### 4. [Adiciona testes unitários para a classe Filme](https://github.com/ClaudenyAvelino/screenmatch/commit/commit_id)
- Implementação de testes unitários para verificar se os métodos `estaIncluidoNoPlano()` e `calcularMediaAvaliacoes()` funcionam corretamente.
- Utilização do JUnit para garantir a qualidade e o funcionamento adequado do código.

### 5. [Melhora a documentação e formatação do código](https://github.com/ClaudenyAvelino/screenmatch/commit/commit_id)
- Melhorias na documentação dos métodos e atributos da classe `Filme`.
- Adoção de convenções de nomenclatura para garantir maior legibilidade do código.

---

## Exercícios Práticos
- Criar novos filmes e verificar se estão incluídos no plano.
- Implementar métodos adicionais, como alterar o status de inclusão no plano ou adicionar novas avaliações.
- Escrever testes unitários para validar os métodos criados.
