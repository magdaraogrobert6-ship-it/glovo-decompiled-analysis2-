package com.google.android.play.core.review.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzi {
    private final String zza;

    public zzi(String str) {
        this.zza = af$$ExternalSyntheticOutline0.m(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    private static String zze(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                SentryLogcatAdapter.read("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e);
                str2 = m1$$ExternalSyntheticOutline0.m(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return af$$ExternalSyntheticOutline0.m(str, " : ", str2);
    }

    public final int zza(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return SentryLogcatAdapter.serializer("PlayCore", zze(this.zza, "Play Store app is either not installed or not the official version", objArr));
        }
        return 0;
    }

    public final int zzb(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return SentryLogcatAdapter.read("PlayCore", zze(this.zza, str, objArr), th);
        }
        return 0;
    }

    public final int zzc(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzd(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return SentryLogcatAdapter.IconCompatParcelizer("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }
}
