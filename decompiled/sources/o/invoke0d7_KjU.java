package o;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public abstract class invoke0d7_KjU {
    public static void IconCompatParcelizer(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }

    public static void RemoteActionCompatParcelizer(int i, String str) {
        Trace.setCounter(str, i);
    }

    public static boolean RemoteActionCompatParcelizer() {
        return Trace.isEnabled();
    }

    public static void serializer(int i, String str) {
        Trace.endAsyncSection(str, i);
    }
}
