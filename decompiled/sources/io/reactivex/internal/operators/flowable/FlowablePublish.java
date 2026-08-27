package io.reactivex.internal.operators.flowable;

import bo.app.af$$ExternalSyntheticOutline1;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ConnectConsumer;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.syncCustomerProfilefwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowablePublish<T> extends ConnectableFlowable<T> {
    public final AtomicReference IconCompatParcelizer;
    public final syncCustomerProfilefwf_client_release RemoteActionCompatParcelizer;
    public final Flowable read;
    public final int serializer;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class FlowablePublisher<T> implements syncCustomerProfilefwf_client_release {
        public final AtomicReference IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.syncCustomerProfilefwf_client_release
        public void subscribe(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            PublishSubscriber publishSubscriber;
            InnerSubscriber innerSubscriber = new InnerSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1);
            fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(innerSubscriber);
            loop0: while (true) {
                PublishSubscriber publishSubscriber2 = (PublishSubscriber) this.IconCompatParcelizer.get();
                if (publishSubscriber2 == null || publishSubscriber2.isDisposed()) {
                    PublishSubscriber publishSubscriber3 = new PublishSubscriber(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
                    AtomicReference atomicReference = this.IconCompatParcelizer;
                    while (true) {
                        if (atomicReference.compareAndSet(publishSubscriber2, publishSubscriber3)) {
                            publishSubscriber = publishSubscriber3;
                        } else if (atomicReference.get() != publishSubscriber2) {
                        }
                    }
                } else {
                    publishSubscriber = publishSubscriber2;
                }
                AtomicReference atomicReference2 = publishSubscriber.RatingCompat;
                while (true) {
                    InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) atomicReference2.get();
                    if (innerSubscriberArr == PublishSubscriber.serializer) {
                        break;
                    }
                    int length = innerSubscriberArr.length;
                    InnerSubscriber[] innerSubscriberArr2 = new InnerSubscriber[length + 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                    innerSubscriberArr2[length] = innerSubscriber;
                    do {
                        if (atomicReference2.compareAndSet(innerSubscriberArr, innerSubscriberArr2)) {
                            break loop0;
                        }
                    } while (atomicReference2.get() == innerSubscriberArr);
                }
            }
            if (innerSubscriber.get() == Long.MIN_VALUE) {
                publishSubscriber.serializer(innerSubscriber);
            } else {
                innerSubscriber.write = publishSubscriber;
            }
            publishSubscriber.read();
        }

        public FlowablePublisher(AtomicReference atomicReference, int i) {
            this.IconCompatParcelizer = atomicReference;
            this.RemoteActionCompatParcelizer = i;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class PublishSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        public final AtomicReference IconCompatParcelizer;
        public volatile Object MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public final int RemoteActionCompatParcelizer;
        public volatile SimpleQueue read;
        public static final InnerSubscriber[] write = new InnerSubscriber[0];
        public static final InnerSubscriber[] serializer = new InnerSubscriber[0];
        public final AtomicReference MediaSessionCompatQueueItem = new AtomicReference();
        public final AtomicReference RatingCompat = new AtomicReference(write);
        public final AtomicBoolean MediaBrowserCompatMediaItem = new AtomicBoolean();

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            AtomicReference atomicReference = this.RatingCompat;
            Object obj = atomicReference.get();
            Object obj2 = serializer;
            if (obj == obj2 || ((InnerSubscriber[]) atomicReference.getAndSet(obj2)) == obj2) {
                return;
            }
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.IconCompatParcelizer, this);
            SubscriptionHelper.cancel(this.MediaSessionCompatQueueItem);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.RatingCompat.get() == serializer;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.setOnce(this.MediaSessionCompatQueueItem, fwFClientclose11)) {
                if (fwFClientclose11 instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) fwFClientclose11;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.MediaMetadataCompat = iRequestFusion;
                        this.read = queueSubscription;
                        this.MediaDescriptionCompat = NotificationLite.complete();
                        read();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.MediaMetadataCompat = iRequestFusion;
                        this.read = queueSubscription;
                        fwFClientclose11.request(this.RemoteActionCompatParcelizer);
                        return;
                    }
                }
                this.read = new SpscArrayQueue(this.RemoteActionCompatParcelizer);
                fwFClientclose11.request(this.RemoteActionCompatParcelizer);
            }
        }

        public final void read() {
            Object objPoll;
            Object objPoll2;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference atomicReference = this.RatingCompat;
            boolean z = true;
            InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) atomicReference.get();
            int iAddAndGet = 1;
            while (true) {
                Object obj = this.MediaDescriptionCompat;
                SimpleQueue simpleQueue = this.read;
                boolean z2 = (simpleQueue == null || simpleQueue.isEmpty()) ? z : false;
                if (RemoteActionCompatParcelizer(obj, z2)) {
                    return;
                }
                if (!z2) {
                    int length = innerSubscriberArr.length;
                    int i = 0;
                    long jMin = Long.MAX_VALUE;
                    for (InnerSubscriber innerSubscriber : innerSubscriberArr) {
                        long j = innerSubscriber.get();
                        if (j != Long.MIN_VALUE) {
                            jMin = Math.min(jMin, j - innerSubscriber.IconCompatParcelizer);
                        } else {
                            i++;
                        }
                    }
                    if (length == i) {
                        Object objError = this.MediaDescriptionCompat;
                        try {
                            objPoll = simpleQueue.poll();
                        } catch (Throwable th) {
                            Exceptions.read(th);
                            ((FwFClientclose11) this.MediaSessionCompatQueueItem.get()).cancel();
                            objError = NotificationLite.error(th);
                            this.MediaDescriptionCompat = objError;
                            objPoll = null;
                        }
                        if (RemoteActionCompatParcelizer(objError, objPoll == null ? z : false)) {
                            return;
                        }
                        if (this.MediaMetadataCompat != z) {
                            ((FwFClientclose11) this.MediaSessionCompatQueueItem.get()).request(1L);
                        }
                    } else {
                        int i2 = 0;
                        while (true) {
                            long j2 = i2;
                            if (j2 < jMin) {
                                Object objError2 = this.MediaDescriptionCompat;
                                try {
                                    objPoll2 = simpleQueue.poll();
                                } catch (Throwable th2) {
                                    Exceptions.read(th2);
                                    ((FwFClientclose11) this.MediaSessionCompatQueueItem.get()).cancel();
                                    objError2 = NotificationLite.error(th2);
                                    this.MediaDescriptionCompat = objError2;
                                    objPoll2 = null;
                                }
                                boolean z3 = objPoll2 == null ? z : false;
                                if (RemoteActionCompatParcelizer(objError2, z3)) {
                                    return;
                                }
                                if (z3) {
                                    z2 = z3;
                                } else {
                                    Object value = NotificationLite.getValue(objPoll2);
                                    int length2 = innerSubscriberArr.length;
                                    int i3 = 0;
                                    boolean z4 = false;
                                    while (i3 < length2) {
                                        InnerSubscriber innerSubscriber2 = innerSubscriberArr[i3];
                                        long j3 = innerSubscriber2.get();
                                        if (j3 != Long.MIN_VALUE) {
                                            if (j3 != Long.MAX_VALUE) {
                                                innerSubscriber2.IconCompatParcelizer++;
                                            }
                                            innerSubscriber2.RemoteActionCompatParcelizer.onNext(value);
                                        } else {
                                            simpleQueue = simpleQueue;
                                            z3 = z3;
                                            z4 = true;
                                        }
                                        i3++;
                                        simpleQueue = simpleQueue;
                                        z3 = z3;
                                    }
                                    SimpleQueue simpleQueue2 = simpleQueue;
                                    boolean z5 = z3;
                                    i2++;
                                    InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) atomicReference.get();
                                    if (z4 || innerSubscriberArr2 != innerSubscriberArr) {
                                        if (i2 != 0 && this.MediaMetadataCompat != 1) {
                                            ((FwFClientclose11) this.MediaSessionCompatQueueItem.get()).request(i2);
                                        }
                                        innerSubscriberArr = innerSubscriberArr2;
                                        z = true;
                                    } else {
                                        simpleQueue = simpleQueue2;
                                        z2 = z5;
                                        z = true;
                                    }
                                }
                            }
                            if (i2 != 0) {
                                z = true;
                                if (this.MediaMetadataCompat != 1) {
                                    ((FwFClientclose11) this.MediaSessionCompatQueueItem.get()).request(j2);
                                }
                            } else {
                                z = true;
                            }
                            if (jMin == 0 || z2) {
                            }
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    innerSubscriberArr = (InnerSubscriber[]) atomicReference.get();
                }
            }
        }

        public final void serializer(InnerSubscriber innerSubscriber) {
            AtomicReference atomicReference;
            InnerSubscriber[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                atomicReference = this.RatingCompat;
                innerSubscriberArr = (InnerSubscriber[]) atomicReference.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerSubscriberArr[i].equals(innerSubscriber)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = write;
                } else {
                    InnerSubscriber[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i);
                    System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!af$$ExternalSyntheticOutline1.IconCompatParcelizer(atomicReference, innerSubscriberArr, innerSubscriberArr2));
        }

        public final boolean RemoteActionCompatParcelizer(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                boolean zIsComplete = NotificationLite.isComplete(obj);
                InnerSubscriber[] innerSubscriberArr = serializer;
                AtomicReference atomicReference = this.RatingCompat;
                AtomicReference atomicReference2 = this.IconCompatParcelizer;
                if (!zIsComplete) {
                    Throwable error = NotificationLite.getError(obj);
                    while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                    }
                    InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) atomicReference.getAndSet(innerSubscriberArr);
                    if (innerSubscriberArr2.length != 0) {
                        int length = innerSubscriberArr2.length;
                        while (i < length) {
                            innerSubscriberArr2[i].RemoteActionCompatParcelizer.onError(error);
                            i++;
                        }
                    } else {
                        RxJavaPlugins.IconCompatParcelizer(error);
                    }
                    return true;
                }
                if (z) {
                    while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                    }
                    InnerSubscriber[] innerSubscriberArr3 = (InnerSubscriber[]) atomicReference.getAndSet(innerSubscriberArr);
                    int length2 = innerSubscriberArr3.length;
                    while (i < length2) {
                        innerSubscriberArr3[i].RemoteActionCompatParcelizer.onComplete();
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            if (this.MediaDescriptionCompat == null) {
                this.MediaDescriptionCompat = NotificationLite.complete();
                read();
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            if (this.MediaDescriptionCompat != null) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.MediaDescriptionCompat = NotificationLite.error(th);
                read();
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.MediaMetadataCompat != 0 || this.read.offer(obj)) {
                read();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        public PublishSubscriber(AtomicReference atomicReference, int i) {
            this.IconCompatParcelizer = atomicReference;
            this.RemoteActionCompatParcelizer = i;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class InnerSubscriber<T> extends AtomicLong implements FwFClientclose11 {
        public long IconCompatParcelizer;
        public final FwFClientaddFeatureKeysfeaturesUpdated1 RemoteActionCompatParcelizer;
        public volatile PublishSubscriber write;

        public InnerSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            this.RemoteActionCompatParcelizer = fwFClientaddFeatureKeysfeaturesUpdated1;
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            long j2;
            if (SubscriptionHelper.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE || j2 == Long.MAX_VALUE) {
                        break;
                    }
                } while (!compareAndSet(j2, BackpressureHelper.serializer(j2, j)));
                PublishSubscriber publishSubscriber = this.write;
                if (publishSubscriber != null) {
                    publishSubscriber.read();
                }
            }
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            PublishSubscriber publishSubscriber;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (publishSubscriber = this.write) == null) {
                return;
            }
            publishSubscriber.serializer(this);
            publishSubscriber.read();
        }
    }

    public static FlowablePublish serializer(Flowable flowable, int i) {
        AtomicReference atomicReference = new AtomicReference();
        return new FlowablePublish(new FlowablePublisher(atomicReference, i), flowable, atomicReference, i);
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.RemoteActionCompatParcelizer.subscribe(fwFClientaddFeatureKeysfeaturesUpdated1);
    }

    public final void serializer(ConnectConsumer connectConsumer) {
        PublishSubscriber publishSubscriber;
        loop0: while (true) {
            AtomicReference atomicReference = this.IconCompatParcelizer;
            publishSubscriber = (PublishSubscriber) atomicReference.get();
            if (publishSubscriber != null && !publishSubscriber.isDisposed()) {
                break;
            }
            PublishSubscriber publishSubscriber2 = new PublishSubscriber(atomicReference, this.serializer);
            do {
                if (atomicReference.compareAndSet(publishSubscriber, publishSubscriber2)) {
                    publishSubscriber = publishSubscriber2;
                    break loop0;
                }
            } while (atomicReference.get() == publishSubscriber);
        }
        AtomicBoolean atomicBoolean = publishSubscriber.MediaBrowserCompatMediaItem;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        this.read.subscribe((FlowableSubscriber) publishSubscriber);
    }

    public FlowablePublish(syncCustomerProfilefwf_client_release synccustomerprofilefwf_client_release, Flowable flowable, AtomicReference atomicReference, int i) {
        this.RemoteActionCompatParcelizer = synccustomerprofilefwf_client_release;
        this.read = flowable;
        this.IconCompatParcelizer = atomicReference;
        this.serializer = i;
    }
}
