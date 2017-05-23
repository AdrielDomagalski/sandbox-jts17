package com.ilegra.jts.spring.modelo;

/**
 * Created by ilegra0267 on 22/05/2017.
 */
public interface Service {
    void banho(int id);
    void cortePelo(int id);
    Pet save(Pet pet);
    Pet remove(Integer id);

}