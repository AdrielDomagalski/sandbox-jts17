package com.ilegra.jts.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Adriel on 29/05/2017.
 */
public class ServicoPet {
    List<Pet> listaPet = new ArrayList<>();

    Map<Integer, List<Object>> banhoPet = new HashMap<>();


    public boolean addPet(Pet pet) {
        try {
            listaPet.add(pet);
            System.out.println("Pet Adicionado com sucesso");
            return true;
        } catch (Exception e) {
            System.out.println("erro: " + e);
            return false;
        }


    }

    public void ListaPet() {
        for (int i = 0; i < listaPet.size(); i++) {
            System.out.println("\n");
            System.out.println("Id: " + listaPet.get(i).getId());
            System.out.println("nome: " + listaPet.get(i).getNome());
            System.out.println("Raca: " + listaPet.get(i).getRaca());
            System.out.println("Idade: " + listaPet.get(i).getIdade());


        }
    }

    public List<Pet> removePet(int id) {
        try {
            if (listaPet.contains(id)) {
                listaPet.remove(id);
                System.out.println("\n Pet Removido com sucesso " + id + 1);
                return listaPet;
            } else {
                System.out.println("\n Pet não encontrado para remoção ");
            }
        } catch (Exception e) {
            System.out.println("erro: " + e);
        }

        return listaPet;
    }

    public boolean verifica(int idade) {
        for (Pet pet : listaPet) {
            if (pet.getIdade() == idade) {
                System.out.println("\nPet Encontrado com sucesso\n" + "Idade:" + pet.getIdade() + "\nNome: " + pet.getNome());
                return true;
            } else {
                System.out.println("Pet não encontrado");
            }
        }
        return false;
    }

    public boolean addBanho(int id, boolean seco, boolean perfume) {
        if (banhoPet.size() != 0) {
            for (Pet pet : listaPet) {
                if (pet.getId() == id) {
                        banhoPet.get(id).add(new Banho(id, seco, perfume));
                        System.out.println("\n Banho adicionando com sucesso ao pet");
                        return true;
                } else {
                        System.out.println("\n Erro ao adicionar banho  no pet");
                        return false;
                }
            }
        }
        return true;
    }
}





