package com.mapbox.common;

import io.sentry.android.core.SentryLogcatAdapter;
import o.createFromParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxMapsAndroidLogger {
    public static final MapboxMapsAndroidLogger INSTANCE = new MapboxMapsAndroidLogger();
    public static final String SDK_IDENTIFIER = "maps-android";

    private MapboxMapsAndroidLogger() {
    }

    public final boolean internalIsLoggableD$sdk_base_release() {
        try {
            return LogConfiguration.getLoggingLevel() == LoggingLevel.DEBUG;
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public final void internalLogD$sdk_base_release(String str, String str2, LogThrottler logThrottler) {
        createFromParcel createfromparcel;
        str.getClass();
        str2.getClass();
        if (logThrottler != null) {
            try {
                Log.debug(str2, "maps-android\\".concat(str), logThrottler);
                createfromparcel = createFromParcel.INSTANCE;
            } catch (UnsatisfiedLinkError unused) {
                return;
            }
        } else {
            createfromparcel = null;
        }
        if (createfromparcel == null) {
            Log.debug(str2, "maps-android\\".concat(str));
        }
    }

    public final void internalLogE$sdk_base_release(String str, String str2, LogThrottler logThrottler) {
        createFromParcel createfromparcel;
        str.getClass();
        str2.getClass();
        if (logThrottler != null) {
            try {
                Log.error(str2, "maps-android\\".concat(str), logThrottler);
                createfromparcel = createFromParcel.INSTANCE;
            } catch (UnsatisfiedLinkError unused) {
                SentryLogcatAdapter.serializer("maps-android\\".concat(str), str2);
                return;
            }
        } else {
            createfromparcel = null;
        }
        if (createfromparcel == null) {
            Log.error(str2, "maps-android\\".concat(str));
        }
    }

    public final void internalLogI$sdk_base_release(String str, String str2, LogThrottler logThrottler) {
        createFromParcel createfromparcel;
        str.getClass();
        str2.getClass();
        if (logThrottler != null) {
            try {
                Log.info(str2, "maps-android\\".concat(str), logThrottler);
                createfromparcel = createFromParcel.INSTANCE;
            } catch (UnsatisfiedLinkError unused) {
                return;
            }
        } else {
            createfromparcel = null;
        }
        if (createfromparcel == null) {
            Log.info(str2, "maps-android\\".concat(str));
        }
    }

    public final void internalLogW$sdk_base_release(String str, String str2, LogThrottler logThrottler) {
        createFromParcel createfromparcel;
        str.getClass();
        str2.getClass();
        if (logThrottler != null) {
            try {
                Log.warning(str2, "maps-android\\".concat(str), logThrottler);
                createfromparcel = createFromParcel.INSTANCE;
            } catch (UnsatisfiedLinkError unused) {
                SentryLogcatAdapter.IconCompatParcelizer("maps-android\\".concat(str), str2);
                return;
            }
        } else {
            createfromparcel = null;
        }
        if (createfromparcel == null) {
            Log.warning(str2, "maps-android\\".concat(str));
        }
    }

    public static /* synthetic */ void internalLogD$sdk_base_release$default(MapboxMapsAndroidLogger mapboxMapsAndroidLogger, String str, String str2, LogThrottler logThrottler, int i, Object obj) {
        if ((i & 4) != 0) {
            logThrottler = null;
        }
        mapboxMapsAndroidLogger.internalLogD$sdk_base_release(str, str2, logThrottler);
    }

    public static /* synthetic */ void internalLogE$sdk_base_release$default(MapboxMapsAndroidLogger mapboxMapsAndroidLogger, String str, String str2, LogThrottler logThrottler, int i, Object obj) {
        if ((i & 4) != 0) {
            logThrottler = null;
        }
        mapboxMapsAndroidLogger.internalLogE$sdk_base_release(str, str2, logThrottler);
    }

    public static /* synthetic */ void internalLogI$sdk_base_release$default(MapboxMapsAndroidLogger mapboxMapsAndroidLogger, String str, String str2, LogThrottler logThrottler, int i, Object obj) {
        if ((i & 4) != 0) {
            logThrottler = null;
        }
        mapboxMapsAndroidLogger.internalLogI$sdk_base_release(str, str2, logThrottler);
    }

    public static /* synthetic */ void internalLogW$sdk_base_release$default(MapboxMapsAndroidLogger mapboxMapsAndroidLogger, String str, String str2, LogThrottler logThrottler, int i, Object obj) {
        if ((i & 4) != 0) {
            logThrottler = null;
        }
        mapboxMapsAndroidLogger.internalLogW$sdk_base_release(str, str2, logThrottler);
    }
}
