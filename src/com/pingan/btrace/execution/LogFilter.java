package com.pingan.btrace.execution;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/12
 * @Description:
 */
public class LogFilter implements Filter {

    @Override
    public void doFilter() throws InterruptedException {
        System.out.println("logFilter");
        TimeUnit.SECONDS.sleep(1 );
    }
}
