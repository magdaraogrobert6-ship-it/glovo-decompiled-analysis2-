package com.mapbox.navigation.core.accounts;

import com.mapbox.common.BillingServiceErrorCode;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class BillingController$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[BillingServiceErrorCode.values().length];
        try {
            iArr[BillingServiceErrorCode.RESUME_FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BillingServiceErrorCode.TOKEN_VALIDATION_FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
