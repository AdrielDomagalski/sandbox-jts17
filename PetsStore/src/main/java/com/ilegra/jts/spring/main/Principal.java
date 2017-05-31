package com.ilegra.jts.spring.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ilegra.jts.spring.modelo.Pet;
import com.ilegra.jts.spring.modelo.ServicoPet;
import com.ilegra.jts.spring.modulo.PetServiceModulo;

/**
 * Created by Adriel on 29/05/2017.
 */
public class Principal {
    public static void main(String [] args){
       Injector injector = Guice.createInjector(new PetServiceModulo());
       ServicoPet servicoPet = injector.getInstance(ServicoPet.class);

       servicoPet.addPet(0,"pedro", "vira-lata", 5);
       servicoPet.addPet(1, "goldofredo","golden", 6);
       servicoPet.addPet(2, "cabra", "cabrito",15);

       servicoPet.ListaPet();

       servicoPet.addBanho(2,false,true);

       servicoPet.addCorte(2,true,false);

       servicoPet.MostraServicos();

       servicoPet.removePet(1);

       servicoPet.pesquisaPorIdade(5);



















       //               Pet pet = new Pet(0, "adr", "raco", 10);
//        ServicoPet add = new ServicoPet();
//        Pet pet2 = new Pet(1, "vitor", "marchal", 15);
//        ServicoPet add2 = new ServicoPet();
//        Pet pet3 = new Pet(2, "betowem", "golden", 5);
//        ServicoPet add3 = new ServicoPet();
//
//        add.addPet(pet);
//        add.addPet(pet2);
//        add.addPet(pet3);
//
////
////        add.verifica(15);
////
////        add.removePet(3);
////
////        add.ListaPet();
//
//        add.addBanho(0, true, true);
//        add.addCorte(0, true, false);

    }
}
