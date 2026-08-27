package com.mapbox.search.base.utils.extension;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DoubleKt {
    public static final boolean safeCompareTo(Double d, Double d2) {
        if (d == null) {
            return d2 == null;
        }
        return d2 != null && Double.compare(d.doubleValue(), d2.doubleValue()) == 0;
    }
}
