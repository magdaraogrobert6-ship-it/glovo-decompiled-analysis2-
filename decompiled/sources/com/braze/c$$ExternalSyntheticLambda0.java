package com.braze;

import com.braze.configuration.BrazeConfig;
import com.braze.enums.NotificationSubscriptionType;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ c$$ExternalSyntheticLambda0(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i == 0) {
            return c.a((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj);
        }
        if (i != 1) {
            return i != 2 ? BrazeUser.setPushNotificationSubscriptionType$lambda$0((NotificationSubscriptionType) obj) : Braze.applyPendingRuntimeConfiguration$lambda$0$2((BrazeConfig) obj);
        }
        return Braze.subscribeToChangeUserEvents$lambda$3((Braze) obj);
    }
}
