package com.ilegra.jts.spring.modelo;

/**
 * Created by Adriel on 31/05/2017.
 */
public interface InterfacePet {
    boolean addPet(int id, String nome, String raca, int idade);
    boolean removePet(int id);
    boolean pesquisaPorIdade(int idade);
    boolean addBanho(int id, boolean seco, boolean perfume);
    boolean addCorte(int id, boolean peloCurto, boolean peloLongo );
}
