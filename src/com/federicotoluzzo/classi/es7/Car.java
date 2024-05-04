package com.federicotoluzzo.classi.es7;

public class Car implements Driveable{
    private float distanceMeter;

    public Car(){
        distanceMeter = 0;
    }
    @Override
    public void drive() {
        System.out.println("Brumm");
    }

    @Override
    public void drive(float distanceKm){
        System.out.println("Brumm");
        distanceMeter += distanceKm;
    }

    @Override
    public void park() {
        System.out.println("bip bip bip Bip Bip BIP BIP BIIIIP BIIIIIP BIIIIIIIII-");
    }
}

