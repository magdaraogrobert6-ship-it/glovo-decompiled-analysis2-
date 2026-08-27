package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import bo.app.d0$$ExternalSyntheticLambda4;
import com.braze.Braze;
import com.braze.BrazeUser;
import o.createFromParcel;

/* JADX INFO: loaded from: classes.dex */
public final class RemoveFromSubscriptionGroupStep extends BaseBrazeActionStep {
    public static final RemoveFromSubscriptionGroupStep INSTANCE = new RemoveFromSubscriptionGroupStep();

    private RemoveFromSubscriptionGroupStep() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel run$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.removeFromSubscriptionGroup(str);
        return createFromParcel.INSTANCE;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData stepData) {
        context.getClass();
        stepData.getClass();
        BaseBrazeActionStep.Companion.runOnUser$android_sdk_ui_release(Braze.Companion.getInstance(context), new d0$$ExternalSyntheticLambda4(String.valueOf(stepData.getFirstArg()), 19));
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData stepData) {
        stepData.getClass();
        return StepData.isArgCountInBounds$default(stepData, 1, null, 2, null) && stepData.isArgString(0);
    }
}
