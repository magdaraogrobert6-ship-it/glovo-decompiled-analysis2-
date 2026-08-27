package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import bo.app.f2$$ExternalSyntheticLambda4;
import com.braze.Braze;
import com.braze.BrazeUser;
import o.createFromParcel;

/* JADX INFO: loaded from: classes.dex */
public final class RemoveFromCustomAttributeArrayStep extends BaseBrazeActionStep {
    public static final RemoveFromCustomAttributeArrayStep INSTANCE = new RemoveFromCustomAttributeArrayStep();

    private RemoveFromCustomAttributeArrayStep() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel run$lambda$0(StepData stepData, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.removeFromCustomAttributeArray(String.valueOf(stepData.getFirstArg()), String.valueOf(stepData.getSecondArg()));
        return createFromParcel.INSTANCE;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData stepData) {
        context.getClass();
        stepData.getClass();
        BaseBrazeActionStep.Companion.runOnUser$android_sdk_ui_release(Braze.Companion.getInstance(context), new f2$$ExternalSyntheticLambda4(12, stepData));
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData stepData) {
        stepData.getClass();
        return StepData.isArgCountInBounds$default(stepData, 2, null, 2, null) && stepData.isArgString(0) && stepData.isArgString(1);
    }
}
