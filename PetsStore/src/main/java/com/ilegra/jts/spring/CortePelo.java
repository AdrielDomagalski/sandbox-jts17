package com.ilegra.jts.spring;

/**
 * Created by Adriel on 30/05/2017.
 */
public class CortePelo {
    private boolean peloCurto;
    private boolean peloLongo;

    public CortePelo(int id, boolean peloCurto, boolean peloLongo) {
        this.peloCurto = peloCurto;
        this.peloLongo = peloLongo;
    }

    public boolean isPeloCurto() {
        return peloCurto;
    }

    public void setPeloCurto(boolean peloCurto) {
        this.peloCurto = peloCurto;
    }

    public boolean isPeloLongo() {
        return peloLongo;
    }

    public void setPeloLongo(boolean peloLongo) {
        this.peloLongo = peloLongo;
    }

    @Override
    public String toString() {
        if(peloCurto == true){
            return "Corte Curto";
        }else if(peloLongo == true){
            return "Corte Longo";
        }else {
             return "Sem corte";
        }
    }
}
