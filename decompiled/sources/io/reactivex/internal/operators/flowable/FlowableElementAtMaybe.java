package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableElementAtMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {
    public final FlowableFlattenIterable serializer;

    public static final class ElementAtSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public boolean IconCompatParcelizer;
        public final MaybeObserver RemoteActionCompatParcelizer;
        public FwFClientclose11 read;
        public long serializer;

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
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            this.RemoteActionCompatParcelizer.onComplete();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.read, fwFClientclose11)) {
                this.read = fwFClientclose11;
                this.RemoteActionCompatParcelizer.onSubscribe(this);
                fwFClientclose11.request(Long.MAX_VALUE);
            }
        }

        public ElementAtSubscriber(MaybeObserver maybeObserver) {
            this.RemoteActionCompatParcelizer = maybeObserver;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            if (this.IconCompatParcelizer) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            this.IconCompatParcelizer = true;
            this.read = SubscriptionHelper.CANCELLED;
            this.RemoteActionCompatParcelizer.onError(th);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.IconCompatParcelizer) {
                return;
            }
            long j = this.serializer;
            if (j != 0) {
                this.serializer = j + 1;
                return;
            }
            this.IconCompatParcelizer = true;
            this.read.cancel();
            this.read = SubscriptionHelper.CANCELLED;
            this.RemoteActionCompatParcelizer.onSuccess(obj);
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        this.serializer.subscribe((FlowableSubscriber) new ElementAtSubscriber(maybeObserver));
    }

    public FlowableElementAtMaybe(FlowableFlattenIterable flowableFlattenIterable) {
        this.serializer = flowableFlattenIterable;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final Flowable read() {
        return new FlowableElementAt(this.serializer, null, false);
    }
}
