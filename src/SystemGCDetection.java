import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/10
 * @Description: 打印出System.gc()的调用栈
 */
@BTrace
public class SystemGCDetection {

    //方法必须是静态的
    @OnMethod(
            clazz = "java.lang.System",
            method = "gc",
            location = @Location(Kind.ENTRY)
    )
    public static void onSystemGC(){
        BTraceUtils.println("---system gc trace---");
        BTraceUtils.jstack();
    }
}
