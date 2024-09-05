package com.juaracoding.oop;

//object fruit
public class Fruit {

    //state
    int grams;
    int calsPerGrams;

    //behavior
    int totalCalories() {
        return grams * calsPerGrams;
    }
}
