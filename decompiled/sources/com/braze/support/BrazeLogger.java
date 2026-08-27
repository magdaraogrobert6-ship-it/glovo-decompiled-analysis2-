package com.braze.support;

import android.util.Log;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import coil3.util.UtilsKt;
import com.braze.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.resetMessageMarginslambda000;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeLogger {
    private static final int DESIRED_MAX_BRAZE_TAG_LENGTH = 80;
    private static final String LOG_LEVEL_PROPERTY_NAME_APPBOY = "log.tag.APPBOY";
    private static final String LOG_LEVEL_PROPERTY_NAME_BRAZE = "log.tag.BRAZE";
    private static final int MAX_REMAINING_LENGTH_FOR_CLASS_TAG = 65;
    public static final int SUPPRESS = Integer.MAX_VALUE;
    public static final int VERBOSE = 2;
    private static boolean hasLogLevelBeenSetForAppRun;
    private static boolean isSystemPropLogLevelSet;
    private static r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY onLoggedCallback;
    private static r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds sdkDebuggerCallback;
    public static final BrazeLogger INSTANCE = new BrazeLogger();
    private static int logLevel = 4;

    private BrazeLogger() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d$lambda$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e$lambda$0(String str) {
        return str;
    }

    public static final void enableVerboseLogging() {
        setLogLevel(2);
    }

    public static final int getLogLevel() {
        return logLevel;
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY getOnLoggedCallback() {
        return onLoggedCallback;
    }

    public static /* synthetic */ void getOnLoggedCallback$annotations() {
    }

    public static /* synthetic */ void getSUPPRESS$annotations() {
    }

    public static /* synthetic */ void getVERBOSE$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i$lambda$0(String str) {
        return str;
    }

    public static final void resetForTesting() {
        isSystemPropLogLevelSet = false;
        hasLogLevelBeenSetForAppRun = false;
        onLoggedCallback = null;
        sdkDebuggerCallback = null;
    }

    public static final void setOnLoggedCallback(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        onLoggedCallback = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String v$lambda$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String w$lambda$0(String str) {
        return str;
    }

    public final r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds getSdkDebuggerCallback$android_sdk_base_release() {
        return sdkDebuggerCallback;
    }

    public final void setSdkDebuggerCallback$android_sdk_base_release(r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds) {
        sdkDebuggerCallback = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds;
    }

    public enum Priority {
        D(3),
        I(4),
        E(6),
        V(2),
        W(5);

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
        private final int logLevel;

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }

        public final int getLogLevel() {
            return this.logLevel;
        }

        Priority(int i) {
            this.logLevel = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_logLevel_$lambda$0(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Log level already set via system property. BrazeLogger.setLogLevel() ignored for level: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String brazelog$lambda$0(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return INSTANCE.toStringSafe(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public static final void checkForSystemLogLevelProperty(boolean z) {
        String strA = j.a(LOG_LEVEL_PROPERTY_NAME_BRAZE);
        if ("verbose".equalsIgnoreCase(hideCurrentlyDisplayingInAppMessage.read((CharSequence) j.a(LOG_LEVEL_PROPERTY_NAME_APPBOY)).toString()) || "verbose".equalsIgnoreCase(hideCurrentlyDisplayingInAppMessage.read((CharSequence) strA).toString())) {
            setLogLevel(2);
            isSystemPropLogLevelSet = true;
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, (Object) brazeLogger, Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(19), 6, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String checkForSystemLogLevelProperty$lambda$0() {
        return "BrazeLogger log level set to VERBOSE via device system property for BRAZE/APPBOY. Note that subsequent calls to BrazeLogger.setLogLevel() will have no effect.";
    }

    public static final void d(String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        brazelog$default(INSTANCE, str, Priority.D, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str2, 12), 8, (Object) null);
    }

    public static final void e(String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        th.getClass();
        brazelog$default(INSTANCE, str, Priority.D, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str2, 13), 8, (Object) null);
    }

    public static final String getBrazeLogTag(Class<?> cls) {
        cls.getClass();
        String name = cls.getName();
        int length = name.length();
        if (length > MAX_REMAINING_LENGTH_FOR_CLASS_TAG) {
            name = name.substring(length - MAX_REMAINING_LENGTH_FOR_CLASS_TAG);
        }
        return Constants.LOG_TAG_PREFIX.concat(name);
    }

    public static final void i(String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        brazelog$default(INSTANCE, str, Priority.I, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str2, 15), 8, (Object) null);
    }

    public static final void v(String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        brazelog$default(INSTANCE, str, Priority.V, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str2, 16), 8, (Object) null);
    }

    public static final void w(String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        brazelog$default(INSTANCE, str, Priority.W, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str2, 14), 8, (Object) null);
    }

    public final String brazeLogTag(Object obj) {
        obj.getClass();
        String name = obj.getClass().getName();
        String strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(name, '$');
        String strIconCompatParcelizer2 = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', strIconCompatParcelizer, strIconCompatParcelizer);
        return strIconCompatParcelizer2.length() == 0 ? getBrazeLogTag(name) : getBrazeLogTag(strIconCompatParcelizer2);
    }

    public final void brazelog(String str, Priority priority, Throwable th, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds;
        str.getClass();
        priority.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new resetMessageMarginslambda000(2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = onLoggedCallback;
        if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry != null) {
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(priority, isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), th);
        }
        if (!z && (r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = sdkDebuggerCallback) != null) {
            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke(str, priority, isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), th);
        }
        if (logLevel <= priority.getLogLevel()) {
            int i = a.a[priority.ordinal()];
            if (i == 1) {
                if (th == null) {
                    return;
                } else {
                    return;
                }
            }
            if (i == 2) {
                if (th == null) {
                    return;
                } else {
                    return;
                }
            }
            if (i == 3) {
                if (th == null) {
                    Log.w(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper());
                    return;
                } else {
                    Log.e(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), th);
                    return;
                }
            }
            if (i == 4) {
                if (th == null) {
                    Log.w(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper());
                    return;
                } else {
                    Log.w(str, (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), th);
                    return;
                }
            }
            if (i != 5) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            } else if (th == null) {
            }
        }
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, Object obj, Priority priority, Throwable th, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj2) {
        if ((i & 1) != 0) {
            priority = Priority.D;
        }
        Priority priority2 = priority;
        if ((i & 2) != 0) {
            th = null;
        }
        Throwable th2 = th;
        if ((i & 4) != 0) {
            z = false;
        }
        brazeLogger.brazelog(obj, priority2, th2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public static final void setInitialLogLevelFromConfiguration(int i) {
        if (hasLogLevelBeenSetForAppRun) {
            return;
        }
        setLogLevel(i);
    }

    private final String toStringSafe(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        try {
            return String.valueOf(r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke());
        } catch (Exception unused) {
            return "";
        }
    }

    public static /* synthetic */ void checkForSystemLogLevelProperty$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        checkForSystemLogLevelProperty(z);
    }

    public static /* synthetic */ void d$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        d(str, str2, th);
    }

    public static /* synthetic */ void i$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        i(str, str2, th);
    }

    public static final void setLogLevel(int i) {
        int i2 = 1;
        if (isSystemPropLogLevelSet) {
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, (Object) brazeLogger, Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new xg$$ExternalSyntheticLambda9(i, i2), 6, (Object) null);
        } else {
            hasLogLevelBeenSetForAppRun = true;
            logLevel = i;
        }
    }

    public static /* synthetic */ void v$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        v(str, str2, th);
    }

    public static /* synthetic */ void w$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        w(str, str2, th);
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, String str, Priority priority, Throwable th, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 2) != 0) {
            priority = Priority.D;
        }
        Priority priority2 = priority;
        if ((i & 4) != 0) {
            th = null;
        }
        Throwable th2 = th;
        if ((i & 8) != 0) {
            z = false;
        }
        brazeLogger.brazelog(str, priority2, th2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public static final void d(String str, String str2) {
        str.getClass();
        str2.getClass();
        d$default(str, str2, null, 4, null);
    }

    public static final void i(String str, String str2) {
        str.getClass();
        str2.getClass();
        i$default(str, str2, null, 4, null);
    }

    public static final void v(String str, String str2) {
        str.getClass();
        str2.getClass();
        v$default(str, str2, null, 4, null);
    }

    public static final void w(String str, String str2) {
        str.getClass();
        str2.getClass();
        w$default(str, str2, null, 4, null);
    }

    public final String getBrazeLogTag(String str) {
        str.getClass();
        return Constants.LOG_TAG_PREFIX.concat(str);
    }

    public final void brazelog(Object obj, Priority priority, Throwable th, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        obj.getClass();
        priority.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logLevel <= priority.getLogLevel() || sdkDebuggerCallback != null) {
            brazelog(brazeLogTag(obj), priority, th, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
