package com.zz.java310.v2;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zncu on 2017-09-23.
 */
public class Driver {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        //那些类创建了方法，把它记下来但没有调用
      //  Animal dog = (Animal) applicationContext.getBean(Animal.class);
        //需要一个animal对象，叫Bean创建一个animal对象
        Animal dog = (Animal) applicationContext.getBean("bad_dog");

        dog.eat();

    }
}
