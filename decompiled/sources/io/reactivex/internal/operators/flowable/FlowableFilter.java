package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableFilter<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Predicate RemoteActionCompatParcelizer;

    public static final class FilterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        public final Predicate serializer;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            QueueSubscription queueSubscription = this.MediaSessionCompatQueueItem;
            while (true) {
                Object objPoll = queueSubscription.poll();
                if (objPoll == null) {
                    return null;
                }
                if (this.serializer.read(objPoll)) {
                    return objPoll;
                }
                if (this.MediaDescriptionCompat == 2) {
                    queueSubscription.request(1L);
                }
            }
        }

        public FilterConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Predicate predicate) {
            super(conditionalSubscriber);
            this.serializer = predicate;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean IconCompatParcelizer(Object obj) {
            if (this.RatingCompat) {
                return false;
            }
            int i = this.MediaDescriptionCompat;
            ConditionalSubscriber conditionalSubscriber = this.MediaMetadataCompat;
            if (i != 0) {
                return conditionalSubscriber.IconCompatParcelizer(null);
            }
            try {
                return this.serializer.read(obj) && conditionalSubscriber.IconCompatParcelizer(obj);
            } catch (Throwable th) {
                read(th);
                return true;
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (IconCompatParcelizer(obj)) {
                return;
            }
            this.MediaBrowserCompatMediaItem.request(1L);
        }
    }

    public static final class FilterSubscriber<T> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {
        public final Predicate read;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            QueueSubscription queueSubscription = this.MediaBrowserCompatMediaItem;
            while (true) {
                Object objPoll = queueSubscription.poll();
                if (objPoll == null) {
                    return null;
                }
                if (this.read.read(objPoll)) {
                    return objPoll;
                }
                if (this.MediaSessionCompatQueueItem == 2) {
                    queueSubscription.request(1L);
                }
            }
        }

        public FilterSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Predicate predicate) {
            super(fwFClientaddFeatureKeysfeaturesUpdated1);
            this.read = predicate;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean IconCompatParcelizer(Object obj) {
            if (this.write) {
                return false;
            }
            int i = this.MediaSessionCompatQueueItem;
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.MediaDescriptionCompat;
            if (i != 0) {
                fwFClientaddFeatureKeysfeaturesUpdated1.onNext(null);
                return true;
            }
            try {
                boolean z = this.read.read(obj);
                if (z) {
                    fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
                }
                return z;
            } catch (Throwable th) {
                Exceptions.read(th);
                this.MediaMetadataCompat.cancel();
                onError(th);
                return true;
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (IconCompatParcelizer(obj)) {
                return;
            }
            this.MediaMetadataCompat.request(1L);
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        boolean z = fwFClientaddFeatureKeysfeaturesUpdated1 instanceof ConditionalSubscriber;
        Predicate predicate = this.RemoteActionCompatParcelizer;
        Flowable flowable = this.IconCompatParcelizer;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new FilterConditionalSubscriber((ConditionalSubscriber) fwFClientaddFeatureKeysfeaturesUpdated1, predicate));
        } else {
            flowable.subscribe((FlowableSubscriber) new FilterSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, predicate));
        }
    }

    public FlowableFilter(Flowable flowable, Predicate predicate) {
        super(flowable);
        this.RemoteActionCompatParcelizer = predicate;
    }
}
