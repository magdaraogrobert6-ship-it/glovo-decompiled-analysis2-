package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableObserveOn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final int read;
    public final Scheduler serializer;

    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {
        public Throwable IconCompatParcelizer;
        public SimpleQueue MediaBrowserCompatMediaItem;
        public long MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public final AtomicLong MediaSessionCompatQueueItem = new AtomicLong();
        public final Scheduler.Worker MediaSessionCompatToken;
        public FwFClientclose11 PlaybackStateCompat;
        public final int RatingCompat;
        public volatile boolean RemoteActionCompatParcelizer;
        public final int read;
        public volatile boolean serializer;
        public boolean write;

        public abstract void RemoteActionCompatParcelizer();

        public abstract void read();

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            this.write = true;
            return 2;
        }

        public abstract void write();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.MediaBrowserCompatMediaItem.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.MediaBrowserCompatMediaItem.isEmpty();
        }

        public BaseObserveOnSubscriber(Scheduler.Worker worker, int i) {
            this.MediaSessionCompatToken = worker;
            this.RatingCompat = i;
            this.read = i - (i >> 2);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            if (this.RemoteActionCompatParcelizer) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            this.IconCompatParcelizer = th;
            this.RemoteActionCompatParcelizer = true;
            serializer();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.write) {
                read();
            } else if (this.MediaMetadataCompat == 1) {
                write();
            } else {
                RemoteActionCompatParcelizer();
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            serializer();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            if (this.MediaMetadataCompat == 2) {
                serializer();
                return;
            }
            if (!this.MediaBrowserCompatMediaItem.offer(obj)) {
                this.PlaybackStateCompat.cancel();
                this.IconCompatParcelizer = new MissingBackpressureException("Queue is full?!");
                this.RemoteActionCompatParcelizer = true;
            }
            serializer();
        }

        public final boolean read(boolean z, boolean z2, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            if (this.serializer) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.IconCompatParcelizer;
            if (th != null) {
                this.serializer = true;
                clear();
                fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
                this.MediaSessionCompatToken.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.serializer = true;
            fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
            this.MediaSessionCompatToken.dispose();
            return true;
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            if (this.serializer) {
                return;
            }
            this.serializer = true;
            this.PlaybackStateCompat.cancel();
            this.MediaSessionCompatToken.dispose();
            if (this.write || getAndIncrement() != 0) {
                return;
            }
            this.MediaBrowserCompatMediaItem.clear();
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.write(this.MediaSessionCompatQueueItem, j);
                serializer();
            }
        }

        public final void serializer() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.MediaSessionCompatToken.IconCompatParcelizer(this);
        }
    }

    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        public long MediaSessionCompatResultReceiverWrapper;
        public final ConditionalSubscriber PlaybackStateCompatCustomAction;

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void RemoteActionCompatParcelizer() {
            ConditionalSubscriber conditionalSubscriber = this.PlaybackStateCompatCustomAction;
            SimpleQueue simpleQueue = this.MediaBrowserCompatMediaItem;
            long j = this.MediaDescriptionCompat;
            long j2 = this.MediaSessionCompatResultReceiverWrapper;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.MediaSessionCompatQueueItem.get();
                while (j != j3) {
                    boolean z = this.RemoteActionCompatParcelizer;
                    try {
                        Object objPoll = simpleQueue.poll();
                        boolean z2 = objPoll == null;
                        if (read(z, z2, conditionalSubscriber)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (conditionalSubscriber.IconCompatParcelizer(objPoll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.read) {
                            this.PlaybackStateCompat.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.read(th);
                        this.serializer = true;
                        this.PlaybackStateCompat.cancel();
                        simpleQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.MediaSessionCompatToken.dispose();
                        return;
                    }
                }
                if (j == j3 && read(this.RemoteActionCompatParcelizer, simpleQueue.isEmpty(), conditionalSubscriber)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.MediaDescriptionCompat = j;
                    this.MediaSessionCompatResultReceiverWrapper = j2;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.PlaybackStateCompat, fwFClientclose11)) {
                this.PlaybackStateCompat = fwFClientclose11;
                if (fwFClientclose11 instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) fwFClientclose11;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.MediaMetadataCompat = 1;
                        this.MediaBrowserCompatMediaItem = queueSubscription;
                        this.RemoteActionCompatParcelizer = true;
                        this.PlaybackStateCompatCustomAction.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.MediaMetadataCompat = 2;
                        this.MediaBrowserCompatMediaItem = queueSubscription;
                        this.PlaybackStateCompatCustomAction.onSubscribe(this);
                        fwFClientclose11.request(this.RatingCompat);
                        return;
                    }
                }
                this.MediaBrowserCompatMediaItem = new SpscArrayQueue(this.RatingCompat);
                this.PlaybackStateCompatCustomAction.onSubscribe(this);
                fwFClientclose11.request(this.RatingCompat);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.MediaBrowserCompatMediaItem.poll();
            if (objPoll != null && this.MediaMetadataCompat != 1) {
                long j = this.MediaSessionCompatResultReceiverWrapper + 1;
                if (j == this.read) {
                    this.MediaSessionCompatResultReceiverWrapper = 0L;
                    this.PlaybackStateCompat.request(j);
                    return objPoll;
                }
                this.MediaSessionCompatResultReceiverWrapper = j;
            }
            return objPoll;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void read() {
            int iAddAndGet = 1;
            while (!this.serializer) {
                boolean z = this.RemoteActionCompatParcelizer;
                this.PlaybackStateCompatCustomAction.onNext(null);
                if (z) {
                    this.serializer = true;
                    Throwable th = this.IconCompatParcelizer;
                    ConditionalSubscriber conditionalSubscriber = this.PlaybackStateCompatCustomAction;
                    if (th != null) {
                        conditionalSubscriber.onError(th);
                    } else {
                        conditionalSubscriber.onComplete();
                    }
                    this.MediaSessionCompatToken.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void write() {
            ConditionalSubscriber conditionalSubscriber = this.PlaybackStateCompatCustomAction;
            SimpleQueue simpleQueue = this.MediaBrowserCompatMediaItem;
            long j = this.MediaDescriptionCompat;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.MediaSessionCompatQueueItem.get();
                while (j != j2) {
                    try {
                        Object objPoll = simpleQueue.poll();
                        if (this.serializer) {
                            return;
                        }
                        if (objPoll == null) {
                            this.serializer = true;
                            conditionalSubscriber.onComplete();
                            this.MediaSessionCompatToken.dispose();
                            return;
                        } else if (conditionalSubscriber.IconCompatParcelizer(objPoll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        Exceptions.read(th);
                        this.serializer = true;
                        this.PlaybackStateCompat.cancel();
                        conditionalSubscriber.onError(th);
                        this.MediaSessionCompatToken.dispose();
                        return;
                    }
                }
                if (this.serializer) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.serializer = true;
                    conditionalSubscriber.onComplete();
                    this.MediaSessionCompatToken.dispose();
                    return;
                } else {
                    int i = get();
                    if (iAddAndGet == i) {
                        this.MediaDescriptionCompat = j;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i;
                    }
                }
            }
        }

        public ObserveOnConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Scheduler.Worker worker, int i) {
            super(worker, i);
            this.PlaybackStateCompatCustomAction = conditionalSubscriber;
        }
    }

    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> {
        public final FwFClientaddFeatureKeysfeaturesUpdated1 MediaSessionCompatResultReceiverWrapper;

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void RemoteActionCompatParcelizer() {
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.MediaSessionCompatResultReceiverWrapper;
            SimpleQueue simpleQueue = this.MediaBrowserCompatMediaItem;
            long j = this.MediaDescriptionCompat;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.MediaSessionCompatQueueItem.get();
                while (j != jAddAndGet) {
                    boolean z = this.RemoteActionCompatParcelizer;
                    try {
                        Object objPoll = simpleQueue.poll();
                        boolean z2 = objPoll == null;
                        if (read(z, z2, fwFClientaddFeatureKeysfeaturesUpdated1)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        fwFClientaddFeatureKeysfeaturesUpdated1.onNext(objPoll);
                        j++;
                        if (j == this.read) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.MediaSessionCompatQueueItem.addAndGet(-j);
                            }
                            this.PlaybackStateCompat.request(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.read(th);
                        this.serializer = true;
                        this.PlaybackStateCompat.cancel();
                        simpleQueue.clear();
                        fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
                        this.MediaSessionCompatToken.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && read(this.RemoteActionCompatParcelizer, simpleQueue.isEmpty(), fwFClientaddFeatureKeysfeaturesUpdated1)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.MediaDescriptionCompat = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.PlaybackStateCompat, fwFClientclose11)) {
                this.PlaybackStateCompat = fwFClientclose11;
                if (fwFClientclose11 instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) fwFClientclose11;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.MediaMetadataCompat = 1;
                        this.MediaBrowserCompatMediaItem = queueSubscription;
                        this.RemoteActionCompatParcelizer = true;
                        this.MediaSessionCompatResultReceiverWrapper.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.MediaMetadataCompat = 2;
                        this.MediaBrowserCompatMediaItem = queueSubscription;
                        this.MediaSessionCompatResultReceiverWrapper.onSubscribe(this);
                        fwFClientclose11.request(this.RatingCompat);
                        return;
                    }
                }
                this.MediaBrowserCompatMediaItem = new SpscArrayQueue(this.RatingCompat);
                this.MediaSessionCompatResultReceiverWrapper.onSubscribe(this);
                fwFClientclose11.request(this.RatingCompat);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.MediaBrowserCompatMediaItem.poll();
            if (objPoll != null && this.MediaMetadataCompat != 1) {
                long j = this.MediaDescriptionCompat + 1;
                if (j == this.read) {
                    this.MediaDescriptionCompat = 0L;
                    this.PlaybackStateCompat.request(j);
                    return objPoll;
                }
                this.MediaDescriptionCompat = j;
            }
            return objPoll;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void read() {
            int iAddAndGet = 1;
            while (!this.serializer) {
                boolean z = this.RemoteActionCompatParcelizer;
                this.MediaSessionCompatResultReceiverWrapper.onNext(null);
                if (z) {
                    this.serializer = true;
                    Throwable th = this.IconCompatParcelizer;
                    FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.MediaSessionCompatResultReceiverWrapper;
                    if (th != null) {
                        fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
                    } else {
                        fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                    }
                    this.MediaSessionCompatToken.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void write() {
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.MediaSessionCompatResultReceiverWrapper;
            SimpleQueue simpleQueue = this.MediaBrowserCompatMediaItem;
            long j = this.MediaDescriptionCompat;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.MediaSessionCompatQueueItem.get();
                while (j != j2) {
                    try {
                        Object objPoll = simpleQueue.poll();
                        if (this.serializer) {
                            return;
                        }
                        if (objPoll == null) {
                            this.serializer = true;
                            fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                            this.MediaSessionCompatToken.dispose();
                            return;
                        }
                        fwFClientaddFeatureKeysfeaturesUpdated1.onNext(objPoll);
                        j++;
                    } catch (Throwable th) {
                        Exceptions.read(th);
                        this.serializer = true;
                        this.PlaybackStateCompat.cancel();
                        fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
                        this.MediaSessionCompatToken.dispose();
                        return;
                    }
                }
                if (this.serializer) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.serializer = true;
                    fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                    this.MediaSessionCompatToken.dispose();
                    return;
                } else {
                    int i = get();
                    if (iAddAndGet == i) {
                        this.MediaDescriptionCompat = j;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i;
                    }
                }
            }
        }

        public ObserveOnSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Scheduler.Worker worker, int i) {
            super(worker, i);
            this.MediaSessionCompatResultReceiverWrapper = fwFClientaddFeatureKeysfeaturesUpdated1;
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        Scheduler.Worker workerWrite = this.serializer.write();
        boolean z = fwFClientaddFeatureKeysfeaturesUpdated1 instanceof ConditionalSubscriber;
        int i = this.read;
        Flowable flowable = this.IconCompatParcelizer;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new ObserveOnConditionalSubscriber((ConditionalSubscriber) fwFClientaddFeatureKeysfeaturesUpdated1, workerWrite, i));
        } else {
            flowable.subscribe((FlowableSubscriber) new ObserveOnSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, workerWrite, i));
        }
    }

    public FlowableObserveOn(Flowable flowable, Scheduler scheduler, int i) {
        super(flowable);
        this.serializer = scheduler;
        this.read = i;
    }
}
