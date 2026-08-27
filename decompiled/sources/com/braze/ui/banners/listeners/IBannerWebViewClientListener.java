package com.braze.ui.banners.listeners;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public interface IBannerWebViewClientListener {
    void onCloseAction(Context context, String str, Bundle bundle);

    void onCustomEventAction(Context context, String str, Bundle bundle);

    void onOtherUrlAction(Context context, String str, Bundle bundle);
}
