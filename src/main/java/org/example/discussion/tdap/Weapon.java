package org.example.discussion.tdap;

public class Weapon {
    public int ammo;

    public Weapon(int initialAmmo) {
        ammo = initialAmmo;
    }

    public void Fire() {
        ammo--;
        System.out.println("Weapon fired! Remaining ammo: " + ammo);
    }
}

/**
 *
 * The Player class checks the state of the Weapon object (specifically, the ammo count) before deciding whether to attack.
 *
 * The Player class checks the Ammo state of the Weapon object before deciding on an action.
 * This approach increases coupling between the two classes and breaks the encapsulation of the Weapon class.
 * */

class Player {
    public void Attack(Weapon weapon) {
        if (weapon.ammo > 0) {
            weapon.Fire();
        } else {
            System.out.println("Cannot attack: No ammo left!");
        }
    }
}
