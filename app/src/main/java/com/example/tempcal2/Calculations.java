package com.example.tempcal2;

public class Calculations {

    protected float convertCelciusToFahrenheit(float value){
        float ans = (value * 9/5) + 32;
        return ans;
    }

    protected float convertFahrenheitToCelcius(float value){
        Float ans = (value - 32) * 5/9;
        return ans;
    }

}
