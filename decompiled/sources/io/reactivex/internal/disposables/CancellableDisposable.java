package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Cancellable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import o.InAppMessageManagerBase;

/* JADX INFO: loaded from: classes4.dex */
public final class CancellableDisposable extends AtomicReference<Cancellable> implements Disposable {
    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Cancellable andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            ((InAppMessageManagerBase) andSet).serializer.write((CancellationException) null);
        } catch (Exception e) {
            Exceptions.read(e);
            RxJavaPlugins.IconCompatParcelizer(e);
        }
    }

    public CancellableDisposable(Object obj) {
        super(obj);
    }
}
