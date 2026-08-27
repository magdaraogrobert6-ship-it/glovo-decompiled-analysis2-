package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import o.ensureSubscribedToInAppMessageEventslambda7;

/* JADX INFO: loaded from: classes.dex */
public final class OpenLinkExternallyStep extends BaseBrazeActionStep {
    public static final OpenLinkExternallyStep INSTANCE = new OpenLinkExternallyStep();

    private OpenLinkExternallyStep() {
        super(null);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData stepData) {
        context.getClass();
        stepData.getClass();
        String strValueOf = String.valueOf(stepData.getFirstArg());
        IBrazeDeeplinkHandler companion = BrazeDeeplinkHandler.Companion.getInstance();
        UriAction uriActionCreateUriActionFromUrlString = companion.createUriActionFromUrlString(strValueOf, null, false, stepData.getChannel());
        if (uriActionCreateUriActionFromUrlString != null) {
            companion.gotoUri(context, uriActionCreateUriActionFromUrlString);
        }
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData stepData) {
        stepData.getClass();
        return StepData.isArgCountInBounds$default(stepData, 0, new ensureSubscribedToInAppMessageEventslambda7(1, 2, 1), 1, null) && stepData.isArgString(0);
    }
}
