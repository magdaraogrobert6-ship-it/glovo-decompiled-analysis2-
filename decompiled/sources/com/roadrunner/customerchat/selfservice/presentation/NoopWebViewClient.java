package com.roadrunner.customerchat.selfservice.presentation;

import android.webkit.WebViewClient;
import androidx.compose.ui.graphics.Fields;

/* JADX INFO: loaded from: classes4.dex */
public final class NoopWebViewClient extends WebViewClient {
    public static final NoopWebViewClient IconCompatParcelizer = new NoopWebViewClient();
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    static {
        int i = serializer + 1;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
