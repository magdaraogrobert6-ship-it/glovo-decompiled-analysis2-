package o;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class copyeZhPAX0 implements Blur_androidKt {
    public final ConcurrentHashMap write;
    public final configureShadowFoewPVk serializer = new configureShadowFoewPVk();
    public final ConcurrentHashMap read = new ConcurrentHashMap();

    @Override // o.Blur_androidKt
    public final void RemoteActionCompatParcelizer(String str, long j) {
        str.getClass();
        this.read.put(str, String.valueOf(j));
    }

    @Override // o.Blur_androidKt
    public final void serializer(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.read.put(str, str2);
    }

    public copyeZhPAX0() {
        new ConcurrentHashMap();
        this.write = new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    @Override // o.Blur_androidKt
    public final void serializer() {
        Long lValueOf;
        long jUptimeMillis = SystemClock.uptimeMillis();
        configureShadowFoewPVk configureshadowfoewpvk = this.serializer;
        configureshadowfoewpvk.IconCompatParcelizer = Long.valueOf(jUptimeMillis);
        Long l = configureshadowfoewpvk.serializer;
        if (l != null) {
            long jLongValue = l.longValue();
            Long l2 = configureshadowfoewpvk.IconCompatParcelizer;
            if (l2 != null) {
                lValueOf = Long.valueOf(l2.longValue() - jLongValue);
            } else {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        this.read.put("durationMs", String.valueOf(lValueOf != null ? lValueOf.longValue() : 0L));
    }
}
