import com.sun.btrace.BTraceUtils;
import com.sun.btrace.BTraceUtils.Threads;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Duration;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/10
 * @Description: 测试未通过
 */
@BTrace
public class ExceptionTrace {
    @OnMethod(
            clazz = "com.pingan.btrace.execution.PrintExceptionTrace",
            method = "doException",
            location = @Location(value = Kind.ERROR)
    )
    public static void onInfo(Exception exception, @Duration long duration){
        BTraceUtils.println("exception: ");
        Threads.jstack(exception);
    }
}
