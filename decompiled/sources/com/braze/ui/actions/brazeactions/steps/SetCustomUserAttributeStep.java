package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.support.BrazeLogger;
import o.createFromParcel;

/* JADX INFO: loaded from: classes.dex */
public final class SetCustomUserAttributeStep extends BaseBrazeActionStep {
    public static final SetCustomUserAttributeStep INSTANCE;
    private static final String TAG;

    private SetCustomUserAttributeStep() {
        super(null);
    }

    public final String getTAG() {
        return TAG;
    }

    static {
        SetCustomUserAttributeStep setCustomUserAttributeStep = new SetCustomUserAttributeStep();
        INSTANCE = setCustomUserAttributeStep;
        TAG = BrazeLogger.INSTANCE.brazeLogTag(setCustomUserAttributeStep);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel run$lambda$0(StepData stepData, Object obj, BrazeUser brazeUser) {
        brazeUser.getClass();
        BrazeUser.setCustomAttribute$default(brazeUser, String.valueOf(stepData.getFirstArg()), obj, false, 4, null);
        return createFromParcel.INSTANCE;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData stepData) {
        context.getClass();
        stepData.getClass();
        Object secondArg = stepData.getSecondArg();
        if (secondArg == null) {
            return;
        }
        BaseBrazeActionStep.Companion.runOnUser$android_sdk_ui_release(Braze.Companion.getInstance(context), new Navigator$$ExternalSyntheticLambda1(stepData, 24, secondArg));
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData stepData) {
        stepData.getClass();
        return StepData.isArgCountInBounds$default(stepData, 2, null, 2, null) && stepData.isArgString(0) && stepData.getSecondArg() != null;
    }
}
