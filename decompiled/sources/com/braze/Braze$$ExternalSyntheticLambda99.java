package com.braze;

import android.content.Intent;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda99 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Intent f$0;

    public /* synthetic */ Braze$$ExternalSyntheticLambda99(int i, Intent intent) {
        this.$r8$classId = i;
        this.f$0 = intent;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Intent intent = this.f$0;
        if (i == 0) {
            return Braze.logPushNotificationOpened$lambda$2(intent);
        }
        if (i == 1) {
            return BrazeBootReceiver.onReceive$lambda$0(intent);
        }
        if (i != 2) {
            return i != 3 ? BrazeFlushPushDeliveryReceiver.onReceive$lambda$0(intent) : BrazeBootReceiver.handleIncomingIntent$lambda$2(intent);
        }
        return BrazeBootReceiver.handleIncomingIntent$lambda$0(intent);
    }
}
