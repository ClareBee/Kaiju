package com.example.clareblackburne.kaijuattack;

import com.example.clareblackburne.kaijuattack.Vehicle.Tank;
import com.example.clareblackburne.kaijuattack.Vehicle.Truck;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by clareblackburne on 25/10/2017.
 */

public class TestKaiju {

    Otachi otachi;
    Garuda garuda;
    Truck truck;
    Tank tank;


    @Before
    public void before(){
        otachi = new Otachi("Bob", 50, 100, truck);
        garuda = new Garuda("Dave", 70, 10, tank);
        truck = new Truck("nuclear", 100);
        tank = new Tank("superpowered", 120);
    }

    @Test
    public void kaijuHasName() {
        assertEquals("Dave", garuda.getName());
    }

    @Test
    public void kaijuHasHealthValue() {
        assertEquals(50, otachi.getHealthValue());
    }

    @Test
    public void truckHasHealthValue() {
        assertEquals(100, truck.getHealthValue());
    }
    @Test
    public void kaijuCanSetName() {
        garuda.setName("Gillian");
        assertEquals("Gillian", garuda.getName());
    }

    @Test
    public void kaijuCanFly() {
        assertEquals("Flippety Flap", otachi.fly());
    }

    @Test
    public void kaijuCanRoar() {
        assertEquals("Aaaaaarrggghhhh", garuda.roar());
    }


    @Test
    public void otachiDamagesTruck() {
        otachi.attack(truck);
        assertEquals(0, truck.getHealthValue());
    }

    @Test
    public void garudaDamagesTank() {
        garuda.attack(tank);
        assertEquals(110, tank.getHealthValue());
    }

    @Test
    public void kaijuCanBeAttackedbyTruck(){
        otachi.setAttacker(truck);
        assertEquals("Kaboom", otachi.attacked());
    }
}
