package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class SubscriberCompletableObserver<T> implements CompletableObserver, FwFClientclose11 {
    public final FwFClientaddFeatureKeysfeaturesUpdated1 read;
    public Disposable serializer;

    @Override // o.FwFClientclose11
    public final void request(long j) {
    }

    @Override // o.FwFClientclose11
    public final void cancel() {
        this.serializer.dispose();
    }

    @Override // io.reactivex.CompletableObserver
    public final void onComplete() {
        this.read.onComplete();
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(Throwable th) {
        this.read.onError(th);
    }

    @Override // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.serializer, disposable)) {
            this.serializer = disposable;
            this.read.onSubscribe(this);
        }
    }

    public SubscriberCompletableObserver(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.read = fwFClientaddFeatureKeysfeaturesUpdated1;
    }
}
