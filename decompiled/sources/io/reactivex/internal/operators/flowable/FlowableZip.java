package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;
import o.syncCustomerProfilefwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableZip<T, R> extends Flowable<R> {
    public final syncCustomerProfilefwf_client_release[] IconCompatParcelizer;
    public final Function RemoteActionCompatParcelizer;
    public final int read;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements FwFClientclose11 {
        public final FwFClientaddFeatureKeysfeaturesUpdated1 IconCompatParcelizer;
        public final ZipSubscriber[] MediaDescriptionCompat;
        public final Function MediaMetadataCompat;
        public volatile boolean RemoteActionCompatParcelizer;
        public final AtomicLong read;
        public final AtomicThrowable serializer;
        public final Object[] write;

        public final void RemoteActionCompatParcelizer() {
            for (ZipSubscriber zipSubscriber : this.MediaDescriptionCompat) {
                zipSubscriber.getClass();
                SubscriptionHelper.cancel(zipSubscriber);
            }
        }

        public final void write() {
            if (getAndIncrement() != 0) {
                return;
            }
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.IconCompatParcelizer;
            ZipSubscriber[] zipSubscriberArr = this.MediaDescriptionCompat;
            int length = zipSubscriberArr.length;
            Object[] objArr = this.write;
            int iAddAndGet = 1;
            do {
                long j = this.read.get();
                long j2 = 0;
                while (j != j2) {
                    if (this.RemoteActionCompatParcelizer) {
                        return;
                    }
                    if (this.serializer.get() != null) {
                        RemoteActionCompatParcelizer();
                        AtomicThrowable atomicThrowable = this.serializer;
                        atomicThrowable.getClass();
                        fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable));
                        return;
                    }
                    boolean z = false;
                    for (int i = 0; i < length; i++) {
                        ZipSubscriber zipSubscriber = zipSubscriberArr[i];
                        if (objArr[i] == null) {
                            try {
                                boolean z2 = zipSubscriber.read;
                                SimpleQueue simpleQueue = zipSubscriber.MediaSessionCompatQueueItem;
                                Object objPoll = simpleQueue != null ? simpleQueue.poll() : null;
                                boolean z3 = objPoll == null;
                                if (z2 && z3) {
                                    RemoteActionCompatParcelizer();
                                    if (this.serializer.get() == null) {
                                        fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                                        return;
                                    }
                                    AtomicThrowable atomicThrowable2 = this.serializer;
                                    atomicThrowable2.getClass();
                                    fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable2));
                                    return;
                                }
                                if (z3) {
                                    z = true;
                                } else {
                                    objArr[i] = objPoll;
                                }
                            } catch (Throwable th) {
                                Exceptions.read(th);
                                AtomicThrowable atomicThrowable3 = this.serializer;
                                atomicThrowable3.getClass();
                                ExceptionHelper.read(atomicThrowable3, th);
                                RemoteActionCompatParcelizer();
                                AtomicThrowable atomicThrowable4 = this.serializer;
                                atomicThrowable4.getClass();
                                fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable4));
                                return;
                            }
                        }
                    }
                    if (z) {
                        break;
                    }
                    try {
                        Object objApply = this.MediaMetadataCompat.apply(objArr.clone());
                        ObjectHelper.write(objApply, "The zipper returned a null value");
                        fwFClientaddFeatureKeysfeaturesUpdated1.onNext(objApply);
                        j2++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th2) {
                        Exceptions.read(th2);
                        RemoteActionCompatParcelizer();
                        AtomicThrowable atomicThrowable5 = this.serializer;
                        atomicThrowable5.getClass();
                        ExceptionHelper.read(atomicThrowable5, th2);
                        AtomicThrowable atomicThrowable6 = this.serializer;
                        atomicThrowable6.getClass();
                        fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable6));
                        return;
                    }
                }
                if (j == j2) {
                    if (this.RemoteActionCompatParcelizer) {
                        return;
                    }
                    if (this.serializer.get() != null) {
                        RemoteActionCompatParcelizer();
                        AtomicThrowable atomicThrowable7 = this.serializer;
                        atomicThrowable7.getClass();
                        fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable7));
                        return;
                    }
                    for (int i2 = 0; i2 < length; i2++) {
                        ZipSubscriber zipSubscriber2 = zipSubscriberArr[i2];
                        if (objArr[i2] == null) {
                            try {
                                boolean z4 = zipSubscriber2.read;
                                SimpleQueue simpleQueue2 = zipSubscriber2.MediaSessionCompatQueueItem;
                                Object objPoll2 = simpleQueue2 != null ? simpleQueue2.poll() : null;
                                boolean z5 = objPoll2 == null;
                                if (z4 && z5) {
                                    RemoteActionCompatParcelizer();
                                    if (this.serializer.get() == null) {
                                        fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                                        return;
                                    }
                                    AtomicThrowable atomicThrowable8 = this.serializer;
                                    atomicThrowable8.getClass();
                                    fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable8));
                                    return;
                                }
                                if (!z5) {
                                    objArr[i2] = objPoll2;
                                }
                            } catch (Throwable th3) {
                                Exceptions.read(th3);
                                AtomicThrowable atomicThrowable9 = this.serializer;
                                atomicThrowable9.getClass();
                                ExceptionHelper.read(atomicThrowable9, th3);
                                RemoteActionCompatParcelizer();
                                AtomicThrowable atomicThrowable10 = this.serializer;
                                atomicThrowable10.getClass();
                                fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable10));
                                return;
                            }
                        }
                    }
                }
                if (j2 != 0) {
                    for (ZipSubscriber zipSubscriber3 : zipSubscriberArr) {
                        zipSubscriber3.request(j2);
                    }
                    if (j != Long.MAX_VALUE) {
                        this.read.addAndGet(-j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public ZipCoordinator(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Function function, int i, int i2) {
            this.IconCompatParcelizer = fwFClientaddFeatureKeysfeaturesUpdated1;
            this.MediaMetadataCompat = function;
            ZipSubscriber[] zipSubscriberArr = new ZipSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                zipSubscriberArr[i3] = new ZipSubscriber(this, i2);
            }
            this.write = new Object[i];
            this.MediaDescriptionCompat = zipSubscriberArr;
            this.read = new AtomicLong();
            this.serializer = new AtomicThrowable();
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            RemoteActionCompatParcelizer();
        }

        public void subscribe(syncCustomerProfilefwf_client_release[] synccustomerprofilefwf_client_releaseArr, int i) {
            ZipSubscriber[] zipSubscriberArr = this.MediaDescriptionCompat;
            for (int i2 = 0; i2 < i && !this.RemoteActionCompatParcelizer && this.serializer.get() == null; i2++) {
                synccustomerprofilefwf_client_releaseArr[i2].subscribe(zipSubscriberArr[i2]);
            }
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.write(this.read, j);
                write();
            }
        }
    }

    public static final class ZipSubscriber<T, R> extends AtomicReference<FwFClientclose11> implements FlowableSubscriber<T>, FwFClientclose11 {
        public final int IconCompatParcelizer;
        public int MediaMetadataCompat;
        public SimpleQueue MediaSessionCompatQueueItem;
        public final int RemoteActionCompatParcelizer;
        public volatile boolean read;
        public final ZipCoordinator serializer;
        public long write;

        @Override // o.FwFClientclose11
        public final void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            this.read = true;
            this.serializer.write();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            ZipCoordinator zipCoordinator = this.serializer;
            AtomicThrowable atomicThrowable = zipCoordinator.serializer;
            atomicThrowable.getClass();
            if (!ExceptionHelper.read(atomicThrowable, th)) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.read = true;
                zipCoordinator.write();
            }
        }

        public ZipSubscriber(ZipCoordinator zipCoordinator, int i) {
            this.serializer = zipCoordinator;
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = i - (i >> 2);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.MediaMetadataCompat != 2) {
                this.MediaSessionCompatQueueItem.offer(obj);
            }
            this.serializer.write();
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (this.MediaMetadataCompat != 1) {
                long j2 = this.write + j;
                if (j2 < this.IconCompatParcelizer) {
                    this.write = j2;
                } else {
                    this.write = 0L;
                    get().request(j2);
                }
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.setOnce(this, fwFClientclose11)) {
                if (fwFClientclose11 instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) fwFClientclose11;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.MediaMetadataCompat = iRequestFusion;
                        this.MediaSessionCompatQueueItem = queueSubscription;
                        this.read = true;
                        this.serializer.write();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.MediaMetadataCompat = iRequestFusion;
                        this.MediaSessionCompatQueueItem = queueSubscription;
                        fwFClientclose11.request(this.RemoteActionCompatParcelizer);
                        return;
                    }
                }
                this.MediaSessionCompatQueueItem = new SpscArrayQueue(this.RemoteActionCompatParcelizer);
                fwFClientclose11.request(this.RemoteActionCompatParcelizer);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        syncCustomerProfilefwf_client_release[] synccustomerprofilefwf_client_releaseArr = this.IconCompatParcelizer;
        int length = synccustomerprofilefwf_client_releaseArr.length;
        if (length == 0) {
            EmptySubscription.complete(fwFClientaddFeatureKeysfeaturesUpdated1);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(fwFClientaddFeatureKeysfeaturesUpdated1, this.RemoteActionCompatParcelizer, length, this.read);
        fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(zipCoordinator);
        zipCoordinator.subscribe(synccustomerprofilefwf_client_releaseArr, length);
    }

    public FlowableZip(syncCustomerProfilefwf_client_release[] synccustomerprofilefwf_client_releaseArr, Function function, int i) {
        this.IconCompatParcelizer = synccustomerprofilefwf_client_releaseArr;
        this.RemoteActionCompatParcelizer = function;
        this.read = i;
    }
}
