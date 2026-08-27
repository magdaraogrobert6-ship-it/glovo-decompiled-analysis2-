package com.braze;

import com.braze.configuration.BrazeConfig;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$Companion$$ExternalSyntheticLambda21 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeConfig f$0;

    public /* synthetic */ Braze$Companion$$ExternalSyntheticLambda21(BrazeConfig brazeConfig, int i) {
        this.$r8$classId = i;
        this.f$0 = brazeConfig;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        BrazeConfig brazeConfig = this.f$0;
        return i != 0 ? RuntimeAppConfigurationProvider.setConfiguration$lambda$0(brazeConfig) : Braze.Companion.configure$lambda$0(brazeConfig);
    }
}
