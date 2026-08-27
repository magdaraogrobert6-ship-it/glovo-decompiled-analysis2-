package com.braze;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeActivityLifecycleCallbackListener$$ExternalSyntheticLambda4 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeActivityLifecycleCallbackListener f$0;

    public /* synthetic */ BrazeActivityLifecycleCallbackListener$$ExternalSyntheticLambda4(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener, int i) {
        this.$r8$classId = i;
        this.f$0 = brazeActivityLifecycleCallbackListener;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener = this.f$0;
        if (i == 0) {
            return BrazeActivityLifecycleCallbackListener.onActivityPaused$lambda$1(brazeActivityLifecycleCallbackListener);
        }
        if (i != 1) {
            return i != 2 ? BrazeActivityLifecycleCallbackListener._init_$lambda$0(brazeActivityLifecycleCallbackListener) : BrazeActivityLifecycleCallbackListener._init_$lambda$1(brazeActivityLifecycleCallbackListener);
        }
        return BrazeActivityLifecycleCallbackListener.AnonymousClass2.invokeSuspend$lambda$1(brazeActivityLifecycleCallbackListener);
    }
}
