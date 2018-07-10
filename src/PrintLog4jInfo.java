import com.sun.btrace.BTraceUtils;
import com.sun.btrace.BTraceUtils.Reflective;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;
import java.lang.reflect.Field;
import org.apache.log4j.lf5.LogRecord;
import org.slf4j.Logger;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/10
 * @Description:
 */
@BTrace
public class PrintLog4jInfo {
    private static Field msgField = Reflective.field("org.apache.log4j.lf5.LogRecord", "_message");

    @OnMethod(
            clazz = "+org.slf4j.Logger",
            method = "info"
    )
    public static void onInfo(@Self Logger logger,LogRecord record){
        BTraceUtils.println(Reflective.get(msgField, record));
    }
}
