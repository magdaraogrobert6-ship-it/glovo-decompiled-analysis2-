package com.braze.ui.inappmessage;

import com.braze.models.inappmessage.IInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class InAppMessageManagerBase$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IInAppMessage f$0;

    public /* synthetic */ InAppMessageManagerBase$$ExternalSyntheticLambda2(IInAppMessage iInAppMessage, int i) {
        this.$r8$classId = i;
        this.f$0 = iInAppMessage;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        IInAppMessage iInAppMessage = this.f$0;
        if (i == 0) {
            return InAppMessageManagerBase.getDefaultInAppMessageViewFactory$lambda$0(iInAppMessage);
        }
        if (i != 1) {
            return i != 2 ? BrazeInAppMessageManager.displayInAppMessage$lambda$13(iInAppMessage) : BrazeInAppMessageManager.displayInAppMessage$lambda$0(iInAppMessage);
        }
        return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$9(iInAppMessage);
    }
}
