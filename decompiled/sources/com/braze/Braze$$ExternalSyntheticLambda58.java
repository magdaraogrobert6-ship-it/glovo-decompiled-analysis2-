package com.braze;

import android.content.Intent;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda58 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Intent f$0;
    public final /* synthetic */ Braze f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda58(Intent intent, Braze braze, int i) {
        this.$r8$classId = i;
        this.f$0 = intent;
        this.f$1 = braze;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Braze braze = this.f$1;
        Intent intent = this.f$0;
        return i != 0 ? Braze.logPushNotificationOpened$lambda$3(intent, braze) : Braze.handleInAppMessageTestPush$lambda$1(intent, braze);
    }
}
