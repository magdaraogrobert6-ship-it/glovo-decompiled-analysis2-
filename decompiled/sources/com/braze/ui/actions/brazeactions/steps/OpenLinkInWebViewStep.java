package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;

/* JADX INFO: loaded from: classes.dex */
public final class OpenLinkInWebViewStep extends BaseBrazeActionStep {
    public static final OpenLinkInWebViewStep INSTANCE = new OpenLinkInWebViewStep();

    private OpenLinkInWebViewStep() {
        super(null);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData stepData) {
        context.getClass();
        stepData.getClass();
        String strValueOf = String.valueOf(stepData.getFirstArg());
        IBrazeDeeplinkHandler companion = BrazeDeeplinkHandler.Companion.getInstance();
        UriAction uriActionCreateUriActionFromUrlString = companion.createUriActionFromUrlString(strValueOf, null, true, stepData.getChannel());
        if (uriActionCreateUriActionFromUrlString != null) {
            companion.gotoUri(context, uriActionCreateUriActionFromUrlString);
        }
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData stepData) {
        stepData.getClass();
        return StepData.isArgCountInBounds$default(stepData, 1, null, 2, null) && stepData.isArgString(0);
    }
}
