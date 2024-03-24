package me.tunisiaa.classi.es6;

import java.util.concurrent.TimeUnit;

public class Medkit extends Item{
    private int hp;
    private int delay;

    public Medkit(int hp, int delay) {
        this.hp = hp;
        this.delay = delay;
    }

    @Override
    public void use(){
        System.out.println("Healing");
        try {
            TimeUnit.SECONDS.sleep(delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Healed!");
        System.out.printf("+%dhp\n", hp);
    }

    @Override
    public void print(){
        super.print();
        System.out.println("hp bonus : " + hp);
        System.out.println("use delay :" + delay);
    }
}
