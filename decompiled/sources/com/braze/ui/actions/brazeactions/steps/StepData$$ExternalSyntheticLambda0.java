package com.braze.ui.actions.brazeactions.steps;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class StepData$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ StepData f$1;

    public /* synthetic */ StepData$$ExternalSyntheticLambda0(int i, StepData stepData, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = stepData;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        StepData stepData = this.f$1;
        int i2 = this.f$0;
        if (i != 0) {
            return i != 1 ? StepData.isArgCountInBounds$lambda$0(i2, stepData) : StepData.isArgOptionalJsonObject$lambda$0(i2, stepData);
        }
        return StepData.isArgString$lambda$0(i2, stepData);
    }
}
