package com.google.zxing.qrcode.encoder;

import com.google.zxing.WriterException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import o.InfiniteAnimationPolicyDefaultImpls;
import o.getBaselineShift5SSeXJ0;
import o.getFontFeatureSettings;
import o.getFontSynthesisZQGJjVo;
import o.getTextDecoration;
import o.getTextGeometricTransform;
import o.isValidMotionEvent;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Encoder {
    public static final int[] RemoteActionCompatParcelizer = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset serializer = StandardCharsets.ISO_8859_1;

    public static boolean IconCompatParcelizer(String str) {
        byte[] bytes = str.getBytes(getFontFeatureSettings.IconCompatParcelizer);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < length; i += 2) {
            int i2 = bytes[i] & 255;
            if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static void read(String str, getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo, isValidMotionEvent isvalidmotionevent, Charset charset) throws WriterException {
        int i;
        int i2 = getTextDecoration.read[getfontsynthesiszqgjjvo.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            int length = str.length();
            while (i3 < length) {
                int iCharAt = str.charAt(i3) - '0';
                int i4 = i3 + 2;
                if (i4 < length) {
                    isvalidmotionevent.write(((str.charAt(i3 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i4) - '0'), 10);
                    i3 += 3;
                } else {
                    i3++;
                    if (i3 < length) {
                        isvalidmotionevent.write((iCharAt * 10) + (str.charAt(i3) - '0'), 7);
                        i3 = i4;
                    } else {
                        isvalidmotionevent.write(iCharAt, 4);
                    }
                }
            }
            return;
        }
        if (i2 == 2) {
            int length2 = str.length();
            while (i3 < length2) {
                char cCharAt = str.charAt(i3);
                int[] iArr = RemoteActionCompatParcelizer;
                int i5 = cCharAt < '`' ? iArr[cCharAt] : -1;
                if (i5 == -1) {
                    throw new WriterException();
                }
                int i6 = i3 + 1;
                if (i6 < length2) {
                    char cCharAt2 = str.charAt(i6);
                    int i7 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                    if (i7 == -1) {
                        throw new WriterException();
                    }
                    isvalidmotionevent.write((i5 * 45) + i7, 11);
                    i3 += 2;
                } else {
                    isvalidmotionevent.write(i5, 6);
                    i3 = i6;
                }
            }
            return;
        }
        if (i2 == 3) {
            byte[] bytes = str.getBytes(charset);
            int length3 = bytes.length;
            while (i3 < length3) {
                isvalidmotionevent.write(bytes[i3], 8);
                i3++;
            }
            return;
        }
        if (i2 != 4) {
            throw new WriterException("Invalid mode: " + getfontsynthesiszqgjjvo);
        }
        Charset charset2 = getFontFeatureSettings.IconCompatParcelizer;
        if (charset2 == null) {
            throw new WriterException("SJIS Charset not supported on this platform");
        }
        byte[] bytes2 = str.getBytes(charset2);
        if (bytes2.length % 2 != 0) {
            throw new WriterException("Kanji byte size not even");
        }
        int length4 = bytes2.length;
        while (i3 < length4 - 1) {
            int i8 = ((bytes2[i3] & 255) << 8) | (bytes2[i3 + 1] & 255);
            int i9 = 33088;
            if (i8 >= 33088 && i8 <= 40956) {
                i = i8 - i9;
            } else if (i8 < 57408 || i8 > 60351) {
                i = -1;
            } else {
                i9 = 49472;
                i = i8 - i9;
            }
            if (i == -1) {
                throw new WriterException("Invalid byte sequence");
            }
            isvalidmotionevent.write(((i >> 8) * 192) + (i & 255), 13);
            i3 += 2;
        }
    }

    public static boolean serializer(int i, getTextGeometricTransform gettextgeometrictransform, getBaselineShift5SSeXJ0 getbaselineshift5ssexj0) {
        int i2 = gettextgeometrictransform.RemoteActionCompatParcelizer;
        DeltaDecoder deltaDecoder = gettextgeometrictransform.IconCompatParcelizer[getbaselineshift5ssexj0.ordinal()];
        int i3 = deltaDecoder.write;
        int i4 = 0;
        for (InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls : (InfiniteAnimationPolicyDefaultImpls[]) deltaDecoder.serializer) {
            i4 += infiniteAnimationPolicyDefaultImpls.serializer;
        }
        return i2 - (i4 * i3) >= (i + 7) / 8;
    }
}
