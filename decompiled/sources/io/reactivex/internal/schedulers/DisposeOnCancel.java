package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class DisposeOnCancel implements Future<Object> {
    public final Disposable RemoteActionCompatParcelizer;

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.RemoteActionCompatParcelizer.dispose();
        return false;
    }

    public DisposeOnCancel(Disposable disposable) {
        this.RemoteActionCompatParcelizer = disposable;
    }
}
