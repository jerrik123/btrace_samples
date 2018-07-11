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
 * @Description: 统计方法耗时(使用Kind.Call)
 */
@BTrace
public class StatisicMethodCostTimeWithCall {
    @OnMethod(
            clazz = "com.pingan.btrace.execution.StatisicMethodCostTime",
            method = "execute",
            location = @Location(clazz = "/.*/",method = "/.*/",value = Kind.CALL ,where = Where.AFTER)
    )
    public static void onInfo(@Self Object self,@TargetInstance Object instance, @TargetMethodOrField String method, @Duration long duration){
        BTraceUtils.println("method: " + method + " ,costTime: " + duration/1000000.0);
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
