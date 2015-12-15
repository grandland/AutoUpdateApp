package com.grandland.autoupdate.server.controller;

import com.grandland.autoupdate.server.bean.UpdateResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yestin on 2015/12/15.
 * 更新程序的Controller
 */
@Controller
@RequestMapping("/update")
public class UpdateController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @RequestMapping("check")
    @ResponseBody
    public UpdateResponse checkUpdate(@RequestParam("v") int version, HttpServletRequest request){
        //TODO check version and record ip
        String ip = request.getRemoteAddr();
        return null;
    }
}
