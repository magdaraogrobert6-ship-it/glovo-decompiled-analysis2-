package com.mapbox.navigation.base.internal.utils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FloatKt {
    public static final boolean safeCompareTo(Float f, Float f2) {
        return Float.compare(f.floatValue(), f2.floatValue()) == 0;
    }
}
