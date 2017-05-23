package Operacoes;

/**
 * Created by Adriel on 21/05/2017.
 */
public class Divisao implements Strategy {
    @Override
    public double Operacao(double num1, double num2) {
        double valor = 0;
        if (num2 >= 0)
           return valor = num1 / num2;
        return valor;
    }
}