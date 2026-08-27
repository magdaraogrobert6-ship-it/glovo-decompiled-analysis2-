package com.mapbox.navigation.base.utils;

import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import o.getCustomActions;
import o.setDropDownVerticalOffset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NavigationPerformance {
    public static final setDropDownVerticalOffset loggingSwitch = new setDropDownVerticalOffset(new getCustomActions());

    public static void performanceInfoLoggingEnabled(boolean z) {
        setDropDownVerticalOffset setdropdownverticaloffset = loggingSwitch;
        getCustomActions getcustomactions = (getCustomActions) setdropdownverticaloffset.IconCompatParcelizer;
        if (z && !setdropdownverticaloffset.serializer) {
            PerformanceTracker.performanceObservers.add(getcustomactions);
        } else if (!z && setdropdownverticaloffset.serializer) {
            PerformanceTracker.performanceObservers.remove(getcustomactions);
        }
        setdropdownverticaloffset.serializer = z;
    }
}
