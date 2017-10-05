package com.zz.web310.Service;

import com.zz.web310.entity.Moments;
import org.jboss.logging.FormatWith;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zncu on 2017-10-01.
 */

@Service
//@Service(value = ""pyq) 放在类上， 相当于 create been momentsServiceImpl name pyq
//Service 相当于 @Bean 放在方法上
public class MomentsServiceImpli implements IMomnentsService{

    private Map<String, Moments> momentsHolder;

    @PostConstruct //1.create bean 2. invoke postConstruct method
    private  void init(){
        momentsHolder = new HashMap<String, Moments>();
    }

    // controller -> handle request
    // request -> despatch requestParam to service

    //1.controller
    //2.service
    //3.repo  //in to database
    @Override
    public Moments saveMoments(Moments moments){
        if (moments == null || moments.getUser() == null){
            return null;
        }
        String user = moments.getUser();
        momentsHolder.put(user, moments);
        return moments;
    }


}
