package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableMap<T, U> extends AbstractFlowableWithUpstream<T, U> {
    public final Function serializer;

    public static final class MapConditionalSubscriber<T, U> extends BasicFuseableConditionalSubscriber<T, U> {
        public final Function RemoteActionCompatParcelizer;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.MediaSessionCompatQueueItem.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.RemoteActionCompatParcelizer.apply(objPoll);
            ObjectHelper.write(objApply, "The mapper function returned a null value.");
            return objApply;
        }

        public MapConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Function function) {
            super(conditionalSubscriber);
            this.RemoteActionCompatParcelizer = function;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.RatingCompat) {
                return;
            }
            int i = this.MediaDescriptionCompat;
            ConditionalSubscriber conditionalSubscriber = this.MediaMetadataCompat;
            if (i != 0) {
                conditionalSubscriber.onNext(null);
                return;
            }
            try {
                Object objApply = this.RemoteActionCompatParcelizer.apply(obj);
                ObjectHelper.write(objApply, "The mapper function returned a null value.");
                conditionalSubscriber.onNext(objApply);
            } catch (Throwable th) {
                read(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean IconCompatParcelizer(Object obj) {
            if (this.RatingCompat) {
                return false;
            }
            try {
                Object objApply = this.RemoteActionCompatParcelizer.apply(obj);
                ObjectHelper.write(objApply, "The mapper function returned a null value.");
                return this.MediaMetadataCompat.IconCompatParcelizer(objApply);
            } catch (Throwable th) {
                read(th);
                return true;
            }
        }
    }

    public static final class MapSubscriber<T, U> extends BasicFuseableSubscriber<T, U> {
        public final Function IconCompatParcelizer;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.MediaBrowserCompatMediaItem.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.IconCompatParcelizer.apply(objPoll);
            ObjectHelper.write(objApply, "The mapper function returned a null value.");
            return objApply;
        }

        public MapSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Function function) {
            super(fwFClientaddFeatureKeysfeaturesUpdated1);
            this.IconCompatParcelizer = function;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.write) {
                return;
            }
            int i = this.MediaSessionCompatQueueItem;
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.MediaDescriptionCompat;
            if (i != 0) {
                fwFClientaddFeatureKeysfeaturesUpdated1.onNext(null);
                return;
            }
            try {
                Object objApply = this.IconCompatParcelizer.apply(obj);
                ObjectHelper.write(objApply, "The mapper function returned a null value.");
                fwFClientaddFeatureKeysfeaturesUpdated1.onNext(objApply);
            } catch (Throwable th) {
                Exceptions.read(th);
                this.MediaMetadataCompat.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        boolean z = fwFClientaddFeatureKeysfeaturesUpdated1 instanceof ConditionalSubscriber;
        Function function = this.serializer;
        Flowable flowable = this.IconCompatParcelizer;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new MapConditionalSubscriber((ConditionalSubscriber) fwFClientaddFeatureKeysfeaturesUpdated1, function));
        } else {
            flowable.subscribe((FlowableSubscriber) new MapSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, function));
        }
    }

    public FlowableMap(Flowable flowable, Function function) {
        super(flowable);
        this.serializer = function;
    }
}
