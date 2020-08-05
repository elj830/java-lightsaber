package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightSaberTest {

    @Test
    public void charged(){
        LightSaber lightsaber = new LightSaber(1234);

        float expected = 100f;
        float result = lightsaber.getCharge();

        assertEquals(expected, result);
    }

    @Test
    public void useCharge(){
        LightSaber lightsaber = new LightSaber(1234);

        lightsaber.use(30);
        float expected = 95f;
        float result = lightsaber.getCharge();

        assertEquals(expected, result);
    }

    @Test
    public void setCharge(){
        LightSaber lightsaber = new LightSaber(1234);

        lightsaber.setCharge(50);
        float expected = 50f;
        float result = lightsaber.getCharge();

        assertEquals(expected, result);
    }

    @Test
    public void recharge(){
        LightSaber lightsaber = new LightSaber(1234);

        lightsaber.use(30);
        lightsaber.recharge();
        float expected = 100f;
        float result = lightsaber.getCharge();

        assertEquals(expected, result);
    }

    @Test
    public void getMinutes(){
        LightSaber lightsaber = new LightSaber(1234);

        lightsaber.use(30);

        float expected = 285f;
        float result = lightsaber.getRemainingMinutes();

        assertEquals(expected, result);
    }

    @Test
    public void getSerial(){
        LightSaber lightsaber = new LightSaber(1234);

        float expected = 1234;
        float result = lightsaber.getJediSerialNumber();

        assertEquals(expected, result);
    }

    @Test
    public void setColor(){
        LightSaber lightsaber = new LightSaber(1234);

        lightsaber.setColor("blue");
        String expected = "blue";
        String result = lightsaber.getColor();

        assertEquals(expected, result);
    }

    @Test
    public void getColor(){
        LightSaber lightsaber = new LightSaber(1234);

        String expected = "green";
        String result = lightsaber.getColor();

        assertEquals(expected, result);
    }






}
