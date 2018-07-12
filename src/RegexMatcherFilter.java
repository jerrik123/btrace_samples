import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/12
 * @Description:
 */
@BTrace
public class RegexMatcherFilter {

    @OnMethod(clazz = "+com.pingan.btrace.execution.Filter",method = "doFilter")
    public static void onFilter(@ProbeClassName String probeClass, @ProbeMethodName String probeMethod){
        BTraceUtils.println("entered " + probeClass + "."  + probeMethod);
    }
}
