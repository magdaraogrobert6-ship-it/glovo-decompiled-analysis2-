package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.util.BackpressureHelper;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableOnErrorReturn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Function read;

    public static final class OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {
        public final Function read;

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            this.IconCompatParcelizer.onComplete();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.IconCompatParcelizer;
            try {
                Object objApply = this.read.apply(th);
                ObjectHelper.write(objApply, "The valueSupplier returned a null value");
                long j = this.write;
                if (j != 0) {
                    BackpressureHelper.serializer(this, j);
                }
                while (true) {
                    long j2 = get();
                    if ((j2 & Long.MIN_VALUE) != 0) {
                        return;
                    }
                    if ((j2 & Long.MAX_VALUE) != 0) {
                        lazySet(-9223372036854775807L);
                        fwFClientaddFeatureKeysfeaturesUpdated1.onNext(objApply);
                        fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                        return;
                    } else {
                        this.RemoteActionCompatParcelizer = objApply;
                        if (compareAndSet(0L, Long.MIN_VALUE)) {
                            return;
                        } else {
                            this.RemoteActionCompatParcelizer = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                Exceptions.read(th2);
                fwFClientaddFeatureKeysfeaturesUpdated1.onError(new CompositeException(th, th2));
            }
        }

        public OnErrorReturnSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Function function) {
            super(fwFClientaddFeatureKeysfeaturesUpdated1);
            this.read = function;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            this.write++;
            this.IconCompatParcelizer.onNext(obj);
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.IconCompatParcelizer.subscribe((FlowableSubscriber) new OnErrorReturnSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, this.read));
    }

    public FlowableOnErrorReturn(Flowable flowable, Function function) {
        super(flowable);
        this.read = function;
    }
}
