package com.braze.push;

import android.os.Bundle;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeHuaweiPushHandler$$ExternalSyntheticLambda3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Bundle f$0;

    public /* synthetic */ BrazeHuaweiPushHandler$$ExternalSyntheticLambda3(Bundle bundle, int i) {
        this.$r8$classId = i;
        this.f$0 = bundle;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Bundle bundle = this.f$0;
        if (i != 0) {
            return i != 1 ? BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$2(bundle) : BrazeNotificationActionUtils.addNotificationAction$lambda$3(bundle);
        }
        return BrazeHuaweiPushHandler.handleHmsRemoteMessageData$lambda$3(bundle);
    }
}
