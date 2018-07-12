package com.pingan.btrace.execution;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/12
 * @Description:
 */
public class FilterBootstrap {

    public static void main(String[] args) throws InterruptedException {
        List<Filter> filterList = new ArrayList<Filter>();

        filterList.add(new LogFilter());
        filterList.add(new EncodeFilter());

        while(true){
            for(Filter filter : filterList){
                filter.doFilter();
                TimeUnit.SECONDS.sleep(2);
            }
        }
    }
}
