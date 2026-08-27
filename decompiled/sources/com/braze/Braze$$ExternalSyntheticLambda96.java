package com.braze;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda96 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Braze f$2;

    public /* synthetic */ Braze$$ExternalSyntheticLambda96(Braze braze, String str, String str2) {
        this.f$2 = braze;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$1;
        String str2 = this.f$0;
        Braze braze = this.f$2;
        if (i != 0) {
            return i != 1 ? Braze.logBannerClick$lambda$1(braze, str2, str) : Braze.addSerializedCardJsonToStorage$lambda$1(str2, braze, str);
        }
        return Braze.logPushStoryPageClicked$lambda$1(str2, str, braze);
    }

    public /* synthetic */ Braze$$ExternalSyntheticLambda96(String str, Braze braze, String str2) {
        this.f$0 = str;
        this.f$2 = braze;
        this.f$1 = str2;
    }

    public /* synthetic */ Braze$$ExternalSyntheticLambda96(String str, String str2, Braze braze) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = braze;
    }
}
