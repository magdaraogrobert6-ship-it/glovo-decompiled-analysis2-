package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, FwFClientclose11 {
        public FwFClientclose11 RatingCompat;
        public Throwable RemoteActionCompatParcelizer;
        public volatile boolean read;
        public volatile boolean serializer;
        public final FwFClientaddFeatureKeysfeaturesUpdated1 write;
        public final AtomicLong MediaMetadataCompat = new AtomicLong();
        public final AtomicReference IconCompatParcelizer = new AtomicReference();

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            this.read = true;
            RemoteActionCompatParcelizer();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            this.IconCompatParcelizer.lazySet(obj);
            RemoteActionCompatParcelizer();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.RatingCompat, fwFClientclose11)) {
                this.RatingCompat = fwFClientclose11;
                this.write.onSubscribe(this);
                fwFClientclose11.request(Long.MAX_VALUE);
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            this.RemoteActionCompatParcelizer = th;
            this.read = true;
            RemoteActionCompatParcelizer();
        }

        public BackpressureLatestSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            this.write = fwFClientaddFeatureKeysfeaturesUpdated1;
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            if (this.serializer) {
                return;
            }
            this.serializer = true;
            this.RatingCompat.cancel();
            if (getAndIncrement() == 0) {
                this.IconCompatParcelizer.lazySet(null);
            }
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.write(this.MediaMetadataCompat, j);
                RemoteActionCompatParcelizer();
            }
        }

        public final boolean write(boolean z, boolean z2, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, AtomicReference atomicReference) {
            if (this.serializer) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.RemoteActionCompatParcelizer;
            if (th != null) {
                atomicReference.lazySet(null);
                fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
            return true;
        }

        public final void RemoteActionCompatParcelizer() {
            if (getAndIncrement() != 0) {
                return;
            }
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.write;
            AtomicLong atomicLong = this.MediaMetadataCompat;
            AtomicReference atomicReference = this.IconCompatParcelizer;
            int iAddAndGet = 1;
            do {
                long j = 0;
                while (true) {
                    if (j == atomicLong.get()) {
                        break;
                    }
                    boolean z = this.read;
                    Object andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (write(z, z2, fwFClientaddFeatureKeysfeaturesUpdated1, atomicReference)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    fwFClientaddFeatureKeysfeaturesUpdated1.onNext(andSet);
                    j++;
                }
                if (j == atomicLong.get()) {
                    if (write(this.read, atomicReference.get() == null, fwFClientaddFeatureKeysfeaturesUpdated1, atomicReference)) {
                        return;
                    }
                }
                if (j != 0) {
                    BackpressureHelper.serializer(atomicLong, j);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    public FlowableOnBackpressureLatest(FlowableFromObservable flowableFromObservable) {
        super(flowableFromObservable);
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.IconCompatParcelizer.subscribe((FlowableSubscriber) new BackpressureLatestSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1));
    }
}
