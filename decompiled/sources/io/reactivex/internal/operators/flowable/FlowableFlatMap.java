package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;
import o.syncCustomerProfilefwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableFlatMap<T, U> extends AbstractFlowableWithUpstream<T, U> {
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final Function serializer;

    public static final class InnerSubscriber<T, U> extends AtomicReference<FwFClientclose11> implements FlowableSubscriber<U>, Disposable {
        public final long IconCompatParcelizer;
        public long MediaBrowserCompatMediaItem;
        public final MergeSubscriber MediaDescriptionCompat;
        public volatile SimpleQueue MediaMetadataCompat;
        public final int RemoteActionCompatParcelizer;
        public final int read;
        public volatile boolean serializer;
        public int write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            this.serializer = true;
            this.MediaDescriptionCompat.RemoteActionCompatParcelizer();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            MergeSubscriber mergeSubscriber = this.MediaDescriptionCompat;
            AtomicThrowable atomicThrowable = mergeSubscriber.MediaBrowserCompatMediaItem;
            atomicThrowable.getClass();
            if (!ExceptionHelper.read(atomicThrowable, th)) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            this.serializer = true;
            if (!mergeSubscriber.RemoteActionCompatParcelizer) {
                mergeSubscriber.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.cancel();
                for (InnerSubscriber innerSubscriber : (InnerSubscriber[]) mergeSubscriber.ComponentActivity.getAndSet(MergeSubscriber.serializer)) {
                    innerSubscriber.getClass();
                    SubscriptionHelper.cancel(innerSubscriber);
                }
            }
            mergeSubscriber.RemoteActionCompatParcelizer();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            int i = this.write;
            MergeSubscriber mergeSubscriber = this.MediaDescriptionCompat;
            if (i == 2) {
                mergeSubscriber.RemoteActionCompatParcelizer();
                return;
            }
            if (mergeSubscriber.get() == 0 && mergeSubscriber.compareAndSet(0, 1)) {
                long j = mergeSubscriber.MediaSessionCompatToken.get();
                SimpleQueue simpleQueue = this.MediaMetadataCompat;
                if (j == 0 || !(simpleQueue == null || simpleQueue.isEmpty())) {
                    if (simpleQueue == null && (simpleQueue = this.MediaMetadataCompat) == null) {
                        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(mergeSubscriber.read);
                        this.MediaMetadataCompat = spscArrayQueue;
                        simpleQueue = spscArrayQueue;
                    }
                    if (!simpleQueue.offer(obj)) {
                        mergeSubscriber.onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    mergeSubscriber.RatingCompat.onNext(obj);
                    if (j != Long.MAX_VALUE) {
                        mergeSubscriber.MediaSessionCompatToken.decrementAndGet();
                    }
                    serializer(1L);
                }
                if (mergeSubscriber.decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue simpleQueue2 = this.MediaMetadataCompat;
                if (simpleQueue2 == null) {
                    SpscArrayQueue spscArrayQueue2 = new SpscArrayQueue(mergeSubscriber.read);
                    this.MediaMetadataCompat = spscArrayQueue2;
                    simpleQueue2 = spscArrayQueue2;
                }
                if (!simpleQueue2.offer(obj)) {
                    mergeSubscriber.onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (mergeSubscriber.getAndIncrement() != 0) {
                    return;
                }
            }
            mergeSubscriber.serializer();
        }

        public InnerSubscriber(MergeSubscriber mergeSubscriber, long j) {
            this.IconCompatParcelizer = j;
            this.MediaDescriptionCompat = mergeSubscriber;
            int i = mergeSubscriber.read;
            this.RemoteActionCompatParcelizer = i;
            this.read = i >> 2;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        public final void serializer(long j) {
            if (this.write != 1) {
                long j2 = this.MediaBrowserCompatMediaItem + j;
                if (j2 < this.read) {
                    this.MediaBrowserCompatMediaItem = j2;
                } else {
                    this.MediaBrowserCompatMediaItem = 0L;
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
                        this.write = iRequestFusion;
                        this.MediaMetadataCompat = queueSubscription;
                        this.serializer = true;
                        this.MediaDescriptionCompat.RemoteActionCompatParcelizer();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.write = iRequestFusion;
                        this.MediaMetadataCompat = queueSubscription;
                    }
                }
                fwFClientclose11.request(this.RemoteActionCompatParcelizer);
            }
        }
    }

    public static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, FwFClientclose11 {
        public final AtomicReference ComponentActivity;
        public volatile boolean IconCompatParcelizer;
        public final AtomicThrowable MediaBrowserCompatMediaItem = new AtomicThrowable();
        public long MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public volatile boolean MediaSessionCompatQueueItem;
        public int MediaSessionCompatResultReceiverWrapper;
        public final AtomicLong MediaSessionCompatToken;
        public volatile SimplePlainQueue ParcelableVolumeInfo;
        public final int PlaybackStateCompat;
        public final Function PlaybackStateCompatCustomAction;
        public final FwFClientaddFeatureKeysfeaturesUpdated1 RatingCompat;
        public final boolean RemoteActionCompatParcelizer;
        public long ResultReceiver;
        public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        public FwFClientclose11 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        public final int read;
        public static final InnerSubscriber[] write = new InnerSubscriber[0];
        public static final InnerSubscriber[] serializer = new InnerSubscriber[0];

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, fwFClientclose11)) {
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = fwFClientclose11;
                this.RatingCompat.onSubscribe(this);
                if (this.IconCompatParcelizer) {
                    return;
                }
                int i = this.PlaybackStateCompat;
                if (i == Integer.MAX_VALUE) {
                    fwFClientclose11.request(Long.MAX_VALUE);
                } else {
                    fwFClientclose11.request(i);
                }
            }
        }

        public final void serializer() {
            long j;
            long j2;
            long j3;
            boolean z;
            int i;
            int i2;
            long j4;
            Object obj;
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.RatingCompat;
            int iAddAndGet = 1;
            while (!read()) {
                SimplePlainQueue simplePlainQueue = this.ParcelableVolumeInfo;
                long jAddAndGet = this.MediaSessionCompatToken.get();
                boolean z2 = jAddAndGet == Long.MAX_VALUE;
                long j5 = 0;
                if (simplePlainQueue != null) {
                    j = 0;
                    do {
                        long j6 = 0;
                        obj = null;
                        while (jAddAndGet != 0) {
                            Object objPoll = simplePlainQueue.poll();
                            if (read()) {
                                return;
                            }
                            if (objPoll == null) {
                                obj = objPoll;
                                break;
                            }
                            fwFClientaddFeatureKeysfeaturesUpdated1.onNext(objPoll);
                            j++;
                            j6++;
                            jAddAndGet--;
                            obj = objPoll;
                        }
                        if (j6 != 0) {
                            jAddAndGet = z2 ? Long.MAX_VALUE : this.MediaSessionCompatToken.addAndGet(-j6);
                        }
                        if (jAddAndGet == 0) {
                            break;
                        }
                    } while (obj != null);
                } else {
                    j = 0;
                }
                boolean z3 = this.MediaSessionCompatQueueItem;
                SimplePlainQueue simplePlainQueue2 = this.ParcelableVolumeInfo;
                InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) this.ComponentActivity.get();
                int length = innerSubscriberArr.length;
                if (z3 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    AtomicThrowable atomicThrowable = this.MediaBrowserCompatMediaItem;
                    atomicThrowable.getClass();
                    Throwable thRemoteActionCompatParcelizer = ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable);
                    if (thRemoteActionCompatParcelizer != ExceptionHelper.serializer) {
                        if (thRemoteActionCompatParcelizer == null) {
                            fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                            return;
                        } else {
                            fwFClientaddFeatureKeysfeaturesUpdated1.onError(thRemoteActionCompatParcelizer);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j7 = this.MediaDescriptionCompat;
                    int i3 = this.MediaMetadataCompat;
                    if (length <= i3 || innerSubscriberArr[i3].IconCompatParcelizer != j7) {
                        if (length <= i3) {
                            i3 = 0;
                        }
                        for (int i4 = 0; i4 < length && innerSubscriberArr[i3].IconCompatParcelizer != j7; i4++) {
                            i3++;
                            if (i3 == length) {
                                i3 = 0;
                            }
                        }
                        this.MediaMetadataCompat = i3;
                        this.MediaDescriptionCompat = innerSubscriberArr[i3].IconCompatParcelizer;
                    }
                    int i5 = i3;
                    boolean z4 = false;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            z = z4;
                            break;
                        }
                        if (read()) {
                            return;
                        }
                        InnerSubscriber innerSubscriber = innerSubscriberArr[i5];
                        Object obj2 = null;
                        while (!read()) {
                            SimpleQueue simpleQueue = innerSubscriber.MediaMetadataCompat;
                            if (simpleQueue == null) {
                                i = length;
                            } else {
                                i = length;
                                Object obj3 = obj2;
                                long j8 = j5;
                                while (jAddAndGet != j5) {
                                    try {
                                        Object objPoll2 = simpleQueue.poll();
                                        if (objPoll2 == null) {
                                            obj3 = objPoll2;
                                            j5 = 0;
                                            break;
                                        }
                                        fwFClientaddFeatureKeysfeaturesUpdated1.onNext(objPoll2);
                                        if (read()) {
                                            return;
                                        }
                                        jAddAndGet--;
                                        j8++;
                                        obj3 = objPoll2;
                                        j5 = 0;
                                    } catch (Throwable th) {
                                        Exceptions.read(th);
                                        SubscriptionHelper.cancel(innerSubscriber);
                                        AtomicThrowable atomicThrowable2 = this.MediaBrowserCompatMediaItem;
                                        atomicThrowable2.getClass();
                                        ExceptionHelper.read(atomicThrowable2, th);
                                        if (!this.RemoteActionCompatParcelizer) {
                                            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.cancel();
                                        }
                                        if (read()) {
                                            return;
                                        }
                                        write(innerSubscriber);
                                        i6++;
                                        z4 = true;
                                        i2 = 1;
                                    }
                                }
                                if (j8 != j5) {
                                    jAddAndGet = !z2 ? this.MediaSessionCompatToken.addAndGet(-j8) : Long.MAX_VALUE;
                                    innerSubscriber.serializer(j8);
                                    j4 = 0;
                                } else {
                                    j4 = j5;
                                }
                                if (jAddAndGet != j4 && obj3 != null) {
                                    length = i;
                                    obj2 = obj3;
                                    j5 = 0;
                                }
                            }
                            boolean z5 = innerSubscriber.serializer;
                            SimpleQueue simpleQueue2 = innerSubscriber.MediaMetadataCompat;
                            if (z5 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                write(innerSubscriber);
                                if (read()) {
                                    return;
                                }
                                j++;
                                z4 = true;
                            }
                            if (jAddAndGet == 0) {
                                z = z4;
                                break;
                            }
                            i5++;
                            if (i5 == i) {
                                i5 = 0;
                            }
                            i2 = 1;
                            i6 += i2;
                            length = i;
                            j5 = 0;
                        }
                        return;
                    }
                    this.MediaMetadataCompat = i5;
                    this.MediaDescriptionCompat = innerSubscriberArr[i5].IconCompatParcelizer;
                    j3 = j;
                    j2 = 0;
                } else {
                    j2 = 0;
                    j3 = j;
                    z = false;
                }
                if (j3 != j2 && !this.IconCompatParcelizer) {
                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.request(j3);
                }
                if (z) {
                    iAddAndGet = iAddAndGet;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void write(InnerSubscriber innerSubscriber) {
            InnerSubscriber[] innerSubscriberArr;
            while (true) {
                AtomicReference atomicReference = this.ComponentActivity;
                InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) atomicReference.get();
                int length = innerSubscriberArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerSubscriberArr2[i] == innerSubscriber) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr = write;
                } else {
                    InnerSubscriber[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr2, 0, innerSubscriberArr3, 0, i);
                    System.arraycopy(innerSubscriberArr2, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                    innerSubscriberArr = innerSubscriberArr3;
                }
                while (!atomicReference.compareAndSet(innerSubscriberArr2, innerSubscriberArr)) {
                    if (atomicReference.get() != innerSubscriberArr2) {
                    }
                }
                return;
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            if (this.MediaSessionCompatQueueItem) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            AtomicThrowable atomicThrowable = this.MediaBrowserCompatMediaItem;
            atomicThrowable.getClass();
            if (!ExceptionHelper.read(atomicThrowable, th)) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            this.MediaSessionCompatQueueItem = true;
            if (!this.RemoteActionCompatParcelizer) {
                for (InnerSubscriber innerSubscriber : (InnerSubscriber[]) this.ComponentActivity.getAndSet(serializer)) {
                    innerSubscriber.getClass();
                    SubscriptionHelper.cancel(innerSubscriber);
                }
            }
            RemoteActionCompatParcelizer();
        }

        public final SimplePlainQueue write() {
            SimplePlainQueue simplePlainQueue = this.ParcelableVolumeInfo;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            int i = this.PlaybackStateCompat;
            SimplePlainQueue spscLinkedArrayQueue = i == Integer.MAX_VALUE ? new SpscLinkedArrayQueue(this.read) : new SpscArrayQueue(i);
            this.ParcelableVolumeInfo = spscLinkedArrayQueue;
            return spscLinkedArrayQueue;
        }

        public MergeSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Function function, boolean z, int i, int i2) {
            AtomicReference atomicReference = new AtomicReference();
            this.ComponentActivity = atomicReference;
            this.MediaSessionCompatToken = new AtomicLong();
            this.RatingCompat = fwFClientaddFeatureKeysfeaturesUpdated1;
            this.PlaybackStateCompatCustomAction = function;
            this.RemoteActionCompatParcelizer = z;
            this.PlaybackStateCompat = i;
            this.read = i2;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Math.max(1, i >> 1);
            atomicReference.lazySet(write);
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            SimplePlainQueue simplePlainQueue;
            InnerSubscriber[] innerSubscriberArr;
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.cancel();
            AtomicReference atomicReference = this.ComponentActivity;
            InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) atomicReference.get();
            InnerSubscriber[] innerSubscriberArr3 = serializer;
            if (innerSubscriberArr2 != innerSubscriberArr3 && (innerSubscriberArr = (InnerSubscriber[]) atomicReference.getAndSet(innerSubscriberArr3)) != innerSubscriberArr3) {
                for (InnerSubscriber innerSubscriber : innerSubscriberArr) {
                    innerSubscriber.getClass();
                    SubscriptionHelper.cancel(innerSubscriber);
                }
                AtomicThrowable atomicThrowable = this.MediaBrowserCompatMediaItem;
                atomicThrowable.getClass();
                Throwable thRemoteActionCompatParcelizer = ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable);
                if (thRemoteActionCompatParcelizer != null && thRemoteActionCompatParcelizer != ExceptionHelper.serializer) {
                    RxJavaPlugins.IconCompatParcelizer(thRemoteActionCompatParcelizer);
                }
            }
            if (getAndIncrement() != 0 || (simplePlainQueue = this.ParcelableVolumeInfo) == null) {
                return;
            }
            simplePlainQueue.clear();
        }

        public final boolean read() {
            if (this.IconCompatParcelizer) {
                SimplePlainQueue simplePlainQueue = this.ParcelableVolumeInfo;
                if (simplePlainQueue != null) {
                    simplePlainQueue.clear();
                    return true;
                }
            } else {
                if (this.RemoteActionCompatParcelizer || this.MediaBrowserCompatMediaItem.get() == null) {
                    return false;
                }
                SimplePlainQueue simplePlainQueue2 = this.ParcelableVolumeInfo;
                if (simplePlainQueue2 != null) {
                    simplePlainQueue2.clear();
                }
                AtomicThrowable atomicThrowable = this.MediaBrowserCompatMediaItem;
                atomicThrowable.getClass();
                Throwable thRemoteActionCompatParcelizer = ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable);
                if (thRemoteActionCompatParcelizer != ExceptionHelper.serializer) {
                    this.RatingCompat.onError(thRemoteActionCompatParcelizer);
                }
            }
            return true;
        }

        public final void RemoteActionCompatParcelizer() {
            if (getAndIncrement() == 0) {
                serializer();
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            if (this.MediaSessionCompatQueueItem) {
                return;
            }
            this.MediaSessionCompatQueueItem = true;
            RemoteActionCompatParcelizer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.MediaSessionCompatQueueItem) {
                return;
            }
            try {
                Object objApply = this.PlaybackStateCompatCustomAction.apply(obj);
                ObjectHelper.write(objApply, "The mapper returned a null Publisher");
                syncCustomerProfilefwf_client_release synccustomerprofilefwf_client_release = (syncCustomerProfilefwf_client_release) objApply;
                if (synccustomerprofilefwf_client_release instanceof Callable) {
                    try {
                        Object objCall = ((Callable) synccustomerprofilefwf_client_release).call();
                        if (objCall == null) {
                            if (this.PlaybackStateCompat == Integer.MAX_VALUE || this.IconCompatParcelizer) {
                                return;
                            }
                            int i = this.MediaSessionCompatResultReceiverWrapper + 1;
                            this.MediaSessionCompatResultReceiverWrapper = i;
                            int i2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                            if (i == i2) {
                                this.MediaSessionCompatResultReceiverWrapper = 0;
                                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.request(i2);
                                return;
                            }
                            return;
                        }
                        if (get() == 0 && compareAndSet(0, 1)) {
                            long j = this.MediaSessionCompatToken.get();
                            SimplePlainQueue simplePlainQueueWrite = this.ParcelableVolumeInfo;
                            if (j == 0 || !(simplePlainQueueWrite == null || simplePlainQueueWrite.isEmpty())) {
                                if (simplePlainQueueWrite == null) {
                                    simplePlainQueueWrite = write();
                                }
                                if (!simplePlainQueueWrite.offer(objCall)) {
                                    onError(new IllegalStateException("Scalar queue full?!"));
                                    return;
                                }
                            } else {
                                this.RatingCompat.onNext(objCall);
                                if (j != Long.MAX_VALUE) {
                                    this.MediaSessionCompatToken.decrementAndGet();
                                }
                                if (this.PlaybackStateCompat != Integer.MAX_VALUE && !this.IconCompatParcelizer) {
                                    int i3 = this.MediaSessionCompatResultReceiverWrapper + 1;
                                    this.MediaSessionCompatResultReceiverWrapper = i3;
                                    int i4 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                                    if (i3 == i4) {
                                        this.MediaSessionCompatResultReceiverWrapper = 0;
                                        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.request(i4);
                                    }
                                }
                            }
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } else if (!write().offer(objCall)) {
                            onError(new IllegalStateException("Scalar queue full?!"));
                            return;
                        } else if (getAndIncrement() != 0) {
                            return;
                        }
                        serializer();
                        return;
                    } catch (Throwable th) {
                        Exceptions.read(th);
                        AtomicThrowable atomicThrowable = this.MediaBrowserCompatMediaItem;
                        atomicThrowable.getClass();
                        ExceptionHelper.read(atomicThrowable, th);
                        RemoteActionCompatParcelizer();
                        return;
                    }
                }
                long j2 = this.ResultReceiver;
                this.ResultReceiver = 1 + j2;
                InnerSubscriber innerSubscriber = new InnerSubscriber(this, j2);
                AtomicReference atomicReference = this.ComponentActivity;
                while (true) {
                    InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) atomicReference.get();
                    if (innerSubscriberArr == serializer) {
                        SubscriptionHelper.cancel(innerSubscriber);
                        return;
                    }
                    int length = innerSubscriberArr.length;
                    InnerSubscriber[] innerSubscriberArr2 = new InnerSubscriber[length + 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                    innerSubscriberArr2[length] = innerSubscriber;
                    do {
                        if (atomicReference.compareAndSet(innerSubscriberArr, innerSubscriberArr2)) {
                            synccustomerprofilefwf_client_release.subscribe(innerSubscriber);
                            return;
                        }
                    } while (atomicReference.get() == innerSubscriberArr);
                }
            } catch (Throwable th2) {
                Exceptions.read(th2);
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.cancel();
                onError(th2);
            }
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.write(this.MediaSessionCompatToken, j);
                RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        Flowable flowable = this.IconCompatParcelizer;
        Function function = this.serializer;
        if (FlowableScalarXMap.RemoteActionCompatParcelizer(flowable, fwFClientaddFeatureKeysfeaturesUpdated1, function)) {
            return;
        }
        flowable.subscribe((FlowableSubscriber) subscribe(fwFClientaddFeatureKeysfeaturesUpdated1, function, false, this.read, this.RemoteActionCompatParcelizer));
    }

    public FlowableFlatMap(Flowable flowable, Function function, int i, int i2) {
        super(flowable);
        this.serializer = function;
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    public static <T, U> FlowableSubscriber<T> subscribe(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Function<? super T, ? extends syncCustomerProfilefwf_client_release> function, boolean z, int i, int i2) {
        return new MergeSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, function, z, i, i2);
    }
}
