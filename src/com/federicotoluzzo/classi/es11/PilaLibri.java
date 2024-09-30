package com.federicotoluzzo.classi.es11;


import java.util.ArrayList;

public class PilaLibri {
    private ArrayList<Libro> libri = new ArrayList<>();
    public int nMazElementi;

    public PilaLibri(int nMazElementi) {
        this.nMazElementi = nMazElementi;
    }

    public boolean inserimento(Libro libro) {
        if(libri.size() < nMazElementi && !libri.contains(libro)) {
            libri.add(libro);
            return true;
        }
        return false;
    }

    public Libro estrazione(){
        return libri.get(libri.size()-1);
    }

    public void stampa(){
        System.out.println("------------------------------");
        for(Libro libro : libri){
            Libro.stampa();
            System.out.println("------------------------------");
        }
    }
}
