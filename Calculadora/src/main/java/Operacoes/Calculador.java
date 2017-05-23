package Operacoes;

/**
 * Created by Adriel on 21/05/2017.
 */
public class Calculador {
    private Strategy calculatorFunctions;

    public Calculador(Strategy calculatorFunctions){
        this.calculatorFunctions = calculatorFunctions;
    }

    public Calculador() {

    }

    public Double executeCalculator(Double num1, Double num2){
        return calculatorFunctions.Operacao(num1, num2);
    }
}