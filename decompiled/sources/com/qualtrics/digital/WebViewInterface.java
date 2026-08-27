package com.qualtrics.digital;

import android.content.Context;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes4.dex */
class WebViewInterface {
    boolean autoCloseAtEndOfSurvey;
    QualtricsSurveyFragment instanceContext;
    Context mContext;

    @JavascriptInterface
    public void recordPayload(String str, String str2, String str3) {
        this.instanceContext.webRequestBody = str3;
    }

    public WebViewInterface(Context context, QualtricsSurveyFragment qualtricsSurveyFragment, boolean z) {
        this.mContext = context;
        this.instanceContext = qualtricsSurveyFragment;
        this.autoCloseAtEndOfSurvey = z;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        if (str == null || !str.startsWith("SV_")) {
            return;
        }
        Qualtrics.instance().properties.setSurveyHasBeenTaken(str);
        if (this.autoCloseAtEndOfSurvey) {
            this.instanceContext.getActivity().finish();
        }
    }
}
