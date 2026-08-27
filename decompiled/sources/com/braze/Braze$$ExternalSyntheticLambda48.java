package com.braze;

import com.braze.push.BrazeNotificationUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda48 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda48(String str, int i, boolean z) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = z;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        if (i != 0) {
            return i != 1 ? BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$4(this.f$0, this.f$1) : Braze.setGoogleAdvertisingId$lambda$1$0(this.f$0, this.f$1);
        }
        return Braze.setGoogleAdvertisingId$lambda$0(this.f$0, this.f$1);
    }
}
