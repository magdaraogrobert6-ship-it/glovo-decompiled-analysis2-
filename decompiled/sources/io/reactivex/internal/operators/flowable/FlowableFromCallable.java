package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableFromCallable<T> extends Flowable<T> implements Callable<T> {
    public final Callable read;

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(fwFClientaddFeatureKeysfeaturesUpdated1);
        fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(deferredScalarSubscription);
        try {
            Object objCall = this.read.call();
            ObjectHelper.write(objCall, "The callable returned a null value");
            deferredScalarSubscription.IconCompatParcelizer(objCall);
        } catch (Throwable th) {
            Exceptions.read(th);
            if (deferredScalarSubscription.get() == 4) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        Object objCall = this.read.call();
        ObjectHelper.write(objCall, "The callable returned a null value");
        return objCall;
    }

    public FlowableFromCallable(Callable callable) {
        this.read = callable;
    }
}
