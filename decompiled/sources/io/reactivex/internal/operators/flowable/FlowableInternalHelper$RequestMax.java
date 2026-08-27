package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.Consumer;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public enum FlowableInternalHelper$RequestMax implements Consumer<FwFClientclose11> {
    INSTANCE;

    @Override // io.reactivex.functions.Consumer
    public void accept(FwFClientclose11 fwFClientclose11) throws Exception {
        fwFClientclose11.request(Long.MAX_VALUE);
    }
}
