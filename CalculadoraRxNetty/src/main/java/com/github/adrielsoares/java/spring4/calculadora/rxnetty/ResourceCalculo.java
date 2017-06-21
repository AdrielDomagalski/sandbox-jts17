package com.github.adrielsoares.java.spring4.calculadora.rxnetty;

import com.github.adrielsoares.java.spring4.calculadora.rxnetty.Operacoes.Calculo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by ilegra0267 on 20/06/17.
 */

@Path("/calcula")
public class ResourceCalculo {
    Calculo calculo;

    @Autowired
    public ResourceCalculo(Calculo calculo) {
       this.calculo = calculo;
    }

    @GET
    @Path("/{numero}/{numero2}/{operacao}")
    @Produces(MediaType.APPLICATION_JSON)
    public String calculculo(@PathParam("numero") double numero, @PathParam("numero2") double numero2, @PathParam("operacao") String operacao) {
        return calculo.calculo(numero, numero2, operacao);
    }
}



