package com.braze;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda29 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ double f$0;
    public final /* synthetic */ double f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda29(double d, double d2, int i) {
        this.$r8$classId = i;
        this.f$0 = d;
        this.f$1 = d2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        if (i != 0) {
            return i != 1 ? BrazeUser.setLocationCustomAttribute$lambda$1(this.f$0, this.f$1) : Braze.requestGeofences$lambda$1$1(this.f$0, this.f$1);
        }
        return Braze.requestGeofences$lambda$1$0(this.f$0, this.f$1);
    }
}
