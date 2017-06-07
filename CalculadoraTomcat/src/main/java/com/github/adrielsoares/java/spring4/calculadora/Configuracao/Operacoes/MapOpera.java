package com.github.adrielsoares.java.spring4.calculadora.Configuracao.Operacoes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by adriel on 05/06/17.
 */
public class MapOpera {
    private Map<String, List> opera = new HashMap<>();

    public Map<String, List> getOpera() {
        return opera;
    }

    public void setOpera(Map<String, List> opera) {
        this.opera = opera;
    }
}
