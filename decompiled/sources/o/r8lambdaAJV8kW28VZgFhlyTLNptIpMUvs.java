package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaAJV8kW28VZgFhlyTLNptIpMUvs {
    public static final Method RemoteActionCompatParcelizer;
    public static final Method write;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i];
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{method2.getName(), "addSuppressed"}, getCieXyz.write())).booleanValue()) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class}, getCieXyz.write())).booleanValue()) {
                    break;
                }
            }
            i++;
        }
        write = method2;
        for (Method method3 : methods) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{method3.getName(), "getSuppressed"}, getCieXyz.write())).booleanValue()) {
                method = method3;
                break;
            }
        }
        RemoteActionCompatParcelizer = method;
    }
}
