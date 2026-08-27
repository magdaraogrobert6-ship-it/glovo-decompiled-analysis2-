package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda6;
import o.createFromParcel;

/* JADX INFO: loaded from: classes.dex */
public final class AddToCustomAttributeArrayStep extends BaseBrazeActionStep {
    public static final AddToCustomAttributeArrayStep INSTANCE = new AddToCustomAttributeArrayStep();

    private AddToCustomAttributeArrayStep() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel run$lambda$0(String str, String str2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.addToCustomAttributeArray(str, str2);
        return createFromParcel.INSTANCE;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData stepData) {
        context.getClass();
        stepData.getClass();
        BaseBrazeActionStep.Companion.runOnUser$android_sdk_ui_release(Braze.Companion.getInstance(context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda6(String.valueOf(stepData.getFirstArg()), String.valueOf(stepData.getSecondArg()), 3));
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData stepData) {
        stepData.getClass();
        return StepData.isArgCountInBounds$default(stepData, 2, null, 2, null) && stepData.isArgString(0) && stepData.isArgString(1);
    }
}
