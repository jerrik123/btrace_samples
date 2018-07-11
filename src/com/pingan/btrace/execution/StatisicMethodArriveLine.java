package com.pingan.btrace.execution;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/11
 * @Description: 统计方法是否到了指定的行
 */
public class StatisicMethodArriveLine {

    static Random random = new Random();

    static final String[] userNames = new String[]{"jerrik","smith","bob","scott","angela","ben","jobs","bill","joe","john","rike"};

    public void arrive() throws Exception {
        System.out.println("arrive begin()");
        int index = 0;
        while(true){
            String userName = userNames[random.nextInt(userNames.length-1)];
            if(userName.equals("jerrik")){
                System.out.println("jerrik is comming.");
            }
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public static void main(String[] args) throws Exception {
        new StatisicMethodArriveLine().arrive();
    }


}
