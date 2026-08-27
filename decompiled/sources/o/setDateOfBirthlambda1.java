package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setDateOfBirthlambda1 {
    public static final String[] serializer = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] read = new String[64];
    public static final String[] write = new String[androidx.compose.ui.graphics.Fields.RotationX];

    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    public static String read(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String strReplace;
        String str2;
        String str3;
        if (b < 10) {
            str = serializer[b];
        } else {
            str = String.format("0x%02x", Byte.valueOf(b));
        }
        if (b2 == 0) {
            strReplace = "";
        } else {
            String[] strArr = write;
            if (b == 2 || b == 3) {
                strReplace = strArr[b2];
            } else if (b == 4 || b == 6) {
                if (b2 == 1) {
                    strReplace = "ACK";
                } else {
                    strReplace = strArr[b2];
                }
            } else if (b == 7 || b == 8) {
                strReplace = strArr[b2];
            } else {
                if (b2 < 64) {
                    str2 = read[b2];
                } else {
                    str2 = strArr[b2];
                }
                if (b == 5 && (b2 & 4) != 0) {
                    strReplace = str2.replace("HEADERS", "PUSH_PROMISE");
                } else {
                    strReplace = (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                }
            }
        }
        java.util.Locale locale = java.util.Locale.US;
        if (z) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return String.format(locale, "%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i), Integer.valueOf(i2), str, strReplace);
    }

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = write;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = String.format("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = read;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), strArr2[i3], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = read;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i6]);
            sb.append('|');
            strArr3[i7 | 8] = ff$$ExternalSyntheticOutline0.m(sb, strArr3[i5], "|PADDED");
        }
        while (true) {
            String[] strArr4 = read;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = write[i];
            }
            i++;
        }
    }
}
