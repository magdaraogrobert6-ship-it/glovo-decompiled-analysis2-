package o;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class migratePushDeliveryEventsToJsonlambda10 {
    private static final HashMap IconCompatParcelizer = new HashMap();
    private final HashMap write = new HashMap();

    public static migratePushDeliveryEventsToJsonlambda10 read(String str) {
        HashMap map = IconCompatParcelizer;
        if (!map.containsKey(str)) {
            map.put(str, new migratePushDeliveryEventsToJsonlambda10());
        }
        return (migratePushDeliveryEventsToJsonlambda10) map.get(str);
    }

    public final ArrayList IconCompatParcelizer() {
        return new ArrayList(this.write.keySet());
    }

    public final <T> T RemoteActionCompatParcelizer(String str) {
        T t = (T) this.write.get(str);
        if (t == null) {
            return null;
        }
        return t;
    }

    private migratePushDeliveryEventsToJsonlambda10() {
    }

    public final void read(String str, Object obj) {
        this.write.put(str, obj);
    }

    public final void RemoteActionCompatParcelizer() {
        this.write.clear();
    }
}
