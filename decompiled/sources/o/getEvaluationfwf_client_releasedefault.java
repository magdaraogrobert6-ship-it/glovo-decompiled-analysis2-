package o;

import com.huawei.hms.location.ActivityIdentificationData;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getEvaluationfwf_client_releasedefault {
    public static final short[] IconCompatParcelizer = new short[androidx.compose.ui.graphics.Fields.SpotShadowColor];
    public static final byte[] RemoteActionCompatParcelizer;

    static {
        byte[] bArr = new byte[112];
        RemoteActionCompatParcelizer = bArr;
        byte[] bArr2 = new byte[androidx.compose.ui.graphics.Fields.SpotShadowColor];
        serializer(bArr2, 0, 15, (byte) 1);
        serializer(bArr2, 16, 31, (byte) 2);
        serializer(bArr2, 32, 63, (byte) 3);
        serializer(bArr2, 64, 65, (byte) 0);
        serializer(bArr2, 66, 95, (byte) 4);
        serializer(bArr2, 96, 96, (byte) 5);
        serializer(bArr2, 97, ActivityIdentificationData.RUNNING, (byte) 6);
        serializer(bArr2, 109, 109, (byte) 7);
        serializer(bArr2, 110, 111, (byte) 6);
        serializer(bArr2, 112, 112, (byte) 8);
        serializer(bArr2, 113, 115, (byte) 9);
        serializer(bArr2, 116, 116, (byte) 10);
        serializer(bArr2, 117, 127, (byte) 0);
        serializer(bArr, 0, 111, (byte) -2);
        serializer(bArr, 8, 11, (byte) -1);
        serializer(bArr, 24, 27, (byte) 0);
        serializer(bArr, 40, 43, (byte) 16);
        serializer(bArr, 58, 59, (byte) 0);
        serializer(bArr, 72, 73, (byte) 0);
        serializer(bArr, 89, 91, (byte) 16);
        serializer(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b = bArr2[i];
            IconCompatParcelizer[i] = (short) (bArr4[b] | ((bArr3[b] & i) << 8));
        }
    }

    public static void serializer(byte[] bArr, int i, int i2, byte b) {
        while (i <= i2) {
            bArr[i] = b;
            i++;
        }
    }
}
