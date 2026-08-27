package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.okio.ByteString;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getContextandroid_sdk_base_releaseannotations {
    public static final ByteString IconCompatParcelizer = ByteString.IconCompatParcelizer("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] write = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] RemoteActionCompatParcelizer = new String[64];
    public static final String[] serializer = new String[androidx.compose.ui.graphics.Fields.RotationX];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = serializer;
            if (i2 >= strArr.length) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i2)};
            byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
            strArr[i2] = String.format(java.util.Locale.US, "%8s", objArr).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = RemoteActionCompatParcelizer;
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
            String[] strArr3 = RemoteActionCompatParcelizer;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i6]);
            sb.append('|');
            strArr3[i7 | 8] = ff$$ExternalSyntheticOutline0.m(sb, strArr3[i5], "|PADDED");
        }
        while (true) {
            String[] strArr4 = RemoteActionCompatParcelizer;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = serializer[i];
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    public static String write(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String strReplace;
        String[] strArr = write;
        if (b < strArr.length) {
            str = strArr[b];
        } else {
            Object[] objArr = {Byte.valueOf(b)};
            byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
            str = String.format(java.util.Locale.US, "0x%02x", objArr);
        }
        if (b2 == 0) {
            strReplace = "";
        } else {
            String[] strArr2 = serializer;
            if (b == 2 || b == 3) {
                strReplace = strArr2[b2];
            } else if (b == 4 || b == 6) {
                strReplace = b2 == 1 ? "ACK" : strArr2[b2];
            } else if (b == 7 || b == 8) {
                strReplace = strArr2[b2];
            } else {
                String[] strArr3 = RemoteActionCompatParcelizer;
                String str2 = b2 < strArr3.length ? strArr3[b2] : strArr2[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    strReplace = (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                } else {
                    strReplace = str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
        }
        Object[] objArr2 = {z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), str, strReplace};
        byte[] bArr2 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
        return String.format(java.util.Locale.US, "%s 0x%08x %5d %-13s %s", objArr2);
    }

    public static void write(String str, Object... objArr) {
        byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
        throw new IOException(String.format(java.util.Locale.US, str, objArr));
    }

    public static void read(String str, Object... objArr) {
        byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
        throw new IllegalArgumentException(String.format(java.util.Locale.US, str, objArr));
    }
}
