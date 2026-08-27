package o;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetLightGraycp {
    public static final com.huawei.hmf.tasks.a.j IconCompatParcelizer = new com.huawei.hmf.tasks.a.j(11);
    public static final LinkedHashMap read = new LinkedHashMap();
    public final accessgetGreencp RemoteActionCompatParcelizer;
    public final ReentrantLock write;

    public accessgetLightGraycp(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (IconCompatParcelizer) {
            LinkedHashMap linkedHashMap = read;
            Object reentrantLock2 = linkedHashMap.get(str);
            if (reentrantLock2 == null) {
                reentrantLock2 = new ReentrantLock();
                linkedHashMap.put(str, reentrantLock2);
            }
            reentrantLock = (ReentrantLock) reentrantLock2;
        }
        this.write = reentrantLock;
        this.RemoteActionCompatParcelizer = z ? new accessgetGreencp(str) : null;
    }
}
