package com.braze.ui.inappmessage;

import android.window.OnBackInvokedCallback;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1 implements OnBackInvokedCallback {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBackInvoked$lambda$0() {
        return "Back button intercepted by in-app message default view wrapper";
    }

    public void onBackInvoked() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(24), 7, (Object) null);
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
    }
}
