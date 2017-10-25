package com.example.clareblackburne.kaijuattack;

import com.example.clareblackburne.kaijuattack.Vehicle.*;


/**
 * Created by clareblackburne on 25/10/2017.
 */


public class Otachi extends Kaiju {

    public Otachi(String name, int healthValue, int attackValue, Attacking attacker){
        super(name, healthValue, attackValue, attacker);
    }

    public String fly() {
        return "Flippety Flap";
    }

    public String roar() {
        return "Grrrrrrrrr";
    }

    public String attack(Truck truck) {
        truck.setHealthValue(truck.healthValue -= this.getAttackValue());
        return "Thwack";
    }

    public String attacked() {
        return "Kaboom";
    }





}
