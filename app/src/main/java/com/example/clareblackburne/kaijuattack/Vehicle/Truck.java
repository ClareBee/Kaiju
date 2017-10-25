package com.example.clareblackburne.kaijuattack.Vehicle;

import com.example.clareblackburne.kaijuattack.Garuda;
import com.example.clareblackburne.kaijuattack.Kaiju;

/**
 * Created by clareblackburne on 25/10/2017.
 */

public class Truck extends Vehicle implements Attacking {

    public Truck(String type, int healthValue) {
        super(type, healthValue);
    }

    public String attacked(){
        return "Kapow!";
    }


}
