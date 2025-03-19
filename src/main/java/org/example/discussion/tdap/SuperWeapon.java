package org.example.discussion.tdap;

public class SuperWeapon {
    private int ammo;

    public SuperWeapon(int initialAmmo) {
        ammo = initialAmmo;
    }

    public void Fire() {
        if (ammo > 0) {
            ammo--;
            System.out.println("Weapon fired! Remaining ammo: " + ammo);
        } else {
            System.out.println("No ammo left!");
        }
    }
}


/**
 *
 * Player class doesn't need to know anything about the Weapon object's internal state.
 * The Weapon class manages its own state internally and decides on the appropriate action without exposing its state externally.
 * This reduces coupling between the classes and maintains the encapsulation of the Weapon class.
 * */

class SuperPlayer {
    public void Attack(SuperWeapon weapon) {
        weapon.Fire(); // Simply request the action without asking about the state
    }
}

