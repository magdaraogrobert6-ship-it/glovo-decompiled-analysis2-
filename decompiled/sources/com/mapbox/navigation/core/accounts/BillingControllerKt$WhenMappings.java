package com.mapbox.navigation.core.accounts;

import com.mapbox.common.SessionSKUIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class BillingControllerKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SessionSKUIdentifier.values().length];
        try {
            iArr[SessionSKUIdentifier.NAV3_SES_CORE_AGTRIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SessionSKUIdentifier.NAV3_SES_CORE_FDTRIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SessionSKUIdentifier.NAV3_SES_UX_AGTRIP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SessionSKUIdentifier.NAV3_SES_UX_FDTRIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SessionSKUIdentifier.NAV2_SES_TRIP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SessionSKUIdentifier.NAV2_SES_FDTRIP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
