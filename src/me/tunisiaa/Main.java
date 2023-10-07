package me.tunisiaa;

public class Main {

    public static void main(String[] args) {
	    count(1, 15);
    }

    public static void count(int n, int m) {
        System.out.println(n);
        if(n != m){
            count(n + 1, m);
        }
    }
}
