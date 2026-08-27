package com.google.android.gms.internal.mlkit_vision_face;

import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzdx {
    public static final void access$log(String str) {
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
            LoggerProviderKt.logD(str, "TrafficOverride");
        }
    }
}
