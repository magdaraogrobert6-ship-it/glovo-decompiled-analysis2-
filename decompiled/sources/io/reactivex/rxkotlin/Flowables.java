package io.reactivex.rxkotlin;

import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.internal.operators.flowable.FlowableZip;
import o.onViewAttachedToWindowlambda0;
import o.syncCustomerProfilefwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Flowables {
    public static FlowableZip RemoteActionCompatParcelizer(FlowableOnErrorReturn flowableOnErrorReturn, FlowableOnErrorReturn flowableOnErrorReturn2) {
        Function functionSerializer = Functions.serializer(new BiFunction<T1, T2, onViewAttachedToWindowlambda0>() { // from class: io.reactivex.rxkotlin.Flowables$zip$2
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                obj.getClass();
                obj2.getClass();
                return new onViewAttachedToWindowlambda0(obj, obj2);
            }
        });
        int i = Flowable.write;
        syncCustomerProfilefwf_client_release[] synccustomerprofilefwf_client_releaseArr = {flowableOnErrorReturn, flowableOnErrorReturn2};
        ObjectHelper.serializer(i, "bufferSize");
        return new FlowableZip(synccustomerprofilefwf_client_releaseArr, functionSerializer, i);
    }
}
