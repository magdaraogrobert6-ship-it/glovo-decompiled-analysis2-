package com.braze;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda36 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Braze f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda36(Braze braze, String str) {
        this.$r8$classId = 0;
        this.f$0 = str;
        this.f$1 = braze;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$0;
        Braze braze = this.f$1;
        if (i == 0) {
            return Braze.logPushNotificationOpened$lambda$1(str, braze);
        }
        if (i == 1) {
            return Braze.logFeatureFlagImpression$lambda$1(braze, str);
        }
        if (i != 2) {
            return i != 3 ? Braze.setSdkAuthenticationSignature$lambda$1(braze, str) : Braze.dismissBanner$lambda$1(braze, str);
        }
        return Braze.logPushMaxCampaign$lambda$1(braze, str);
    }

    public /* synthetic */ Braze$$ExternalSyntheticLambda36(Braze braze, String str, int i) {
        this.$r8$classId = i;
        this.f$1 = braze;
        this.f$0 = str;
    }
}
