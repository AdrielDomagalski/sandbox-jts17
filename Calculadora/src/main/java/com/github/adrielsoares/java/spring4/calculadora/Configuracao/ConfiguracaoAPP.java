package com.github.adrielsoares.java.spring4.calculadora.Configuracao;

import com.github.adrielsoares.java.spring4.calculadora.Configuracao.Operacoes.Calculo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Adriel on 21/05/2017.
 */
@Configuration
@ComponentScan(basePackages = "com.github.adrielsoares.java.spring4.calculadora.Operacoes")
public class ConfiguracaoAPP {

    @Bean
    public Calculo calculo(){
        Calculo calculo = new Calculo();
        return calculo;
    }
}

