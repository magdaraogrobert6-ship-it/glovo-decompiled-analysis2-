package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class updateOutline {
    public static boolean IconCompatParcelizer(byte b) {
        return b < -32;
    }

    public static boolean RemoteActionCompatParcelizer(byte b) {
        return b < -16;
    }

    public static boolean read(byte b) {
        return b >= 0;
    }

    public static void serializer(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static boolean serializer(byte b) {
        return b > -65;
    }

    public static void IconCompatParcelizer(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !serializer(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.IconCompatParcelizer();
    }

    public static void RemoteActionCompatParcelizer(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (serializer(b2) || (((b2 + 112) + (b << 28)) >> 30) != 0 || serializer(b3) || serializer(b4)) {
            throw com.google.protobuf.InvalidProtocolBufferException.IconCompatParcelizer();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    public static void serializer(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (serializer(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || serializer(b3)))) {
            throw com.google.protobuf.InvalidProtocolBufferException.IconCompatParcelizer();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }
}
