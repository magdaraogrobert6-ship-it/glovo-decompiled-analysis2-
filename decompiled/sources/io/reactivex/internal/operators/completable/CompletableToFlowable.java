package io.reactivex.internal.operators.completable;

import io.reactivex.Flowable;
import io.reactivex.internal.observers.SubscriberCompletableObserver;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableToFlowable<T> extends Flowable<T> {
    public final ObservableFlatMapCompletableCompletable serializer;

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.serializer.subscribe(new SubscriberCompletableObserver(fwFClientaddFeatureKeysfeaturesUpdated1));
    }

    public CompletableToFlowable(ObservableFlatMapCompletableCompletable observableFlatMapCompletableCompletable) {
        this.serializer = observableFlatMapCompletableCompletable;
    }
}
