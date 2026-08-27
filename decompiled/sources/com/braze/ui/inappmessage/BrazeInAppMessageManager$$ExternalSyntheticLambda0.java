package com.braze.ui.inappmessage;

import android.app.Activity;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class BrazeInAppMessageManager$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Activity f$0;

    public /* synthetic */ BrazeInAppMessageManager$$ExternalSyntheticLambda0(Activity activity, int i) {
        this.$r8$classId = i;
        this.f$0 = activity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Activity activity = this.f$0;
        if (i != 0) {
            return i != 1 ? InAppMessageActivityTransitionCoordinator.logUnregisterActivity$lambda$1(activity) : BrazeInAppMessageManager.registerInAppMessageManager$lambda$1(activity);
        }
        return BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$0(activity);
    }
}
