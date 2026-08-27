package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzlc {
    public static String formatTime$default(Calendar calendar, int i, boolean z) {
        Locale locale = Locale.getDefault();
        locale.getClass();
        if (i == 0) {
            return String.format(locale, "%tl:%tM %tp", Arrays.copyOf(new Object[]{calendar, calendar, calendar}, 3));
        }
        if (i == 1) {
            return String.format(locale, "%tk:%tM", Arrays.copyOf(new Object[]{calendar, calendar}, 2));
        }
        return z ? String.format(locale, "%tk:%tM", Arrays.copyOf(new Object[]{calendar, calendar}, 2)) : String.format(locale, "%tl:%tM %tp", Arrays.copyOf(new Object[]{calendar, calendar, calendar}, 3));
    }
}
