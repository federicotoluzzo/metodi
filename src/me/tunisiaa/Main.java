package me.tunisiaa;

public class Main {

    public static void main(String[] args) {
	    count(5, 150);
    }

    public static void count(int n, int m) {
        System.out.println(n);
        if(n == m){
            return;
        }else{
            count(n + 1, m);
        }
    }
}
