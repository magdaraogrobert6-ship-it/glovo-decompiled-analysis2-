package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableElementAtSingle<T> extends Single<T> implements FuseToFlowable<T> {
    public final Object serializer;
    public final Flowable write;

    public static final class ElementAtSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final SingleObserver IconCompatParcelizer;
        public boolean RemoteActionCompatParcelizer;
        public FwFClientclose11 read;
        public long serializer;
        public final Object write;

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
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            Object obj = this.write;
            SingleObserver singleObserver = this.IconCompatParcelizer;
            if (obj != null) {
                singleObserver.onSuccess(obj);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.read, fwFClientclose11)) {
                this.read = fwFClientclose11;
                this.IconCompatParcelizer.onSubscribe(this);
                fwFClientclose11.request(Long.MAX_VALUE);
            }
        }

        public ElementAtSubscriber(SingleObserver singleObserver, Object obj) {
            this.IconCompatParcelizer = singleObserver;
            this.write = obj;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            if (this.RemoteActionCompatParcelizer) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            this.read = SubscriptionHelper.CANCELLED;
            this.IconCompatParcelizer.onError(th);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            long j = this.serializer;
            if (j != 0) {
                this.serializer = j + 1;
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            this.read.cancel();
            this.read = SubscriptionHelper.CANCELLED;
            this.IconCompatParcelizer.onSuccess(obj);
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        this.write.subscribe((FlowableSubscriber) new ElementAtSubscriber(singleObserver, this.serializer));
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final Flowable read() {
        return new FlowableElementAt(this.write, this.serializer, true);
    }

    public FlowableElementAtSingle(Flowable flowable, Integer num) {
        this.write = flowable;
        this.serializer = num;
    }
}
