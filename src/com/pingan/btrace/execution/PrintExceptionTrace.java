package com.pingan.btrace.execution;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/11
 * @Description:
 */
public class PrintExceptionTrace {

    public static void main(String[] args) {
        while (true) {
            try {
                doException();
            } catch (Exception e) {
               // e.printStackTrace();
            }
        }
    }

    public static void doException() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw e;
        }
    }
}
