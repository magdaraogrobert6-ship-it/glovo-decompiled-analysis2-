package com.mapbox.bindgen;

/* JADX INFO: loaded from: classes2.dex */
public final class PartialEq {
    private static double epsilonD = Math.ulp(1.0d);
    private static float epsilonF = Math.ulp(1.0f);

    public static boolean compare(double d, double d2) {
        return Math.abs(d - d2) <= epsilonD * Math.max(1.0d, Math.max(Math.abs(d), Math.abs(d2)));
    }

    public static boolean compare(float f, float f2) {
        return Math.abs(f - f2) <= epsilonF * Math.max(1.0f, Math.max(Math.abs(f), Math.abs(f2)));
    }
}
