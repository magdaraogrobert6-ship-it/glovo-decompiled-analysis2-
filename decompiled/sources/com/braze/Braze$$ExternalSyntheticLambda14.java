package com.braze;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda14 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ Braze$$ExternalSyntheticLambda14(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                return Braze._set_registeredPushToken_$lambda$1$0(str);
            case 1:
                return Braze._set_registeredPushToken_$lambda$1$2(str);
            case 2:
                return Braze._set_registeredPushToken_$lambda$0(str);
            case 3:
                return Braze.changeUser$lambda$1$1(str);
            case 4:
                return Braze.changeUser$lambda$1$2(str);
            case 5:
                return Braze.changeUser$lambda$1$3(str);
            case 6:
                return Braze.changeUser$lambda$1$5(str);
            case 7:
                return Braze.changeUser$lambda$0(str);
            case 8:
                return Braze.verifyProperSdkSetup$lambda$0(str);
            default:
                return BrazeUser.setCustomUserAttribute$lambda$4(str);
        }
    }
}
