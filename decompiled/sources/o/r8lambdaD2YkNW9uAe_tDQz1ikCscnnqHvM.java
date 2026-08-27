package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaD2YkNW9uAe_tDQz1ikCscnnqHvM {
    public static final RequestBuilder RemoteActionCompatParcelizer;
    public static final String[] read;
    public static final String[] serializer;
    public static final String[] write;

    public static String serializer(int i, int i2, long j, boolean z) {
        return setWebViewContent.RemoteActionCompatParcelizer("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), write(8), Long.valueOf(j));
    }

    public static String write(int i) {
        String[] strArr = write;
        return i < strArr.length ? strArr[i] : setWebViewContent.RemoteActionCompatParcelizer("0x%02x", Integer.valueOf(i));
    }

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        RemoteActionCompatParcelizer = ImageHeaderParserImageType.serializer("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        write = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        serializer = new String[64];
        String[] strArr = new String[androidx.compose.ui.graphics.Fields.RotationX];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String strReplace = setWebViewContent.RemoteActionCompatParcelizer("%8s", binaryString).replace(' ', '0');
            strReplace.getClass();
            strArr[i] = strReplace;
        }
        read = strArr;
        String[] strArr2 = serializer;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = serializer;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = ff$$ExternalSyntheticOutline0.m(sb, strArr3[i4], "|PADDED");
        }
        int length = serializer.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = serializer;
            if (strArr4[i7] == null) {
                strArr4[i7] = read[i7];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0055  */
    public static String write(int i, int i2, int i3, int i4, boolean z) {
        String strWrite;
        String str;
        String strWrite2 = write(i3);
        if (i4 == 0) {
            strWrite = "";
        } else {
            String[] strArr = read;
            if (i3 == 2 || i3 == 3) {
                strWrite = strArr[i4];
            } else if (i3 == 4 || i3 == 6) {
                strWrite = i4 == 1 ? "ACK" : strArr[i4];
            } else if (i3 == 7 || i3 == 8) {
                strWrite = strArr[i4];
            } else {
                String[] strArr2 = serializer;
                if (i4 < strArr2.length) {
                    str = strArr2[i4];
                    str.getClass();
                } else {
                    str = strArr[i4];
                }
                if (i3 != 5 || (i4 & 4) == 0) {
                    strWrite = (i3 != 0 || (i4 & 32) == 0) ? str : setCarryoverInAppMessage.write(str, "PRIORITY", "COMPRESSED");
                } else {
                    strWrite = setCarryoverInAppMessage.write(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return setWebViewContent.RemoteActionCompatParcelizer("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strWrite2, strWrite);
    }
}
