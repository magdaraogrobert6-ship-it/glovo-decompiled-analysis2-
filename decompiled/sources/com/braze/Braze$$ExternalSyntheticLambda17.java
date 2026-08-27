package com.braze;

import com.braze.models.recommended.ecommerce.EcommerceEvent;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda17 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EcommerceEvent f$0;

    public /* synthetic */ Braze$$ExternalSyntheticLambda17(EcommerceEvent ecommerceEvent, int i) {
        this.$r8$classId = i;
        this.f$0 = ecommerceEvent;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        EcommerceEvent ecommerceEvent = this.f$0;
        if (i != 0) {
            return i != 1 ? Braze.logEcommerceEvent$lambda$1$1(ecommerceEvent) : Braze.logEcommerceEvent$lambda$1$0(ecommerceEvent);
        }
        return Braze.logEcommerceEvent$lambda$0(ecommerceEvent);
    }
}
