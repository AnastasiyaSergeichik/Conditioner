package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    private void fields() {
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(10);

    }

    @Test
        //температура в пределах;
    void setCurrentTemperature() {
        fields();
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
        //температура выше максимума
    void setCurrentOverMaxTemperature() {
        fields();
        conditioner.setCurrentTemperature(31);
        conditioner.increaseCurrentTemperature();

        assertEquals(30, conditioner.getMaxTemperature());
    }

    @Test                                            //повышение на 1 градус
    public void shouldIncreaseCurrentTemperature() {
        fields();
        conditioner.setCurrentTemperature(23);
        conditioner.increaseCurrentTemperature();
        assertEquals(24, conditioner.getCurrentTemperature());
    }


    @Test                                                      //понижение на 1 градус
    public void shouldDecreaseCurrentTemperature() {
        fields();
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(14, conditioner.getCurrentTemperature());
    }

    @Test
        //температура ниже минимума
    void setCurrentUnderMinTemperature() {
        fields();
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10, conditioner.getMinTemperature());
    }
}

