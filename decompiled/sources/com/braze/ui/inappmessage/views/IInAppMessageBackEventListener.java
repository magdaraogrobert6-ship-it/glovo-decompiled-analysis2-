package com.braze.ui.inappmessage.views;

import android.window.BackEvent;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.InAppMessageManagerBase$$ExternalSyntheticLambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageBackEventListener {
    void onBackProgressed(BackEvent backEvent);

    /* JADX INFO: Access modifiers changed from: private */
    static String onBackCancelled$lambda$0() {
        return "IInAppMessageBackEventListener: onBackCancelled() called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    static String onBackInvoked$lambda$0() {
        return "IInAppMessageBackEventListener: onBackInvoked() called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    static String onBackStarted$lambda$0() {
        return "IInAppMessageBackEventListener: onBackStarted() called.";
    }

    default void onBackCancelled() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(27), 6, (Object) null);
    }

    default void onBackInvoked() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(26), 6, (Object) null);
    }

    default void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(25), 6, (Object) null);
    }
}
