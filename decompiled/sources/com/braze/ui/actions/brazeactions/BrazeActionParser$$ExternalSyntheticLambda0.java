package com.braze.ui.actions.brazeactions;

import com.braze.ui.actions.brazeactions.steps.StepData;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeActionParser$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeActionParser.ActionType f$0;
    public final /* synthetic */ StepData f$1;

    public /* synthetic */ BrazeActionParser$$ExternalSyntheticLambda0(BrazeActionParser.ActionType actionType, StepData stepData, int i) {
        this.$r8$classId = i;
        this.f$0 = actionType;
        this.f$1 = stepData;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        StepData stepData = this.f$1;
        BrazeActionParser.ActionType actionType = this.f$0;
        return i != 0 ? BrazeActionParser.parse$lambda$0(actionType, stepData) : BrazeActionParser.getActionType$lambda$0(actionType, stepData);
    }
}
