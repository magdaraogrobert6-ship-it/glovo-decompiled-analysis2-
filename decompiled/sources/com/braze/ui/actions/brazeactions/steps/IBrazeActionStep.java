package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public interface IBrazeActionStep {
    boolean isValid(StepData stepData);

    void run(Context context, StepData stepData);
}
