package com.nowcoder.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 元海洋、 on 2017/8/1.
 */
@Controller
public class SettingController {

    public static final Logger logger= LoggerFactory.getLogger(SettingController.class);

    @RequestMapping(value = "/setting",method = RequestMethod.GET)
    @ResponseBody
    public String Setting(){
        logger.info("visit method");
        return "settings:ok";
    }
}
