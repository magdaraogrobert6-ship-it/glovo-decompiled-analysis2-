package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ArrayListSupplier;
import java.util.Collection;
import java.util.concurrent.Callable;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToFlowable<U> {
    public final Callable RemoteActionCompatParcelizer;
    public final FlowableFlatMapMaybe read;

    public static final class ToListSubscriber<T, U extends Collection<? super T>> implements FlowableSubscriber<T>, Disposable {
        public final SingleObserver IconCompatParcelizer;
        public FwFClientclose11 read;
        public Collection serializer;

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            this.serializer = null;
            this.read = SubscriptionHelper.CANCELLED;
            this.IconCompatParcelizer.onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.read.cancel();
            this.read = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.read == SubscriptionHelper.CANCELLED;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            this.read = SubscriptionHelper.CANCELLED;
            this.IconCompatParcelizer.onSuccess(this.serializer);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            this.serializer.add(obj);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.read, fwFClientclose11)) {
                this.read = fwFClientclose11;
                this.IconCompatParcelizer.onSubscribe(this);
                fwFClientclose11.request(Long.MAX_VALUE);
            }
        }

        public ToListSubscriber(SingleObserver singleObserver, Collection collection) {
            this.IconCompatParcelizer = singleObserver;
            this.serializer = collection;
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        try {
            Object objCall = this.RemoteActionCompatParcelizer.call();
            ObjectHelper.write(objCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.read.subscribe((FlowableSubscriber) new ToListSubscriber(singleObserver, (Collection) objCall));
        } catch (Throwable th) {
            Exceptions.read(th);
            EmptyDisposable.error(th, (SingleObserver<?>) singleObserver);
        }
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final Flowable read() {
        return new FlowableToList(this.read, this.RemoteActionCompatParcelizer);
    }

    public FlowableToListSingle(FlowableFlatMapMaybe flowableFlatMapMaybe) {
        Callable callableAsCallable = ArrayListSupplier.asCallable();
        this.read = flowableFlatMapMaybe;
        this.RemoteActionCompatParcelizer = callableAsCallable;
    }
}
