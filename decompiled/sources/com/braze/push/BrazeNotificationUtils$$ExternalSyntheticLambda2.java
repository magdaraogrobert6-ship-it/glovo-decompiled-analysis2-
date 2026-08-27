package com.braze.push;

import android.content.Intent;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeNotificationUtils$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Intent f$0;

    public /* synthetic */ BrazeNotificationUtils$$ExternalSyntheticLambda2(int i, Intent intent) {
        this.$r8$classId = i;
        this.f$0 = intent;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Intent intent = this.f$0;
        if (i == 0) {
            return BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$3(intent);
        }
        if (i == 1) {
            return BrazeNotificationUtils.sendPushActionIntent$lambda$1(intent);
        }
        if (i == 2) {
            return BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$0(intent);
        }
        if (i != 3) {
            return i != 4 ? NotificationTrampolineActivity.onResume$lambda$2(intent) : BrazePushReceiver.Companion.handlePush$performWork$lambda$1(intent);
        }
        return BrazePushReceiver.Companion.handlePush$performWork$lambda$0(intent);
    }
}
