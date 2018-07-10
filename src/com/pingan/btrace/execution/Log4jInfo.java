package com.pingan.btrace.execution;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/10
 * @Description:
 */
public class Log4jInfo {
    private static Logger logger = LoggerFactory.getLogger(MyList.class);

    public static void main(String[] args){
        int i = 0;
        while(true){
            logger.info("start...{}", i);
            i++;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
