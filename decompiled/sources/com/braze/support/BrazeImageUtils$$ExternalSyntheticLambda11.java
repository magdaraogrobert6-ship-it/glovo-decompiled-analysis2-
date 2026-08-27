package com.braze.support;

import androidx.compose.ui.tooling.animation.clock.Utils_androidKt;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.placeSpaceBetweenfoundation_layout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeImageUtils$$ExternalSyntheticLambda11 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ BrazeImageUtils$$ExternalSyntheticLambda11(Object obj, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = j2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        long j = this.f$2;
        long j2 = this.f$1;
        Object obj = this.f$0;
        return i != 0 ? Utils_androidKt.createTransitionInfo$lambda$4(0L, (placeSpaceBetweenfoundation_layout) obj, j2, j) : BrazeImageUtils.calculateInSampleSize$lambda$2((createBrazeUserChangeEventSubscriberlambda01) obj, j2, j);
    }
}
