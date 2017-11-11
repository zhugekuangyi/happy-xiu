package com.mingsheng.controller;

import com.alibaba.fastjson.JSONObject;
import com.mingsheng.model.User;
import com.mingsheng.service.UserService;
import com.mingsheng.util.RespStatus;
import com.mingsheng.util.SmsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 增加支付密码的验证码
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/regCode", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONObject regCode(String phone) {
        try {
            if(phone ==null|| phone.trim().length()<=0){
                return RespStatus.fail("手机号不能为空");
            }
            User user = userService.getUserByPhone(Integer.parseInt(phone));
            if(user!=null){
                return RespStatus.fail("该用户已注册，请登录");
            }
            Random r = new Random();
            String code = "";
            for (int i = 1; i <= 6; i++) {
                code += String.valueOf(r.nextInt(10));
            }
            SmsUtils.veriCode(phone, code);
            RedisUtil.getRu().setex("reg" + phone, code, 1800);
            return RespStatus.success();
        } catch (Exception e) {
            e.printStackTrace();
            return RespStatus.exception();
        }
    }

}
