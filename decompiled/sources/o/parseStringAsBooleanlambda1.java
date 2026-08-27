package o;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class parseStringAsBooleanlambda1 {
    LinkedHashMap RemoteActionCompatParcelizer;
    long write;

    public final long[] serializer(long j, String str) {
        LinkedHashMap linkedHashMap = this.RemoteActionCompatParcelizer;
        Long l = (Long) linkedHashMap.get(str);
        if (l == null) {
            return new long[]{-1, -1};
        }
        Iterator it = linkedHashMap.keySet().iterator();
        long j2 = 0;
        for (int i = 0; it.hasNext() && i < 1; i++) {
            if (((String) it.next()).equals(str)) {
                j2 = j - this.write;
                this.write = j;
            }
        }
        linkedHashMap.remove(str);
        return new long[]{j - l.longValue(), j2};
    }
}
