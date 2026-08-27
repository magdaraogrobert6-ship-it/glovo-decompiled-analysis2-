package com.mapbox.navigation.utils.internal;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.NativeLoggerWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class Time$SystemClockImpl {
    public static final Time$SystemClockImpl INSTANCE = new Time$SystemClockImpl();

    public static void logD(String str, String str2) {
        str.getClass();
        NativeLoggerWrapper.INSTANCE.debug(ff$$ExternalSyntheticOutline0.m(new StringBuilder(), str2 != null ? ff$$ExternalSyntheticOutline0.m("[", str2, "] ") : "", str), "nav-sdk");
    }

    public static LoggingLevel getLogLevel() {
        return NativeLoggerWrapper.INSTANCE.getLogLevel("nav-sdk");
    }
}
