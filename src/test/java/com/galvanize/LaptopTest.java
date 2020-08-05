package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LaptopTest {
    @Test

    public void itIsOffByDefault(){

        Laptop laptop = new Laptop();

        boolean expected = false;
        boolean actual = laptop.isOn();

        assertEquals(expected, actual);

    }

    @Test
    public void callingPowerTurnsItOn(){
        Laptop laptop = new Laptop();

        laptop.power();
        boolean expected = true;
        boolean actual = laptop.isOn();

        assertEquals(expected, actual);
    }

    @Test
    public void callingPowerTurnsItOff(){
        Laptop laptop = new Laptop();

        laptop.power();
        laptop.power();
        boolean expected = false;
        boolean actual = laptop.isOn();

        assertEquals(expected, actual);
    }
}
