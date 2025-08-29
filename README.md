![Calculadora Android](images/capa.png)

# 📱 Calculadora Android
Calculadora simples usando Kotlin e Android Studio 

---
## 🙋‍♂️ Sobre o projeto

Esse app foi desenvolvido como parte da disciplina **Programação para Dispositivos Móveis** no **IFSP - São Carlos**. 
A intenção era aplicar conceitos de interface, lógica e boas práticas com Kotlin.


## ✨ O que ela faz

- Soma, subtração, multiplicação e divisão
- Suporte a parênteses e ponto decimal
- Botão de apagar (`backspace`) e limpar tudo (`CE`)
- Mensagens de erro para casos como divisão por zero ou entrada inválida

---

## ⚙️ Tecnologias usadas

- **Kotlin** — linguagem principal
- **ViewBinding** — pra facilitar a ligação entre layout e código
- **[mxparser](http://mathparser.org/)** — biblioteca que interpreta as expressões matemáticas

---

## 📂 Estrutura básica

A lógica está toda na `MainActivity.kt`. Os botões da calculadora chamam a função `adicionarTexto()` pra montar a expressão, e quando o usuário aperta `=`, a expressão é avaliada com `mxparser`.

---

## 🧪 Como testar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/calculadora-android.git
