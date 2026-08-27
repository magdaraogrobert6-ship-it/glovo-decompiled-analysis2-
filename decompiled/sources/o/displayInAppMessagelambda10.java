package o;

import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
public final class displayInAppMessagelambda10 {
    public static int read;
    public static int serializer;

    public static String serializer(r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0 r8lambdauprfjtiz1df0oco00nrhbn7_a0) {
        String string = r8lambdauprfjtiz1df0oco00nrhbn7_a0.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public static int read() {
        int i = read;
        int i2 = i % 9633587;
        read = i + 1;
        if (i2 != 0) {
            return serializer;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        serializer = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
