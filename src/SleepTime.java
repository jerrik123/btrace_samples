import static com.sun.btrace.BTraceUtils.println;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Duration;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Return;
import com.sun.btrace.annotations.Self;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/10
 * @Description: 打印休眠时间
 */
@BTrace
public class SleepTime {

    @OnMethod(
            clazz = "/java\\.util\\.concurrent\\.TimeUnit..*/",
            method = "/.*/",
            location = @Location(Kind.RETURN)
    )
    public static void sleep(@Self Object self,long sleepTime,@Duration long costTime) {
        println("sleepTime: " + sleepTime);
        println("costTime: " + costTime);
    }

}
