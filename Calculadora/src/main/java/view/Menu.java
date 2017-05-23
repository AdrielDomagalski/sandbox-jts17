package view;

/**
 * Created by Adriel on 21/05/2017.
 */
import Operacoes.*;
import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.Scanner;
public class Menu {

    public void menu() {
        Scanner ler = new Scanner(System.in);
        System.out.println("digite 1 para entrar na calculadora \n" + "2 para ver historico \n" + "3 para sair");
        int escolha = ler.nextInt();
        switch (escolha) {
            case 0: {
                System.exit(0);
                break;
            }
            case 1: {
                menuCalculadora();
                break;
            }
            case 2: {

                break;
            }
            case 3: {

                break;
            }
            default: {
                System.out.println("Operação invalida");
            }
        }
    }

    public void menuCalculadora(){
        Scanner ler = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("informe o primeiro valor" );
        num1 = ler.nextDouble();
        System.out.println("informe o segundo valor");
        num2 = ler.nextDouble();
        System.out.println("digite 1 para soma \n" + "2 para subtração \n" + "3 para multiplicação \n" + "4 para Divisão \n" + "5 para potencia");
        int escolha = ler.nextInt();
        switch (escolha) {
            case 0: {
                System.exit(0);
                break;
            }
            case 1: {
                Soma soma = new Soma();
                soma.Operacao(num1 , num2);
                break;
            }
            case 2: {
                Subtracao sub = new Subtracao();
                sub.Operacao(num1 , num2);
                break;
            }
            case 3: {
                Multiplicacao mul = new Multiplicacao();
                mul.Operacao(num1 , num2);
                break;
            }
            case 4: {
                Divisao div = new Divisao();
                div.Operacao(num1 , num2);
                break;
            }
            case 5: {
                Potencia pot = new Potencia();
                pot.Operacao(num1 , num2);
                break;
            }
            default: {
                System.out.println("Operação invalida");
            }
        }
    }

}

