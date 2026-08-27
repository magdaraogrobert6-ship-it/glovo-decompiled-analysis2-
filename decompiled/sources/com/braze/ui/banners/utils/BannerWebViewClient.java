package com.braze.ui.banners.utils;

import android.content.Context;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.banners.listeners.IBannerWebViewClientListener;

/* JADX INFO: loaded from: classes.dex */
public final class BannerWebViewClient extends BrazeWebViewClient {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerWebViewClient(Context context, IBannerWebViewClientListener iBannerWebViewClientListener) {
        super(context, BrazeWebViewClient.Type.BANNER, null, null, iBannerWebViewClientListener, null);
        context.getClass();
    }
}
