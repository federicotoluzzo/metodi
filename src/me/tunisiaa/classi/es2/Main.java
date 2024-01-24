package me.tunisiaa.classi.es2;

public class Main {
    public static void main(String[] args) {
        Parco p = new Parco("Parco Albanese", 750, 450, 8000 + 600 + 1700);
        System.out.println(p.percentualeAcqua() + "%");
    }

}
