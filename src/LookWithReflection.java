import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;
import java.lang.reflect.Field;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/10
 */
@BTrace
public class LookWithReflection {

    @OnMethod(
            clazz = "com.pingan.btrace.execution.MyList",
            method = "adds",
            location = @Location(Kind.ENTRY)
    )
    public static void lookField(@Self Object self){
        Field field = BTraceUtils.field("com.pingan.btrace.execution.MyList","length");
        int length = (int) BTraceUtils.get(field,self);
        BTraceUtils.println("length: " + length);

    }

    /*
     *
     * btrace.bat 8960  samples\LookWithReflection.java
     *
     */
}
