package o;

import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import io.sentry.SentryUUID;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class setPlacedUnderMotionFrameOfReference implements hasui, getTailui {
    public final Executor write;
    public final HashMap RemoteActionCompatParcelizer = new HashMap();
    public ArrayDeque IconCompatParcelizer = new ArrayDeque();

    public final void write(Gson$$ExternalSyntheticBUOutline0 gson$$ExternalSyntheticBUOutline0) {
        synchronized (this) {
            gson$$ExternalSyntheticBUOutline0.getClass();
            if (this.RemoteActionCompatParcelizer.containsKey(SentryUUID.class)) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.RemoteActionCompatParcelizer.get(SentryUUID.class);
                concurrentHashMap.remove(gson$$ExternalSyntheticBUOutline0);
                if (concurrentHashMap.isEmpty()) {
                    this.RemoteActionCompatParcelizer.remove(SentryUUID.class);
                }
            }
        }
    }

    public final void write(Executor executor, trimChain trimchain) {
        synchronized (this) {
            executor.getClass();
            if (!this.RemoteActionCompatParcelizer.containsKey(SentryUUID.class)) {
                this.RemoteActionCompatParcelizer.put(SentryUUID.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.RemoteActionCompatParcelizer.get(SentryUUID.class)).put(trimchain, executor);
        }
    }

    public setPlacedUnderMotionFrameOfReference(Executor executor) {
        this.write = executor;
    }
}
