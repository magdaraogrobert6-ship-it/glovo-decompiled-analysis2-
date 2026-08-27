package com.braze.push;

import java.util.Map;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeHuaweiPushHandler$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Map f$0;

    public /* synthetic */ BrazeHuaweiPushHandler$$ExternalSyntheticLambda0(Map map, int i) {
        this.$r8$classId = i;
        this.f$0 = map;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Map map = this.f$0;
        return i != 0 ? BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$4(map) : BrazeHuaweiPushHandler.handleHmsRemoteMessageData$lambda$0(map);
    }
}
