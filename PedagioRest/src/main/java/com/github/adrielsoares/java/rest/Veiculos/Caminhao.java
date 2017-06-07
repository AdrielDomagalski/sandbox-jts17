package com.github.adrielsoares.java.rest.Veiculos;

import java.text.DecimalFormat;

/**
 * Created by adriel on 06/06/17.
 */
public class Caminhao {
    private double valor = 3.95;

    public String printCaminhao(int eixoExtra){
        String mostra = "U$" + (valor + (1 * eixoExtra));
        return mostra;
    }

    public String validaPagamentoCaminhao(double dinheiro, int eixoExtra) {
        DecimalFormat df = new DecimalFormat("0.##");
        double aux = 1;
        double valida = dinheiro - (valor + (aux * eixoExtra));
        String mensagem = null;
        if(dinheiro < valida){
            return mensagem = "Faltou " + df.format(valida) + " dolares";
        }
        else if(dinheiro == valida) {
            return mensagem = "Pagamento realizado com sucesso";
        }
        else if(dinheiro > valida){
            return mensagem = "Pagamento realizado com sucesso \n Seu troco " + df.format(valida);
        }

        return mensagem;
    }
}
