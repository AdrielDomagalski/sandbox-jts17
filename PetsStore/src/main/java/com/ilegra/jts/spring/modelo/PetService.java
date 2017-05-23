package com.ilegra.jts.spring.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilegra0267 on 22/05/2017.
 */
public class PetService implements Service{

    private final List<Pet> petList;


    public PetService() {
        petList = new ArrayList<Pet>();
    }


    @Override
    public Pet save(Pet pet) {
        if( pet.getId()== null ) {
            pet.setId( petList.size() + 1 );
        }
        petList.add( pet );
        return pet;
    }

    @Override
    public Pet remove(Integer id) {
        petList.remove(id);
        return petList.get(id);
    }

    @Override
    public void banho(int id) {

    }

    @Override
    public void cortePelo(int id) {

    }
}
















