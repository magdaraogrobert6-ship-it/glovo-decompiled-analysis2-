package o;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DelayedInitializationAnalyticsBehavior {
    public static volatile DelayedInitializationAnalyticsBehavior read;
    public static final DelayedInitializationAnalyticsBehavior serializer = new DelayedInitializationAnalyticsBehavior();
    public final Map IconCompatParcelizer = Collections.EMPTY_MAP;

    public static DelayedInitializationAnalyticsBehavior write() {
        DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior;
        DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior2 = read;
        if (delayedInitializationAnalyticsBehavior2 != null) {
            return delayedInitializationAnalyticsBehavior2;
        }
        synchronized (DelayedInitializationAnalyticsBehavior.class) {
            delayedInitializationAnalyticsBehavior = read;
            if (delayedInitializationAnalyticsBehavior == null) {
                Class cls = DataStoreKey.RemoteActionCompatParcelizer;
                DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior3 = null;
                if (cls != null) {
                    try {
                        delayedInitializationAnalyticsBehavior3 = (DelayedInitializationAnalyticsBehavior) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                delayedInitializationAnalyticsBehavior = delayedInitializationAnalyticsBehavior3 != null ? delayedInitializationAnalyticsBehavior3 : serializer;
                read = delayedInitializationAnalyticsBehavior;
            }
        }
        return delayedInitializationAnalyticsBehavior;
    }

    public final getServerKeyFromCardType serializer(int i, accessgetDiskCacheLockp accessgetdiskcachelockp) {
        return (getServerKeyFromCardType) this.IconCompatParcelizer.get(new accessgetKeyMapdelegatecp(i, accessgetdiskcachelockp));
    }
}
