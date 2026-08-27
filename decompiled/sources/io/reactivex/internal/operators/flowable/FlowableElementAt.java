package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableElementAt<T> extends AbstractFlowableWithUpstream<T, T> {
    public final boolean RemoteActionCompatParcelizer;
    public final Object serializer;

    public static final class ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        public final boolean IconCompatParcelizer;
        public FwFClientclose11 RemoteActionCompatParcelizer;
        public long read;
        public boolean serializer;
        public final Object write;

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.RemoteActionCompatParcelizer, fwFClientclose11)) {
                this.RemoteActionCompatParcelizer = fwFClientclose11;
                this.RatingCompat.onSubscribe(this);
                fwFClientclose11.request(Long.MAX_VALUE);
            }
        }

        public ElementAtSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Object obj, boolean z) {
            super(fwFClientaddFeatureKeysfeaturesUpdated1);
            this.write = obj;
            this.IconCompatParcelizer = z;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, o.FwFClientclose11
        public final void cancel() {
            super.cancel();
            this.RemoteActionCompatParcelizer.cancel();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            if (this.serializer) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.serializer = true;
                this.RatingCompat.onError(th);
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            if (this.serializer) {
                return;
            }
            this.serializer = true;
            Object obj = this.write;
            if (obj != null) {
                IconCompatParcelizer(obj);
                return;
            }
            boolean z = this.IconCompatParcelizer;
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.RatingCompat;
            if (z) {
                fwFClientaddFeatureKeysfeaturesUpdated1.onError(new NoSuchElementException());
            } else {
                fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.serializer) {
                return;
            }
            long j = this.read;
            if (j != 0) {
                this.read = j + 1;
                return;
            }
            this.serializer = true;
            this.RemoteActionCompatParcelizer.cancel();
            IconCompatParcelizer(obj);
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.IconCompatParcelizer.subscribe((FlowableSubscriber) new ElementAtSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, this.serializer, this.RemoteActionCompatParcelizer));
    }

    public FlowableElementAt(Flowable flowable, Object obj, boolean z) {
        super(flowable);
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = z;
    }
}
