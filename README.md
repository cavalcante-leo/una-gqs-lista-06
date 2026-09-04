# Fibonacci em Java

Implementação simples e iterativa da sequência de Fibonacci.

## Descrição

Gera os primeiros `n` termos da sequência de Fibonacci utilizando um laço `for`, sem recursão. Evita overflow de pilha (stack overflow) para valores grandes de `n` e roda em complexidade **O(n)**.

## Como executar

```bash
javac Fibonacci.java
java Fibonacci
```

## Saída esperada

```
Sequência de Fibonacci: 0 1 1 2 3 5 8 13 21 34
```

## Configuração

Para alterar a quantidade de termos gerados, edite o valor da variável `n` no método `main`:

```java
int n = 10; // quantidade de termos
```

## Complexidade

- **Tempo:** O(n)
- **Espaço:** O(1)

---

#### By Leandro Cavalcante