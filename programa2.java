package com.mycompany.programacionlogicayfuncional;

import java.util.Stack;

/**
 *
 * @author enoce
 */
public class programa2 {

    public void programa2(String exp) {

        String post[] = Postf(exp).split(" ");
        Stack<Double> numeros = new Stack<Double>();

        for (int i = 0; i < post.length; i++) {
            try {
                Double val = Double.parseDouble(post[i]);
                numeros.push(val);
            } catch (Exception e) {
                char oper = post[i].charAt(0);
                Double val = operacion(numeros.pop(), numeros.pop(), oper);
                numeros.push(val);
            }
        }
        System.out.println("Operación: " + exp);
        System.out.println("Operación postfija: " + Postf(exp));
        System.out.println("Resultado= " + numeros.peek());
    }

    public static String Postf(String postfija) {

        final String operadores = "-+/*^";

        StringBuilder oper = new StringBuilder();
        Stack<Integer> pila = new Stack<>();
        for (String token : postfija.split("\\s")) {
            if (token.isEmpty()) {
                continue;
            }
            char caracter = token.charAt(0);
            int index = operadores.indexOf(caracter);
            if (index != -1) {
                if (pila.isEmpty()) {
                    pila.push(index);
                } else {
                    while (!pila.isEmpty()) {
                        int precedenciaPila = pila.peek() / 2;
                        int precedenciaNueva = index / 2;
                        if (precedenciaPila > precedenciaNueva || (precedenciaPila == precedenciaNueva && caracter != '^')) {
                            oper.append(operadores.charAt(pila.pop())).append(' ');

                        } else {
                            break;
                        }
                    }
                    pila.push(index);
                }
            } else if (caracter == '(') {
                pila.push(-2);
            } else if (caracter == ')') {

                while (pila.peek() != -2) {
                    oper.append(operadores.charAt(pila.pop())).append(' ');
                }
                pila.pop();
            } else {
                oper.append(token).append(' ');
            }
        }
        while (!pila.isEmpty()) {
            oper.append(operadores.charAt(pila.pop())).append(' ');
        }
        return oper.toString();

    }

    public static Double operacion(Double v2, Double v1, char op) {
        Double resul = 0.0;
        if (op == '^') {
            resul = Math.pow(v1, v2);
        } else if (op == '/') {
            resul = v1 / v2;
        } else if (op == '*') {
            resul = v1 * v2;
        } else if (op == '+') {
            resul = v1 + v2;
        } else if (op == '-') {
            resul = v1 - v2;
        } else {
            System.out.println("No existe operador");
        }
        return resul;
    }

}
