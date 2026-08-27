package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
final class WeakMapCtorCache extends CtorCache {
    public static final /* synthetic */ int write = 0;

    static {
        new ReentrantReadWriteLock();
        new WeakHashMap();
    }
}
