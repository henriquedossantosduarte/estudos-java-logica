# estudos-java-logica

# Validador de E-mail (Java)

Exercício de lógica em Java para treinar validação de entrada do usuário usando `do-while`, métodos de `String` e operador ternário.

## 🎯 Objetivo
Solicitar um e-mail ao usuário e validar algumas regras antes de aceitar a entrada.

## ✅ Regras de validação
O programa só aceita o e-mail quando:

1. O texto contém o caractere `@`  
   - verificação com `indexOf("@")`
2. A parte antes do `@` (usuário) possui pelo menos **5 caracteres**  
   - verificação com `length()`

Quando o e-mail é validado:
- O programa separa usuário e domínio com `split("@")`
- Usa um **ternário** para classificar:
  - `gmail.com` → **E-mail pessoal**
  - qualquer outro domínio → **E-mail corporativo**

## 🧠 Conceitos praticados
- `do-while` (repetição até uma condição ser atendida)
- `Scanner` + `nextLine()`
- `trim()` para remover espaços nas extremidades
- `indexOf()` para buscar caracteres dentro da `String`
- `split()` para separar usuário e domínio
- operador ternário (`? :`)
- `equals()` para comparar Strings corretamente

## ▶️ Como executar
1. Compile e execute o arquivo `.java` no seu ambiente (IntelliJ, VS Code ou terminal).
2. Digite e-mails de teste quando solicitado.

### Exemplos de teste
- `abc` → inválido (sem `@`)
- `joao@gmail.com` → válido (pessoal)
- `maria@empresa.com.br` → válido (corporativo)

## 📌 Observação
Este exercício foi feito com foco em lógica e validação.  
Uma melhoria futura é validar também casos como `nome@` (sem domínio) e `@dominio.com` (sem usuário), adicionando verificações extras.
