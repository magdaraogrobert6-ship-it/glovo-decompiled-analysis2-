package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.Braze;
import o.ensureSubscribedToInAppMessageEventslambda7;

/* JADX INFO: loaded from: classes.dex */
public final class LogCustomEventStep extends BaseBrazeActionStep {
    public static final LogCustomEventStep INSTANCE = new LogCustomEventStep();

    private LogCustomEventStep() {
        super(null);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData stepData) {
        context.getClass();
        stepData.getClass();
        Braze.Companion.getInstance(context).logCustomEvent(String.valueOf(stepData.getFirstArg()), stepData.coerceArgToPropertiesOrNull(1));
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData stepData) {
        stepData.getClass();
        return StepData.isArgCountInBounds$default(stepData, 0, new ensureSubscribedToInAppMessageEventslambda7(1, 2, 1), 1, null) && stepData.isArgString(0) && stepData.isArgOptionalJsonObject(1);
    }
}
