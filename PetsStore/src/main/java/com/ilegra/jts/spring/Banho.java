package com.ilegra.jts.spring;

/**
 * Created by Adriel on 30/05/2017.
 */
public class Banho {
    private boolean perfume;
    private boolean seco;

    public Banho(int id, boolean perfume, boolean seco) {
        this.perfume = perfume;
        this.seco = seco;
    }

    public boolean isPerfume() {
        return perfume;
    }

    public void setPerfume(boolean perfume) {
        this.perfume = perfume;
    }

    public boolean isSeco() {
        return seco;
    }

    public void setSeco(boolean seco) {
        this.seco = seco;
    }

    @Override
    public String toString() {
            if (seco == true && perfume == true) {
                return "Banho com agua e perfume";
            }else if(seco == false && perfume == false){
                return  "Banho sem agua e sem perfume";
            }else if(seco == false && perfume == true){
                return "Banho sem agua e com perfume";
            }else{
                return "Banho com agua e sem perfume";
            }
    }
}