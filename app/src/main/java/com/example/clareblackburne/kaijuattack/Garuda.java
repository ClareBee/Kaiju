package com.example.clareblackburne.kaijuattack;

import com.example.clareblackburne.kaijuattack.Vehicle.Attacking;
import com.example.clareblackburne.kaijuattack.Vehicle.Tank;

/**
 * Created by clareblackburne on 25/10/2017.
 */

public class Garuda extends Kaiju {
    public Garuda(String name, int healthValue, int attackValue, Attacking attacker) {
        super(name, healthValue, attackValue, attacker);
    }

    public String fly() {
        return "Flapflapflap";
    }

    public String roar() {
        return "Aaaaaarrggghhhh";
    }


    public String attack(Tank tank) {
        tank.setHealthValue(tank.healthValue -= this.getAttackValue());
        return "Smash!";
    }

    public String attacked() {
        return "Kapow!";
    }
}
