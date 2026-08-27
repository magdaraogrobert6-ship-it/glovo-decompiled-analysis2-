package com.mapbox.common;

import android.content.Context;
import android.os.Looper;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class LifecycleUtils$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ Looper f$1;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM f$2;

    public /* synthetic */ LifecycleUtils$$ExternalSyntheticLambda2(Context context, Looper looper, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
        this.f$1 = looper;
        this.f$2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.f$2;
        Looper looper = this.f$1;
        Context context = this.f$0;
        if (i != 0) {
            LifecycleUtils.getLifecycleState$lambda$24(context, looper, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        } else {
            LifecycleUtils.hasServiceRunningInForeground$lambda$15(context, looper, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }
}
