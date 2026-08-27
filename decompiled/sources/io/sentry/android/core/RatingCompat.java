package io.sentry.android.core;

import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class RatingCompat {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.values().length];
        write = iArr;
        try {
            iArr[r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            write[r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.FATAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            write[r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
