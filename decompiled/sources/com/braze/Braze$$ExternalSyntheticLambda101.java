package com.braze;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda101 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Class f$0;

    public /* synthetic */ Braze$$ExternalSyntheticLambda101(Class cls, int i) {
        this.$r8$classId = i;
        this.f$0 = cls;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Class cls = this.f$0;
        return i != 0 ? Braze.addSingleSynchronousSubscription$lambda$0(cls) : Braze.removeSingleSubscription$lambda$0(cls);
    }
}
