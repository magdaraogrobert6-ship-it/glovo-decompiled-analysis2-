package com.incognia.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.os.Build;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class Se {
    public final Context BGx;

    public static String mbG(AccessibilityServiceInfo accessibilityServiceInfo) {
        if (accessibilityServiceInfo != null) {
            return accessibilityServiceInfo.getId();
        }
        return null;
    }

    public final String BGx(AccessibilityServiceInfo accessibilityServiceInfo, int i) {
        String strLoadDescription;
        if (accessibilityServiceInfo == null || (strLoadDescription = accessibilityServiceInfo.loadDescription(this.BGx.getPackageManager())) == null) {
            return null;
        }
        return hideCurrentlyDisplayingInAppMessage.write(i, strLoadDescription);
    }

    public Se(Context context) {
        this.BGx = context;
    }

    public static Integer HQ(AccessibilityServiceInfo accessibilityServiceInfo) {
        if (Build.VERSION.SDK_INT < 34 || accessibilityServiceInfo == null) {
            return null;
        }
        return Integer.valueOf(accessibilityServiceInfo.getMotionEventSources());
    }

    public static Boolean N(AccessibilityServiceInfo accessibilityServiceInfo) {
        if (Build.VERSION.SDK_INT < 31 || accessibilityServiceInfo == null) {
            return null;
        }
        return Boolean.valueOf(accessibilityServiceInfo.isAccessibilityTool());
    }

    public static Integer BGx(AccessibilityServiceInfo accessibilityServiceInfo) {
        if (accessibilityServiceInfo != null) {
            return Integer.valueOf(accessibilityServiceInfo.getCapabilities());
        }
        return null;
    }
}
