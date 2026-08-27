package com.mapbox.search.base;

import com.mapbox.search.base.logger.LogKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AssertionsKt {
    public static final void assertDebug(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (z) {
            return;
        }
        LogKt.logw$default(r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke().toString());
    }

    public static void failDebug$default(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        new IllegalStateException(r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke().toString(), null);
        LogKt.logw$default(r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke().toString());
    }
}
