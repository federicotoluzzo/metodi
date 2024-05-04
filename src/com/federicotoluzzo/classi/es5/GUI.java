package com.federicotoluzzo.classi.es5;

public class GUI {
    private static String prompt = "---------------------------------------------------\n" +
                                   "\t\tScegli l'operazione da eseguire :\n\n" +
                                   "\t1)\tAggiungi giardiniere.\n" +
                                   "\t2)\tRimuovi giardiniere.\n" +
                                   "\t3)\tAggiungi genere.\n" +
                                   "\t4)\tRimuovi genere.\n" +
                                   "\t5)\tRegistra ordine.\n" +
                                   "\t0)\tEsci.\n";
    public static void start(){
        System.out.println(prompt);
    }
}
