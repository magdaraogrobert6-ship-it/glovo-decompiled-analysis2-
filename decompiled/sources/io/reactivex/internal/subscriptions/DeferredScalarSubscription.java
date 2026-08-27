package io.reactivex.internal.subscriptions;

import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    public Object MediaDescriptionCompat;
    public final FwFClientaddFeatureKeysfeaturesUpdated1 RatingCompat;

    public void cancel() {
        set(4);
        this.MediaDescriptionCompat = null;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        IconCompatParcelizer(obj);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.MediaDescriptionCompat = null;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i) {
        lazySet(8);
        return 2;
    }

    public DeferredScalarSubscription(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.RatingCompat = fwFClientaddFeatureKeysfeaturesUpdated1;
    }

    public final void IconCompatParcelizer(Object obj) {
        int i = get();
        do {
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.RatingCompat;
            if (i == 8) {
                this.MediaDescriptionCompat = obj;
                lazySet(16);
                fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
                if (get() != 4) {
                    fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
                if (get() != 4) {
                    fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                    return;
                }
                return;
            }
            this.MediaDescriptionCompat = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.MediaDescriptionCompat = null;
    }

    @Override // o.FwFClientclose11
    public final void request(long j) {
        Object obj;
        if (SubscriptionHelper.validate(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.MediaDescriptionCompat) == null) {
                        return;
                    }
                    this.MediaDescriptionCompat = null;
                    FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.RatingCompat;
                    fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
                    if (get() != 4) {
                        fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.MediaDescriptionCompat;
        this.MediaDescriptionCompat = null;
        return obj;
    }
}
