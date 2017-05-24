package com.github.adrielsoares.java.spring4.calculadora.Configuracao.Operacoes;

import com.github.adrielsoares.java.spring4.calculadora.Configuracao.ConfiguracaoAPP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ilegra0267 on 23/05/2017.
 */

public class Calculo{
    private ConfiguracaoAPP configuracao;
    private Map<String, Operacao> operacaoMap = new HashMap<>();
    private Map<String, List> opera = new HashMap<>();

    public Map<String, List> getOpera(){
        return opera;
    }

    public Map<String, Operacao> getOperacaoMap(){
        return operacaoMap;
    }

    public Double calcula(double num1, double num2, String op) {
        double aux = operacaoMap.get(op).calcula(num1, num2);
        salvaOperacao(num1, num2, op, aux);
        return aux;
    }

    public void salvaOperacao (double num1, double num2, String op, double aux ){
        String salva = num1 + "" + op + "" + num2  + "=" + aux;
        opera.get(op).add(salva);
    }


}


