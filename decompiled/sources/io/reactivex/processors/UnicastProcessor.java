package io.reactivex.processors;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    public final AtomicReference IconCompatParcelizer;
    public final SpscLinkedArrayQueue MediaBrowserCompatMediaItem;
    public final AtomicBoolean MediaDescriptionCompat;
    public final AtomicReference MediaMetadataCompat;
    public Throwable MediaSessionCompatQueueItem;
    public final AtomicLong MediaSessionCompatResultReceiverWrapper;
    public final BasicIntQueueSubscription PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public volatile boolean RemoteActionCompatParcelizer;
    public final boolean read;
    public volatile boolean serializer;

    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        public UnicastQueueSubscription() {
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            if (UnicastProcessor.this.RemoteActionCompatParcelizer) {
                return;
            }
            UnicastProcessor.this.RemoteActionCompatParcelizer = true;
            Runnable runnable = (Runnable) UnicastProcessor.this.MediaMetadataCompat.getAndSet(null);
            if (runnable != null) {
                runnable.run();
            }
            UnicastProcessor.this.IconCompatParcelizer.lazySet(null);
            if (UnicastProcessor.this.PlaybackStateCompatCustomAction.getAndIncrement() == 0) {
                UnicastProcessor.this.IconCompatParcelizer.lazySet(null);
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                if (unicastProcessor.RatingCompat) {
                    return;
                }
                unicastProcessor.MediaBrowserCompatMediaItem.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            UnicastProcessor.this.MediaBrowserCompatMediaItem.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return UnicastProcessor.this.MediaBrowserCompatMediaItem.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return UnicastProcessor.this.MediaBrowserCompatMediaItem.poll();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            UnicastProcessor.this.RatingCompat = true;
            return 2;
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                BackpressureHelper.write(unicastProcessor.MediaSessionCompatResultReceiverWrapper, j);
                unicastProcessor.IconCompatParcelizer();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IconCompatParcelizer() {
        long j;
        if (this.PlaybackStateCompatCustomAction.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = (FwFClientaddFeatureKeysfeaturesUpdated1) this.IconCompatParcelizer.get();
        int iAddAndGet2 = 1;
        while (fwFClientaddFeatureKeysfeaturesUpdated1 == null) {
            iAddAndGet2 = this.PlaybackStateCompatCustomAction.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            }
            fwFClientaddFeatureKeysfeaturesUpdated1 = (FwFClientaddFeatureKeysfeaturesUpdated1) this.IconCompatParcelizer.get();
            iAddAndGet = 1;
        }
        boolean z = this.RatingCompat;
        SpscLinkedArrayQueue spscLinkedArrayQueue = this.MediaBrowserCompatMediaItem;
        boolean z2 = this.read;
        if (z) {
            while (!this.RemoteActionCompatParcelizer) {
                boolean z3 = this.serializer;
                if (!z2 && z3 && this.MediaSessionCompatQueueItem != null) {
                    spscLinkedArrayQueue.clear();
                    this.IconCompatParcelizer.lazySet(null);
                    fwFClientaddFeatureKeysfeaturesUpdated1.onError(this.MediaSessionCompatQueueItem);
                    return;
                }
                fwFClientaddFeatureKeysfeaturesUpdated1.onNext(null);
                if (z3) {
                    this.IconCompatParcelizer.lazySet(null);
                    Throwable th = this.MediaSessionCompatQueueItem;
                    if (th != null) {
                        fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
                        return;
                    } else {
                        fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.PlaybackStateCompatCustomAction.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.IconCompatParcelizer.lazySet(null);
            return;
        }
        boolean z4 = !z2;
        int iAddAndGet3 = iAddAndGet;
        while (true) {
            long j2 = this.MediaSessionCompatResultReceiverWrapper.get();
            long j3 = 0;
            while (true) {
                if (j2 == j3) {
                    j = j3;
                    break;
                }
                boolean z5 = this.serializer;
                Object objPoll = spscLinkedArrayQueue.poll();
                int i = objPoll == null ? iAddAndGet : 0;
                j = j3;
                if (read(z4, z5, i, fwFClientaddFeatureKeysfeaturesUpdated1, spscLinkedArrayQueue)) {
                    return;
                }
                if (i != 0) {
                    break;
                }
                fwFClientaddFeatureKeysfeaturesUpdated1.onNext(objPoll);
                j3 = j + 1;
                iAddAndGet = 1;
            }
            if (j2 == j3 && read(z4, this.serializer, spscLinkedArrayQueue.isEmpty(), fwFClientaddFeatureKeysfeaturesUpdated1, spscLinkedArrayQueue)) {
                return;
            }
            if (j != 0 && j2 != Long.MAX_VALUE) {
                this.MediaSessionCompatResultReceiverWrapper.addAndGet(-j);
            }
            iAddAndGet3 = this.PlaybackStateCompatCustomAction.addAndGet(-iAddAndGet3);
            if (iAddAndGet3 == 0) {
                return;
            } else {
                iAddAndGet = 1;
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        if (this.MediaDescriptionCompat.get() || !this.MediaDescriptionCompat.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), fwFClientaddFeatureKeysfeaturesUpdated1);
            return;
        }
        fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(this.PlaybackStateCompatCustomAction);
        this.IconCompatParcelizer.set(fwFClientaddFeatureKeysfeaturesUpdated1);
        if (this.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer.lazySet(null);
        } else {
            IconCompatParcelizer();
        }
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onError(Throwable th) {
        ObjectHelper.write(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.serializer || this.RemoteActionCompatParcelizer) {
            RxJavaPlugins.IconCompatParcelizer(th);
            return;
        }
        this.MediaSessionCompatQueueItem = th;
        this.serializer = true;
        Runnable runnable = (Runnable) this.MediaMetadataCompat.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        IconCompatParcelizer();
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onNext(Object obj) {
        ObjectHelper.write(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.serializer || this.RemoteActionCompatParcelizer) {
            return;
        }
        this.MediaBrowserCompatMediaItem.offer(obj);
        IconCompatParcelizer();
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onComplete() {
        if (this.serializer || this.RemoteActionCompatParcelizer) {
            return;
        }
        this.serializer = true;
        Runnable runnable = (Runnable) this.MediaMetadataCompat.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        IconCompatParcelizer();
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
        if (this.serializer || this.RemoteActionCompatParcelizer) {
            fwFClientclose11.cancel();
        } else {
            fwFClientclose11.request(Long.MAX_VALUE);
        }
    }

    public final boolean read(boolean z, boolean z2, boolean z3, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, SpscLinkedArrayQueue spscLinkedArrayQueue) {
        if (this.RemoteActionCompatParcelizer) {
            spscLinkedArrayQueue.clear();
            this.IconCompatParcelizer.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.MediaSessionCompatQueueItem != null) {
            spscLinkedArrayQueue.clear();
            this.IconCompatParcelizer.lazySet(null);
            fwFClientaddFeatureKeysfeaturesUpdated1.onError(this.MediaSessionCompatQueueItem);
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.MediaSessionCompatQueueItem;
        this.IconCompatParcelizer.lazySet(null);
        if (th != null) {
            fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
            return true;
        }
        fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
        return true;
    }

    public UnicastProcessor() {
        ObjectHelper.serializer(8, "capacityHint");
        this.MediaBrowserCompatMediaItem = new SpscLinkedArrayQueue(8);
        this.MediaMetadataCompat = new AtomicReference(null);
        this.read = true;
        this.IconCompatParcelizer = new AtomicReference();
        this.MediaDescriptionCompat = new AtomicBoolean();
        this.PlaybackStateCompatCustomAction = new UnicastQueueSubscription();
        this.MediaSessionCompatResultReceiverWrapper = new AtomicLong();
    }
}
