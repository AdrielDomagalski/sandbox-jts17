package Bean;

import Operacoes.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "calculator")
public class Beans {

   @Bean
    public Calculador Divisao() {
        Calculador cal = new Calculador(new Divisao());
        return cal;
    }

    public Calculador Soma() {
        Calculador cal = new Calculador(new Soma());
        return cal;
    }

    @Bean
    public Calculador Subtracao() {
        Calculador cal = new Calculador(new Subtracao());
        return cal;
    }

    @Bean
    public Calculador Multiplicacao() {
        Calculador cal = new Calculador(new Multiplicacao());
        return cal;
    }

    @Bean
    public Calculador Potencia() {
        Calculador cal = new Calculador(new Potencia());
        return cal;
    }

}
