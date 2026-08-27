package com.braze.ui.banners.jsinterface;

import android.content.Context;
import com.braze.ui.UserJavascriptInterfaceBase;

/* JADX INFO: loaded from: classes.dex */
public final class BannerUserJavascriptInterface extends UserJavascriptInterfaceBase {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerUserJavascriptInterface(Context context) {
        super(context);
        context.getClass();
        this.context = context;
    }
}
