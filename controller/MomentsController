package com.zz.web310.controller;

import com.zz.web310.Service.IMomnentsService;
import com.zz.web310.entity.Moments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zncu on 2017-10-01.
 */

@RestController
@RequestMapping(value = "/pyq")
public class MomentsController {

    //get只能通过url发信息；  post 有body 可以传多个信息
    //request -> requestbody
    //request -> json ->java instance

    @RequestMapping(value = "/info", method = RequestMethod.POST)
    private Moments postMoments(@RequestBody Moments pyq){
        if (pyq == null) {
            Moments moments = new Moments();
            moments.setUser("NoBody");
            return moments;
        }
        return pyq;

    }

    // Autowired 相当于 applicationContext.getBean(IMomentsService.class)
    @Autowired
    @Qualifier(value = "pyq") // applicationContext.getBean(name = "pyq") 传参要传name
    private IMomnentsService momentsService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Moments saveMoments(@RequestBody Moments moments){
        if(moments != null){
            System.out.println(moments.getUser());
            return momentsService.saveMoments(moments);
        }
        return null;
    }

}
