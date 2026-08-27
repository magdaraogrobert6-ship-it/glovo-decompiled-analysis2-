package com.sentiance.sdk.diagnostics;

import android.app.Service;
import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface ServiceLifecycleObserver {
    default void onForegroundStarted(Class<? extends Service> cls) {
    }

    default void onForegroundStopped(Class<? extends Service> cls) {
    }

    default void onServiceCreated(Class<? extends Service> cls) {
    }

    default void onServiceDestroyed(Class<? extends Service> cls) {
    }
}
