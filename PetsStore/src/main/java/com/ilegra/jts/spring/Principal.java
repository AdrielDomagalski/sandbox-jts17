package com.ilegra.jts.spring;

/**
 * Created by Adriel on 29/05/2017.
 */
public class Principal {
    public static void main(String [] args){
        Pet pet = new Pet(1, "adr", "raco", 10);
        ServicoPet add = new ServicoPet();
        Pet pet2 = new Pet(2, "vitor", "marchal", 15);
        ServicoPet add2 = new ServicoPet();
        Pet pet3 = new Pet(3, "betowem", "golden", 5);
        ServicoPet add3 = new ServicoPet();

        add.addPet(pet);
        add.addPet(pet2);
        add.addPet(pet3);

//        add.ListaPet();
//
//        add.verifica(15);
//
//        add.removePet(3);
//
//        add.ListaPet();

        add.addBanho(2, true, false);

    }
}
