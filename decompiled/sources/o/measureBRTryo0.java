package o;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public abstract class measureBRTryo0 {
    public static void serializer(component2D9Ej5fM component2d9ej5fm, long j) {
        LockSupport.parkNanos(component2d9ej5fm, Math.min(j, 2147483647999999999L));
    }
}
