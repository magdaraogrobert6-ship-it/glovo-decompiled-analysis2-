package com.braze.push;

import com.braze.models.push.BrazeNotificationPayload;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeNotificationUtils$$ExternalSyntheticLambda34 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeNotificationPayload f$0;

    public /* synthetic */ BrazeNotificationUtils$$ExternalSyntheticLambda34(BrazeNotificationPayload brazeNotificationPayload, int i) {
        this.$r8$classId = i;
        this.f$0 = brazeNotificationPayload;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        BrazeNotificationPayload brazeNotificationPayload = this.f$0;
        if (i != 0) {
            return i != 1 ? BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$9(brazeNotificationPayload) : BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$0(brazeNotificationPayload);
        }
        return BrazeNotificationUtils.setPublicVersionIfPresentAndSupported$lambda$0(brazeNotificationPayload);
    }
}
