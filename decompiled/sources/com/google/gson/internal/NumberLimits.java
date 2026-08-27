package com.google.gson.internal;

import com.google.android.gms.location.DeviceOrientationRequest;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes2.dex */
public class NumberLimits {
    private static final int MAX_NUMBER_STRING_LENGTH = 10000;

    private NumberLimits() {
    }

    public static BigDecimal parseBigDecimal(String str) throws NumberFormatException {
        checkNumberStringLength(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
            return bigDecimal;
        }
        throw new NumberFormatException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Number has unsupported scale: ", str));
    }

    public static BigInteger parseBigInteger(String str) throws NumberFormatException {
        checkNumberStringLength(str);
        return new BigInteger(str);
    }

    private static void checkNumberStringLength(String str) {
        if (str.length() <= 10000) {
            return;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write("Number string too large: ", str.substring(0, 30), "...");
    }
}
