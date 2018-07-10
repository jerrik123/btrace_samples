package com.pingan.btrace.execution;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/10
 * @Description: 查看length的值
 */
public class MyList<T> extends ArrayList<T> {
    private int length;

    public void adds(String value){
        length++;
    }

    public int length(){
        return length;
    }

    public static void main(String[] args){
        MyList<String> list = new MyList<String>();

        while(true){
            list.adds(UUID.randomUUID().toString().substring(0,10));
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println(list.length());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
