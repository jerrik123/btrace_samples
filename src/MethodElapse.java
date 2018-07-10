import com.sun.btrace.BTraceUtils;
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
 * @Description: 方法耗时(MethodCall2)
 */
@BTrace
public class MethodElapse {

    @OnMethod(
            clazz = "com.pingan.btrace.execution.MethodCall2",
            method = "call",
            location = @Location(Kind.RETURN)//如果要统计耗时,必须设置成RETURN
    )
    public static void methodElapse(@Self Object obj,@Duration long time){
        BTraceUtils.println("method elapsed time: " + time);
    }
}
