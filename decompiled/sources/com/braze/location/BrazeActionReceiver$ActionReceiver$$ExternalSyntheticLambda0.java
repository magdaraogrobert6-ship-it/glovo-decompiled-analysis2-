package com.braze.location;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class BrazeActionReceiver$ActionReceiver$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeActionReceiver.ActionReceiver f$0;

    public /* synthetic */ BrazeActionReceiver$ActionReceiver$$ExternalSyntheticLambda0(BrazeActionReceiver.ActionReceiver actionReceiver, int i) {
        this.$r8$classId = i;
        this.f$0 = actionReceiver;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        BrazeActionReceiver.ActionReceiver actionReceiver = this.f$0;
        if (i == 0) {
            return BrazeActionReceiver.ActionReceiver.performWork$lambda$0(actionReceiver);
        }
        if (i == 1) {
            return BrazeActionReceiver.ActionReceiver.performWork$lambda$2(actionReceiver);
        }
        if (i != 2) {
            return i != 3 ? BrazeActionReceiver.ActionReceiver.run$lambda$0(actionReceiver) : BrazeActionReceiver.ActionReceiver.performWork$lambda$6(actionReceiver);
        }
        return BrazeActionReceiver.ActionReceiver.performWork$lambda$4(actionReceiver);
    }
}
