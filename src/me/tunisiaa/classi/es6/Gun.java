package me.tunisiaa.classi.es6;

import me.tunisiaa.classi.es6.Item;

import java.util.concurrent.TimeUnit;

public class Gun extends Item {
    private int damage;
    private int maxAmmo;
    private int speed; // supponiamo possa essere in millisecondi
    private int quickReloadDuration;
    private int slowReloadDuration;

    private long lastUsed;
    private int availableAmmo;

    public Gun(int damage, int maxAmmo, int speed, int quickReloadDuration, int slowReloadDuration) {
        this.damage = damage;
        this.maxAmmo = maxAmmo;
        this.speed = speed;
        this.quickReloadDuration = quickReloadDuration;
        this.slowReloadDuration = slowReloadDuration;

        availableAmmo = 0;
    }
    // override del costruttore
    public Gun(){
        availableAmmo = 0;
    }

    @Override
    public void use(){
        if(System.currentTimeMillis() - lastUsed >= speed){
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
    }

    public void slowReload(){ // equivalente di inserire ogni proiettile singolarmente
        try {
            TimeUnit.MILLISECONDS.sleep(slowReloadDuration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // player.setAmmo(player.getAmmo() - availableAmmo);
        availableAmmo = maxAmmo;
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
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
