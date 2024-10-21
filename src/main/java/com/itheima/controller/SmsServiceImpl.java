package com.itheima.controller;

import com.itheima.Service.SmsService;

import java.io.Serializable;
import java.util.ArrayDeque;

public class SmsServiceImpl implements SmsService, Serializable {

    @Override
    public String send(String message) {
        System.out.println("send message: "+message);
        return message;
    }


}
