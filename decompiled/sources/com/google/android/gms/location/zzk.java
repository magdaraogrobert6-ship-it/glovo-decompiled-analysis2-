package com.google.android.gms.location;

import java.util.Comparator;
import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
final class zzk implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(detectedActivity);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(detectedActivity2);
        int iCompareTo = Integer.valueOf(detectedActivity2.getConfidence()).compareTo(Integer.valueOf(detectedActivity.getConfidence()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        return Integer.valueOf(detectedActivity.getType()).compareTo(Integer.valueOf(detectedActivity2.getType()));
    }
}
