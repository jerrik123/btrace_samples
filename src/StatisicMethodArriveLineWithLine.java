import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Duration;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Self;
import com.sun.btrace.annotations.TargetInstance;
import com.sun.btrace.annotations.TargetMethodOrField;
import com.sun.btrace.annotations.Where;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/10
 * @Description: 统计方法是否到达指定的行(使用Kind.LINE)
 */
@BTrace
public class StatisicMethodArriveLineWithLine {

    @OnMethod(
            clazz = "com.pingan.btrace.execution.StatisicMethodArriveLine",
            location = @Location(value = Kind.LINE, line = 22)
    )
    public static void onInfo() {
        BTraceUtils.println("method arrive line 26");
    }

    /***
     *
     method: println ,costTime: 0.041844
     method: nextInt ,costTime: 0.004513
     method: sleep ,costTime: 42.949809
     method: doExecute ,costTime: 460.49123
     method: printResult ,costTime: 551.8408
     method: println ,costTime: 0.013948
     method: nextInt ,costTime: 0.002461
     method: sleep ,costTime: 2387.618168
     method: doExecute ,costTime: 304.664437
     method: printResult ,costTime: 2360.98868
     method: println ,costTime: 0.050048
     method: nextInt ,costTime: 0.006153
     method: sleep ,costTime: 329.267372
     method: doExecute ,costTime: 354.529962
     method: printResult ,costTime: 808.155934
     method: println ,costTime: 0.077944
     method: nextInt ,costTime: 0.005333
     method: sleep ,costTime: 1817.198302
     method: doExecute ,costTime: 1822.732763
     method: printResult ,costTime: 2859.415024
     method: println ,costTime: 0.042254
     method: nextInt ,costTime: 0.019281
     method: sleep ,costTime: 2643.780286
     method: doExecute ,costTime: 1424.440728
     method: printResult ,costTime: 3650.923271
     method: println ,costTime: 0.044715
     *
     */
}
