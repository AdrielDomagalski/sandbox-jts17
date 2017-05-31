package com.ilegra.jts.spring.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adriel on 31/05/2017.
 */
public class ListaPet {
    private List<Pet> listaPet = new ArrayList<>();

    public List<Pet> getListaPet() {
        return listaPet;
    }

    public void setListaPet(List<Pet> listaPet) {
        this.listaPet = listaPet;
    }
}
