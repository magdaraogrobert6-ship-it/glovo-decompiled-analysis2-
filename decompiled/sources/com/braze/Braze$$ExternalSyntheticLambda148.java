package com.braze;

import com.braze.events.InAppMessageEvent;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda148 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InAppMessageEvent f$0;

    public /* synthetic */ Braze$$ExternalSyntheticLambda148(InAppMessageEvent inAppMessageEvent, int i) {
        this.$r8$classId = i;
        this.f$0 = inAppMessageEvent;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        InAppMessageEvent inAppMessageEvent = this.f$0;
        return i != 0 ? Braze.retryInAppMessage$lambda$0(inAppMessageEvent) : Braze.reenqueueInAppMessage$lambda$0(inAppMessageEvent);
    }
}
