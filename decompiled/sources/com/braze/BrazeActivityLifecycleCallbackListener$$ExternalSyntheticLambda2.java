package com.braze;

import android.app.Activity;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class BrazeActivityLifecycleCallbackListener$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Activity f$0;

    public /* synthetic */ BrazeActivityLifecycleCallbackListener$$ExternalSyntheticLambda2(Activity activity, int i) {
        this.$r8$classId = i;
        this.f$0 = activity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Activity activity = this.f$0;
        if (i == 0) {
            return BrazeActivityLifecycleCallbackListener.onActivityStopped$lambda$0(activity);
        }
        if (i == 1) {
            return BrazeActivityLifecycleCallbackListener.onActivityPaused$lambda$0(activity);
        }
        if (i != 2) {
            return i != 3 ? BrazeActivityLifecycleCallbackListener.onActivityResumed$lambda$1(activity) : BrazeActivityLifecycleCallbackListener.onActivityCreated$lambda$0(activity);
        }
        return BrazeActivityLifecycleCallbackListener.onActivityStarted$lambda$0(activity);
    }
}
