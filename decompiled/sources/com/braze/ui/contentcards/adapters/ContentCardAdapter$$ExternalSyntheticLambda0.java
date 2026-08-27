package com.braze.ui.contentcards.adapters;

import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ContentCardAdapter$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ ContentCardAdapter$$ExternalSyntheticLambda0(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = this.f$0;
        if (i == 0) {
            return ContentCardAdapter.onViewAttachedToWindow$lambda$0(i2);
        }
        if (i == 1) {
            return ContentCardAdapter.onViewDetachedFromWindow$lambda$0(i2);
        }
        if (i == 2) {
            return DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$1(i2);
        }
        if (i != 3) {
            return i != 4 ? InAppMessageImmersiveBaseView.setupDirectionalNavigation$lambda$1(i2) : InAppMessageHtmlBaseView._get_messageWebView_$lambda$2(i2);
        }
        return DefaultInAppMessageViewWrapper.open$lambda$1(i2);
    }
}
