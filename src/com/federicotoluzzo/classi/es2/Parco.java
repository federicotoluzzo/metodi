package com.federicotoluzzo.classi.es2;

// Creare una classe Parco, contenente il nome, la larghezza, la lunghezza, l'area totale di specchi d'acqua. Creare setter e getter, il metodo area (che calcola l'area del parco) e il metodo areaNoAcqua (che restituisce l'area del parco esclusi gli specchi d'acqua) e il metodo percentualeAcqua che dica quale percentuale dell'area del parco sia coperta da specchi d'acqua. (Consegnare il PDF)
public class Parco {
    private String nome;
    private int lunghezza;
    private int larghezza;
    private int acqua;

    public Parco(String nome, int lunghezza, int larghezza, int acqua){
        this.nome = nome;
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.acqua = acqua;
    }

    public int area(){
        return lunghezza * larghezza;
    }

    public int areaNoAcqua(){
        return area() - acqua;
    }

    public double percentualeAcqua(){
        return acqua * 100d / area();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getAcqua() {
        return acqua;
    }

    public void setAcqua(int acqua) {
        this.acqua = acqua;
    }
}
