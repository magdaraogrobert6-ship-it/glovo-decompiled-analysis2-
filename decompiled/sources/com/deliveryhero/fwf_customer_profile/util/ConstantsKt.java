package com.deliveryhero.fwf_customer_profile.util;

import o.getInAppMessageEventMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ConstantsKt {
    public static final long DEFAULT_PROFILE_TTL = 86400;
    public static final long DEFAULT_REQUEST_TIMEOUT = 3000;
    public static final int MIN_PROFILE_TTL = 10800;
    private static final getInAppMessageEventMap globalEntityIdRegex = new getInAppMessageEventMap("^[A-Z]{2}_[A-Z]{2}$");

    public static final getInAppMessageEventMap getGlobalEntityIdRegex() {
        return globalEntityIdRegex;
    }
}
