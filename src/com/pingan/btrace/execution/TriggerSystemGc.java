package com.pingan.btrace.execution;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/10
 * @Description:
 */
public class TriggerSystemGc {

    static final int _1M = 1024 * 1024;

    public static void main(String[] args) throws InterruptedException {
        int index = 0;
        while (true) {
            index++;
            if(index%5 == 0){
                System.gc();
            }
            byte[] buffer = new byte[_1M];

            TimeUnit.SECONDS.sleep(2);
        }
    }
}
