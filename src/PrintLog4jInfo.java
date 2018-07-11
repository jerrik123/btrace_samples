import com.sun.btrace.BTraceUtils;
import com.sun.btrace.BTraceUtils.Reflective;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;
import java.lang.reflect.Field;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/10
 * @Description:
 */
@BTrace
public class PrintLog4jInfo {
    @OnMethod(
            clazz = "+org.slf4j.Logger",
            method = "info"
    )
    public static void onInfo(@Self Object self,String arg0,Object arg1){
        BTraceUtils.println("output: " + arg0 + "-" + arg1);
    }
}
