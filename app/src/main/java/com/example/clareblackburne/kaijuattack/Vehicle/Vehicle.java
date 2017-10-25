package com.example.clareblackburne.kaijuattack.Vehicle;

/**
 * Created by clareblackburne on 25/10/2017.
 */

public abstract class Vehicle implements Attacking {

    private String type;
    public int healthValue;


    public Vehicle(String type, int healthValue){
        this.type = type;
        this.healthValue = healthValue;

    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public abstract String attacked();
}
