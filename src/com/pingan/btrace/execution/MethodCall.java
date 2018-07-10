package com.pingan.btrace.execution;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/10
 * @Description: 方法调用
 */
public class MethodCall {
    static final String[] userNames = new String[]{"jerrik","smith","bob","scott","angela","ben","jobs","bill","joe","john","rike"};

    static final Random random = new Random();

    public static void main(String[] args){
        System.out.println("startup...");

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    doCall(userNames[random.nextInt(userNames.length-1)],"How are you_" + random.nextInt(100));

                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        System.out.println("end...");
    }

    public static String doCall(String userName,String hints){
        return userName + " ," + hints;
    }
}
