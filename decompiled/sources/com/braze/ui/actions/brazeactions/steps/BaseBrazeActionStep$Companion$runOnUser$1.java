package com.braze.ui.actions.brazeactions.steps;

import com.braze.BrazeUser;
import com.braze.events.IValueCallback;
import com.braze.support.BrazeLogger;
import com.braze.support.i$$ExternalSyntheticLambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class BaseBrazeActionStep$Companion$runOnUser$1 implements IValueCallback<BrazeUser> {
    final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM $block;

    public BaseBrazeActionStep$Companion$runOnUser$1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.$block = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onError$lambda$0() {
        return "Failed to run on Braze user object";
    }

    @Override // com.braze.events.IValueCallback
    public void onSuccess(BrazeUser brazeUser) {
        brazeUser.getClass();
        this.$block.invoke(brazeUser);
    }

    @Override // com.braze.events.IValueCallback
    public void onError() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(15), 7, (Object) null);
    }
}
