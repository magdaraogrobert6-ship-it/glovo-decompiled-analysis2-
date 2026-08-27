package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.support.PermissionUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;

/* JADX INFO: loaded from: classes.dex */
public final class RequestPushPermissionStep extends BaseBrazeActionStep {
    public static final RequestPushPermissionStep INSTANCE = new RequestPushPermissionStep();

    private RequestPushPermissionStep() {
        super(null);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData stepData) {
        stepData.getClass();
        return true;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData stepData) {
        context.getClass();
        stepData.getClass();
        PermissionUtils.requestPushPermissionPrompt(BrazeInAppMessageManager.Companion.getInstance().getActivity());
    }
}
