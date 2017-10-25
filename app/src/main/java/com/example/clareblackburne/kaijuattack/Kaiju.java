package com.example.clareblackburne.kaijuattack;

import com.example.clareblackburne.kaijuattack.Vehicle.Attacking;

/**
 * Created by clareblackburne on 25/10/2017.
 */

public abstract class Kaiju {

    private String name;
    public int healthValue;
    private int attackValue;
    private Attacking attacker;


    public Kaiju(String name, int healthValue, int attackValue, Attacking attacker){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.attacker = attacker;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public abstract String roar();


    public abstract String fly();

    public String Attacking(){
        return this.attacker.attacked();
    }

    public Attacking getAttacker() {
        return attacker;
    }

    public void setAttacker(Attacking attacker) {
        this.attacker = attacker;
    }

}
