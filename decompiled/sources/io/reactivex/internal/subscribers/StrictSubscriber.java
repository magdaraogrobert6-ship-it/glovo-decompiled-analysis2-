package io.reactivex.internal.subscribers;

import bo.app.af$$ExternalSyntheticOutline0;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, FwFClientclose11 {
    public volatile boolean read;
    public final FwFClientaddFeatureKeysfeaturesUpdated1 write;
    public final AtomicThrowable RemoteActionCompatParcelizer = new AtomicThrowable();
    public final AtomicLong serializer = new AtomicLong();
    public final AtomicReference MediaDescriptionCompat = new AtomicReference();
    public final AtomicBoolean IconCompatParcelizer = new AtomicBoolean();

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onComplete() {
        this.read = true;
        FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.write;
        AtomicThrowable atomicThrowable = this.RemoteActionCompatParcelizer;
        if (getAndIncrement() == 0) {
            atomicThrowable.getClass();
            Throwable thRemoteActionCompatParcelizer = ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable);
            if (thRemoteActionCompatParcelizer != null) {
                fwFClientaddFeatureKeysfeaturesUpdated1.onError(thRemoteActionCompatParcelizer);
            } else {
                fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
            }
        }
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onError(Throwable th) {
        this.read = true;
        FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.write;
        AtomicThrowable atomicThrowable = this.RemoteActionCompatParcelizer;
        atomicThrowable.getClass();
        if (!ExceptionHelper.read(atomicThrowable, th)) {
            RxJavaPlugins.IconCompatParcelizer(th);
        } else if (getAndIncrement() == 0) {
            fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable));
        }
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
        if (this.IconCompatParcelizer.compareAndSet(false, true)) {
            this.write.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.MediaDescriptionCompat, this.serializer, fwFClientclose11);
        } else {
            fwFClientclose11.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    public StrictSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.write = fwFClientaddFeatureKeysfeaturesUpdated1;
    }

    @Override // o.FwFClientclose11
    public final void cancel() {
        if (this.read) {
            return;
        }
        SubscriptionHelper.cancel(this.MediaDescriptionCompat);
    }

    @Override // o.FwFClientclose11
    public final void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException(af$$ExternalSyntheticOutline0.m(j, "§3.9 violated: positive request amount required but it was ")));
        } else {
            SubscriptionHelper.deferredRequest(this.MediaDescriptionCompat, this.serializer, j);
        }
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onNext(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.write;
            fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
            if (decrementAndGet() != 0) {
                AtomicThrowable atomicThrowable = this.RemoteActionCompatParcelizer;
                atomicThrowable.getClass();
                Throwable thRemoteActionCompatParcelizer = ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable);
                if (thRemoteActionCompatParcelizer != null) {
                    fwFClientaddFeatureKeysfeaturesUpdated1.onError(thRemoteActionCompatParcelizer);
                } else {
                    fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                }
            }
        }
    }
}
