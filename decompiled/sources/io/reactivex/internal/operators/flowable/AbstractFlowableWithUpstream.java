package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;

/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractFlowableWithUpstream<T, R> extends Flowable<R> {
    public final Flowable IconCompatParcelizer;

    public AbstractFlowableWithUpstream(Flowable flowable) {
        ObjectHelper.write(flowable, "source is null");
        this.IconCompatParcelizer = flowable;
    }
}
