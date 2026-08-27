package com.sentiance.sdk.ondevicecommon;

import com.adjust.sdk.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaa8loZ52c3nLOMd2nhzH49eHtNuw;

/* JADX INFO: loaded from: classes3.dex */
public enum CrashSeverityInternal {
    INVALID(0),
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    public static final IconCompatParcelizer Companion = new IconCompatParcelizer(null);
    private final int level;

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final int getLevel() {
        return this.level;
    }

    public final String toThriftEventConstant() {
        int i = r8lambdaa8loZ52c3nLOMd2nhzH49eHtNuw.read[ordinal()];
        if (i == 1) {
            return Constants.LOW;
        }
        if (i == 2) {
            return Constants.MEDIUM;
        }
        if (i != 3) {
            return null;
        }
        return Constants.HIGH;
    }

    CrashSeverityInternal(int i) {
        this.level = i;
    }

    public final boolean isHigherOrEqualTo(CrashSeverityInternal crashSeverityInternal) {
        crashSeverityInternal.getClass();
        return this.level >= crashSeverityInternal.level;
    }
}
