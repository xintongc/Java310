package com.zz.java310.v0;

/**
 * Created by zncu on 2017-09-23.
 */
public class Dog implements Animal {

    private Food food;

    @Override
    public void eat() {
//        food = new Meat();
        food = new Apple();//食物是dog自己创建的，其实两者并没有关联
        System.out.println(food.name());

    }
}
