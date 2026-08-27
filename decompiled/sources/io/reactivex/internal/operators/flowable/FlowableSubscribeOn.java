package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;
import o.syncCustomerProfilefwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Scheduler RemoteActionCompatParcelizer;
    public final boolean read;

    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, FwFClientclose11, Runnable {
        public syncCustomerProfilefwf_client_release IconCompatParcelizer;
        public final Scheduler.Worker MediaMetadataCompat;
        public final FwFClientaddFeatureKeysfeaturesUpdated1 RemoteActionCompatParcelizer;
        public final boolean read;
        public final AtomicReference serializer = new AtomicReference();
        public final AtomicLong write = new AtomicLong();

        public static final class Request implements Runnable {
            public final FwFClientclose11 RemoteActionCompatParcelizer;
            public final long serializer;

            @Override // java.lang.Runnable
            public final void run() {
                this.RemoteActionCompatParcelizer.request(this.serializer);
            }

            public Request(long j, FwFClientclose11 fwFClientclose11) {
                this.RemoteActionCompatParcelizer = fwFClientclose11;
                this.serializer = j;
            }
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            SubscriptionHelper.cancel(this.serializer);
            this.MediaMetadataCompat.dispose();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            this.RemoteActionCompatParcelizer.onComplete();
            this.MediaMetadataCompat.dispose();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            this.RemoteActionCompatParcelizer.onError(th);
            this.MediaMetadataCompat.dispose();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            this.RemoteActionCompatParcelizer.onNext(obj);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.setOnce(this.serializer, fwFClientclose11)) {
                long andSet = this.write.getAndSet(0L);
                if (andSet != 0) {
                    read(andSet, fwFClientclose11);
                }
            }
        }

        public SubscribeOnSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Scheduler.Worker worker, syncCustomerProfilefwf_client_release synccustomerprofilefwf_client_release, boolean z) {
            this.RemoteActionCompatParcelizer = fwFClientaddFeatureKeysfeaturesUpdated1;
            this.MediaMetadataCompat = worker;
            this.IconCompatParcelizer = synccustomerprofilefwf_client_release;
            this.read = !z;
        }

        public final void read(long j, FwFClientclose11 fwFClientclose11) {
            if (this.read || Thread.currentThread() == get()) {
                fwFClientclose11.request(j);
            } else {
                this.MediaMetadataCompat.IconCompatParcelizer(new Request(j, fwFClientclose11));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            lazySet(Thread.currentThread());
            syncCustomerProfilefwf_client_release synccustomerprofilefwf_client_release = this.IconCompatParcelizer;
            this.IconCompatParcelizer = null;
            synccustomerprofilefwf_client_release.subscribe(this);
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                AtomicReference atomicReference = this.serializer;
                FwFClientclose11 fwFClientclose11 = (FwFClientclose11) atomicReference.get();
                if (fwFClientclose11 != null) {
                    read(j, fwFClientclose11);
                    return;
                }
                AtomicLong atomicLong = this.write;
                BackpressureHelper.write(atomicLong, j);
                FwFClientclose11 fwFClientclose12 = (FwFClientclose11) atomicReference.get();
                if (fwFClientclose12 != null) {
                    long andSet = atomicLong.getAndSet(0L);
                    if (andSet != 0) {
                        read(andSet, fwFClientclose12);
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        Scheduler.Worker workerWrite = this.RemoteActionCompatParcelizer.write();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, workerWrite, this.IconCompatParcelizer, this.read);
        fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(subscribeOnSubscriber);
        workerWrite.IconCompatParcelizer(subscribeOnSubscriber);
    }

    public FlowableSubscribeOn(Flowable flowable, Scheduler scheduler, boolean z) {
        super(flowable);
        this.RemoteActionCompatParcelizer = scheduler;
        this.read = z;
    }
}
