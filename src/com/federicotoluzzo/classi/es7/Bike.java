package com.federicotoluzzo.classi.es7;

import java.util.concurrent.TimeUnit;

public class Bike implements Driveable{

    @Override
    public void drive() {
        System.out.println("Drinn drinn");
    }

    @Override
    public void park() {
        System.out.println("Legando la bici");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bici legata");
    }
}
