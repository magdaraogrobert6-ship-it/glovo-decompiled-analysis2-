package io.sentry.android.replay;

import java.util.ArrayList;
import o.BrazeActionUtils;
import o.createInAppMessageEventSubscriber;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ReplayIntegration$$ExternalSyntheticLambda1 implements r8lambdaaCm2JcMru73kJeywi54SW2Mni8U {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ createInAppMessageEventSubscriber RemoteActionCompatParcelizer;

    public /* synthetic */ ReplayIntegration$$ExternalSyntheticLambda1(createInAppMessageEventSubscriber createinappmessageeventsubscriber, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = createinappmessageeventsubscriber;
    }

    @Override // o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U
    public final void write(BrazeActionUtils brazeActionUtils) {
        int i = this.IconCompatParcelizer;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            int i2 = ReplayIntegration.write;
            brazeActionUtils.getClass();
            String strR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = brazeActionUtils.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            createinappmessageeventsubscriber.IconCompatParcelizer = strR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != null ? hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', strR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, strR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) : null;
            return;
        }
        if (i != 1) {
            brazeActionUtils.getClass();
            createinappmessageeventsubscriber.IconCompatParcelizer = new ArrayList(brazeActionUtils.RatingCompat());
        } else {
            brazeActionUtils.getClass();
            createinappmessageeventsubscriber.IconCompatParcelizer = brazeActionUtils.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
        }
    }
}
