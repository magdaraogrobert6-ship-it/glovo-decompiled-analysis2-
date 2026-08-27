package com.braze.support;

import com.braze.ui.UserJavascriptInterfaceBase;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WebContentUtils$$ExternalSyntheticLambda9 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ WebContentUtils$$ExternalSyntheticLambda9(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$1;
        String str2 = this.f$0;
        if (i != 0) {
            return i != 1 ? UserJavascriptInterfaceBase.setCustomAttribute$lambda$1(str2, str) : UserJavascriptInterfaceBase.setCustomAttribute$lambda$0(str2, str);
        }
        return WebContentUtils.replacePrefetchedUrlsWithLocalAssets$lambda$1(str2, str);
    }
}
