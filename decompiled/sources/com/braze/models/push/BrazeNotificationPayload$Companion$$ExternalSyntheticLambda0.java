package com.braze.models.push;

import android.os.Bundle;
import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeNotificationPayload$Companion$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Bundle f$1;

    public /* synthetic */ BrazeNotificationPayload$Companion$$ExternalSyntheticLambda0(int i, Bundle bundle, String str) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = bundle;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Bundle bundle = this.f$1;
        String str = this.f$0;
        switch (i) {
            case 0:
                return BrazeNotificationPayload.Companion.parseObjectAsInteger$lambda$1(str, bundle);
            case 1:
                return BrazeNotificationPayload.Companion.parseStringAsLong$lambda$1(str, bundle);
            case 2:
                return BrazeNotificationPayload.Companion.parseStringAsColorInt$lambda$1(str, bundle);
            case 3:
                return BrazeNotificationPayload.Companion.parseLong$lambda$0(str, bundle);
            case 4:
                return BrazeNotificationPayload.Companion.parseString$lambda$0(str, bundle);
            case 5:
                return BrazeNotificationPayload.Companion.parseStringAsBoolean$lambda$1(str, bundle);
            case 6:
                return BrazeNotificationPayload.Companion.parseNonBlankString$lambda$0(str, bundle);
            case 7:
                return BrazeNotificationPayload.Companion.parseStringAsInteger$lambda$1(str, bundle);
            default:
                return DefaultBannerWebViewClientListener.Companion.logHtmlClick$lambda$0(str, bundle);
        }
    }
}
