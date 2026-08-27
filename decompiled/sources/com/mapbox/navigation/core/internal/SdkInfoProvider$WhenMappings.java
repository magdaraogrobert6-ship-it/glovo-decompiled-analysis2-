package com.mapbox.navigation.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class SdkInfoProvider$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SdkVariant.values().length];
        try {
            iArr[SdkVariant.CORE_FRAMEWORK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SdkVariant.UX_FRAMEWORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
