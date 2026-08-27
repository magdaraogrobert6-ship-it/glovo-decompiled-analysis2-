package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getRectManager {
    public static void write(String str, Object... objArr) {
        throw new AssertionError("INTERNAL ASSERTION FAILED: ".concat(String.format(str, objArr)));
    }

    public static void IconCompatParcelizer(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return;
        }
        write(str, objArr);
        throw null;
    }

    public static void RemoteActionCompatParcelizer(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        write(str, objArr);
        throw null;
    }
}
