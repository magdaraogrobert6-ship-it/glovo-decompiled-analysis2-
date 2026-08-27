package com.braze.ui.actions.brazeactions.steps;

import com.braze.ui.actions.brazeactions.BrazeActionParser;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class StepData$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StepData f$0;

    public /* synthetic */ StepData$$ExternalSyntheticLambda1(int i, StepData stepData) {
        this.$r8$classId = i;
        this.f$0 = stepData;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        StepData stepData = this.f$0;
        if (i == 0) {
            return StepData.args_delegate$lambda$0(stepData);
        }
        if (i == 1) {
            return BrazeActionParser.parse$lambda$1(stepData);
        }
        if (i == 2) {
            return SetEmailSubscriptionStep.run$lambda$0(stepData);
        }
        if (i != 3) {
            return i != 4 ? StepData.secondArg_delegate$lambda$0(stepData) : StepData.firstArg_delegate$lambda$0(stepData);
        }
        return SetPushNotificationSubscriptionStep.run$lambda$0(stepData);
    }
}
