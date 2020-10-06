package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    void setCurrentTemperature() {             //температура в пределах;
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(20);
        int expected =20;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void setCurrentOverMaxTemperature() {             //температура выше максимума
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(35);
        int expected =0;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperature() {             //повышение температуры на 1
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.increaseCurrentTemperature();
        int expected =1;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void setCurrentUnderMinTemperature() {             //температура ниже минимума
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(9);
        int expected =0;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {             //понижение температуры на 1
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        conditioner.decreaseCurrentTemperature();
        int expected =-1;
        assertEquals (expected, conditioner.getCurrentTemperature());
    }
}