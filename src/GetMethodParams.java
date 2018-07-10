import static com.sun.btrace.BTraceUtils.println;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Return;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/10
 * @Description: 获取方法参数(注意:实际执行过程中没有package)
 * 注意: 方法必须是静态的
 */
@BTrace
public class GetMethodParams {

    @OnMethod(
            clazz = "com.pingan.btrace.execution.MethodCall",
            method = "doCall",
            location = @Location(Kind.RETURN)
    )
    public static void sayHello(String userName, String hints, @Return String result) {
        println("userName: " + userName);
        println("hints: " + hints);
        println(result);
    }

    /*
        cd D:\open_source\btrace\btrace-bin-1.3.11\bin>
        btrace.bat 6048 samples\GetMethodParams.java
     */
}
