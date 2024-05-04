package com.federicotoluzzo.classi.es6;

import java.util.concurrent.TimeUnit;

public class Medkit extends Item{
    private int hp;
    private int delay;

    public Medkit(int quantity, int hp, int delay) {
        super("medkit", quantity);
        this.hp = hp;
        this.delay = delay;
    }

    @Override
    public void use(){
        if(quantity < 1/* || player.getHP() == 100*/)
        System.out.println("Healing");
        try {
            TimeUnit.MILLISECONDS.sleep(delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Healed!");
        System.out.printf("+%dhp\n", hp);
        quantity--;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("hp bonus : " + hp);
        System.out.println("use delay :" + delay);
        // player.setHP(player.getHP() + HP > 100 ? 100 : player.getHP() + HP);
    }
}
