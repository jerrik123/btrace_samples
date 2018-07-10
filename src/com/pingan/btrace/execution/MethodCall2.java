package com.pingan.btrace.execution;

import com.sun.btrace.annotations.Duration;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/10
 * @Description: 方法调用(设置延迟)
 */
public class MethodCall2 {

    static Random random = new Random();

    public static void call(){
        try {
            TimeUnit.MILLISECONDS.sleep(random.nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        while(true){
            call();
        }
    }
}
