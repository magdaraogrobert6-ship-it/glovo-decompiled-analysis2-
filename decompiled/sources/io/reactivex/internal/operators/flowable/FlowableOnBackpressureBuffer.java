package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableOnBackpressureBuffer<T> extends AbstractFlowableWithUpstream<T, T> {
    public final boolean RemoteActionCompatParcelizer;
    public final int read;
    public final Action serializer;

    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        public volatile boolean IconCompatParcelizer;
        public final AtomicLong MediaBrowserCompatMediaItem = new AtomicLong();
        public boolean MediaDescriptionCompat;
        public final SimplePlainQueue MediaMetadataCompat;
        public FwFClientclose11 RatingCompat;
        public final FwFClientaddFeatureKeysfeaturesUpdated1 RemoteActionCompatParcelizer;
        public final Action read;
        public Throwable serializer;
        public volatile boolean write;

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            this.IconCompatParcelizer = true;
            if (this.MediaDescriptionCompat) {
                this.RemoteActionCompatParcelizer.onComplete();
            } else {
                IconCompatParcelizer();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            this.MediaDescriptionCompat = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.MediaMetadataCompat.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.MediaMetadataCompat.isEmpty();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.MediaMetadataCompat.offer(obj)) {
                if (this.MediaDescriptionCompat) {
                    this.RemoteActionCompatParcelizer.onNext(null);
                    return;
                } else {
                    IconCompatParcelizer();
                    return;
                }
            }
            this.RatingCompat.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.read.run();
            } catch (Throwable th) {
                Exceptions.read(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.RatingCompat, fwFClientclose11)) {
                this.RatingCompat = fwFClientclose11;
                this.RemoteActionCompatParcelizer.onSubscribe(this);
                fwFClientclose11.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return this.MediaMetadataCompat.poll();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            this.serializer = th;
            this.IconCompatParcelizer = true;
            if (this.MediaDescriptionCompat) {
                this.RemoteActionCompatParcelizer.onError(th);
            } else {
                IconCompatParcelizer();
            }
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (this.MediaDescriptionCompat || !SubscriptionHelper.validate(j)) {
                return;
            }
            BackpressureHelper.write(this.MediaBrowserCompatMediaItem, j);
            IconCompatParcelizer();
        }

        public BackpressureBufferSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, int i, boolean z, Action action) {
            this.RemoteActionCompatParcelizer = fwFClientaddFeatureKeysfeaturesUpdated1;
            this.read = action;
            this.MediaMetadataCompat = z ? new SpscLinkedArrayQueue(i) : new SpscArrayQueue(i);
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            if (this.write) {
                return;
            }
            this.write = true;
            this.RatingCompat.cancel();
            if (this.MediaDescriptionCompat || getAndIncrement() != 0) {
                return;
            }
            this.MediaMetadataCompat.clear();
        }

        public final boolean write(boolean z, boolean z2, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            if (this.write) {
                this.MediaMetadataCompat.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.serializer;
            if (th != null) {
                this.MediaMetadataCompat.clear();
                fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
            return true;
        }

        public final void IconCompatParcelizer() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue simplePlainQueue = this.MediaMetadataCompat;
                FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.RemoteActionCompatParcelizer;
                int iAddAndGet = 1;
                while (!write(this.IconCompatParcelizer, simplePlainQueue.isEmpty(), fwFClientaddFeatureKeysfeaturesUpdated1)) {
                    long j = this.MediaBrowserCompatMediaItem.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.IconCompatParcelizer;
                        Object objPoll = simplePlainQueue.poll();
                        boolean z2 = objPoll == null;
                        if (write(z, z2, fwFClientaddFeatureKeysfeaturesUpdated1)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        fwFClientaddFeatureKeysfeaturesUpdated1.onNext(objPoll);
                        j2++;
                    }
                    if (j2 == j && write(this.IconCompatParcelizer, simplePlainQueue.isEmpty(), fwFClientaddFeatureKeysfeaturesUpdated1)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.MediaBrowserCompatMediaItem.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.IconCompatParcelizer.subscribe((FlowableSubscriber) new BackpressureBufferSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, this.read, this.RemoteActionCompatParcelizer, this.serializer));
    }

    public FlowableOnBackpressureBuffer(FlowableFromObservable flowableFromObservable, int i) {
        super(flowableFromObservable);
        this.read = i;
        this.RemoteActionCompatParcelizer = true;
        this.serializer = Functions.read;
    }
}
