package com.ilegra.jts.spring.modelo;

import javax.inject.Inject;
import java.util.*;

/**
 * Created by Adriel on 29/05/2017.
 */
public class ServicoPet implements InterfacePet {

    private ListaPet listaPet;

    Map<Integer, List<Banho>> banhoPet = new HashMap<>();
    Map<Integer, List<CortePelo>> cortePet = new HashMap<>();
    private List<String> salvaServicos = new ArrayList<>();

    @Inject
    public ServicoPet(ListaPet listaPet){
        this.listaPet = listaPet;
    }

    public ListaPet getListaPet() {
        return listaPet;
    }

    public void setListaPet(ListaPet listaPet) {
        this.listaPet = listaPet;
    }

    public boolean addPet(int id, String nome, String raca, int idade) {
        try {
            listaPet.getListaPet().add(new Pet(id, nome, raca, idade));
            System.out.println("Pet Adicionado com sucesso");
            return true;
        } catch (Exception e) {
            System.out.println("erro: " + e);
            return false;
        }


    }

    public boolean removePet(int id) {
        for (Pet pet : listaPet.getListaPet()) {
            if (listaPet.getListaPet().get(id).getId() == id) {
                listaPet.getListaPet().remove(id);
                System.out.println("\nPet removido com sucesso " + id);
                return true;
            } else {
                System.out.println("Pet não encontrado para remoção");
                return false;
            }
        }
        return false;
    }

        public void ListaPet() {
        for (int i = 0; i < listaPet.getListaPet().size(); i++) {
            System.out.println("\n");
            System.out.println("Id: " + listaPet.getListaPet().get(i).getId());
            System.out.println("nome: " + listaPet.getListaPet().get(i).getNome());
            System.out.println("Raca: " + listaPet.getListaPet().get(i).getRaca());
            System.out.println("Idade: " + listaPet.getListaPet().get(i).getIdade());


        }
    }

    public boolean pesquisaPorIdade(int idade) {
        for (Pet pet : listaPet.getListaPet()) {
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
        try {
            for (Pet pet : listaPet.getListaPet()) {
                if (listaPet.getListaPet().get(id).getId() == id) {
                    banhoPet.put(id, new ArrayList<Banho>());
                    banhoPet.get(id).add(new Banho(id, seco, perfume));
                    System.out.println("\n Banho adicionando com sucesso ao pet " + listaPet.getListaPet().get(id).getNome());
                    salvaServicos.add("\nBanho adicionado no(a) " + listaPet.getListaPet().get(id).getNome());
                    return true;
                } else {
                    System.out.println("\n Erro ao adicionar banho  no pet");
                    return false;
                }
            }
        }catch (Exception e) {
        System.out.println("erro: " + e);
    }
        return false;
    }

    public boolean addCorte(int id, boolean peloCurto, boolean peloLongo ){
        try {
            for (Pet pet : listaPet.getListaPet()) {
                if (listaPet.getListaPet().get(id).getId() == id) {
                    cortePet.put(id, new ArrayList<CortePelo>());
                    cortePet.get(id).add(new CortePelo(id, peloCurto, peloLongo));
                    System.out.println("\n Corte Adicionado com sucesso " + listaPet.getListaPet().get(id).getNome() );
                    salvaServicos.add("\nCorte adicionado no(a) " + listaPet.getListaPet().get(id).getNome());
                    return true;

                } else {
                    System.out.println("\n Erro ao adicionar o corte");
                    return false;
                }
            }
        }catch (Exception e) {
            System.out.println("erro: " + e);
        }
        return true;
    }

    public void MostraServicos(){
        for (int i = 0; i<salvaServicos.size(); i++ ){
            System.out.println(salvaServicos.get(i));
        }
    }
    public void TopDezPets(int id) {
        int i = 0;
        System.out.println("Lista dos 10 pets com mais serviços");
        for (i = 0; i <= 10; i++) {
          for(int j=0; j<salvaServicos.size(); j++){
             // if(listaPet.getListaPet().get(id).getId() )

          }
        }
    }
}





