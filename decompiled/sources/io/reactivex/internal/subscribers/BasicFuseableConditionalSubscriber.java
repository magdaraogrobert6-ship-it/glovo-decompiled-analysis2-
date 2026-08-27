package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BasicFuseableConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, QueueSubscription<R> {
    public FwFClientclose11 MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final ConditionalSubscriber MediaMetadataCompat;
    public QueueSubscription MediaSessionCompatQueueItem;
    public boolean RatingCompat;

    @Override // o.FwFClientclose11
    public final void cancel() {
        this.MediaBrowserCompatMediaItem.cancel();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.MediaSessionCompatQueueItem.clear();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.MediaSessionCompatQueueItem.isEmpty();
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
        if (SubscriptionHelper.validate(this.MediaBrowserCompatMediaItem, fwFClientclose11)) {
            this.MediaBrowserCompatMediaItem = fwFClientclose11;
            if (fwFClientclose11 instanceof QueueSubscription) {
                this.MediaSessionCompatQueueItem = (QueueSubscription) fwFClientclose11;
            }
            this.MediaMetadataCompat.onSubscribe(this);
        }
    }

    @Override // o.FwFClientclose11
    public final void request(long j) {
        this.MediaBrowserCompatMediaItem.request(j);
    }

    public BasicFuseableConditionalSubscriber(ConditionalSubscriber conditionalSubscriber) {
        this.MediaMetadataCompat = conditionalSubscriber;
    }

    public final void read(Throwable th) {
        Exceptions.read(th);
        this.MediaBrowserCompatMediaItem.cancel();
        onError(th);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public void onError(Throwable th) {
        if (this.RatingCompat) {
            RxJavaPlugins.IconCompatParcelizer(th);
        } else {
            this.RatingCompat = true;
            this.MediaMetadataCompat.onError(th);
        }
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public void onComplete() {
        if (this.RatingCompat) {
            return;
        }
        this.RatingCompat = true;
        this.MediaMetadataCompat.onComplete();
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i) {
        QueueSubscription queueSubscription = this.MediaSessionCompatQueueItem;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = queueSubscription.requestFusion(i);
        if (iRequestFusion == 0) {
            return iRequestFusion;
        }
        this.MediaDescriptionCompat = iRequestFusion;
        return iRequestFusion;
    }
}
