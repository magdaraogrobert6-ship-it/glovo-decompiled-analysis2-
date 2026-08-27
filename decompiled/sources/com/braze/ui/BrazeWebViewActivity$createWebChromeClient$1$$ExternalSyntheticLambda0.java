package com.braze.ui;

import android.webkit.ConsoleMessage;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class BrazeWebViewActivity$createWebChromeClient$1$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConsoleMessage f$0;

    public /* synthetic */ BrazeWebViewActivity$createWebChromeClient$1$$ExternalSyntheticLambda0(ConsoleMessage consoleMessage, int i) {
        this.$r8$classId = i;
        this.f$0 = consoleMessage;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        ConsoleMessage consoleMessage = this.f$0;
        return i != 0 ? InAppMessageHtmlBaseView$messageWebView$6.onConsoleMessage$lambda$0(consoleMessage) : BrazeWebViewActivity.AnonymousClass1.onConsoleMessage$lambda$0(consoleMessage);
    }
}
