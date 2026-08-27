package androidx.work.impl;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerStoppedException extends CancellationException {
    public final int serializer;

    public WorkerStoppedException(int i) {
        this.serializer = i;
    }
}
