package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BasicFuseableSubscriber<T, R> implements FlowableSubscriber<T>, QueueSubscription<R> {
    public QueueSubscription MediaBrowserCompatMediaItem;
    public final FwFClientaddFeatureKeysfeaturesUpdated1 MediaDescriptionCompat;
    public FwFClientclose11 MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public boolean write;

    @Override // o.FwFClientclose11
    public final void cancel() {
        this.MediaMetadataCompat.cancel();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.MediaBrowserCompatMediaItem.clear();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.MediaBrowserCompatMediaItem.isEmpty();
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
        if (SubscriptionHelper.validate(this.MediaMetadataCompat, fwFClientclose11)) {
            this.MediaMetadataCompat = fwFClientclose11;
            if (fwFClientclose11 instanceof QueueSubscription) {
                this.MediaBrowserCompatMediaItem = (QueueSubscription) fwFClientclose11;
            }
            this.MediaDescriptionCompat.onSubscribe(this);
        }
    }

    @Override // o.FwFClientclose11
    public final void request(long j) {
        this.MediaMetadataCompat.request(j);
    }

    public BasicFuseableSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.MediaDescriptionCompat = fwFClientaddFeatureKeysfeaturesUpdated1;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public void onError(Throwable th) {
        if (this.write) {
            RxJavaPlugins.IconCompatParcelizer(th);
        } else {
            this.write = true;
            this.MediaDescriptionCompat.onError(th);
        }
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public void onComplete() {
        if (this.write) {
            return;
        }
        this.write = true;
        this.MediaDescriptionCompat.onComplete();
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i) {
        QueueSubscription queueSubscription = this.MediaBrowserCompatMediaItem;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = queueSubscription.requestFusion(i);
        if (iRequestFusion == 0) {
            return iRequestFusion;
        }
        this.MediaSessionCompatQueueItem = iRequestFusion;
        return iRequestFusion;
    }
}
