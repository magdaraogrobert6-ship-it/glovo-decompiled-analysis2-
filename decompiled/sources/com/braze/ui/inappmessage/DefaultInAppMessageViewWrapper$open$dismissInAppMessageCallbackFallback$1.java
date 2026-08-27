package com.braze.ui.inappmessage;

import androidx.activity.OnBackPressedCallback;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1 extends OnBackPressedCallback {
    public DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1() {
        super(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleOnBackPressed$lambda$0() {
        return "Fallback Back button intercepted by in-app message";
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackPressed() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(25), 7, (Object) null);
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
    }
}
