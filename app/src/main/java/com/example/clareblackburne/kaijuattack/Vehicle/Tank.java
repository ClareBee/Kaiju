package com.example.clareblackburne.kaijuattack.Vehicle;

import com.example.clareblackburne.kaijuattack.Kaiju;
import com.example.clareblackburne.kaijuattack.Otachi;

/**
 * Created by clareblackburne on 25/10/2017.
 */

public class Tank extends Vehicle implements Attacking {
    public Tank(String type, int healthValue) {
        super(type, healthValue);
    }


    public String attacked(){
        return "Kaboom!";
    }
}
