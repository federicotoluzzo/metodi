package com.federicotoluzzo.classi.es6;

import java.util.concurrent.TimeUnit;

public class Gun extends Item {
    private int damage;
    private int maxAmmo;
    private int cooldown; // supponiamo possa essere in millisecondi
    private int quickReloadDuration;
    private int slowReloadDuration; // per ciascun proiettile

    private long lastUsed;
    private int availableAmmo;

    public Gun(int quantity, int damage, int maxAmmo, int cooldown, int quickReloadDuration, int slowReloadDuration) {
        super("Gun", quantity);
        this.quantity = quantity;
        this.damage = damage;
        this.maxAmmo = maxAmmo;
        this.cooldown = cooldown;
        this.quickReloadDuration = quickReloadDuration;
        this.slowReloadDuration = slowReloadDuration;

        availableAmmo = 0;
    }

    // override del costruttore
    public Gun(){
        super();
        availableAmmo = 0;
    }

    @Override
    public void use(){
        if(System.currentTimeMillis() - lastUsed >= cooldown){
            System.out.println("BANG");
            availableAmmo--;
            // enemy.setHP(enemy.getHP() - damage);
        }else{
            System.out.println("cooldown");
        }
    }

    public void quickReload(){ // equivalente di sostituire e buttare via il caricatore
        try {
            TimeUnit.MILLISECONDS.sleep(quickReloadDuration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // player.setAmmo(player.getAmmo() - maxAmmo);
        // non c'è una classe player quindi dobbiamo affidarci all'immaginazione
        availableAmmo = maxAmmo;
        System.out.println("Reloaded");
    }

    public void slowReload(){ // equivalente di inserire ogni proiettile singolarmente
        System.out.println("Started to slowly reload");
        while(availableAmmo < maxAmmo){
            try {
                TimeUnit.MILLISECONDS.sleep(slowReloadDuration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // player.setAmmo(player.getAmmo() - availableAmmo);
            availableAmmo++;
            System.out.println("Added one bullet : " + availableAmmo + "/" + maxAmmo);
        }
        System.out.println("Finished slowly reloading");
    }

    @Override
    public void print(){
        super.print();
        System.out.println("damage : " + damage);
        System.out.println("max ammo : " + maxAmmo);
        System.out.println("available ammo : " + availableAmmo);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getSpeed() {
        return cooldown;
    }

    public void setSpeed(int cooldown) {
        this.cooldown = cooldown;
    }

    public int getQuickReloadDuration() {
        return quickReloadDuration;
    }

    public void setQuickReloadDuration(int quickReloadDuration) {
        this.quickReloadDuration = quickReloadDuration;
    }

    public int getSlowReloadDuration() {
        return slowReloadDuration;
    }

    public void setSlowReloadDuration(int slowReloadDuration) {
        this.slowReloadDuration = slowReloadDuration;
    }

    public int getAvailableAmmo() {
        return availableAmmo;
    }

    public void setAvailableAmmo(int availableAmmo) {
        this.availableAmmo = availableAmmo;
    }
}
