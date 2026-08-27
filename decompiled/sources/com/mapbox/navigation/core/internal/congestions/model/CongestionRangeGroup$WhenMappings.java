package com.mapbox.navigation.core.internal.congestions.model;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class CongestionRangeGroup$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CongestionSeverityType.values().length];
        try {
            iArr[CongestionSeverityType.LOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CongestionSeverityType.MODERATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CongestionSeverityType.HEAVY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CongestionSeverityType.SEVERE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
