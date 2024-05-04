package com.federicotoluzzo.classi.es6;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun();
        gun.setQuantity(1);
        gun.setName("Gun");
        gun.setDamage(20);
        gun.setMaxAmmo(20);
        gun.setAvailableAmmo(20);
        gun.setQuickReloadDuration(800);
        gun.setSlowReloadDuration(300);

        gun.use();
        gun.quickReload();
        gun.use();
        gun.use();
        gun.use();
        gun.use();
        gun.use();
        gun.print();
        gun.slowReload();



        Medkit mk = new Medkit(5, 50, 5000);
        mk.print();
        mk.use();
        mk.print();
    }
}
