package Operacoes;

/**
 * Created by Adriel on 21/05/2017.
 */
public class Potencia implements Strategy {
    @Override
    public double Operacao(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
