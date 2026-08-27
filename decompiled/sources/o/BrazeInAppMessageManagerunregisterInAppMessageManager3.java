package o;

import android.view.accessibility.AccessibilityEvent;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BrazeInAppMessageManagerunregisterInAppMessageManager3 {
    public static void RemoteActionCompatParcelizer(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setMaxScrollX(i);
    }

    public static void read(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setMaxScrollY(i);
    }

    public static final void IconCompatParcelizer(int i, String str, String str2) {
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("Expected ", i, str2, " at index ", ", but was '");
        sbM.append(str.charAt(i));
        sbM.append('\'');
        throw new IllegalArgumentException(sbM.toString());
    }

    public static final r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y RemoteActionCompatParcelizer(String str) {
        int i = 0;
        long j = 0;
        while (true) {
            if (i < 16) {
                char cCharAt = str.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j2 = addInAppMessage.RemoteActionCompatParcelizer[cCharAt];
                    if (j2 >= 0) {
                        j = (j << 4) | j2;
                        i++;
                    }
                }
                IconCompatParcelizer(i, str, "a hexadecimal digit");
                throw null;
            }
            long j3 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                char cCharAt2 = str.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j4 = addInAppMessage.RemoteActionCompatParcelizer[cCharAt2];
                    if (j4 >= 0) {
                        j3 = (j3 << 4) | j4;
                    }
                }
                IconCompatParcelizer(i2, str, "a hexadecimal digit");
                throw null;
            }
            if (j == 0 && j3 == 0) {
                return r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y.serializer;
            }
            return new r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y(j, j3);
        }
    }

    public static final String write(String str) {
        return str.length() <= 64 ? str : str.substring(0, 64).concat("...");
    }

    public static final r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y serializer(String str) {
        long j = 0;
        for (int i = 0; i < 8; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j2 = addInAppMessage.RemoteActionCompatParcelizer[cCharAt];
                if (j2 >= 0) {
                    j = (j << 4) | j2;
                }
            }
            IconCompatParcelizer(i, str, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(8) == '-') {
            long j3 = 0;
            for (int i2 = 9; i2 < 13; i2++) {
                char cCharAt2 = str.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j4 = addInAppMessage.RemoteActionCompatParcelizer[cCharAt2];
                    if (j4 >= 0) {
                        j3 = (j3 << 4) | j4;
                    }
                }
                IconCompatParcelizer(i2, str, "a hexadecimal digit");
                throw null;
            }
            if (str.charAt(13) == '-') {
                long j5 = 0;
                for (int i3 = 14; i3 < 18; i3++) {
                    char cCharAt3 = str.charAt(i3);
                    if ((cCharAt3 >>> '\b') == 0) {
                        long j6 = addInAppMessage.RemoteActionCompatParcelizer[cCharAt3];
                        if (j6 >= 0) {
                            j5 = (j5 << 4) | j6;
                        }
                    }
                    IconCompatParcelizer(i3, str, "a hexadecimal digit");
                    throw null;
                }
                if (str.charAt(18) == '-') {
                    long j7 = 0;
                    for (int i4 = 19; i4 < 23; i4++) {
                        char cCharAt4 = str.charAt(i4);
                        if ((cCharAt4 >>> '\b') == 0) {
                            long j8 = addInAppMessage.RemoteActionCompatParcelizer[cCharAt4];
                            if (j8 >= 0) {
                                j7 = (j7 << 4) | j8;
                            }
                        }
                        IconCompatParcelizer(i4, str, "a hexadecimal digit");
                        throw null;
                    }
                    if (str.charAt(23) != '-') {
                        IconCompatParcelizer(23, str, "'-' (hyphen)");
                        throw null;
                    }
                    long j9 = 0;
                    for (int i5 = 24; i5 < 36; i5++) {
                        char cCharAt5 = str.charAt(i5);
                        if ((cCharAt5 >>> '\b') == 0) {
                            long j10 = addInAppMessage.RemoteActionCompatParcelizer[cCharAt5];
                            if (j10 >= 0) {
                                j9 = (j9 << 4) | j10;
                            }
                        }
                        IconCompatParcelizer(i5, str, "a hexadecimal digit");
                        throw null;
                    }
                    long j11 = (j << 32) | (j3 << 16) | j5;
                    long j12 = (j7 << 48) | j9;
                    if (j11 == 0 && j12 == 0) {
                        return r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y.serializer;
                    }
                    return new r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y(j11, j12);
                }
                IconCompatParcelizer(18, str, "'-' (hyphen)");
                throw null;
            }
            IconCompatParcelizer(13, str, "'-' (hyphen)");
            throw null;
        }
        IconCompatParcelizer(8, str, "'-' (hyphen)");
        throw null;
    }

    public static final void serializer(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = addInAppMessage.write[(int) ((j >> (i4 << 3)) & 255)];
            bArr[i] = (byte) (i6 >> 8);
            int i7 = i + 2;
            bArr[i + 1] = (byte) i6;
            if (i4 == i5) {
                return;
            }
            i4--;
            i = i7;
        }
    }
}
