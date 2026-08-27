package com.mapbox.maps.threading;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AnimationThreadController$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 f$0;

    public /* synthetic */ AnimationThreadController$$ExternalSyntheticLambda0(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.$r8$classId = i;
        this.f$0 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.f$0;
        if (i != 0) {
            AnimationThreadController.postOnMainThread$lambda$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        } else {
            AnimationThreadController.postOnAnimatorThread$lambda$3$lambda$2(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
