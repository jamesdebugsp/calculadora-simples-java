# 🧮 Calculadora Simples em Java

Este é um projeto básico em Java que realiza operações aritméticas simples entre dois números inteiros.

---

## ✨ Funcionalidades

- Soma (`+`)
- Subtração (`-`)
- Multiplicação (`*`)
- Divisão com ponto flutuante (`/`)
- Resto da divisão (`%`)

---

## 📂 Código-fonte

```java
public class CalculadoraSimples {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + ((double) a / b));
        System.out.println("Resto: " + (a % b));
    }
}
