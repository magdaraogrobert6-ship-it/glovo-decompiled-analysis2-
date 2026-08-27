package io.sentry.android.replay;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda7IJBVrN0sHyidCAZufWEJFc7yY implements Closeable {
    public final AtomicBoolean write = new AtomicBoolean(false);
    public final io.sentry.util.RemoteActionCompatParcelizer read = new io.sentry.util.RemoteActionCompatParcelizer();
    public final ResultReceiver IconCompatParcelizer = new ResultReceiver(this);
    public final r8lambda54BeH8ZsBru0CXI2CCSP2syNys RemoteActionCompatParcelizer = new r8lambda54BeH8ZsBru0CXI2CCSP2syNys(this);

    public final ResultReceiver read() {
        return this.IconCompatParcelizer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.write.set(true);
        this.IconCompatParcelizer.clear();
    }
}
