package o;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getCACHE_SUFFIX_PREFERENCES_FILEannotations {
    public static final java.util.logging.Logger serializer = java.util.logging.Logger.getLogger(getCACHE_SUFFIX_PREFERENCES_FILEannotations.class.getName());
    public final AtomicLong read;
    public final String write;

    public getCACHE_SUFFIX_PREFERENCES_FILEannotations(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.read = atomicLong;
        TextStreamsKt.read("value must be positive", j > 0);
        this.write = "keepalive time nanos";
        atomicLong.set(j);
    }
}
