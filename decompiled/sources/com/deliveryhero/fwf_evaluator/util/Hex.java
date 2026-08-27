package com.deliveryhero.fwf_evaluator.util;

import java.io.IOException;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
final class Hex {
    public static final Hex INSTANCE = new Hex();

    private Hex() {
    }

    public final int decodeChar(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public final char encodeCharLower(int i) {
        return (char) (i >= 10 ? i + 87 : i + 48);
    }

    public final void decode(String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        str.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        int length = str.length() / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(i), Byte.valueOf((byte) (decodeHexDigit(str.charAt(i2 + 1)) | (decodeHexDigit(str.charAt(i2)) << 4))));
        }
    }

    public final String encodeLower(byte[] bArr) throws IOException {
        bArr.getClass();
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            Hex hex = INSTANCE;
            sb.append(hex.encodeCharLower(((b & 255) >>> 4) & 15));
            sb.append(hex.encodeCharLower(b & 15));
        }
        return sb.toString();
    }

    public static /* synthetic */ byte[] decode$default(Hex hex, String str, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = new byte[str.length() / 2];
        }
        return hex.decode(str, bArr);
    }

    private final void encode(byte[] bArr, Appendable appendable, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) throws IOException {
        for (byte b : bArr) {
            appendable.append(((Character) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf(((b & 255) >>> 4) & 15))).charValue());
            appendable.append(((Character) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf(b & 15))).charValue());
        }
    }

    private final String encodeBase(byte[] bArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) throws IOException {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(((Character) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf(((b & 255) >>> 4) & 15))).charValue());
            sb.append(((Character) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf(b & 15))).charValue());
        }
        return sb.toString();
    }

    public final byte[] invoke(String str) {
        str.getClass();
        return decode$default(this, str, null, 2, null);
    }

    public final String invoke(byte[] bArr) {
        bArr.getClass();
        return encode(bArr);
    }

    public final int decodeHexDigit(char c) {
        int iDecodeChar = decodeChar(c);
        if (iDecodeChar >= 0) {
            return iDecodeChar;
        }
        throw new IllegalStateException(("Invalid hex digit '" + c + "'").toString());
    }

    public final String encode(byte[] bArr) {
        bArr.getClass();
        return encodeLower(bArr);
    }

    public final byte[] decode(String str, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        Hex hex = INSTANCE;
        int length = str.length() / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (hex.decodeHexDigit(str.charAt(i2 + 1)) | (hex.decodeHexDigit(str.charAt(i2)) << 4));
        }
        return bArr;
    }
}
