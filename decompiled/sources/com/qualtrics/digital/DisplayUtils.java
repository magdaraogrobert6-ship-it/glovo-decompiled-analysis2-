package com.qualtrics.digital;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes4.dex */
class DisplayUtils {
    public static int convertDpToPixel(float f, Resources resources) {
        return (int) ((resources.getDisplayMetrics().densityDpi / 160.0f) * f);
    }
}
