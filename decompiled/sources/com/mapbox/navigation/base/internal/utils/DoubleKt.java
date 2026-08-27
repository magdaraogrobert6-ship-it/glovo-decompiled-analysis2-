package com.mapbox.navigation.base.internal.utils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DoubleKt {
    public static final boolean safeCompareTo(Double d, Double d2) {
        if (d == null) {
            return d2 == null;
        }
        return d2 != null && Double.compare(d.doubleValue(), d2.doubleValue()) == 0;
    }
}
