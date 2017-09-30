package com.zz.java310.v2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zncu on 2017-09-23.
 */

@Configuration
public class Config {

    @Bean //让spring帮你创建对象，如有参数，先找参数的bean。annotation语法
    public Food apple(){
        return new Apple();
    }

    @Bean
    public Food food2(){
        return new Meat();
    }

    @Bean (name = "dog")
    public Animal dog (Food apple, Food food2){//先用类型找，如果类型冲突用再名字找
        //创建对象和建立关系，组装是自动完成的
        Dog dog = new Dog();
        dog.setFood(apple);//设置对象间的关联

        dog.setFood(food2);
        return dog;
    }

    @Bean(name = "bad_dog")
    public Animal bad_dog(Food apple){
        Dog dog = new Dog();
        dog.setFood(apple);
        return dog;
    }



}
