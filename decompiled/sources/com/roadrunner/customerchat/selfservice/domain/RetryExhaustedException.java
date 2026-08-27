package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;

/* JADX INFO: loaded from: classes5.dex */
public final class RetryExhaustedException extends Exception {
    private static int IconCompatParcelizer = 1;
    private static int write;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 65;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 29 / 0;
        }
        int i5 = i2 + 11;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 121;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "RetryExhaustedException(retries=0, cause=null)";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 79;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        return i2 % 2 == 0 ? Integer.hashCode(0) >>> 1 : Integer.hashCode(0) * 31;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 111;
        int i4 = i3 % Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 71;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof RetryExhaustedException)) {
            int i8 = i2 + 1;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = i4 + 105;
        write = i10 % Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
