package io.reactivex.internal.operators.flowable;

import com.roadrunner.realtime.domain.GetAppStateImpl;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.plugins.RxJavaPlugins;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.syncCustomerProfilefwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableOnErrorNext<T> extends AbstractFlowableWithUpstream<T, T> {
    public final GetAppStateImpl read;

    public static final class OnErrorNextSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        public final FwFClientaddFeatureKeysfeaturesUpdated1 IconCompatParcelizer;
        public final Function RemoteActionCompatParcelizer;
        public long read;
        public boolean serializer;
        public boolean write;

        public OnErrorNextSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, GetAppStateImpl getAppStateImpl) {
            super(false);
            this.IconCompatParcelizer = fwFClientaddFeatureKeysfeaturesUpdated1;
            this.RemoteActionCompatParcelizer = getAppStateImpl;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            boolean z = this.write;
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.IconCompatParcelizer;
            if (z) {
                if (this.serializer) {
                    RxJavaPlugins.IconCompatParcelizer(th);
                    return;
                } else {
                    fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
                    return;
                }
            }
            this.write = true;
            try {
                Object objApply = this.RemoteActionCompatParcelizer.apply(th);
                ObjectHelper.write(objApply, "The nextSupplier returned a null Publisher");
                syncCustomerProfilefwf_client_release synccustomerprofilefwf_client_release = (syncCustomerProfilefwf_client_release) objApply;
                long j = this.read;
                if (j != 0) {
                    IconCompatParcelizer(j);
                }
                synccustomerprofilefwf_client_release.subscribe(this);
            } catch (Throwable th2) {
                Exceptions.read(th2);
                fwFClientaddFeatureKeysfeaturesUpdated1.onError(new CompositeException(th, th2));
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.serializer) {
                return;
            }
            if (!this.write) {
                this.read++;
            }
            this.IconCompatParcelizer.onNext(obj);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            if (this.serializer) {
                return;
            }
            this.serializer = true;
            this.write = true;
            this.IconCompatParcelizer.onComplete();
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        OnErrorNextSubscriber onErrorNextSubscriber = new OnErrorNextSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, this.read);
        fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(onErrorNextSubscriber);
        this.IconCompatParcelizer.subscribe((FlowableSubscriber) onErrorNextSubscriber);
    }

    public FlowableOnErrorNext(Flowable flowable, GetAppStateImpl getAppStateImpl) {
        super(flowable);
        this.read = getAppStateImpl;
    }
}
