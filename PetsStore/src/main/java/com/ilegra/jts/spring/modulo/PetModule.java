package com.ilegra.jts.spring.modulo;

import com.google.inject.AbstractModule;
import com.ilegra.jts.spring.modelo.PetService;
import com.ilegra.jts.spring.modelo.Service;

/**
 * Created by ilegra0267 on 22/05/2017.
 */
public class PetModule extends AbstractModule {


    @Override
    protected void configure() {
        bind(Service.class).to(PetService.class);

    }
}
