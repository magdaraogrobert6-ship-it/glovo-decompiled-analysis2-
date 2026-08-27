package io.sentry.android.core.performance;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer implements Comparable {
    public long IconCompatParcelizer;
    public long read;
    public String serializer;
    public long write;

    public final boolean serializer() {
        return this.read != 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.IconCompatParcelizer, ((RemoteActionCompatParcelizer) obj).IconCompatParcelizer);
    }

    public final void read(long j) {
        this.read = j;
        this.IconCompatParcelizer = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.read);
    }

    public final long RemoteActionCompatParcelizer() {
        long j = this.write;
        if (j != 0) {
            return j - this.read;
        }
        return 0L;
    }
}
