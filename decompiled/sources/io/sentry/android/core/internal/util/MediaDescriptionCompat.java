package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaDescriptionCompat {
    public final int read;
    public final long serializer;
    public final AtomicInteger write = new AtomicInteger(0);
    public final AtomicLong IconCompatParcelizer = new AtomicLong(0);
    public final serializer RemoteActionCompatParcelizer = serializer.IconCompatParcelizer;

    public final boolean IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = this.IconCompatParcelizer;
        long j = atomicLong.get();
        AtomicInteger atomicInteger = this.write;
        if (j == 0 || atomicLong.get() + this.serializer <= jUptimeMillis) {
            atomicInteger.set(0);
            atomicLong.set(jUptimeMillis);
            return false;
        }
        if (atomicInteger.incrementAndGet() < this.read) {
            return false;
        }
        atomicInteger.set(0);
        return true;
    }

    public MediaDescriptionCompat(long j, int i) {
        this.serializer = j;
        this.read = i <= 0 ? 1 : i;
    }
}
