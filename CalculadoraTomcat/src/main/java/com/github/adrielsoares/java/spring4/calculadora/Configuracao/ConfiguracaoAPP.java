package com.github.adrielsoares.java.spring4.calculadora.Configuracao;

import com.github.adrielsoares.java.spring4.calculadora.Configuracao.Operacoes.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

/**
 * Created by Adriel on 21/05/2017.
 */
@Configuration
@ComponentScan(basePackages = "com.github.adrielsoares.java.spring4.calculadora")
public class ConfiguracaoAPP {

    @Bean
    public Calculo calculo(){
        Calculo calculo = new Calculo(mapOperacao(), mapOpera());

        mapOperacao().getMapOperacao().put("+", new Soma());
        mapOperacao().getMapOperacao().put("-", new Subtracao());
        mapOperacao().getMapOperacao().put("*", new Multiplicacao());
        mapOperacao().getMapOperacao().put("/", new Divisao());
        mapOperacao().getMapOperacao().put("^", new Potencia());

        mapOpera().getOpera().put("+", new ArrayList());
        mapOpera().getOpera().put("-", new ArrayList());
        mapOpera().getOpera().put("*", new ArrayList());
        mapOpera().getOpera().put("/", new ArrayList());
        mapOpera().getOpera().put("^", new ArrayList());
        mapOpera().getOpera().put("er", new ArrayList());

        return calculo;
    }


    public MapOpera mapOpera(){
        return new MapOpera();
    }

    public MapOperacao mapOperacao(){
        return new MapOperacao();
    }

}

