package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableFlattenIterable<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final Function RemoteActionCompatParcelizer;
    public final int serializer;

    public static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements FlowableSubscriber<T> {
        public volatile boolean IconCompatParcelizer;
        public int MediaDescriptionCompat;
        public final int MediaMetadataCompat;
        public final Function MediaSessionCompatQueueItem;
        public SimpleQueue ParcelableVolumeInfo;
        public FwFClientclose11 PlaybackStateCompatCustomAction;
        public final int RatingCompat;
        public final FwFClientaddFeatureKeysfeaturesUpdated1 RemoteActionCompatParcelizer;
        public volatile boolean read;
        public Iterator serializer;
        public int write;
        public final AtomicReference MediaBrowserCompatMediaItem = new AtomicReference();
        public final AtomicLong MediaSessionCompatResultReceiverWrapper = new AtomicLong();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.serializer = null;
            this.ParcelableVolumeInfo.clear();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return this.MediaDescriptionCompat == 1 ? 1 : 0;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x014f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x0148 A[PHI: r6
  0x0148: PHI (r6v4 java.util.Iterator<T>) = (r6v3 java.util.Iterator<T>), (r6v6 java.util.Iterator<T>) binds: [B:36:0x0093, B:79:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void IconCompatParcelizer() {
            if (getAndIncrement() != 0) {
                return;
            }
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.RemoteActionCompatParcelizer;
            SimpleQueue simpleQueue = this.ParcelableVolumeInfo;
            int i = 1;
            boolean z = false;
            Object[] objArr = this.MediaDescriptionCompat != 1;
            Iterator<T> it = this.serializer;
            int iAddAndGet = 1;
            while (true) {
                Iterator<T> it2 = null;
                if (it == null) {
                    boolean z2 = this.read;
                    try {
                        Object objPoll = simpleQueue.poll();
                        if (serializer(z2, objPoll == null ? i : z ? 1 : 0, fwFClientaddFeatureKeysfeaturesUpdated1, simpleQueue)) {
                            return;
                        }
                        if (objPoll != null) {
                            try {
                                it = ((Iterable) this.MediaSessionCompatQueueItem.apply(objPoll)).iterator();
                                if (it.hasNext()) {
                                    this.serializer = it;
                                } else {
                                    if (objArr != false) {
                                        int i2 = this.write + i;
                                        if (i2 == this.RatingCompat) {
                                            this.write = z ? 1 : 0;
                                            this.PlaybackStateCompatCustomAction.request(i2);
                                        } else {
                                            this.write = i2;
                                        }
                                    }
                                    it = null;
                                }
                            } catch (Throwable th) {
                                Exceptions.read(th);
                                this.PlaybackStateCompatCustomAction.cancel();
                                ExceptionHelper.read(this.MediaBrowserCompatMediaItem, th);
                                fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem));
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.read(th2);
                        this.PlaybackStateCompatCustomAction.cancel();
                        ExceptionHelper.read(this.MediaBrowserCompatMediaItem, th2);
                        Throwable thRemoteActionCompatParcelizer = ExceptionHelper.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
                        this.serializer = null;
                        simpleQueue.clear();
                        fwFClientaddFeatureKeysfeaturesUpdated1.onError(thRemoteActionCompatParcelizer);
                        return;
                    }
                }
                if (it != null) {
                    long j = this.MediaSessionCompatResultReceiverWrapper.get();
                    long j2 = 0;
                    while (true) {
                        if (j2 == j) {
                            it2 = it;
                            break;
                        }
                        if (serializer(this.read, z, fwFClientaddFeatureKeysfeaturesUpdated1, simpleQueue)) {
                            return;
                        }
                        try {
                            T next = it.next();
                            ObjectHelper.write(next, "The iterator returned a null value");
                            fwFClientaddFeatureKeysfeaturesUpdated1.onNext(next);
                            if (serializer(this.read, z, fwFClientaddFeatureKeysfeaturesUpdated1, simpleQueue)) {
                                return;
                            }
                            j2++;
                            try {
                                if (!it.hasNext()) {
                                    if (objArr != false) {
                                        int i3 = this.write + i;
                                        if (i3 == this.RatingCompat) {
                                            this.write = z ? 1 : 0;
                                            this.PlaybackStateCompatCustomAction.request(i3);
                                        } else {
                                            this.write = i3;
                                        }
                                    }
                                    this.serializer = null;
                                    break;
                                }
                            } catch (Throwable th3) {
                                Exceptions.read(th3);
                                this.serializer = null;
                                this.PlaybackStateCompatCustomAction.cancel();
                                ExceptionHelper.read(this.MediaBrowserCompatMediaItem, th3);
                                fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem));
                                return;
                            }
                        } catch (Throwable th4) {
                            Exceptions.read(th4);
                            this.serializer = null;
                            this.PlaybackStateCompatCustomAction.cancel();
                            ExceptionHelper.read(this.MediaBrowserCompatMediaItem, th4);
                            fwFClientaddFeatureKeysfeaturesUpdated1.onError(ExceptionHelper.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem));
                            return;
                        }
                    }
                    if (j2 == j) {
                        if (serializer(this.read, simpleQueue.isEmpty() && it2 == null, fwFClientaddFeatureKeysfeaturesUpdated1, simpleQueue)) {
                            return;
                        }
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.MediaSessionCompatResultReceiverWrapper.addAndGet(-j2);
                    }
                    it = it2;
                    if (it2 != null) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                i = 1;
                z = false;
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.PlaybackStateCompatCustomAction, fwFClientclose11)) {
                this.PlaybackStateCompatCustomAction = fwFClientclose11;
                if (fwFClientclose11 instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) fwFClientclose11;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.MediaDescriptionCompat = iRequestFusion;
                        this.ParcelableVolumeInfo = queueSubscription;
                        this.read = true;
                        this.RemoteActionCompatParcelizer.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.MediaDescriptionCompat = iRequestFusion;
                        this.ParcelableVolumeInfo = queueSubscription;
                        this.RemoteActionCompatParcelizer.onSubscribe(this);
                        fwFClientclose11.request(this.MediaMetadataCompat);
                        return;
                    }
                }
                this.ParcelableVolumeInfo = new SpscArrayQueue(this.MediaMetadataCompat);
                this.RemoteActionCompatParcelizer.onSubscribe(this);
                fwFClientclose11.request(this.MediaMetadataCompat);
            }
        }

        public FlattenIterableSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Function function, int i) {
            this.RemoteActionCompatParcelizer = fwFClientaddFeatureKeysfeaturesUpdated1;
            this.MediaSessionCompatQueueItem = function;
            this.MediaMetadataCompat = i;
            this.RatingCompat = i - (i >> 2);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.serializer == null && this.ParcelableVolumeInfo.isEmpty();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            if (this.read || !ExceptionHelper.read(this.MediaBrowserCompatMediaItem, th)) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.read = true;
                IconCompatParcelizer();
            }
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            this.PlaybackStateCompatCustomAction.cancel();
            if (getAndIncrement() == 0) {
                this.ParcelableVolumeInfo.clear();
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.read) {
                return;
            }
            if (this.MediaDescriptionCompat != 0 || this.ParcelableVolumeInfo.offer(obj)) {
                IconCompatParcelizer();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Iterator<T> it = this.serializer;
            while (it == null) {
                Object objPoll = this.ParcelableVolumeInfo.poll();
                if (objPoll != null) {
                    it = ((Iterable) this.MediaSessionCompatQueueItem.apply(objPoll)).iterator();
                    if (it.hasNext()) {
                        this.serializer = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            }
            T next = it.next();
            ObjectHelper.write(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.serializer = null;
            }
            return next;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            if (this.read) {
                return;
            }
            this.read = true;
            IconCompatParcelizer();
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.write(this.MediaSessionCompatResultReceiverWrapper, j);
                IconCompatParcelizer();
            }
        }

        public final boolean serializer(boolean z, boolean z2, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, SimpleQueue simpleQueue) {
            if (this.IconCompatParcelizer) {
                this.serializer = null;
                simpleQueue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (((Throwable) this.MediaBrowserCompatMediaItem.get()) == null) {
                if (!z2) {
                    return false;
                }
                fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                return true;
            }
            Throwable thRemoteActionCompatParcelizer = ExceptionHelper.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
            this.serializer = null;
            simpleQueue.clear();
            fwFClientaddFeatureKeysfeaturesUpdated1.onError(thRemoteActionCompatParcelizer);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        Flowable flowable = this.IconCompatParcelizer;
        boolean z = flowable instanceof Callable;
        Function function = this.RemoteActionCompatParcelizer;
        if (!z) {
            flowable.subscribe((FlowableSubscriber) new FlattenIterableSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, function, this.serializer));
            return;
        }
        try {
            Object objCall = ((Callable) flowable).call();
            if (objCall == null) {
                EmptySubscription.complete(fwFClientaddFeatureKeysfeaturesUpdated1);
                return;
            }
            try {
                function.apply(objCall);
                FlowableFromIterable.subscribe(fwFClientaddFeatureKeysfeaturesUpdated1, ((Iterable) objCall).iterator());
            } catch (Throwable th) {
                Exceptions.read(th);
                EmptySubscription.error(th, fwFClientaddFeatureKeysfeaturesUpdated1);
            }
        } catch (Throwable th2) {
            Exceptions.read(th2);
            EmptySubscription.error(th2, fwFClientaddFeatureKeysfeaturesUpdated1);
        }
    }

    public FlowableFlattenIterable(FlowableMap flowableMap, int i) {
        super(flowableMap);
        this.RemoteActionCompatParcelizer = Functions.IconCompatParcelizer;
        this.serializer = i;
    }
}
