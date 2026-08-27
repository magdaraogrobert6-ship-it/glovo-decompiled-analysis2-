package o;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getRoledelegate {
    public static final ReentrantLock IconCompatParcelizer = new ReentrantLock();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 45;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
    }

    public static final /* synthetic */ ReentrantLock read() {
        int i = 2 % 2;
        int i2 = read + 95;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return IconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
