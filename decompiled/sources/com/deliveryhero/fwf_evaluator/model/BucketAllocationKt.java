package com.deliveryhero.fwf_evaluator.model;

import com.deliveryhero.fwf_evaluator.util.SHA1Kt;
import kotlin.TuplesKt;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class BucketAllocationKt {
    public static final float bucketUser(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        String strSubstring = SHA1Kt.sha1(setCarryoverInAppMessage.RatingCompat(str + "." + str2 + "." + str3)).getHex().substring(0, 15);
        TuplesKt.RemoteActionCompatParcelizer(16);
        return Long.parseLong(strSubstring, 16) / 1.1529215E18f;
    }
}
