package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import java.util.concurrent.Callable;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.syncCustomerProfilefwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FlowableScalarXMap {

    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        public final Function IconCompatParcelizer;
        public final Object serializer;

        @Override // io.reactivex.Flowable
        public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            try {
                Object objApply = this.IconCompatParcelizer.apply(this.serializer);
                ObjectHelper.write(objApply, "The mapper returned a null Publisher");
                syncCustomerProfilefwf_client_release synccustomerprofilefwf_client_release = (syncCustomerProfilefwf_client_release) objApply;
                if (!(synccustomerprofilefwf_client_release instanceof Callable)) {
                    synccustomerprofilefwf_client_release.subscribe(fwFClientaddFeatureKeysfeaturesUpdated1);
                    return;
                }
                try {
                    Object objCall = ((Callable) synccustomerprofilefwf_client_release).call();
                    if (objCall == null) {
                        EmptySubscription.complete(fwFClientaddFeatureKeysfeaturesUpdated1);
                    } else {
                        fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(new ScalarSubscription(objCall, fwFClientaddFeatureKeysfeaturesUpdated1));
                    }
                } catch (Throwable th) {
                    Exceptions.read(th);
                    EmptySubscription.error(th, fwFClientaddFeatureKeysfeaturesUpdated1);
                }
            } catch (Throwable th2) {
                EmptySubscription.error(th2, fwFClientaddFeatureKeysfeaturesUpdated1);
            }
        }

        public ScalarXMapFlowable(Object obj, Function function) {
            this.serializer = obj;
            this.IconCompatParcelizer = function;
        }
    }

    public static Flowable serializer(Object obj, Function function) {
        return new ScalarXMapFlowable(obj, function);
    }

    public static boolean RemoteActionCompatParcelizer(syncCustomerProfilefwf_client_release synccustomerprofilefwf_client_release, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, Function function) {
        if (!(synccustomerprofilefwf_client_release instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) synccustomerprofilefwf_client_release).call();
            if (objCall == null) {
                EmptySubscription.complete(fwFClientaddFeatureKeysfeaturesUpdated1);
                return true;
            }
            try {
                Object objApply = function.apply(objCall);
                ObjectHelper.write(objApply, "The mapper returned a null Publisher");
                syncCustomerProfilefwf_client_release synccustomerprofilefwf_client_release2 = (syncCustomerProfilefwf_client_release) objApply;
                if (!(synccustomerprofilefwf_client_release2 instanceof Callable)) {
                    synccustomerprofilefwf_client_release2.subscribe(fwFClientaddFeatureKeysfeaturesUpdated1);
                    return true;
                }
                try {
                    Object objCall2 = ((Callable) synccustomerprofilefwf_client_release2).call();
                    if (objCall2 == null) {
                        EmptySubscription.complete(fwFClientaddFeatureKeysfeaturesUpdated1);
                        return true;
                    }
                    fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(new ScalarSubscription(objCall2, fwFClientaddFeatureKeysfeaturesUpdated1));
                    return true;
                } catch (Throwable th) {
                    Exceptions.read(th);
                    EmptySubscription.error(th, fwFClientaddFeatureKeysfeaturesUpdated1);
                    return true;
                }
            } catch (Throwable th2) {
                Exceptions.read(th2);
                EmptySubscription.error(th2, fwFClientaddFeatureKeysfeaturesUpdated1);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.read(th3);
            EmptySubscription.error(th3, fwFClientaddFeatureKeysfeaturesUpdated1);
            return true;
        }
    }
}
