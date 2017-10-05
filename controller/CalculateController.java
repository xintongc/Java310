package com.zz.web310.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zncu on 2017-09-23.
 */

@RestController
@RequestMapping(value = "/calculate")

public class CalculateController { //rename: shift + F6

    @RequestMapping (value = "/add")
    public Integer add(Integer v1, Integer v2){ http://localhost:8080/calculate/add?v1=2&v2=3
    //传参顺序不重要，类似于map
        if(v1 == null || v2 == null){
            return 0;
        }
        System.out.println("=======");
        return v1 + v2;
    }
    @RequestMapping (value = "/sub")
    public Integer sub(Integer v1, Integer v2){
        if(v1 == null || v2 == null){
            return 0;
        }
        System.out.println("=======");
        return v1 - v2;
    }

    @RequestMapping (value = "/times")
    public Integer times(Integer v1, Integer v2){
        if(v1 == null || v2 == null){
            return 0;
        }
        System.out.println("=======");
        return v1 * v2;
    }

    @RequestMapping (value = "/div")
    public Integer div(Integer v1, Integer v2){
        if(v1 == null || v2 == null){
            return 0;
        }
        if(v2 == 0){
            return 0;
        }
        System.out.println("=======");
        return v1 / v2;
    }


    //路径变量  host:port/path ？param  URL标准语法
    //localhost : 8080 /calculate/add ? param

    @RequestMapping(value = "/add/{v1}/{v2}") //上面v1和下面的v1名字需要对应
    public Integer add2(@PathVariable Integer v1,
                        @PathVariable Integer v2){
        if (v1 == null || v2 == null){
            return 0;
        }
        System.out.println("=========");
        return v1 + v2;
    }

    //para -> sumList
    // 1,2,3,4,5 List<Integer>
    //1,2,3,4,5.split(",") foreach -> Integer.valueof("1")

    @RequestMapping(value = "/sum")
    public Integer sum(@RequestParam List<Integer> sumList){
        if(sumList==null || sumList.isEmpty()){
            return 0;
        }
        int sum = 0;
        for(int value : sumList){
            sum = sum + value;
        }
        return sum;
    }
}
