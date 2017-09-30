package com.zz.java310.v1;

/**
 * Created by zncu on 2017-09-23.
 */
public class Dog implements Animal {

    private Food food;

    public Dog(Food food) {
        this.food = food;
    }

    public Dog() {
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public void eat() {
//        food = new Meat();
//        food = new Apple();
        System.out.println(food.name());

    }
}
