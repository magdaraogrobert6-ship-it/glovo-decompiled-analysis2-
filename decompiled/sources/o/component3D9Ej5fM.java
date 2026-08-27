package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class component3D9Ej5fM {
    public static int write(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
