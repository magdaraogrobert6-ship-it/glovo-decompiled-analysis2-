package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambda0OyDyRxHf9VxLg_dWmpWMJcIdY {
    public static int read;
    public static int serializer;

    public static int write() {
        int i = serializer;
        int i2 = i % 6157393;
        serializer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        read = iFreeMemory;
        return iFreeMemory;
    }
}
