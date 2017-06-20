package com.github.adrielsoares.java.spring4.calculadora.rxnetty;

import com.github.adrielsoares.java.spring4.calculadora.rxnetty.Operacoes.Calculo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by ilegra0267 on 20/06/17.
 */
@Path("/calcula")
public class ResourceCalculo {
    Calculo calculo;

    public ResourceCalculo(Calculo calculo) {
    }

    @GET
    @Produces
    public static String historico() {
        return null;
    }
}


