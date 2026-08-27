package com.braze.ui.inappmessage;

import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class BrazeInAppMessageManager$$ExternalSyntheticLambda45 implements IEventSubscriber {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeInAppMessageManager f$0;

    public /* synthetic */ BrazeInAppMessageManager$$ExternalSyntheticLambda45(BrazeInAppMessageManager brazeInAppMessageManager, int i) {
        this.$r8$classId = i;
        this.f$0 = brazeInAppMessageManager;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.$r8$classId;
        BrazeInAppMessageManager brazeInAppMessageManager = this.f$0;
        if (i == 0) {
            BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$0(brazeInAppMessageManager, (BrazeUserChangeEvent) obj);
        } else if (i != 1) {
            BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$5(brazeInAppMessageManager, (SdkDataWipeEvent) obj);
        } else {
            BrazeInAppMessageManager.createInAppMessageEventSubscriber$lambda$0(brazeInAppMessageManager, (InAppMessageEvent) obj);
        }
    }
}
