package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class NoOpStep implements IBrazeActionStep {
    public static final NoOpStep INSTANCE = new NoOpStep();

    private NoOpStep() {
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData stepData) {
        stepData.getClass();
        return false;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData stepData) {
        context.getClass();
        stepData.getClass();
    }
}
