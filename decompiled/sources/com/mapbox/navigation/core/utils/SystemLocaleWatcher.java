package com.mapbox.navigation.core.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.firebase.messaging.SyncTask$ConnectivityChangeReceiver;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl;
import com.mapbox.navigation.navigator.internal.NativeNavigatorRecreationObserver;
import o.FocusListener;

/* JADX INFO: loaded from: classes2.dex */
public final class SystemLocaleWatcher {
    public final Context context;
    public final Handler handler;
    public final SyncTask$ConnectivityChangeReceiver localeChangeReceiver;

    public SystemLocaleWatcher(Context context, final MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl, Handler handler) {
        this.context = context;
        this.handler = handler;
        SyncTask$ConnectivityChangeReceiver syncTask$ConnectivityChangeReceiver = new SyncTask$ConnectivityChangeReceiver(this, 1, mapboxNativeNavigatorImpl);
        this.localeChangeReceiver = syncTask$ConnectivityChangeReceiver;
        FocusListener.read(context, syncTask$ConnectivityChangeReceiver, new IntentFilter("android.intent.action.LOCALE_CHANGED"), null, 4);
        mapboxNativeNavigatorImpl.addNativeNavigatorRecreationObserver(new NativeNavigatorRecreationObserver() { // from class: com.mapbox.navigation.core.utils.SystemLocaleWatcher$$ExternalSyntheticLambda0
            @Override // com.mapbox.navigation.navigator.internal.NativeNavigatorRecreationObserver
            public final void onNativeNavigatorRecreated() {
                mapboxNativeNavigatorImpl.setUserLanguages(n0.access$getDeviceLanguageTags(this.context));
            }
        });
        mapboxNativeNavigatorImpl.setUserLanguages(n0.access$getDeviceLanguageTags(context));
    }
}
