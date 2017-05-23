package com.github.adrielsoares.java.spring4.calculadora.Configuracao.Operacoes;

/**
 * Created by Adriel on 21/05/2017.
 */
public class Divisao implements Operacao{
    @Override
    public double calcula(double num1, double num2) {
        double valor = 0;
        if (num2 >= 0)
           return valor = num1 / num2;
        return valor;
    }
}