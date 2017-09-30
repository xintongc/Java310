package com.zz.java310.v1;

/**
 * Created by zncu on 2017-09-23.
 */
public class Driver {

    public static void main(String[] args) {
        Food apple = new Apple(); //创建对象
        Food meat = new Meat();


        Dog dog = new Dog();
        dog.setFood(apple); //构建关系
        dog.eat();

        dog.setFood(meat); //call method，做组装的操作，只能创建最大的对象，不能创建中间的对象，如果想需要抽方法
        dog.eat();

    }
}
