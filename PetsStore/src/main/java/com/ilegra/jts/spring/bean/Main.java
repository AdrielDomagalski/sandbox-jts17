package com.ilegra.jts.spring.bean;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ilegra.jts.spring.modelo.PetService;
import com.ilegra.jts.spring.modulo.PetModule;

/**
 * Created by ilegra0267 on 22/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new PetModule());
        PetService petService = injector.getInstance(PetService.class);

    }
}