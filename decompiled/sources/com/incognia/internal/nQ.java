package com.incognia.internal;

import o.ensureSubscribedToInAppMessageEvents;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nQ {
    public static final byte[] BGx(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        byte[] bArr3 = new byte[iMin];
        for (int i = 0; i < iMin; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public static final Number mbG(byte[] bArr) {
        int length = bArr.length;
        long j = 0;
        for (int i = 0; i < length; i++) {
            j += (((long) bArr[i]) & 255) << (i * 7);
        }
        if (-128 <= j && j <= 127) {
            return Byte.valueOf((byte) j);
        }
        if (-32768 > j || j > 32767) {
            return (-2147483648L > j || j > 2147483647L) ? Long.valueOf(j) : Integer.valueOf((int) j);
        }
        return Short.valueOf((short) j);
    }

    public static final JSONObject BGx(byte[] bArr) {
        return new JSONObject(new String(bArr, ensureSubscribedToInAppMessageEvents.write));
    }
}
