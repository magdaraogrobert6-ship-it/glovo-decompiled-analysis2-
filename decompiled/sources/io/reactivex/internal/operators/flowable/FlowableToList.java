package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.concurrent.Callable;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableToList<T, U extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, U> {
    public final Callable read;

    public static final class ToListSubscriber<T, U extends Collection<? super T>> extends DeferredScalarSubscription<U> implements FlowableSubscriber<T> {
        public FwFClientclose11 serializer;

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            this.MediaDescriptionCompat = null;
            this.RatingCompat.onError(th);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            IconCompatParcelizer(this.MediaDescriptionCompat);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            Collection collection = (Collection) this.MediaDescriptionCompat;
            if (collection != null) {
                collection.add(obj);
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.serializer, fwFClientclose11)) {
                this.serializer = fwFClientclose11;
                this.RatingCompat.onSubscribe(this);
                fwFClientclose11.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, o.FwFClientclose11
        public final void cancel() {
            super.cancel();
            this.serializer.cancel();
        }

        public ToListSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            super(fwFClientaddFeatureKeysfeaturesUpdated1);
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        try {
            Object objCall = this.read.call();
            ObjectHelper.write(objCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            Collection collection = (Collection) objCall;
            ToListSubscriber toListSubscriber = new ToListSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1);
            toListSubscriber.MediaDescriptionCompat = collection;
            this.IconCompatParcelizer.subscribe((FlowableSubscriber) toListSubscriber);
        } catch (Throwable th) {
            Exceptions.read(th);
            EmptySubscription.error(th, fwFClientaddFeatureKeysfeaturesUpdated1);
        }
    }

    public FlowableToList(FlowableFlatMapMaybe flowableFlatMapMaybe, Callable callable) {
        super(flowableFlatMapMaybe);
        this.read = callable;
    }
}
