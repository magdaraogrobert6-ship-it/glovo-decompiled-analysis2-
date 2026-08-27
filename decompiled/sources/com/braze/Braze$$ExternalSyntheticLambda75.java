package com.braze;

import com.braze.support.ValidationUtils;
import com.braze.ui.support.UriUtils;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda75 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ createInAppMessageEventSubscriber f$0;

    public /* synthetic */ Braze$$ExternalSyntheticLambda75(createInAppMessageEventSubscriber createinappmessageeventsubscriber, int i) {
        this.$r8$classId = i;
        this.f$0 = createinappmessageeventsubscriber;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.f$0;
        if (i == 0) {
            return Braze.logCustomEvent$lambda$1$1(createinappmessageeventsubscriber);
        }
        if (i == 1) {
            return Braze.logCustomEvent$lambda$1$2(createinappmessageeventsubscriber);
        }
        if (i == 2) {
            return Braze.logCustomEvent$lambda$1$4(createinappmessageeventsubscriber);
        }
        if (i != 3) {
            return i != 4 ? UriUtils.getQueryParameters$lambda$2(createinappmessageeventsubscriber) : UriUtils.getQueryParameters$lambda$0(createinappmessageeventsubscriber);
        }
        return ValidationUtils.ensureBrazeFieldLength$lambda$0(createinappmessageeventsubscriber);
    }
}
