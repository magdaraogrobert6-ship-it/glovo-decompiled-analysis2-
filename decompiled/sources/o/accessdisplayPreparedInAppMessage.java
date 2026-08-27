package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accessdisplayPreparedInAppMessage {
    public static final char[] IconCompatParcelizer = new char[117];
    public static final byte[] serializer = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        read(8, 'b');
        read(9, 't');
        read(10, 'n');
        read(12, 'f');
        read(13, 'r');
        read(47, '/');
        read(34, '\"');
        read(92, '\\');
        byte[] bArr = serializer;
        for (int i2 = 0; i2 < 33; i2++) {
            bArr[i2] = 127;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    public static void read(int i, char c) {
        if (c != 'u') {
            IconCompatParcelizer[c] = (char) i;
        }
    }
}
