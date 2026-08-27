package com.mapbox.common.module.okhttp;

import java.util.HashMap;
import java.util.Locale;
import o._get_messageWebView_lambda1;
import o.resetMessageMarginslambda00;

/* JADX INFO: loaded from: classes5.dex */
public final class HttpCallbackKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap<String, String> generateOutputHeaders(_get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        HashMap<String, String> map = new HashMap<>();
        resetMessageMarginslambda00 resetmessagemarginslambda00 = _get_messagewebview_lambda1.headers;
        int iRemoteActionCompatParcelizer = resetmessagemarginslambda00.RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            String lowerCase = resetmessagemarginslambda00.serializer(i).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            map.put(lowerCase, resetmessagemarginslambda00.read(i));
        }
        return map;
    }
}
