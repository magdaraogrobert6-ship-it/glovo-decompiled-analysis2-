package com.braze;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda64 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Braze f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda64(Braze braze, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = braze;
        this.f$1 = z;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        boolean z = this.f$1;
        Braze braze = this.f$0;
        return i != 0 ? Braze.requestGeofenceRefresh$lambda$3(braze, z) : Braze.setSyncPolicyOfflineStatus$lambda$1(braze, z);
    }
}
