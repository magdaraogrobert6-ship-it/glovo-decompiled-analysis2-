package com.mapbox.navigation.core.internal.congestions.model;

/* JADX INFO: loaded from: classes2.dex */
public final class MetersPerSecond {
    public final float value;

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4783equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.value);
    }

    public final String toString() {
        return m4784toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4784toStringimpl(float f) {
        return "MetersPerSecond(value=" + f + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MetersPerSecond) {
            return Float.compare(this.value, ((MetersPerSecond) obj).value) == 0;
        }
        return false;
    }
}
