package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class LambdaSubscriber<T> extends AtomicReference<FwFClientclose11> implements FlowableSubscriber<T>, FwFClientclose11, Disposable, LambdaConsumerIntrospection {
    public final Consumer IconCompatParcelizer;
    public final Consumer RemoteActionCompatParcelizer;
    public final Consumer serializer;
    public final Action write;

    @Override // o.FwFClientclose11
    public final void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.serializer != Functions.RemoteActionCompatParcelizer;
    }

    public LambdaSubscriber(Consumer consumer, Consumer consumer2, Action action, Consumer consumer3) {
        this.RemoteActionCompatParcelizer = consumer;
        this.serializer = consumer2;
        this.write = action;
        this.IconCompatParcelizer = consumer3;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onComplete() {
        FwFClientclose11 fwFClientclose11 = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (fwFClientclose11 != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.write.run();
            } catch (Throwable th) {
                Exceptions.read(th);
                RxJavaPlugins.IconCompatParcelizer(th);
            }
        }
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onError(Throwable th) {
        FwFClientclose11 fwFClientclose11 = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (fwFClientclose11 == subscriptionHelper) {
            RxJavaPlugins.IconCompatParcelizer(th);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.serializer.accept(th);
        } catch (Throwable th2) {
            Exceptions.read(th2);
            RxJavaPlugins.IconCompatParcelizer(new CompositeException(th, th2));
        }
    }

    @Override // o.FwFClientclose11
    public final void request(long j) {
        get().request(j);
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onNext(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.RemoteActionCompatParcelizer.accept(obj);
        } catch (Throwable th) {
            Exceptions.read(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
        if (SubscriptionHelper.setOnce(this, fwFClientclose11)) {
            try {
                this.IconCompatParcelizer.accept(this);
            } catch (Throwable th) {
                Exceptions.read(th);
                fwFClientclose11.cancel();
                onError(th);
            }
        }
    }
}
